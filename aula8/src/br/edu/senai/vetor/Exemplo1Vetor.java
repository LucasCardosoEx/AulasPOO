package br.edu.senai.vetor;

public class Exemplo1Vetor {

	public static void main(String[] args) {

		String[] vetor = new String[3];

		vetor[0] = "Super Xandão";
		System.out.println(vetor[0]);

		// Strting[]meses = new String[] {"Janeiro","Fervereiro","Março"};
		String[] meses = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun" };

		for (String mes : meses) {
			System.out.println(mes);

		}
	}

}
