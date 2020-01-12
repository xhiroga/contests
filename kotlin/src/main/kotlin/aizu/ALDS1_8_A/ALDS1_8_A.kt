package aizu.ALDS1_8_A

internal sealed class Command

internal data class Insert(
    val argument: Int
) : Command()

internal data class Print(
    val argument: Int = -1
) : Command()

internal data class Node(
    val id: Int,
    var left: Int = -1,
    var right: Int = -1
)

internal data class BinaryTree(
    val nodes: MutableMap<Int, Node>,
    var root: Int? = null
) {
    tailrec fun appendOrNext(num: Int, index: Int?) {
        if (index == null) {
            this.nodes[num] = Node(num)
            this.root = num
            return
        }
        val node = this.nodes[index]!!
        // left, rightのプロパティへの参照を持つ方法が思いつかずこうしている。
        val nextIndex = when {
            num < node.id -> node.left
            node.id < num -> node.right
            else -> throw Error("Node number is duplicated!")
        }
        if (nextIndex == -1) {
            when {
                num < node.id -> {
                    node.left = num
                    this.nodes[num] = Node(num)
                    return
                }
                node.id < num -> {
                    node.right = num
                    this.nodes[num] = Node(num)
                    return
                }
                else -> throw Error("Node number is duplicated!")
            }
        }
        appendOrNext(num, nextIndex)
    }

    fun write() {
        this.forPreOrder { print("${it.id} ") }
        println("")
        this.forInOrder { print("${it.id} ") }
    }

    fun forPreOrder(action: (Node) -> Unit) {
        fun preOrderExec(index: Int) {
            val node = this.nodes[index]!!
            action(node)
            if (node.left != -1) {
                preOrderExec(node.left)
            }
            if (node.right != -1) {
                preOrderExec(node.right)
            }
        }
        preOrderExec(this.root!!)
    }

    fun forInOrder(action: (Node) -> Unit) {
    }

}

internal fun solve(commands: List<Command>) {
    val binTree = BinaryTree(nodes = mutableMapOf())
    commands.forEach {
        when (it) {
            is Insert -> {
                binTree.appendOrNext(it.argument, binTree.root)
            }
            is Print -> {
                binTree.write()
            }
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val size = br.readLine().toInt()
    val commands = List(size) {
        br.readLine().split(" ").let {
            when (it[0]) {
                "insert" -> Insert(it[1].toInt())
                "print" -> Print()
                else -> throw Error("Operation should be in insert or print.")
            }
        }
    }
    solve(commands)
}
