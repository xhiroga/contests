package yukicoder.no23

import assertIOWithInError
import org.junit.Test

private const val ERROR = 0.01

class No23Test{
    @Test
    fun case1(){
        assertIOWithInError("38 10 14", "4.0", ERROR, ::main)
    }

    @Test
    fun case3(){
        assertIOWithInError("49 7 17", "4.5", ERROR, ::main)
    }

    @Test
    fun caseX1(){
        assertIOWithInError("13 6 7", "2.5", ERROR, ::main)
    }

    @Test
    fun `99_system_test_1`(){
        assertIOWithInError("6405 6400 5777", "2.0", ERROR, ::main)
    }
    @Test
    fun challenge01(){
        assertIOWithInError("50 15 20", "3.5", ERROR, ::main)
    }
}
