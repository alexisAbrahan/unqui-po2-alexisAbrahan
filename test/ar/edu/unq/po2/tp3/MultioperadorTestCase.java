package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class MultioperadorTestCase {

    private Multioperador multioperador;
    private ArrayList<Integer> listaPrueba;

    @BeforeEach
    public void setUp() {
        multioperador = new Multioperador();
        listaPrueba = new ArrayList<>();
    }

    @Test
    public void testSumarNumerosLista() {
        // Escenario: lista con [5, 10, 2]
        listaPrueba.add(5);
        listaPrueba.add(10);
        listaPrueba.add(2);

        int resultado = multioperador.sumarNumerosLista(listaPrueba);

        // 5 + 10 + 2 = 17
        assertEquals(17, resultado);
    }

    @Test
    public void testMultiplicarNumerosLista() {
        // Escenario: lista con [3, 4, 2]
        listaPrueba.add(3);
        listaPrueba.add(4);
        listaPrueba.add(2);

        int resultado = multioperador.multiplicarNumerosLista(listaPrueba);

        // 3 * 4 * 2 = 24
        assertEquals(24, resultado);
    }

    @Test
    public void testRestarNumerosLista() {
        // Escenario: lista con [20, 5, 3]
        listaPrueba.add(20);
        listaPrueba.add(5);
        listaPrueba.add(3);

        int resultado = multioperador.restarNumerosLista(listaPrueba);

        // Toma el primero (20) y le resta los siguientes: 20 - 5 - 3 = 12
        assertEquals(12, resultado);
    }
}