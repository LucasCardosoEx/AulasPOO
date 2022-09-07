package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Medico;

public class ExemploMedico {

	public static void main(String[] args) {
		List<Medico> medicos = new ArrayList<>();

		medicos.add(new Medico("142", "Dr.Manhatam", 200.));
		medicos.add(new Medico("123", "Dra.Quinzel", 380.));
		medicos.add(new Medico("154", "Dr.Frans", 290.));
		Double maior = 0.0;
		String nome = "";

		for (Medico medico : medicos) {
			if (medico.getValorConsulta() > maior) {
				maior = medico.getValorConsulta();
				nome = medico.getNome();
			}
			System.out.println(medico);
			System.out.println("____________________");
		}
		System.out.println("O valor mais caro é:" + nome + " " + "R$" + maior);

	}

}
