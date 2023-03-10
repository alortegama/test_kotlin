import jdk.jfr.Name
import org.junit.jupiter.api.DisplayName
import kotlin.math.exp
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CalculadoraTest {
    private val calculadora: Calculadora = Calculadora()

    @Test
    fun testSum() {
        println("EJECUTANDO: testSum")
        val expected = 10
        println("EXPECTED\t$expected")
        val result = calculadora.suma(5, 5)
        println("RESULTADO\t$result")
        assertEquals(expected, result)
    }

    @Test
    fun testSumIncorrecto() {
        val expected = 11
        assertNotEquals(expected, calculadora.suma(5, 5))
    }

    @Test
    fun testResta() {
        val expected = 0
        assertEquals(expected, calculadora.resta(5, 5))
    }

    @Test
    @DisplayName("Resta Test Incorrecto")
    fun testRestaIncorrecto() {
        val expected = 1
        assertNotEquals(expected, calculadora.resta(5, 5), "La resta de 5 y 5 es 0")
    }


}