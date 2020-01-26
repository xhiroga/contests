package atcoder.abc153.c

internal fun solve(spa: Int, enemies: List<Long>): Long {
    return if (spa >= enemies.size) {
        0
    } else {
        enemies.sortedDescending().subList(spa, enemies.size).sum()
    }

}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val (n, spa) = br.readLine().split(" ").map { it.toInt() }
    val enemies = br.readLine().split(" ").map { it.toLong() }

    OUTPUT += solve(spa, enemies).toString()
    print(OUTPUT)
}
