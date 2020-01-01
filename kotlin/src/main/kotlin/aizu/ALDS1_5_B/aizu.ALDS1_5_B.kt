package aizu.ALDS1_5_B

internal fun solve(size: Int, nums: List<Int>): Pair<List<Int>, Int> {
    return mergeSort(nums)
}

internal fun mergeSort(nums: List<Int>): Pair<List<Int>, Int> {
    return if (nums.size == 1) {
        Pair(nums, 0)
    } else {
        val left = mergeSort(nums.subList(0, nums.size / 2))
        val right = mergeSort(nums.subList(nums.size / 2, nums.size))
        val merged = zipper(left.first, right.first)
        println("${merged.first}, ${left.second + right.second + merged.second}")
        Pair(merged.first, left.second + right.second + merged.second)
    }
}

// もともと比較後に都度終端チェックをするつもりで実装していた。
// 終端チェックの実装が番兵の実装を期待値で上回るのは、2つの配列のサイズの差が 初めて番兵が登場するまでの回数の期待値 + 番兵が登場してからの回数の期待値 > 初めて番兵が登場するまでの回数の期待値 * 2 となる場合。
// つまり、左右のサイズの差が倍以上ないのであれば番兵を使ったほうが有利。
internal fun zipper(left: List<Int>, right: List<Int>): Pair<List<Int>, Int> {
    val leftWith番兵 = ArrayList<Int>(left)
    val rightWith番兵 = ArrayList<Int>(right)
    leftWith番兵.add(Int.MAX_VALUE)
    rightWith番兵.add(Int.MAX_VALUE)
    val zipped = arrayListOf<Int>()
    var count = 0
    var li = 0
    var ri = 0

    // C++ならforでループしてループ内で判定するからカウンタ処理が書きやすいのだけど、Kotlinだとやりづらいのでwhile内でカウンタを呼ぶ。
    // 一つ余計な真偽判定が入ったけど許してほしい...
    // Kotlinはループのカウンタループのカウンタのような低レイヤーの操作をしないように努めているので、アルゴリズムの再発明には不向きかも。
    for (i in 1..(left.size + right.size)) {
        count += 1
        if (leftWith番兵[li] < rightWith番兵[ri]) {
            zipped.add(leftWith番兵[li])
            li += 1
        } else {
            zipped.add(rightWith番兵[ri])
            ri += 1
        }
    }
    return Pair(zipped, count)
}
