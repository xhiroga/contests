package atcoder.abc151.c

internal enum class Judge(val judge: String) {
    AC("ac"),
    WA("wa")
}

internal data class Submit(
    val 問題番号: Int,
    val 成否: Judge
)

internal data class Result(
    val wa: Int,
    val ac: Int
)

internal fun Map<Int, Result>.isAc(taskNum: Int): Boolean {
    return this[taskNum]!!.ac > 0
}

internal fun solve(input: Int, 提出回数: Int, submits: List<Submit>): String {
    val 問題ごとのResultMap = mutableMapOf<Int, Result>()
    submits.forEach {
        val 現在のResult = 問題ごとのResultMap.get(it.問題番号)
        if (現在のResult != null) {
            if (問題ごとのResultMap.isAc(it.問題番号)) {
                return@forEach
            }
            if (it.成否 == Judge.AC) {
                問題ごとのResultMap[it.問題番号] = Result(現在のResult.wa, 1)
            } else {
                問題ごとのResultMap[it.問題番号] = Result(現在のResult.wa + 1, 0)
            }
        } else {
            if (it.成否 == Judge.AC) {
                問題ごとのResultMap[it.問題番号] = Result(0, 1)
            } else {
                問題ごとのResultMap[it.問題番号] = Result(1, 0)
            }
        }
    }
    val WA数 = 問題ごとのResultMap.values.map { it.wa }.sum()
    val AC数 = 問題ごとのResultMap.values.map { it.ac }.sum()
    return "$WA数 $AC数"
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val (問題数, 提出回数) = br.readLine().split(" ").map { it.toInt() }
    val submits = mutableListOf<Submit>()
    repeat(提出回数) {
        submits.add(br.readLine().split(" ").let { Submit(it[0].toInt(), Judge.valueOf(it[1])) })
    }

    OUTPUT += solve(問題数, 提出回数, submits)
    print(OUTPUT)
}
