package aizu

import java.io.BufferedReader
import java.io.InputStreamReader

// insertion sort
internal fun solveAlds_1_1_A(size: Int, cards: ArrayList<Int>): String {
    val leftSide = arrayListOf<Int>()
    val rightSide = arrayListOf<Int>() // subList looks not to create new ArrayList and it causes ConcurrentModificationException.
    rightSide.addAll(cards.subList(0, size))
    var res = arrayListOf<String>()
    cards.forEach { card ->
        leftSide.add(card)
        leftSide.sort() // 手抜きは承知。本来はここで不要な順序の交換を行わないように配慮すべきである。そうでないと安定ソートにならない。
        rightSide.removeAt(0)
        res.add((leftSide + rightSide).joinToString(" "))
    }
    return res.joinToString("\n")
}
