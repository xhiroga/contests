package atcoder.abc153.c

import assertIO
import org.junit.Test

class Abc153cTest{
    @Test
    fun case2(){
        assertIO(
            """
                8 9
                7 9 3 2 3 8 4 6
            """.trimIndent(),
            "0", ::main
        )
    }

    @Test
    fun case3(){
        assertIO(
            """
                3 0
                1000000000 1000000000 1000000000
            """.trimIndent(),
            "3000000000", ::main
        )
    }

}