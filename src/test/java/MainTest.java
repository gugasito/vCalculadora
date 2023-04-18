
class MainTest {
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


        @BeforeEach
        void setUp() {
        }

        @AfterEach
        void tearDown() {
        }

        @Test
        void testCalcularB() {
            double resultadoEsperado1 = 1;
            assertEquals(EcuacionRecta.calcularB(1,2,3,4),resultadoEsperado1);
            double resultadoEsperado2 = -1;
            assertEquals(EcuacionRecta.calcularB(4,3,2,1),resultadoEsperado2);
        }
        @Test
        void testCalcularM() {
            double resultadoEsperado1 = 1;
            assertEquals(EcuacionRecta.calcularM(1,2,3,4),resultadoEsperado1);
            double resultadoEsperado2 = 1;
            assertEquals(EcuacionRecta.calcularM(4,3,2,1),resultadoEsperado2);
        }
    }