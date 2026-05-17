package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTestCase {

    @Test
    public void testCrearPointConCoordenadasEspecificas() {
        // Escenario 1: Se crea indicando los valores x e y
        Point Point = new Point(5, 8);

        // Verificaciones
        assertEquals(5, Point.getX(), "La coordenada X debería ser 5");
        assertEquals(8, Point.getY(), "La coordenada Y debería ser 8");
    }

    @Test
    public void testCrearPointSinParametrosDebeIniciarEnCeroCero() {
        // Escenario 2: Se crea directamente sin enviarles parámetros
        Point PointOrigen = new Point();

        // Verificaciones
        assertEquals(0, PointOrigen.getX(), "La coordenada X por defecto debería ser 0");
        assertEquals(0, PointOrigen.getY(), "La coordenada Y por defecto debería ser 0");
    }
    @Test
    public void testSumarPointModificaLasCoordenadasDelPointActual() {
        // Escenario: Tenemos dos Points distintos
        Point PointBase = new Point(10, 5);
        Point PointASumar = new Point(3, 4);

        // Se ejecuta la suma pasando el otro Point por parámetro
        PointBase.sumarPoint(PointASumar);

        // Verificaciones: (10 + 3 = 13) y (5 + 4 = 9)
        assertEquals(13, PointBase.getX(), "La coordenada X debió sumar el valor del otro Point");
        assertEquals(9, PointBase.getY(), "La coordenada Y debió sumar el valor del otro Point");

        // Verificación extra: El Point que pasamos por parámetro NO debió modificarse
        assertEquals(3, PointASumar.getX());
        assertEquals(4, PointASumar.getY());
    }

    @Test
    public void testCambiarPosModificaCorrectamenteAmbasCoordenadas() {
        // Escenario: Point arranca en un lugar cualquiera
        Point Point = new Point(1, 1);

        // Cambiamos de posición enviando los nuevos valores x e y
        Point.cambiarPos(15, 30);

        // Verificaciones
        assertEquals(15, Point.getX(), "La coordenada X debió cambiar a 15");
        assertEquals(30, Point.getY(), "La coordenada Y debió cambiar a 30");
    }
}