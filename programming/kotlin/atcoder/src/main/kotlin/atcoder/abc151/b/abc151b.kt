package atcoder.abc151.b

const val 余裕 = "0"
const val 挽回不可能 = "-1"

internal fun solve(科目数: Int, 満点: Int, 目標平均点: Int, 各教科点数: List<Int>): String {
    val 最終教科の目標点数 = 科目数 * 目標平均点 - 各教科点数.sum()
    return when{
        最終教科の目標点数 < 0 -> 余裕
        最終教科の目標点数 > 満点 -> 挽回不可能
        else -> 最終教科の目標点数.toString()
    }
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val (科目数, 満点, 目標平均点) = br.readLine().split(" ").map{it.toInt()}
    val 各教科点数 = br.readLine().split(" ").map{it.toInt()}

    OUTPUT += solve(科目数, 満点, 目標平均点, 各教科点数)
    print(OUTPUT)
}
