import org.example.Digitos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestDigitos {
    private Digitos digitos;

    @BeforeEach
    public void setUp() {
        digitos = new Digitos();
    }
    @Test
    public void testCalcularMediaDigitosNumeroMisto() {
        double media = Digitos.calcularMediaDigitos(123456789);
        assertEquals(5.0, media, 0.001);
        // Espera-se uma média de 5.0 para 1, 2, 3, 4, 5, 6, 7, 8, 9.
    }

    @Test
    public void testCalcularMediaDigitosNumeroUnicoDigito() {
        double media = Digitos.calcularMediaDigitos(7);
        assertEquals(7.0, media, 0.001);
    }
}
