package atcoder.abc153.b

import assertIO
import org.junit.Test

class Abc153bTest{
    @Test
    fun case4(){
        assertIO(
            """
                211 5
                31 41 59 26 53
            """.trimIndent(),
            "No",
            ::main
        )
    }
}