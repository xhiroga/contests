package aizu.ALDS1_9_B

import kotlin.math.log
import kotlin.math.pow

/**
 * maxヒープ = 根から葉へ降順にソートされた完全二分木
 * ソートの実装案:
 * - 選択ソートの要領で選択した範囲の最大値を根に持ってくる操作を、根から順に範囲を狭めて実行。最悪計算量はO(N^2)
 * - 根から葉に至る全ての経路で(選択|マージ|計数)ソートを実行
 * - マージソートの要領で、葉とその親から順に範囲を広げながら、最も大きい値が根に昇るようにソート。
 */

internal fun solve(size: Int, inputs: List<Int>): String {
    val deepest = log(size.toDouble() + 1, 2.0).toInt()
    return " " + inputs.toMutableList().mergeApply(deepest - 1).joinToString(" ")
}

private tailrec fun MutableList<Int>.mergeApply(depth: Int): List<Int> {
    if (depth < 0) {
        return this.toList()
    }
    for (i in 2.0.pow(depth.toDouble()).toInt() until 2.0.pow(depth.toDouble() + 1.0).toInt()) {
        this.lightningApply(i - 1)
    }
    return this.mergeApply(depth - 1)
}

private tailrec fun MutableList<Int>.lightningApply(root: Int) {
    if (this.getOrNull(root) == null) {
        return
    }
    this.compareRootWithLeavesAndSwap(root, root * 2 + 1, root * 2 + 2)
        ?.let { this.lightningApply(it) }
}

private fun MutableList<Int>.compareRootWithLeavesAndSwap(root: Int, l: Int, r: Int): Int? {
    val ln = this.getOrNull(l) ?: -1
    val rn = this.getOrNull(r) ?: -1
    if (ln == -1 && rn == -1) {
        return null
    }
    return if (ln > rn && ln > this[root]) {
        this[l] = this[root]
        this[root] = ln
        l
    } else if (rn > ln && rn > this[root]) {
        this[r] = this[root]
        this[root] = rn
        r
    } else {
        null
    }
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val size = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toInt() }

    OUTPUT += solve(size, inputs)
    print(OUTPUT)
}
