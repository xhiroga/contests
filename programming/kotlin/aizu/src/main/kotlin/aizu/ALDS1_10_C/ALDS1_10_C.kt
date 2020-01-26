package aizu.ALDS1_10_C

import kotlin.math.max

/**
 * LCS: Longest Common Subsequence: 最長共通部分列問題
 */

internal fun solve(x: String, y: String): String {
    // DPで再帰的に過去の計算結果を参照する場合、位置が0の計算結果も参照できるようにしたほうが都合が良い。
    val lcss = List(x.length + 1) { List(y.length + 1) { 0 }.toMutableList() }.toMutableList()
    for (n in 1..x.length) {
        for (m in 1..y.length) {
            lcss[n][m] = when {
                x[n - 1] == y[m - 1] -> lcss[n - 1][m - 1] + 1
                else -> max(lcss[n - 1][m], lcss[n][m - 1])
            }
        }
    }
    return lcss[x.length][y.length].toString()
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val x = br.readLine()
    val y = br.readLine()

    OUTPUT += solve(x, y)
    print(OUTPUT)
}
