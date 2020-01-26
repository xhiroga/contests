package aizu.ALDS1_6_B

import org.junit.Assert.assertEquals
import org.junit.Test

class ALDS1_6_BTest {
    @Test
    fun case1() {
        assertEquals(
            listOf(9, 5, 8, 7, 4, 2, 6, 11, 13, 19, 12, 21),
            solve(12, arrayListOf(13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11))
        )
    }
}