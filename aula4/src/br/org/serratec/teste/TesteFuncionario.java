package br.org.serratec.teste;

import br.org.serratec.model.Asssistente;
import br.org.serratec.model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("123", "Roberto", 5000., "Financeiro");
		Asssistente assistente = new Asssistente("321", "Raphane", 2200., "TI");
		System.out.println("Dados: " + gerente.getNome() + "\n" + gerente.aumentoSalario());
		System.out.println("Dados: " + assistente.getNome() + "\n" + assistente.aumentoSalario());

	}

}
