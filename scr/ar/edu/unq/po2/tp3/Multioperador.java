package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Multioperador {

    private ArrayList<Integer> numeros;

    public void agregarNumero(int numero) {
        this.numeros.add(numero);
    }


    public void agregarListaDeNumeros(ArrayList<Integer> nuevosNumeros) {
        this.numeros.addAll(nuevosNumeros);
    }


    public void agregarVariosNumeros(Integer... variosNumeros) {
        this.numeros.addAll(java.util.Arrays.asList(variosNumeros));
    }


    public int sumarNumerosLista(ArrayList<Integer> u) {
        return u.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public int multiplicarNumerosLista(ArrayList<Integer> u) {
        return u.stream()
                .reduce((numeroHastaAhora,numero)-> {
                    return numeroHastaAhora * numero;
                }).orElse(0);
    }
    public int restarNumerosLista(ArrayList<Integer> u) {
         return u.stream()
                 .reduce((numeroHastaAhora,numero)-> {
                    return numeroHastaAhora - numero;
        }).orElse(0);
    }


}
