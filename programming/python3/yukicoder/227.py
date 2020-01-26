def main():
    cards = input().split()
    cards.sort()

    hands = [1]
    for i in range(4):
        if cards[i] == cards[i + 1]:
            hands[-1] += 1
        else:
            hands.append(1)
    hands.sort(reverse=True)

    if hands == [3, 2]:
        print("FULL HOUSE")
    elif hands == [3, 1, 1]:
        print("THREE CARD")
    elif hands == [2, 2, 1]:
        print("TWO PAIR")
    elif hands == [2, 1, 1, 1]:
        print("ONE PAIR")
    else:
        print("NO HAND")


main()

"""
カードの種類ごとの枚数をリストで作成して比較した。
種類ごとにまとめるためにソートしたが、他になかったか？
>> set() が使用できた。また、枚数はcount()があった。

list同士を比較できることに気がついたのはよかった。

"""
