package atcoder

import java.lang.Integer.sum

fun abc124a(buttonA: Int, buttonB: Int): Int{
    val nums = arrayListOf(buttonA, buttonA - 1, buttonB, buttonB -1)
    nums.sortDescending()
    return sum(nums[0], nums[1])
}