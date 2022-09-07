package br.org.serratec.model;

public class Asssistente extends Funcionario {

	private String tipo;

	public Asssistente(String cpf, String nome, Double salario, String tipo) {
		super(cpf, nome, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
