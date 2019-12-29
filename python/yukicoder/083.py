# No.83 最大マッチング

# 与えられた数字/2の桁数をもつ、全ての位が1の数字を作る >> あまりが１なら一番大きい位を7にする


def main():
    n = int(input())  # ex: 7
    keta, amari = divmod(n, 2)  # ex: 3, 1
    tmp = ["1"] * keta
    if amari == 1:
        tmp[0] = "7"
    ans = "".join(tmp)
    print(ans + "")


if __name__ == "__main__":
    main()
