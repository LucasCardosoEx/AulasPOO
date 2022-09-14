package br.org.serratec.model;

public class Funcionario {
	private String nome;
	private String email;
	private Double valor;

	public Funcionario(String nome, String email, Double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.valor = valor;
	}

	public Funcionario(String nome2, String email2, Double valor2, String categoria) {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return nome + " | Email:" + email + " | Valor:" + valor;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getValor() {
		return valor;
	}

}
