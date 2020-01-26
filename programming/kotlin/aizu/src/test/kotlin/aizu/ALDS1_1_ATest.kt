package aizu

import org.junit.Assert.assertEquals
import org.junit.Test

class ALDS1_1_ATest {
    @Test
    fun case1() {
        assertEquals(
            """
                5 2 4 6 1 3
                2 5 4 6 1 3
                2 4 5 6 1 3
                2 4 5 6 1 3
                1 2 4 5 6 3
                1 2 3 4 5 6
            """.trimIndent(),
            solveAlds_1_1_A(6, arrayListOf(5, 2, 4, 6, 1, 3))
        )
    }

    @Test
    fun caseX() {
        assertEquals(
            """
                2 1 3 1
                1 2 3 1
                1 2 3 1
                1 1 2 3
            """.trimIndent(),
            solveAlds_1_1_A(4, arrayListOf(2, 1, 3, 1))
        )
    }
}
