def main():
	cards = input().split()
	cards.sort()

	hands = []
	for card in set(cards):
		hands.append(cards.count(card))
	hands.sort(reverse=True)
	
	if hands == [3,2]:
		print("FULL HOUSE")
	elif hands == [3,1,1]:
		print("THREE CARD")
	elif hands == [2,2,1]:
		print("TWO PAIR")
	elif hands == [2,1,1,1]:
		print("ONE PAIR")
	else:
		print("NO HAND")

main()
