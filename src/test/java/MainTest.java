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

    @Test
    void testSumar() {
        double resultadoEsperado1 =  6;
        assertEquals(Main.sumar(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 8;
        assertEquals(Main.sumar(3,5),resultadoEsperado2);
    }

    @Test
    void testRestar() {
        double resultadoEsperado1 =  -2;
        assertEquals(Main.restar(2,4),resultadoEsperado1);
        double resultadoEsperado2 = -2;
        assertEquals(Main.restar(3,5),resultadoEsperado2);
    }

    @Test
    void testMultiplicar() {
        double resultadoEsperado1 =  8;
        assertEquals(Main.multiplicar(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 15;
        assertEquals(Main.multiplicar(3,5),resultadoEsperado2);
    }

    @Test
    void testDividir() {
        double resultadoEsperado1 =  0.5;
        assertEquals(Main.dividir(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 0.6;
        assertEquals(Main.dividir(3,5),resultadoEsperado2);
    }

    @Test
    void testMayorNum() {
        double resultadoEsperado1 =  4;
        assertEquals(Main.mayorNum(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 5;
        assertEquals(Main.mayorNum(3,5),resultadoEsperado2);
    }

    @Test
    void testMenorNum() {
        double resultadoEsperado1 =  2;
        assertEquals(Main.menorNum(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 3;
        assertEquals(Main.menorNum(3,5),resultadoEsperado2);
    }

    @Test
    void testElevado() {
        double resultadoEsperado1 =  16;
        assertEquals(Main.elevado(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 243;
        assertEquals(Main.elevado(3,5),resultadoEsperado2);
    }

    @Test
    void testPorcentaje() {
        double resultadoEsperado1 =  0.08;
        assertEquals(Main.porcentaje(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 0.15;
        assertEquals(Main.porcentaje(3,5),resultadoEsperado2);
    }
}