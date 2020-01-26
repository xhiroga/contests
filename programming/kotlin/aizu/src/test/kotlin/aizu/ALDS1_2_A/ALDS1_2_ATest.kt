package aizu.ALDS1_2_A

import assertIO
import org.junit.Assert
import org.junit.Test


class ALDS1_2_ATest {
    @Test
    fun testExchangeLast2ToLeftLessThanRight() {
        Assert.assertEquals(
            4, mutableListOf(5, 3, 2, 4, 1).exchangeLast2ToLeftLessThanRight()
        )
    }

    @Test
    fun testSolve() {
        Assert.assertEquals(
            Pair(mutableListOf(1, 2, 3, 4, 5), 8),
            solve(5, mutableListOf(5, 3, 2, 4, 1))
        )
    }

    @Test
    fun case1() {
        assertIO(
            """
            5
            5 3 2 4 1
            """.trimIndent(),
            """
            1 2 3 4 5
            8
            """.trimIndent(),
            ::main
        )
    }
}

