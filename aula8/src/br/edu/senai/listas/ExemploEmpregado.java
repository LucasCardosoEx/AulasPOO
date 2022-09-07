package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {

	public static void main(String[] args) {

		List<Empregado> empregados = new ArrayList<>();

		empregados.add(new Empregado("Cleiton", "IX-XIX-IIV"));
		empregados.add(new Empregado("Atreus", "IX-CX-XII"));
		empregados.add(new Empregado("Mimir", "IX-XX-C"));

		for (Empregado palito : empregados) {
			System.out.println(palito);
			System.out.println("---------------------");

		}
	}

}
