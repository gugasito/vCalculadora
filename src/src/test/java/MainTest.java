import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCalculoDeX() {
        double resultadoEsperado1 = 14;
        assertEquals(Main.CalculoDeX(3,2,6,4,3,2),resultadoEsperado1);
        double resultadoEsperado2 = -0.5;
        assertEquals(Main.CalculoDeX(0,2,6,4,3,7),resultadoEsperado2);
    }

    @Test
    void testCalculoDeY() {
        double resultadoEsperado1 = -18;
        assertEquals(Main.CalculoDeY(3,2,6,4,3,2),resultadoEsperado1);
        double resultadoEsperado2 = 3;
        assertEquals(Main.CalculoDeY(0,2,6,4,3,7),resultadoEsperado2);
    }
}