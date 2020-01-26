package aizu.ALDS1_10_C

import assertIO
import org.junit.Test

class ALDS1_10_CTest(){
    @Test
    fun case1(){
        assertIO("""
            abcbdab
            bdcaba
            """.trimIndent(),"4", ::main
        )
    }
}