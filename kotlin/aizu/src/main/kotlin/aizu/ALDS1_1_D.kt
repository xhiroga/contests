package aizu

import java.io.BufferedReader
import java.io.InputStreamReader

// To improving time, not return but pass value by global variables.
// O(n**2)
internal fun solveAlds1_1_D(入力数: Int, 価格s: ArrayList<Int>): Int {
    var その時点の最低価格 = 価格s[0]
    var 最大差額 = -1 * Math.pow(10.0, 9.0).toInt()
    価格s.forEachIndexed { i, 価格 ->
        if (価格 < その時点の最低価格) {
            その時点の最低価格 = 価格
        }
        価格s.subList(i + 1, 価格s.size).forEach { 将来価格 ->
            val 差額 = 将来価格 - 価格
            if (差額 > 最大差額) {
                最大差額 = 差額
            }
        }
    }
    return 最大差額
}

// O(N)
internal fun solveAlds1_1_D_On(入力数: Int, 価格s: ArrayList<Int>): Int {
    var その時点の最低価格 = 価格s[0]
    var 最大差額 = -1 * Math.pow(10.0, 9.0).toInt()
    価格s.subList(1, 価格s.size).forEach { 価格 ->
        val 差額 = 価格 - その時点の最低価格
        if (差額 > 最大差額) {
            最大差額 = 差額
        }
        if (価格 < その時点の最低価格) {
            その時点の最低価格 = 価格
        }
    }
    return 最大差額
}


// To improving time, create inline functions instead of standalone functions.

fun main(args: Array<String>) {
    // Scanner slows down, use InputReader
    val br = BufferedReader(InputStreamReader(System.`in`))

    val output = solveAlds1_1_D(TODO(), TODO())

    println(output)
}
