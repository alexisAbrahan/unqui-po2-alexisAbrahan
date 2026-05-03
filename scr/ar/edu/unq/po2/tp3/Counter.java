package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numbers = new ArrayList<Integer>();
	
	public void addNumber(int number) {
        this.numbers.add(number);
    }
	
	public int contarImpar() {
		int cantidadImpares = 0;
		for (int numero : numbers) {
	        if (numero % 2 != 0) {
	            cantidadImpares++;
	        }
		}
		return cantidadImpares;
	}
}