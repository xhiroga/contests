package aizu.ALDS1_2_A

// Bubble Sort
// バブルソートも挿入ソートも、値を比較的ソートされた領域に持ってくる点で変わらない。
// 未ソート領域の値のチョイスの仕方に違いが出る。未ソート内の最小値ならバブルソート、一番手近な値なら挿入ソート。
internal fun solve(size: Int, inputs: List<Int>): Pair<MutableList<Int>, Int> {
    val outputs = inputs.toMutableList()
    return Pair(outputs, outputs.repeatExchangeLast2ToLeftLessThanRight())
}

internal tailrec fun MutableList<Int>.repeatExchangeLast2ToLeftLessThanRight(): Int {
    val count = this.exchangeLast2ToLeftLessThanRight()
    val subList = this.subList(1, this.size)
    return count + if (subList.size > 1) {
        subList.repeatExchangeLast2ToLeftLessThanRight()
    } else {
        0
    }
}

internal tailrec fun MutableList<Int>.exchangeLast2ToLeftLessThanRight(): Int {
    val count = if (this.subList(this.size - 2, this.size).toLeftBeLessThanRight()) {
        1
    } else {
        0
    }
    val subList = this.subList(0, this.size - 1)
    return count + if (subList.size > 1) {
        subList.exchangeLast2ToLeftLessThanRight()
    } else {
        0
    }
}

internal fun MutableList<Int>.toLeftBeLessThanRight(): Boolean {
    val left = this[0]
    if (this[0] > this[1]) {
        this[0] = this[1]
        this[1] = left
        return true
    }
    return false
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()

    val size = br.readLine().toInt()
    val nums = br.readLine().split(" ").map { it.toInt() }

    val result = solve(size, nums)
    OUTPUT += result.first.joinToString(" ") + "\n" + result.second

    print(OUTPUT)
}
