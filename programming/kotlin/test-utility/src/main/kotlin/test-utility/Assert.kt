import org.hamcrest.Matchers.greaterThanOrEqualTo
import org.hamcrest.Matchers.lessThanOrEqualTo
import org.junit.Assert
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.reflect.KFunction1

// Assert is Java class. It does not have companion object so I cannot add static method as extension.
fun assertIO(input: String, output: String, func: KFunction1<@ParameterName(name = "args") Array<String>, Unit>) {
    Assert.assertEquals(output, runWith(func, input).toString())
}

fun assertIOWithInError(input: String, output: String, error: Number, func: KFunction1<@ParameterName(name = "args") Array<String>, Unit>){
    val actual = runWith(func, input).toString()
    when(error){
        is Int -> {
            Assert.assertThat(actual.toInt(), greaterThanOrEqualTo(output.toInt() - error.toInt()))
            Assert.assertThat(actual.toInt(), lessThanOrEqualTo(output.toInt() + error.toInt()))
        }
        is Double -> {
            Assert.assertThat(actual.toDouble(), greaterThanOrEqualTo(output.toDouble() - error.toDouble()))
            Assert.assertThat(actual.toDouble(), lessThanOrEqualTo(output.toDouble() + error.toDouble()))
        }
        else -> throw Error("Number Type Unsupported.")
    }
}

private fun runWith(func: KFunction1<@ParameterName(name = "args") Array<String>, Unit>, input: String): ByteArrayOutputStream{
    System.setIn(input.byteInputStream())
    val baos = ByteArrayOutputStream()
    val ps = PrintStream(baos)
    System.setOut(ps)
    func(arrayOf())
    return baos
}
