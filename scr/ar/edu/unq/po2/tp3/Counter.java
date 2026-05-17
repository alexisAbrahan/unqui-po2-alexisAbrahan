package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> numbers = new ArrayList<>();

	public void addNumber(int number) {
		this.numbers.add(number);
	}

	public int contarPares() {
		return (int) numbers.stream()
				.filter(n -> n % 2 == 0)
				.count();
	}

	public int contarImpar() {
		return (int) numbers.stream()
				.filter(n -> n % 2 != 0)
				.count();
	}
	public int cantidadDeMCde_(int numeroMultiplo){
		return (int) numbers.stream()
				.filter(n -> n % numeroMultiplo == 0)
				.count();
	}
}