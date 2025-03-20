

import org.junit.jupiter.api.*
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BancoTest {




    @BeforeEach
    fun setup() {
        println("Este método se ejecuta antes de CADA prueba")
    }

    @Test
    fun test1() {
        println("Ejecutando test 1")
    }

    @Test
    fun test2() {
        println("Ejecutando test 2")
    }

    @AfterEach
    fun cleanup() {
        println("Este método se ejecuta después de CADA prueba")
    }

    @AfterAll
    fun cleanupOnce() {
        println("Este método se ejecuta después de TODAS las pruebas")
    }

    @BeforeAll
    fun setupOnce() {
        println("Este método se ejecuta antes de TODAS las pruebas")
    }
}
