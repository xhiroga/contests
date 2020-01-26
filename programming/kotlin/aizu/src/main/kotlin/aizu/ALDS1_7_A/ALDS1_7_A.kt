package aizu.ALDS1_7_A

internal fun solve(nodes: Int, inputs: List<TreeInput>): List<TreeOutput> {
    val outputs = arrayListOf<TreeOutput>()
    fun draw(nodeId: Int, parentId: Int, depth: Int) {
        outputs.add(TreeOutput(nodeId, parentId, depth, inputs[nodeId].children))
        inputs[nodeId].children.forEach {
            draw(it, nodeId, depth + 1)
        }
    }
    draw(0, -1, 0)
    return outputs.toList()
}

internal data class TreeInput(
    val nodeId: Int,
    val childrenCount: Int, // 次数
    val children: List<Int>
)

internal data class TreeOutput(
    val nodeId: Int,
    val parent: Int,
    val depth: Int,
    val leaves: List<Int>
)