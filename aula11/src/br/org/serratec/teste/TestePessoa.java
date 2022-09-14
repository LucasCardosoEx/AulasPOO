package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Amaral", "a@gmail.com", 15);
		Pessoa p2 = new Pessoa("Vinicius", "v@gmail.com", 85);
		Pessoa p3 = new Pessoa("Junior", "j@gmail.com", 54);

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);

		Collections.sort(pessoas);
		System.out.println(pessoas);
		System.out.println("Último:" + pessoas.get(2));
		for (Pessoa pessoa : pessoas) {
			System.out.println("----------------");
			System.out.println(pessoa);
		}
	}

}
