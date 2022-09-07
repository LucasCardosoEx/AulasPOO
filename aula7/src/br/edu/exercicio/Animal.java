package br.edu.exercicio;

import java.time.LocalDate;

public abstract class Animal {
	
	protected String nome;
	protected LocalDate dataVacinacao;
	
	
	public Animal(String nome, LocalDate dataVacinacao) {
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
	}


	public String getNome() {
		return nome;
	}


	public LocalDate getDataVacinacao() {
		return dataVacinacao;
	}


	public abstract String emitirSom();

}
