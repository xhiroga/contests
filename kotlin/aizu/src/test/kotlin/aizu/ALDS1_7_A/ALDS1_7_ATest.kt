package aizu.ALDS1_7_A

import org.junit.Assert.*
import org.junit.Test

class ALDS1_7_ATest {
    @Test
    fun case1() {
        assertEquals(
            listOf(
                TreeOutput(
                    nodeId = 0,
                    parent = -1,
                    depth = 0,
                    leaves = listOf(1, 4, 10)
                ),
                TreeOutput(nodeId = 1, parent = 0, depth = 1, leaves = listOf(2, 3)),
                TreeOutput(nodeId = 2, parent = 1, depth = 2, leaves = listOf()),
                TreeOutput(nodeId = 3, parent = 1, depth = 2, leaves = listOf()),
                TreeOutput(
                    nodeId = 4,
                    parent = 0,
                    depth = 1,
                    leaves = listOf(5, 6, 7)
                ),
                TreeOutput(nodeId = 5, parent = 4, depth = 2, leaves = listOf()),
                TreeOutput(nodeId = 6, parent = 4, depth = 2, leaves = listOf()),
                TreeOutput(nodeId = 7, parent = 4, depth = 2, leaves = listOf(8, 9)),
                TreeOutput(nodeId = 8, parent = 7, depth = 3, leaves = listOf()),
                TreeOutput(nodeId = 9, parent = 7, depth = 3, leaves = listOf()),
                TreeOutput(
                    nodeId = 10,
                    parent = 0,
                    depth = 1,
                    leaves = listOf(11, 12)
                ),
                TreeOutput(nodeId = 11, parent = 10, depth = 2, leaves = listOf()),
                TreeOutput(nodeId = 12, parent = 10, depth = 2, leaves = listOf())
            ),
            solve(
                13, listOf(
                    TreeInput(0, 3, listOf(1, 4, 10)),
                    TreeInput(1, 2, listOf(2, 3)),
                    TreeInput(2, 0, listOf()),
                    TreeInput(3, 0, listOf()),
                    TreeInput(4, 3, listOf(5, 6, 7)),
                    TreeInput(5, 0, listOf()),
                    TreeInput(6, 0, listOf()),
                    TreeInput(7, 2, listOf(8, 9)),
                    TreeInput(8, 0, listOf()),
                    TreeInput(9, 0, listOf()),
                    TreeInput(10, 2, listOf(11, 12)),
                    TreeInput(11, 0, listOf()),
                    TreeInput(12, 0, listOf())
                )
            )
        )
    }
}