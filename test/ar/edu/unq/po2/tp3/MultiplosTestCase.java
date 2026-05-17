package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplosTestCase {

    private Multiplos multiplos;

    @BeforeEach
    public void setUp() {
        multiplos = new Multiplos();
    }

    @Test
    public void testMúltiploSimultaneoCasoEnunciado() {
        // Ejemplo del enunciado: entre 3 y 9, el más alto <= 1000 es 999
        int resultado = multiplos.multiploSimultaneo(3, 9);
        assertEquals(999, resultado);
    }

    @Test
    public void testMúltiploSimultaneoNumerosCoprimos() {
        // El MCM de 20 y 30 es 60. El múltiplo más alto <= 1000 es 60 * 16 = 960
        int resultado = multiplos.multiploSimultaneo(20, 30);
        assertEquals(960, resultado);
    }

    @Test
    public void testMúltiploSimultaneoNoExisteEnRango() {
        // El MCM de 600 y 700 es 4200, se pasa de 1000, debe dar -1
        int resultado = multiplos.multiploSimultaneo(600, 700);
        assertEquals(-1, resultado);
    }

    @Test
    public void testMúltiploSimultaneoConCero() {
        // Con cero o negativos no debería explotar, debería retornar -1
        int resultado = multiplos.multiploSimultaneo(0, 5);
        assertEquals(-1, resultado);
    }

    @Test
    public void testObtenerMCD() {
        // Testeamos tu método del MCD de forma aislada para asegurar que el Stream funcione
        assertEquals(3, multiplos.obtenerMCD(15, 9));
        assertEquals(1, multiplos.obtenerMCD(7, 5)); // Primos entre sí
        assertEquals(10, multiplos.obtenerMCD(20, 30));
    }
}