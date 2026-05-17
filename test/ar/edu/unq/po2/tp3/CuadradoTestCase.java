package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadradoTestCase {

    private Point ubicacion;

    @BeforeEach
    public void setUp() {
        ubicacion = new Point(); // (0,0)
    }

    @Test
    public void testCalcularAreaDeUnCuadrado() {
        // Escenario: Cuadrado de lado 4
        Cuadrado cuadrado = new Cuadrado(4, ubicacion);

        // El área heredada debería ser 4 * 4 = 16
        assertEquals(16, cuadrado.calcularArea());
    }

    @Test
    public void testCalcularPerimetroDeUnCuadrado() {
        // Escenario: Cuadrado de lado 5
        Cuadrado cuadrado = new Cuadrado(5, ubicacion);

        // El perímetro heredado debería ser (5 * 2) + (5 * 2) = 20
        assertEquals(20, cuadrado.calcularPerimetro());
    }

    @Test
    public void testUnCuadradoNuncaEsHorizontal() {
        // Al ser los lados iguales, ancho nunca va a ser estrictamente mayor que alto
        Cuadrado cuadrado = new Cuadrado(6, ubicacion);

        assertFalse(cuadrado.esHorizontal());
    }

    @Test
    public void testLadoMenorAUnoSeCorrigeAUno() {
        // Escenario: Intentamos crear un cuadrado con lado 0
        Cuadrado cuadradoInvalido = new Cuadrado(0, ubicacion);

        // Al reutilizar la lógica de Rectangulo, tanto ancho como alto deben ser 1
        assertEquals(1, cuadradoInvalido.getAncho());
        assertEquals(1, cuadradoInvalido.getAlto());

        // El área de este cuadrado corregido debería ser 1 * 1 = 1
        assertEquals(1, cuadradoInvalido.calcularArea());
    }
}
