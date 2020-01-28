package atcoder.abc153.f

import assertIO
import org.junit.Test
import java.lang.Math.*

class Abc153fTest {

    @Test(timeout = 2000)
    fun case2() {
        assertIO(
            """
                9 4 1
                1 5
                2 4
                3 3
                4 2
                5 1
                6 2
                7 3
                8 4
                9 5
            """.trimIndent(),
            "5", ::main
        )
    }

    @Test(timeout = 2000)
    fun case3() {
        assertIO(
            """
            3 0 1
            300000000 1000000000
            100000000 1000000000
            200000000 1000000000
        """.trimIndent(),
            "3000000000", ::main
        )
    }

    @Test(timeout = 2000)
    fun limit1() {
        abc153f(
            (1..pow(2.0, 5.0).toInt()).map { Enemy(it, 1000000000) },
            1,
            1
        )
    }

}