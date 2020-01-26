package atcoder.abc151.a

internal fun solve(input: String): String {
    val alphabets = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
    return alphabets[alphabets.indexOf(input)+1]
}

fun main(args: Array<String>) {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()

    OUTPUT += solve(br.readLine())
    print(OUTPUT)
}
