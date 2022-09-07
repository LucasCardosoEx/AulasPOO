package br.edu.senai.exercicios;

import java.util.ArrayList;

public class Time extends Atleta{
	private String nome;
	private String tecnico;
	private String diretor;
	
	List<Atleta> buraco = new ArrayList<>();
	
	public Time(String nome, String tecnico, String diretor) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}


	@Override
	public String toString() {
		return "Time [nome=" + nome + ", tecnico=" + tecnico + ", diretor=" + diretor + "]";
	}


	public String getNome() {
		return nome;
	}


	public String getTecnico() {
		return tecnico;
	}


	public String getDiretor() {
		return diretor;
	}
	

}
