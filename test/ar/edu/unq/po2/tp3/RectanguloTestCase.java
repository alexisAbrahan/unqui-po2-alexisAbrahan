package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTestCase {

    private Point ubicacion;

    @BeforeEach
    public void setUp() {
        // Usamos el constructor de Point que inicia en (0,0)
        ubicacion = new Point();
    }

    @Test
    public void testCalcularArea() {
        // Escenario: Rectángulo de ancho 5 y alto 4
        Rectangulo rectangulo = new Rectangulo( 5, 4,ubicacion);

        // El área es base * altura = 5 * 4 = 20
        assertEquals(20, rectangulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        // Escenario: Rectángulo de base 3 y altura 4 (triángulo notable 3-4-5)
        Rectangulo rectangulo = new Rectangulo(3, 4,ubicacion);

        // La diagonal por Pitágoras es √(3² + 4²) = √(9 + 16) = √25 = 5
        // Nota: Si devuelve un 'double', usamos un tercer parámetro de tolerancia (delta)
        assertEquals(14, rectangulo.calcularPerimetro());
    }

    @Test
    public void testEsHorizontalCuandoElAnchoEsMayorAlAlto() {
        // Escenario: Ancho 10, Alto 3 (Es acostado / horizontal)
        Rectangulo rectanguloHorizontal = new Rectangulo( 10, 3,ubicacion);

        assertTrue(rectanguloHorizontal.esHorizontal());
    }

    @Test
    public void testNoEsHorizontalCuandoElAltoEsMayorAlAncho() {
        // Escenario: Ancho 2, Alto 8 (Es parado / vertical)
        Rectangulo rectanguloVertical = new Rectangulo( 2, 8,ubicacion);

        assertFalse(rectanguloVertical.esHorizontal());
    }

    @Test
    public void testValoresMenoresAUnoSeCorrijenAutomaticamenteAUno() {
        // Escenario 1: Le mandamos ancho 0. Debería forzarlo a 1.
        Rectangulo rectanguloAnchoInvalido = new Rectangulo(0, 5, ubicacion);

        assertEquals(1, rectanguloAnchoInvalido.getAncho(), "El ancho menor a 1 debió corregirse a 1");
        assertEquals(5, rectanguloAnchoInvalido.getAlto());

        // Escenario 2: Le mandamos alto negativo. Debería forzarlo a 1.
        Rectangulo rectanguloAltoInvalido = new Rectangulo(5, -2, ubicacion);

        assertEquals(5, rectanguloAltoInvalido.getAncho());
        assertEquals(1, rectanguloAltoInvalido.getAlto(), "El alto menor a 1 debió corregirse a 1");
    }
}