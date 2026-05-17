package ar.edu.unq.po2.tp3;

public class Desarmador {


    public int contarDigitosPares(int numero) {
        int contador = 0;
        int n = Math.abs(numero);
        if (n == 0) return 1;

        while (n > 0) {
            int ultimoDigito = n % 10;            if (ultimoDigito % 2 == 0) {
                contador++;
            }

            n = n / 10;
        }


        return contador;
    }


    public int numeroConMasDigitosPares(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0;

        int ganador = arreglo[0];
        int maxPares = contarDigitosPares(arreglo[0]);

        for (int i = 1; i < arreglo.length; i++) {
            int paresActual = contarDigitosPares(arreglo[i]);


            if (paresActual > maxPares) {
                maxPares = paresActual;
                ganador = arreglo[i];
            }
        }

        return ganador;
    }
}