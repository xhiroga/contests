package aizu.ALDS1_2_A

import org.junit.Test

import org.junit.Assert.*

class ALDS1_2_ATest {

    @Test
    fun testSolve() {
        assertEquals(
            Result(arrayListOf(1, 2, 3, 4, 5), 8),
            solve(5, arrayListOf(5, 3, 2, 4, 1))
        )
    }
}