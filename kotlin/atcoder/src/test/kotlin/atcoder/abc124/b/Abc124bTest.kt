package atcoder

import org.junit.Assert.*
import org.junit.Test

class Abc124bTest {
    @Test
    fun case1() {
        assertEquals(3, abc124b(4, arrayListOf(6, 5, 6, 8)))
    }

    @Test
    fun case2() {
        assertEquals(3, abc124b(5, arrayListOf(4, 5, 3, 5, 4)))
    }

    @Test
    fun case3() {
        assertEquals(1, abc124b(5, arrayListOf(9, 5, 6, 8, 4)))
    }
}