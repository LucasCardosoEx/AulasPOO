package br.org.serratec.teste;

import br.org.serratec.model.Funcionario;
import br.org.serratec.model.Sorteio;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ana", "a@gmail.com", 5600.);
		Funcionario f2 = new Funcionario("Julia", "j@gmail.com", 2600.);
		Funcionario f3 = new Funcionario("Catarina", "c@gmail.com", 4600.);
		Funcionario f4 = new Funcionario("Pablito", "p@gmail.com", 9000.);

		Sorteio<Funcionario> sor = new Sorteio<>();
		sor.adicionar(f1);
		sor.adicionar(f2);
		sor.adicionar(f3);
		sor.adicionar(f4);

		System.out.println("Ganhador:" + sor.sorteio());
		
		Sorteio<String> so = new Sorteio<>();
		String t1 = "Flamengo";
		String t2 = "Vasco";
		String t3 = "Botafogo";

		so.adicionar(t1);
		so.adicionar(t2);
		so.adicionar(t3);
		System.out.println("Ganhador:" + so.sorteio());
	}

}
