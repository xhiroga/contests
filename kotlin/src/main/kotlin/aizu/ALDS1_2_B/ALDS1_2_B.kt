package aizu.ALDS1_2_B

import java.io.BufferedReader
import java.io.InputStreamReader

// Selection Sort
// 未ソート領域から最小の値を持ってくる点がバブルソートと共通。
internal fun solve(nums: ArrayList<Int>, size: Int): Result {
    var count = 0
    for (i in 0..size - 1) {
        if (nums.subList(i, size).最小値を先頭と入れ替える()) {
            count += 1
        }
    }
    return Result(nums, count)
}

internal fun MutableList<Int>.最小値を先頭と入れ替える(): Boolean {
    val i = this.indexOf(this.min())
    return if (i != 0) {
        val top = this[0]
        this[0] = this[i]
        this[i] = top
        true
    } else {
        false
    }

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
