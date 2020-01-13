package aizu.ALDS1_3_B

import org.junit.Assert.*
import org.junit.Test

class ALDS1_3_BTest {
    @Test
    fun case1() {
        assertEquals(
            """
                p2 180
                p5 400
                p1 450
                p3 550
                p4 800
            """.trimIndent(),
            solve(
                5, 100, listOf(
                    Process("p1", 150),
                    Process("p2", 80),
                    Process("p3", 200),
                    Process("p4", 350),
                    Process("p5", 20)
                )
            )
        )
    }
}