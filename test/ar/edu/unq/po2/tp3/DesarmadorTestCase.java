package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DesarmadorTestCase {
    private Desarmador desarmador;

    @BeforeEach
    public void setUp() throws Exception {
//Se crea el contador
        desarmador = new Desarmador();
//Se agregan los numeros. Un solo par y nueve impares
        desarmador.contarDigitosPares(14485484);

    }

    private void contarDigitosPares(int i) {
    }


    @Test
    public void testEvenNumbers() {
// Getting the even occurrences
        int amount = desarmador.contarDigitosPares(14485484);
// I check the amount is the expected one
        assertEquals(amount, 6);
    }


}