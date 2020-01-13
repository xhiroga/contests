package aizu.ALDS1_2_A

// Bubble Sort
// バブルソートも挿入ソートも、値を比較的ソートされた領域に持ってくる点で変わらない。
// 未ソート領域の値のチョイスの仕方に違いが出る。未ソート内の最小値ならバブルソート、一番手近な値なら挿入ソート。
internal fun solve(size: Int, inputs: List<Int>): Pair<MutableList<Int>, Int> {
    val outputs = inputs.toMutableList()
    var 交換回数 = 0
    for (i in 0 until size) {
        // println(outputs)
        交換回数 += outputs.subList(i, size).末尾から隣接する要素を順番に比べ大小関係が逆なら交換()
        // println(outputs)
        // println("------")
    }
    return Pair(outputs, 交換回数)
}

internal fun MutableList<Int>.末尾から隣接する要素を順番に比べ大小関係が逆なら交換(): Int {
    // println(this)
    if (this.size < 2) {
        return 0
    }
    var 交換回数 = 0
    for (i in this.size downTo 2) {
        if (this.subList(i - 2, i).左が小さくなるように交換()) {
            交換回数 += 1
        }
    }
    // println(this)
    return 交換回数
}

internal fun MutableList<Int>.左が小さくなるように交換(): Boolean {
    val left = this[0]
    if (this[0] > this[1]) {
        this[0] = this[1]
        this[1] = left
        return true
    }
    return false
}

internal data class Result(
    val sorted: MutableList<Int>,
    val count: Int
)

// To improving time, create inline functions instead of standalone functions.

fun main(args: Array<String>) {
    var OUTPUT = ""

    // InputStreamReaderをそのまま使うと実行ごとに読み込みが発生するため、BufferedReaderを用いる。
    val br = System.`in`.bufferedReader()

    val size = br.readLine().toInt()
    val nums = br.readLine().split(" ").map { it.toInt() }

    val result = solve(size, nums)
    OUTPUT +=  result.first.joinToString(" ") + "\n" + result.second

    print(OUTPUT)
}
