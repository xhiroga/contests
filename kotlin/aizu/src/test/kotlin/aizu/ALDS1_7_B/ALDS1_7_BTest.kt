package aizu.ALDS1_7_B

import org.junit.Assert.*
import org.junit.Test

class ALDS1_7_BTest {
    @Test
    fun case1() {
        assertEquals(
            listOf(
                OutputNode(0, -1, -1, 2, 0, 3, NodeType.ROOT),
                OutputNode(1, 0, 4, 2, 1, 1, NodeType.INTERNAL_NODE),
                OutputNode(2, 1, 3, 0, 2, 0, NodeType.LEAF),
                OutputNode(3, 1, 2, 0, 2, 0, NodeType.LEAF),
                OutputNode(4, 0, 1, 2, 1, 2, NodeType.INTERNAL_NODE),
                OutputNode(5, 4, 8, 2, 2, 1, NodeType.INTERNAL_NODE),
                OutputNode(6, 5, 7, 0, 3, 0, NodeType.LEAF),
                OutputNode(7, 5, 6, 0, 3, 0, NodeType.LEAF),
                OutputNode(8, 4, 5, 0, 2, 0, NodeType.LEAF)
            ),
            solve(
                9, listOf(
                    InputNode(0, listOf(1, 4)),
                    InputNode(1, listOf(2, 3)),
                    InputNode(2, listOf(-1, -1)),
                    InputNode(3, listOf(-1, -1)),
                    InputNode(4, listOf(5, 8)),
                    InputNode(5, listOf(6, 7)),
                    InputNode(6, listOf(-1, -1)),
                    InputNode(7, listOf(-1, -1)),
                    InputNode(8, listOf(-1, -1))
                )
            )
        )
    }
}