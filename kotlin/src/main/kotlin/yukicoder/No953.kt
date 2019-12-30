package yukicoder

class Fib {
    var prevNum = 0L
    var num = 1L
    fun next() {
        val numBeforeOperation = num
        num += prevNum
        prevNum = numBeforeOperation
    }
}

fun no953(givenNums: ArrayList<Long>): Int {
    val nums = givenNums.reversed()
    val fib = Fib()
    while (fib.num < nums[0]) {
        fib.next()
    }
    return if (fib.num == nums[0]) {
        fib.next()
        if (nums[0] == 1L && nums[1] == 2L){
            fib.next()
        }
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

