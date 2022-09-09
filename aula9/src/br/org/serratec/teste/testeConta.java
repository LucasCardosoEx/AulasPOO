package br.org.serratec.teste;

import br.org.serratec.exception.ContaException;
import br.org.serratec.model.Poupanca;

public class testeConta {

	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca("Mario", 1000.);

		try {
			poupanca.deposito(3000.);
			poupanca.saque(2000.);

		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Saque realizado !");
	}

}
