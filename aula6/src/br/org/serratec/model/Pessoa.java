package br.org.serratec.model;

public class Pessoa implements Tributacao {
	private String nome;
	private Double rendimento;

	public Pessoa(String nome, Double rendimento) {
		super();
		this.nome = nome;
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "Rendimento: " + rendimento;
	}

	public String getNome() {
		return nome;
	}

	public Double getRendimento() {
		return rendimento;
	}

	@Override
	public Double calcularImpostoDeRenda() {
		return rendimento * impostoDeRendaPF;
	}

	@Override
	public Double calcularICMS() {
		return 0.0;
	}

}
