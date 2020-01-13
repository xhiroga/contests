package aizu.ALDS1_6_A

import org.junit.Assert.*
import org.junit.Test

class ALDS1_6_ATest {
    @Test
    fun case1() {
        assertEquals(
            arrayListOf(0, 1, 2, 2, 3, 3, 5),
            solve(
                7, arrayListOf(2, 5, 1, 3, 2, 3, 0)
            )
        )
    }
}