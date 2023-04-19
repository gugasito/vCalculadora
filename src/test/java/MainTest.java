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

    @org.junit.jupiter.api.Test
    void testPerimetroCuadrado() {
        double resultadoEsperado1 =  16;
        assertEquals(Main.perimetroCuadrado(4),resultadoEsperado1);
        double resultadoEsperado2 = 8;
        assertEquals(Main.perimetroCuadrado(2),resultadoEsperado2);
    }

    @Test
    void testAreaCuadrado() {
        double resultadoEsperado1 = 16;
        assertEquals(Main.areaCuadrado(4),resultadoEsperado1);
        double resultadoEsperado2 = 4;
        assertEquals(Main.areaCuadrado(2),resultadoEsperado2);
    }

    @Test
    void testPerimetroRectangulo() {
        double resultadoEsperado1 = 10;
        assertEquals(Main.perimetroRectangulo(3, 2),resultadoEsperado1);
        double resultadoEsperado2 = 12;
        assertEquals(Main.perimetroRectangulo(4, 2),resultadoEsperado2);
    }

    @Test
    void testAreaRectangulo() {
        double resultadoEsperado1 = 6;
        assertEquals(Main.areaRectangulo(3,2),resultadoEsperado1);
        double resultadoEsperado2 = 8;
        assertEquals(Main.areaRectangulo(4,2),resultadoEsperado2);
    }

    @Test
    void testPerimetroCirculo() {
        double resultadoEsperado1 = 12.56;
        assertEquals(Main.perimetroCirculo(2),resultadoEsperado1);
        double resultadoEsperado2 = 25.12;
        assertEquals(Main.perimetroCirculo(4),resultadoEsperado2);
    }

    @Test
    void testAreaCirculo() {
        double resultadoEsperado1 = 12.56;
        assertEquals(Main.areaCirculo(2),resultadoEsperado1);
        double resultadoEsperado2 = 50.24;
        assertEquals(Main.areaCirculo(4),resultadoEsperado2);
    }

    @Test
    void testAreaSuperficialEsfera() {
        double resultadoEsperado1 = 50.24;
        assertEquals(Main.areaSuperficialEsfera(2),resultadoEsperado1);
        double resultadoEsperado2 = 200.96;
        assertEquals(Main.areaSuperficialEsfera(4),resultadoEsperado2);
    }

    @Test
    void testVolumenEsfera() {
        double resultadoEsperado1 =((double) 3 /4)*25.12;
        assertEquals(Main.volumenEsfera(2),resultadoEsperado1);
        double resultadoEsperado2 = ((double) 3 /4)*200.96;
        assertEquals(Main.volumenEsfera(4),resultadoEsperado2);
    }

    @Test
    void testAreaSuperficialCubo() {
        double resultadoEsperado1 = 24;
        assertEquals(Main.areaSuperficialCubo(2),resultadoEsperado1);
        double resultadoEsperado2 = 96;
        assertEquals(Main.areaSuperficialCubo(4),resultadoEsperado2);
    }

    @Test
    void testVolumenCubo() {
        double resultadoEsperado1 = 8;
        assertEquals(Main.volumenCubo(2),resultadoEsperado1);
        double resultadoEsperado2 = 64;
        assertEquals(Main.volumenCubo(4),resultadoEsperado2);
    }

    @Test
    void testAreaSuperficialCono() {
        double resultadoEsperado1 = 37.68;
        assertEquals(Main.areaSuperficialCono(2,4),resultadoEsperado1);
        double resultadoEsperado2 = 150.72;
        assertEquals(Main.areaSuperficialCono(4,8),resultadoEsperado2);
    }

    @Test
    void testVolumenCono() {
        double resultadoEsperado1 = (62.8)/3;
        assertEquals(Main.volumenCono(2,5),resultadoEsperado1);
        double resultadoEsperado2 = (502.4)/3;
        assertEquals(Main.volumenCono(4,10),resultadoEsperado2);
    }
    @Test
    void testCalculoDeX() {
        double resultadoEsperado1 = 14;
        assertEquals(Main.CalculoDeX(3,2,6,4,3,2),resultadoEsperado1);
        double resultadoEsperado2 = -0.5;
        assertEquals(Main.CalculoDeX(0,2,6,4,3,7),resultadoEsperado2);
    }

        @Test
        void testCalcularB() {
            double resultadoEsperado1 = 1;
            assertEquals(Main.calcularB(1,2,3,4),resultadoEsperado1);
            double resultadoEsperado2 = -1;
            assertEquals(Main.calcularB(4,3,2,1),resultadoEsperado2);
        }
        @Test
        void testCalcularM() {
            double resultadoEsperado1 = 1;
            assertEquals(Main.calcularM(1,2,3,4),resultadoEsperado1);
            double resultadoEsperado2 = 1;
            assertEquals(Main.calcularM(4,3,2,1),resultadoEsperado2);
        }

    @Test
    void testComprobarEc() {
        assertTrue(Main.comprobarEc(1,-2,5));
        assertFalse(Main.comprobarEc(2,4,-6));
    }

    @Test
    void testCalculoDeY() {
        double resultadoEsperado1 = -18;
        assertEquals(Main.CalculoDeY(3,2,6,4,3,2),resultadoEsperado1);
        double resultadoEsperado2 = 3;
        assertEquals(Main.CalculoDeY(0,2,6,4,3,7),resultadoEsperado2);
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