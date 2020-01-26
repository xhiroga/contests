package aizu.ALDS1_7_C

internal data class Node(
    val id: Int,
    val left: Int,
    val right: Int
)

internal fun solve(inputs: List<Node>): String {
    return ""
        .let { it + "Preorder\n" + preOrder(inputs).joinToString(" ") + "\n" }
        .let { it + "Inorder\n" + inOrder(inputs).joinToString(" ") + "\n" }
        .let { it + "Postorder\n" + postOrder(inputs).joinToString(" ") }
}

internal fun Int.doesExist(): Int? {
    return this.takeIf { it != -1 }
}

internal fun preOrder(inputs: List<Node>): MutableList<Int> {
    val outputs = mutableListOf<Int>()
    fun Node.print() {
        outputs.add(this.id)
        this.left.doesExist()?.let { inputs[it] }?.print()
        this.right.doesExist()?.let { inputs[it] }?.print()
    }
    inputs[0].print()
    return outputs
}

internal fun inOrder(inputs: List<Node>): MutableList<Int> {
    val outputs = mutableListOf<Int>()
    fun Node.print() {
        this.left.doesExist()?.let { inputs[it] }?.print()
        outputs.add(this.id)
        this.right.doesExist()?.let { inputs[it] }?.print()
    }
    inputs[0].print()
    return outputs
}

internal fun postOrder(inputs: List<Node>): MutableList<Int> {
    val outputs = mutableListOf<Int>()
    fun Node.print() {
        this.left.takeIf { it != -1 }?.let { inputs[it] }?.print()
        this.right.takeIf { it != -1 }?.let { inputs[it] }?.print()
        outputs.add(this.id)
    }
    inputs[0].print()
    return outputs
}

fun main(args: Array<String>) {
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
