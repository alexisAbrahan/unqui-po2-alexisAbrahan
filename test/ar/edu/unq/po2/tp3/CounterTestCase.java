package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
    private Counter counter;

    @BeforeEach
    public void setUp() throws Exception {
        counter = new Counter();

        // Se agregan los números: 9 impares y 1 par
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(5);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
        counter.addNumber(14);
    }

    @Test
    public void testEvenNumbers() {
        // Verificamos la cantidad de pares (solo el número 4)
        int amount = counter.contarPares();
        assertEquals(2, amount);
    }

    @Test
    public void testOddNumbers() {
        // Verificamos la cantidad de multiplos en el array
        int amount = counter.cantidadDeMCde_(7);
        assertEquals(1, amount);
    }


}