package atcoder.abc153.a

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val (hp, attack) = br.readLine().split(" ").map { it.toInt() }

    val res = if (hp % attack == 0) {
        hp / attack
    } else {
        hp / attack + 1
    }
    print(res.toString())
}
