package br.edu.senai.teste;

import br.edu.senai.model.Atleta;
import br.edu.senai.model.Time;

public class testeAtleta {

	public static void main(String[] args) {
		
		Atleta atleta1 = new Atleta ("Raphaela","Atacante");
		Atleta atleta2 = new Atleta ("Paulo Batera","Goleiro");
		Atleta atleta3 = new Atleta ("Seu Roberto","Zagueiro");
		Time time1 = new Time ("Flamengo","Alberto", new Atleta[3]);
		
		time1.adicionarAtletas(atleta1);
		time1.adicionarAtletas(atleta2);
		time1.adicionarAtletas(atleta3);
	
		System.out.println();
		time1.listarAtletas();
	}

}
