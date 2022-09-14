package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {

		Empregado emprega1 = new Empregado("123", "Romario");
		Empregado emprega2 = new Empregado("123", "Romaraio");

		System.out.println(emprega1);
		System.out.println(emprega2);

		if (emprega1.getNome().equals(emprega2.getNome())) {
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes!");
		}
	}

}
