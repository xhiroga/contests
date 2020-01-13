package atcoder.abc151.f

import assertIO
import org.junit.Test

class Abc151fTest{
    @Test
    fun case3(){
        assertIO("""
            10
            10 9
            5 9
            2 0
            0 0
            2 7
            3 3
            2 5
            10 0
            3 7
            1 9
            """.trimIndent(), "6.726812023536805158", ::main
        )
    }
}