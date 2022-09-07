package br.edu.senai.vetor.teste;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {
	public static void main(String[] args)
	{
//		Empregado empregado1 = new Empregado("Lucas", "987654321");
//		Empregado empregado2 = new Empregado("Pablo", "789456154");
		
		Empregado[] empregados = new Empregado[3];
		
		empregados[0] = new Empregado("Lucas", "987654321");
		empregados[1] = new Empregado("Paulin", "12312312");
		empregados[2] = new Empregado("Joazo", "9832123412");
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
			System.out.println("--------------------");
			
		}
	}
}
