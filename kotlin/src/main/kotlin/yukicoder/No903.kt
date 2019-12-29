// https://yukicoder.me/problems/no/903

package yukicoder

fun f(x: Int): Float {
    return 1 / x.toFloat()
}

fun main() {
    var n = readLine()!!.toInt() // read integer from the input
    println(f(n)) // print answer to the output
}