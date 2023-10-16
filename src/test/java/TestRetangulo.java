import org.example.Retangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRetangulo {
    @Test
    public void caso1Area(){
        Retangulo retangulo = new Retangulo();
        int area = retangulo.area(3, 5);
        int testArea = 15;
        assertEquals(area, testArea, "Erro no calculo da area!");
    }


    @Test
    public void caso1Perimetro(){
        Retangulo retangulo = new Retangulo();
        int perimetro = retangulo.perimetro(3, 5);
        int testPerimetro = 16;
        assertEquals(perimetro, testPerimetro, "Erro no calculo da perimetro!");
    }

    @Test
    public void caso2Area(){
        Retangulo retangulo = new Retangulo();
        int area = retangulo.area(5, 8);
        int testArea = 40;
        assertEquals(area, testArea, "Erro no calculo da area!");
    }


    @Test
    public void caso2Perimetro(){
        Retangulo retangulo = new Retangulo();
        int perimetro = retangulo.perimetro(5, 8);
        int testPerimetro = 26;
        assertEquals(perimetro, testPerimetro, "Erro no calculo da perimetro!");
    }

    @Test
    public void caso3Area(){
        Retangulo retangulo = new Retangulo();
        int area = retangulo.area(2, 4);
        int testArea = 8;
        assertEquals(area, testArea, "Erro no calculo da area!");
    }


    @Test
    public void caso3Perimetro(){
        Retangulo retangulo = new Retangulo();
        int perimetro = retangulo.perimetro(2, 4);
        int testPerimetro = 12;
        assertEquals(perimetro, testPerimetro, "Erro no calculo da perimetro!");
    }

    @Test
    public void testIsTriangle(){
        Retangulo retangulo = new Retangulo();
        assertTrue(retangulo.isTriangle(3, 4, 5)); // Triângulo possível
        assertFalse(retangulo.isTriangle(2, 3, 5)); // Triângulo impossível

    }
}
