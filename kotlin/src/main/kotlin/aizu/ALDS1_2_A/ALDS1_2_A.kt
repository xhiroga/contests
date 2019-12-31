package aizu.ALDS1_2_A

import java.io.BufferedReader
import java.io.InputStreamReader

// Bubble Sort
// バブルソートも挿入ソートも、未ソートの領域からソート済みの領域にデータを持ってくる点で変わらない。
// 未ソート領域の値のチョイスの仕方に違いが出る。未ソート内の最小値ならバブルソート、一番手近な値なら挿入ソート。
internal fun solve(size: Int, nums: ArrayList<Int>): Result {
    var 交換回数 = 0
    for (i in 0 until size) {
        println(nums)
        交換回数 += nums.subList(i, size).末尾から隣接する要素を順番に比べ大小関係が逆なら交換()
        println(nums)
        println("------")
    }
    return Result(nums, 交換回数)
}

internal fun MutableList<Int>.末尾から隣接する要素を順番に比べ大小関係が逆なら交換(): Int {
    println(this)
    if (this.size < 2) {
        return 0
    }
    var 交換回数 = 0
    for (i in this.size downTo 2) {
        if (this.subList(i - 2, i).左が小さくなるように交換()) {
            交換回数 += 1
        }
    }
    println(this)
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
    val sorted: ArrayList<Int>,
    val count: Int
)

// To improving time, create inline functions instead of standalone functions.

fun main() {
    // Scanner slows down, use InputReader
    val br = BufferedReader(InputStreamReader(System.`in`))

    val output = solve(TODO(), TODO())

    println(output)
}
