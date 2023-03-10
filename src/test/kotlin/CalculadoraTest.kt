import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CalculadoraTest {
    private val calculadora: Calculadora = Calculadora()

    @Test
    fun testSum() {
        val expected = 10
        assertEquals(expected, calculadora.suma(5, 5))
    }

    @Test
    fun testSumIncorrecto() {
        val expected = 11
        assertNotEquals(expected, calculadora.suma(5, 5))
    }



}