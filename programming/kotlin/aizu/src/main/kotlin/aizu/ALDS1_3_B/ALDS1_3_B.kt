package aizu.ALDS1_3_B

import java.util.*
import kotlin.math.min


// To improving time, not return but pass value by global variables.
internal fun solve(size: Int, quantum: Int, processes: List<Process>): String {
    val queue = LinkedList<Process>(processes)
    var elapsed = 0
    val endProcess = arrayListOf<Process>()
    while (!queue.isEmpty()) {
        val process = queue.first
        queue.removeFirst()
        val estimated = min(process.time, quantum)
        process.time = process.time - estimated
        elapsed += estimated
        if (process.time == 0) {
            process.exitAt = elapsed
            endProcess.add(process)
        } else {
            queue.addLast(process)
        }
    }
    return endProcess.toResult()
}

internal data class Process(
    val name: String,
    var time: Int,
    var exitAt: Int? = null
)

internal fun ArrayList<Process>.toResult(): String {
    var res = arrayListOf<String>()
    this.forEach {
        res.add("${it.name} ${it.exitAt}")
    }
    return res.joinToString("\n")
}

