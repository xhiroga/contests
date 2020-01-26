package atcoder.abc153.b

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val (hp) = br.readLine().split(" ").map { it.toInt() }
    val attacks = br.readLine().split(" ").map { it.toInt() }

    val OUTPUT = if (hp <= attacks.sum()) {
        "Yes"
    } else {
        "No"
    }
    print(OUTPUT)
}
