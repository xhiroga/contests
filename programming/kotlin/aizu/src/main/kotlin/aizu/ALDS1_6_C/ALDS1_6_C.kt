package aizu.ALDS1_6_C

internal fun solve(size: Int, cards: ArrayList<Card>): List<Card> {
    return cards.toMutableList().partitioned().toList()
}

internal fun MutableList<Card>.partitioned(): MutableList<Card> {
    val size = this.size
    if (size <= 1){
        return this
    }
    val partition = this[size - 1].second
    var i = 0
    for (j in 1 until size) {
        if (this[i].second > partition) {
            this.add(this[i])
            this.removeAt(i)
        }else{
            i += 1
        }
    }
    this.subList(0, i).partitioned()
    this.subList(i + 1, size).partitioned()
    return this
}

internal typealias Card = Pair<String, Int>
