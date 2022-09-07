package br.edu.exercicio;

import java.time.LocalDate;

public class Tucano extends Ave {

	private Double peso;
	
	

	public Tucano(String nome, LocalDate dataVacinacao, String cor, Double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	@Override
	public String voar() {
		return null;
	}

	@Override
	public String emitirSom() {
		return null;
	}

	public Double getPeso() {
		return peso;
	}

}
