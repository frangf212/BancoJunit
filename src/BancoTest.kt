

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class BancoTest {

    private lateinit var cuenta: Banco

    @BeforeAll
    fun inicio() {
        println("Este método se ejecuta antes de TODAS las pruebas")
    }

    @BeforeEach
    fun presupuesto() {
        cuenta = Banco(100.0) // Cada prueba comienza con un saldo de 100
        println("Este método se ejecuta antes de CADA prueba")
    }

    @Test
    fun aumentosaldo() {
        cuenta.deposito(50.0)
        assertEquals(149.5, cuenta.getBalance())
    }

    @Test
    fun retirosaldo() {
        cuenta.retiro(50.0)
        assertEquals(48.5, cuenta.getBalance())
    }

    @Test
    fun retirosinsaldo() {
        val exception = assertThrows<IllegalArgumentException> {
            cuenta.retiro(200.0)
        }
        assertEquals("Fondos insuficientes", exception.message)
    }

    @Test
    fun depositonegativo() {
        val exception = assertThrows<IllegalArgumentException> {
            cuenta.deposito(-10.0)
        }
        assertEquals("El depósito debe ser mayor que 0", exception.message)
    }

    @Test
    fun retironegativo() {
        val exception = assertThrows<IllegalArgumentException> {
            cuenta.retiro(-10.0)
        }
        assertEquals("El retiro debe ser mayor que 0", exception.message)
    }

    @Test
    fun tranferenciacuentas() {
        val cuentaDestino = Banco(50.0)
        cuenta.transferencia(cuentaDestino, 50.0)
        assertEquals(48.5, cuenta.getBalance())
        assertEquals(98.5, cuentaDestino.getBalance()) 
    }

    @AfterEach
    fun cleanup() {
        println("Este método se ejecuta después de CADA prueba")
    }

    @AfterAll
    fun cleanupOnce() {
        println("Este método se ejecuta después de TODAS las pruebas")
    }
}
