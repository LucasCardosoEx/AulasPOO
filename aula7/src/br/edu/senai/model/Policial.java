package br.edu.senai.model;

//(final) Essa class não poderá ter filhos
//Imutável Math
public class Policial {

	private String nome;
	private String matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	// Quando colocar o final no método estamos proibindo a sobrescrita
	@Override
	public final String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
