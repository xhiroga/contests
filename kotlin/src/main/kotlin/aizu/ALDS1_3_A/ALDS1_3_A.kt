package aizu.ALDS1_3_A

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.Integer.parseInt
import java.util.*

// To improving time, not return but pass value by global variables.
internal fun solve(inputs: List<String>): Int {
    val stack = Stack<Int>()
    inputs.forEach {
        try {
            stack.push(parseInt(it))
        } catch (e: NumberFormatException) {
            val later = stack.pop()
            val faster = stack.pop()
            stack.push(
                faster.opeBy(it)(later)
            )
        }
    }
    return stack.pop()
}

internal fun Int.opeBy(operation: String): (other: Int) -> Int {
    return when (operation) {
        "+" -> { other: Int -> this.plus(other) }
        "-" -> { other: Int -> this.minus(other) }
        "*" -> { other: Int -> this.times(other) }
        else -> throw Exception()
    }
}

// To improving time, create inline functions instead of standalone functions.

fun main() {
    // Scanner slows down, use InputReader
    val br = BufferedReader(InputStreamReader(System.`in`))

    val output = solve(TODO())

    println(output)
}
