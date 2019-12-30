package yukicoder

object fib {
    var prevNum = 0
    var num = 1
    fun next() {
        val numBeforeOperation = num
        num += prevNum
        prevNum = numBeforeOperation
    }
}

fun no953(givenNums: ArrayList<Int>): Int {
    val nums = givenNums.reversed()
    while (fib.num < nums.first()) {
        fib.next()
    }
    return if (fib.num == nums.first()) {
        fib.next()
        if (fib.num == nums[1]) {
            fib.next()
            if (fib.num == nums[2]) {
                fib.next()
                if (fib.num == nums[3]) {
                    fib.next()
                    if (fib.num == nums[4]) {
                        5
                    } else {
                        4
                    }
                } else {
                    3
                }
            } else {
                2
            }
        } else {
            1
        }
    } else {
        0
    }
}

