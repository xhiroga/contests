package atcoder.abc151.f

internal data class Dot(
    val x: Int,
    val y: Int
) {
    fun getDistance(other: Dot): Double {
        return Math.sqrt(Math.pow((this.x - other.x).toDouble(), 2.0) + Math.pow((this.y - other.y).toDouble(), 2.0))
    }
}

// 等距離な頂点が奇数個ある場合にWA。
internal fun solve(count: Int, dots: List<Dot>): String {
    return (dots.subList(0, count - 1).mapIndexed { index, dot ->
        {
            dots.subList(index + 1, count).map { dot.getDistance(it) }.max()!!
        }
    }.map { it() }.max()?.div(2)).toString()
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val count = br.readLine().toInt()
    val dots = mutableListOf<Dot>()
    repeat(count) { dots.add(br.readLine().split(" ").map { it.toInt() }.let { Dot(it[0], it[1]) }) }

    OUTPUT += solve(count, dots)
    print(OUTPUT)
}
