# No.462 6日知らずのコンピュータ

# 面倒なので省くチェック
# 1. Nビットで表せない文字がakで指定されている
# 2. kとa1~akまでの引数の個数が一致しない

def main():
    N, K = [int(box) for box in input().split()]
    aList = sorted([int(box) for box in input().split()])
    ptn = 0 # 回答 ptn通り

    print (N)
    print (aList)
# 1. 可否判定
# 6日知らず(=数字が次に大きい数字に遷移する際、その差は必ず未使用のビットの和である)

    for i, aS in enumerate(aList):
        print ("i = " + str(i))
        if aS == aList[K-1]: #最後の数字の場合、比較対象がないのでbreakする。
            print("end")
            break
        aL = aList[i+1]
        print(aS)
        print(aL)
        if (aS|aL)^aL == 0: # aSの各桁よりもaLの各桁の方が必ず大きい = (aS or aL) xor aL が必ず 0 になる
            continue
            print("OK")
        else:
            print (0) #不可能
            print("impossible")
            break

# 2. ルート検索





# 勉強スペースここから
# 再帰呼び出し
def fact(n):

    if n == 0:
        return 1
    else:
        return n * fact (n-1)

# 勉強スペースここまで

if __name__ == "__main__":
    main()

    n = int(input())
    print(fact(n))

    # map リストの内部要素に同様に演算する

# どハマりポイント: 2進数に変換する、という操作はない。2進数として表記された文字列への変換のみが存在する。
# どハマりポイント: 基礎中の基礎なんだろうけど、pythonでintを文字列としてprintしたかったらstr()でキャストする
