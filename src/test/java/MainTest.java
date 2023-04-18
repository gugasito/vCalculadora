import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSolCuadratic1() {
        double resultadoEsperado = -1;
        assertEquals(Main.solCuadratic1(1, 2, 1), resultadoEsperado);
        double resultadoEsperado2 = 1;
        assertEquals(Main.solCuadratic1(2, 4, -6), resultadoEsperado2);
    }

    @Test
    void testSolCuadratic2() {
        double resultadoEsperado = -1;
        assertEquals(Main.solCuadratic2(1, 2, 1), resultadoEsperado);
        double resultadoEsperado2 = -3;
        assertEquals(Main.solCuadratic2(2, 4, -6), resultadoEsperado2);
    }

    @Test
    void testComprobarEc() {
        assertTrue(Main.comprobarEc(1,-2,5));
        assertFalse(Main.comprobarEc(2,4,-6));
    }
}