package aizu.ALDS1_3_A

import org.junit.Assert.assertEquals
import org.junit.Test

class ALDS1_3_ATest {
    @Test
    fun case1() {
        assertEquals(-3, solve("1 2 + 3 4 - *".split(" ")))
    }
}