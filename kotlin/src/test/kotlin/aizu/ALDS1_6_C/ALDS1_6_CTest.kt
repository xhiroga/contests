package aizu.ALDS1_6_C

import org.junit.Assert.assertEquals
import org.junit.Test

class ALDS1_6_CTest {
    @Test
    fun case1() {
        assertEquals(
            listOf(Card("D", 1), Card("C", 1), Card("H", 2), Card("D", 2), Card("D", 3), Card("S", 3)),
            solve(6, arrayListOf(Card("D", 3), Card("H", 2), Card("D", 1), Card("S", 3), Card("D", 2), Card("C", 1)))
        )
    }
}