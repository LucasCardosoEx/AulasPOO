package exercicio5;

import java.util.Arrays;

public class Contato {

	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + "\n" + endereco + telefones[0] + telefones[1];
	}

	public void adicionarTelefone(Telefone telefone) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = telefone;
				break;
			}
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public void mostrarTelefones() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println(telefones[i].getNumero());
		}

	}

	public void mostrarEndereco() {

		System.out.println(endereco);
	}
}
