import org.junit.Assert
import java.io.ByteArrayOutputStream
import java.io.PrintStream

// Assert is Java class. It does not have companion object so I cannot add static method as extension.
fun assertIO(input: String, output: String, func: () -> Unit) {
    System.setIn(input.trimIndent().byteInputStream())
    val baos = ByteArrayOutputStream()
    val ps = PrintStream(baos)
    System.setOut(ps)
    func()
    Assert.assertEquals(output.trimIndent(), baos.toString())
}