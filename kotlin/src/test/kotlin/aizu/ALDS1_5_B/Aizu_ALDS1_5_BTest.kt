    package aizu.ALDS1_5_B

import org.junit.Assert.*
import org.junit.Test

class Aizu_ALDS1_5_BTest {
    @Test
    fun case1() {
        assertEquals(
            Pair(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 34),
            solve(10, listOf(8, 5, 9, 2, 6, 3, 7, 1, 10, 4))
        )
    }

    @Test
    fun case2() {
        assertEquals(
            Pair(listOf(1, 2, 3), 5),
            solve(3, listOf(3, 2, 1))
        )
    }
}