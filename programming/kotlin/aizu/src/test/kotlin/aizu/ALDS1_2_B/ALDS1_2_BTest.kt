package aizu.ALDS1_2_B

import org.junit.Assert.assertEquals
import org.junit.Test

class ALDS1_2_BTest {

    @Test
    fun case1() {
        assertEquals(
            Result(arrayListOf(1, 2, 3, 4, 5, 6), 4),
            solve(arrayListOf(5, 6, 4, 2, 1, 3), 6)
        )
    }
}