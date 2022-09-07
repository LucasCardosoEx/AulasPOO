package br.edu.senai.teste;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {
	public static void main(String[] args) {

		Setor setor1 = new Setor(464, "RH");
		Setor setor2 = new Setor(432, "DP");

		Pessoa pessoa1 = new Pessoa("Raphane", "978989787", EstadoCivil.SOLTEIRO, setor1);
		Pessoa pessoa2 = new Pessoa("Julia", "9748415646", EstadoCivil.SOLTEIRO, setor2);

		System.out.println(pessoa1 + "" + setor1);
		System.out.println(pessoa2);

		// Imprimi tudo de EstadoCivil
		for (EstadoCivil situation : EstadoCivil.values()) {
			System.out.println(situation);

		}

	}
}
