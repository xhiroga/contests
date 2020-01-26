package atcoder.abc153.a

import assertIO
import org.junit.Test

class Abc153aTest{
    @Test
    fun case1(){
        assertIO("10 4", "3", ::main)
    }
    @Test
    fun case2(){
        assertIO("10000 1", "10000", ::main)
    }
}