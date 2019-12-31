package aizu.ALDS1_4_D

// 条件を満たす最小の値を探す。内部的には2分探索を利用したほうがよい。そうする場合、JavaDocいわく "The array must be sorted".
internal fun solve(payloadCount: Int, trackCount: Int, payloads: List<Int>): Int {
    // Rangeを作ってminByで判定すると、途中で打ち切れないのでリストの終端まで全部判定して無駄が多い
    // そもそも入力が膨大になったときにRangeだと太刀打ちできない。Range(1..10^12)はOOMで落ちる。
    var ton = 1
    val tonLimit = Math.pow(100000.0, 100000.0).toInt()
    while (!ton.トンの積載量のトラックが荷物をすべて積載できるか(payloadCount, trackCount, payloads) && ton < tonLimit) {
        ton += 1
    }
    return ton
}

internal fun Int.トンの積載量のトラックが荷物をすべて積載できるか(payloadCount: Int, trackCount: Int, payloads: List<Int>): Boolean {
    var currentPayloadIndex = 0
    for (i in 1..trackCount) {
        var freeSpace = this
        while (freeSpace >= payloads[currentPayloadIndex]) {
            freeSpace -= payloads[currentPayloadIndex]
            currentPayloadIndex += 1
            if (currentPayloadIndex == payloadCount) {
                return true
            }
        }
    }
    return false
}
