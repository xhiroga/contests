package yukicoder.no23

import kotlin.math.min

private const val SPECIAL_ATTACK_HIT_RATE = 2.0 / 3.0
private const val SPECIAL_ATTACK_NUM_EXPECTED = 1.0 / SPECIAL_ATTACK_HIT_RATE

internal fun solve(HP: Int, normal: Int, special: Int): String {
    var counter = Double.MAX_VALUE
    fun updateIfNewRecord(record: Double){
        counter = min(counter, record)
    }

    for (n in 0..Int.MAX_VALUE){
        var currentHP: Double = (HP - normal * n).toDouble()
        if (currentHP <= 0){
            updateIfNewRecord(n.toDouble())
            break
        }
        for (m in 1..Int.MAX_VALUE){
            currentHP -= special
            if (currentHP <= 0){
                updateIfNewRecord(n + m * SPECIAL_ATTACK_NUM_EXPECTED)
                break
            }
        }
    }
    return counter.toString()
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val (HP, normal, special) = br.readLine().split(" ").map { it.toInt() }

    OUTPUT += solve(HP, normal, special)
    print(OUTPUT)
}
