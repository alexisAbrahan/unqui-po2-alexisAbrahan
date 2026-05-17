package ar.edu.unq.po2.tp3;
import java.util.stream.Stream;

public class Multiplos {

    public int multiploSimultaneo(int numero, int numero2) {

        if (numero <= 0 || numero2 <= 0) {
            return -1;
        }


        int mcm = (numero * numero2) / obtenerMCD(numero, numero2);


        if (mcm > 1000) {
            return -1;
        }

        // 4. Buscamos el múltiplo más alto menor o igual a 1000
        int resultado = (1000 / mcm) * mcm;

        return resultado;
    }

    public int obtenerMCD(int x, int y) {
        return Stream.iterate(new int[]{x, y}, t -> new int[]{t[1], t[0] % t[1]})
                .filter(t -> t[1] == 0)
                .findFirst()
                .map(t -> t[0])
                .orElse(1);
    }
}