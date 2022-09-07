package exercicio.teste;

import exercicio.model.Atleta;
import exercicio.model.Pais;

public class TesteAtleta {
	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("EUA");

		Atleta atl1 = new Atleta("Anderson Silva", 98, p1);
		System.out.println("O atleta " + atl1.getNome() + " " + atl1.verificaSituacao());

		Atleta atl2 = new Atleta("Jon Jone", 59, p2);
		System.out.println("O atleta " + atl2.getNome() + " " + atl2.verificaSituacao());

		Atleta atl3 = new Atleta("Vitor Belfort", 110, p1);
		System.out.println("O atleta " + atl3.getNome() + " " + atl3.verificaSituacao());

		System.out.println("Total de Particantes:" + Atleta.getTotalParticipantes());
	}

}
