package atcoder.abc153.f

// TODO: TLE

internal data class Enemy(
    var x: Int,
    var hp: Int
)

private fun MutableList<Enemy>.bomb(distance: IntRange, bombAtOnce: Int) {
    this.asSequence().all {
        if (it.x in distance) {
            it.hp -= bombAtOnce
            true
        } else {
            false
        }
    }
}

internal fun abc153f(
    enemies: List<Enemy>,
    d: Int,
    a: Int
): Long {
    val orderedEnemies = enemies.sortedBy { it.x }.toMutableList()
    var count = 0L
    do {
        val farLeft = orderedEnemies.removeAt(0)
        if (farLeft.hp <= 0) {
            continue
        }
        val bombCount = if (farLeft.hp % a == 0) {
            farLeft.hp / a
        } else {
            farLeft.hp / a + 1
        }
        orderedEnemies.bomb(farLeft.x..farLeft.x + (d * 2), a * bombCount)
        count += bombCount
    } while (orderedEnemies.size > 0)
    return count
}


fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val (n, d, a) = br.readLine().split(" ").map { it.toInt() }
    val enemies = (1..n).map { br.readLine().split(" ").map { it.toInt() }.let { Enemy(it[0], it[1]) } }
    OUTPUT += abc153f(enemies, d, a).toString()
    print(OUTPUT)
}
