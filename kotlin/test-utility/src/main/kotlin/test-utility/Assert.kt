import org.junit.Assert
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.reflect.KFunction1

// Assert is Java class. It does not have companion object so I cannot add static method as extension.
fun assertIO(input: String, output: String, func: KFunction1<@ParameterName(name = "args") Array<String>, Unit>) {
    System.setIn(input.byteInputStream())
    val baos = ByteArrayOutputStream()
    val ps = PrintStream(baos)
    System.setOut(ps)
    func(arrayOf())
    Assert.assertEquals(output, baos.toString())
}