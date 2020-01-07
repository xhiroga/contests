package aizu.ALDS1_7_C

internal data class Node(
    val id: Int,
    val left: Int,
    val right: Int
)

internal fun solve(inputs: List<Node>): String {
    return "".let { it + "Postorder\n" + postOrder(inputs).joinToString(" ") }
}

internal fun postOrder(inputs: List<Node>): MutableList<Int> {
    val output: MutableList<Int> = mutableListOf()
    fun Node.print() {
        this.left.takeIf { it != -1 }?.let { inputs[it] }?.print()
        this.right.takeIf { it != -1 }?.let { inputs[it] }?.print()
        output.add(this.id)
    }
    inputs[0].print()
    return output
}

fun main() {
    var OUTPUT = ""

    val br = System.`in`.bufferedReader()
    val size = br.readLine().toInt()
    val inputs = List(size) {
        br.readLine().split(" ")
            .map { it.toInt() }
            .let { Node(it[0], it[1], it[2]) }
    }

    OUTPUT += solve(inputs)
    print(OUTPUT)
}
