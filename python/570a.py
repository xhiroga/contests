def main():
    d = {}
    d[input()] = "A"
    d[input()] = "B"
    d[input()] = "C"

    for _, name in sorted(d.items(), key=lambda x: x[0], reverse=True):
        print(name)

# sortedについて
# 個々の要素から比較項目を取り出すための式を渡す
# pythonではlambdaは()=>{}ではなく lambda x: x*2 みたいに返す


if __name__ == "__main__":
    main()

# 日本語で説明すると...
# main関数の初めに辞書型の変数を初期化した後、標準入力をそのままキーとして"A"が値となる組み合わせを作成する。
# その後、辞書型配列のキーと値の組み合わせのリストをitems()で返させる。そのキーを使って並び替えたリストを
# sortedで生成し、ループごとに返るうちnameを出力する。
