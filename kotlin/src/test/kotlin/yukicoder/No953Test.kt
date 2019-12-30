package yukicoder

import org.junit.Assert.*
import org.junit.Test

class No953Test{
    @Test
    fun サンプル1() {
        assertEquals(1, no953(arrayListOf(543, 1, 1, 2, 3)))
    }

    @Test
    fun サンプル2() {
        assertEquals(3, no953(arrayListOf(458, 10, 3, 2, 1)))
    }

    @Test
    fun サンプル3() {
        assertEquals(4, no953(arrayListOf(650, 3, 2, 1, 1)))
    }
}

