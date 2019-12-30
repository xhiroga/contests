// https://yukicoder.me/problems/no/884

package yukicoder

import kotlin.math.min
import kotlin.math.pow

fun main() {
    val n = readLine()!!
    println(no884(n))
}

fun no884(n: String): Int {
    val num = Integer.parseInt(n, 2)
    return get2の累乗との差が0になるまで2の累乗を足すか引くかし続けた回数(num)
}

fun get2の累乗との差が0になるまで2の累乗を足すか引くかし続けた回数(num: Int, count: Int = 0): Int {
    val 最寄りの2の累乗との差 = get最寄りの2の累乗との差(num)
    return if (最寄りの2の累乗との差 == 0) {
        count + 1
    } else {
        get2の累乗との差が0になるまで2の累乗を足すか引くかし続けた回数(最寄りの2の累乗との差, count + 1)
    }
}

val `2の累乗リスト` = (0..200000).map { 2.0.pow(it.toDouble()).toInt() }
fun get最寄りの2の累乗との差(num: Int): Int {
    for (`2の累乗` in `2の累乗リスト`) {
        if (num == `2の累乗`) {
            return 0
        } else if (num < `2の累乗`) {
            val diff = `2の累乗` - num
            return min(diff, `2の累乗` / 2 - diff)
        }
    }
    throw Exception("Impossible")
}

