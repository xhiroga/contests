package aizu.ALDS1_6_A

internal fun solve(size: Int, nums: ArrayList<Int>): ArrayList<Int> {
    val counter = arrayListOf<Int>()
    val maxNum = 10000
    for (i in 0..maxNum) {
        counter.add(0)
    }
    for (num in nums) {
        counter[num] += 1
    }

    for (i in 1..maxNum) {
        counter[i] += counter[i - 1]
    }

    val sorted = arrayListOf<Int>()
    for (i in 0 until nums.size) {
        sorted.add(0)
    }
    nums.forEach {
        sorted[counter[it] - 1] = it
        counter[it] -= 1
        println(sorted)
    }
    return sorted
}
