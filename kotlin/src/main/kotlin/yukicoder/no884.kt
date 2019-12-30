// https://yukicoder.me/problems/no/884

package yukicoder

import java.math.BigInteger
import java.util.*

fun main() {
    val num = Scanner(System.`in`).nextBigInteger(2)
    println(solveNo884(num))
}

fun solveNo884(num: BigInteger): Int {
    return get2の累乗との差が0になるまで2の累乗を足すか引くかし続けた回数(num)
}

fun get2の累乗との差が0になるまで2の累乗を足すか引くかし続けた回数(num: BigInteger): Int {
    var 最寄りの2の累乗との差 = get最寄りの2の累乗との差(num)
    var count = 1

    while (最寄りの2の累乗との差 != BigInteger.valueOf(0)) {
        最寄りの2の累乗との差 = get最寄りの2の累乗との差(最寄りの2の累乗との差)
        count += 1
    }
    return count
}

fun get最寄りの2の累乗との差(num: BigInteger): BigInteger {
    val digit = num.bitLength()
    val 同桁の2の累乗数 = BigInteger("1").shiftLeft(digit - 1)
    val 同桁の2の累乗数からの差分 = 同桁の2の累乗数.xor(num)

    val i = 同桁の2の累乗数.shiftRight(1).compareTo(同桁の2の累乗数からの差分)
    return if (i > -1) {
        同桁の2の累乗数からの差分
    } else {
        同桁の2の累乗数 - 同桁の2の累乗数からの差分
    }
}

