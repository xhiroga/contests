def main():
	N,K = input().split()
	N = int(N)
	K = int(K)
	goods = []
	for i in range(N):
		goods.append(int(input()))

	totals = []
	tmp = 0
	for j in range(N-1,-1,-1):
		print("j",j)
		for l in range(j,-1,-1):
			print("l",l)
			if K-tmp >= goods[l]:
				tmp+=goods[l]
		totals.append(tmp)
	print(totals)
	print(max(totals))

main()

