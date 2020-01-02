package aizu.ALDS1_6_B

internal fun solve(size: Int, nums: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    var partition = nums[size - 1]
    for (j in 1..size) {
        if (nums[i] > partition) {
            nums.add(nums[i])
            nums.removeAt(i)
        } else {
            i += 1
        }
    }
    return nums
}

