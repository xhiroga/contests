internal fun solve(input: String): String {
    TODO()
}

fun main() {
    var OUTPUT = ""

    // InputStreamReaderをそのまま使うと実行ごとに読み込みが発生するため、BufferedReaderを用いる。
    val br = System.`in`.bufferedReader()

    OUTPUT += solve(br.readLine())
    print(OUTPUT)
}
