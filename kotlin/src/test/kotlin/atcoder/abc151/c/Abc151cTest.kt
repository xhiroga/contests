package atcoder.abc151.c

import assertIOat
import org.junit.Test

class Abc151cTest{
    @Test
    fun case1(){
        assertIOat("""
            2 5
            1 WA
            1 AC
            2 WA
            2 AC
            2 WA
            """.trimIndent(),
            "2 2", ::main
        )
    }

    @Test
    fun case2(){
        assertIOat("""
            100000 3
            7777 AC
            7777 AC
            7777 AC
            """.trimIndent(),
            "1 0", ::main
        )
    }

    @Test
    fun case3(){
        assertIOat("""
            6 0
            """.trimIndent(),
            "0 0", ::main
        )
    }
}