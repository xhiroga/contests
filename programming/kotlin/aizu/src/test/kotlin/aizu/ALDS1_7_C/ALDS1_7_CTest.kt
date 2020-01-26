package aizu.ALDS1_7_C

import assertIO
import org.junit.Test

class ALDS1_7_CTest{
    @Test
    fun case1(){
        assertIO(
            """
                9
                0 1 4
                1 2 3
                2 -1 -1
                3 -1 -1
                4 5 8
                5 6 7
                6 -1 -1
                7 -1 -1
                8 -1 -1
            """.trimIndent(),
            """
                Preorder
                0 1 2 3 4 5 6 7 8
                Inorder
                2 1 3 0 6 5 7 4 8
                Postorder
                2 3 1 6 7 5 8 4 0
            """.trimIndent(),
            ::main
        )
    }
}