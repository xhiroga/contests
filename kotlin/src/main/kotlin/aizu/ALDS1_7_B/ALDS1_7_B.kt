package aizu.ALDS1_7_B

import java.lang.Exception

val NOT_EXIST = -1

internal fun solve(size: Int, nodes: List<InputNode>): List<OutputNode> {
    val heights = mutableMapOf<Int, Int>()
    fun updateHeight(id: Int): Int {
        val height = nodes[id].children.exist().map { updateHeight(it) }.max()?.plus(1) ?: 0
        heights[id] = height
        return height
    }
    updateHeight(0)

    fun getNodes(id: Int, parentId: Int, sibling: Int, depth: Int): List<OutputNode> {
        val children = nodes[id].children.exist()
        val res = mutableListOf<OutputNode>(
            OutputNode(
                id = id,
                parentId = parentId,
                sibling = sibling,
                degree = children.size,
                depth = depth,
                height = heights[id] ?: throw Exception()
            )
        )
        children.forEach {
            res.addAll(getNodes(id = it, parentId = id, sibling = children.siblingOf(it), depth = depth + 1))
        }
        return res
    }

    return getNodes(0, NOT_EXIST, NOT_EXIST, 0)
}

private fun List<Int>.exist(): List<Int> {
    return this.filter { it != NOT_EXIST }
}

private fun List<Int>.siblingOf(me: Int): Int {
    return this.firstOrNull { it != me } ?: NOT_EXIST
}

internal data class InputNode(
    val id: Int,
    val children: List<Int>
)

internal data class OutputNode(
    val id: Int,
    val parentId: Int,
    val sibling: Int,
    val degree: Int,
    val depth: Int,
    val height: Int,
    val type: NodeType = when {
        parentId == NOT_EXIST -> {
            NodeType.ROOT
        }
        height == 0 -> {
            NodeType.LEAF
        }
        else -> {
            NodeType.INTERNAL_NODE
        }
    }
)

internal enum class NodeType { ROOT, INTERNAL_NODE, LEAF }

