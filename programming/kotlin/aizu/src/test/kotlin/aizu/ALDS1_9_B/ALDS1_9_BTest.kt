package aizu.ALDS1_9_B

import assertIO
import org.junit.Test

class ALDS1_9_BTest{
    @Test
    fun case1(){
        assertIO(
            """
            10
            4 1 3 2 16 9 10 14 8 7
            """.trimIndent(),
            " 16 14 10 8 7 9 3 2 4 1",
            ::main
        )
    }
}