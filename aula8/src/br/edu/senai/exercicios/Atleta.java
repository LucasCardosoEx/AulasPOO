package br.edu.senai.exercicios;

public class Atleta {
	private String nome;
	private int idade;
	private String posicao;
	
	public Atleta(String nome, int idade, String posicao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
	}
	
	public Atleta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", posicao=" + posicao + "]";
	}

	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getPosicao() {
		return posicao;
	}

}
