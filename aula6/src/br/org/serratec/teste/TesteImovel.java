package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Proprietario;

public class TesteImovel {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Roni");
		Proprietario proprietario2 = new Proprietario("Carla");
		Casa casa = new Casa("Centro", 409500.0, true);
		Apartamento apto = new Apartamento("Centro ", 201110.0, 5);

		casa.setProprietario(proprietario);
		apto.setProprietario(proprietario2);
		
		System.out.println("Dados do Imóvel: " + casa + "\n" + casa.getProprietario().getNome());
		System.out.println("Dados do Imóvel: " + apto + "\n" + apto.getProprietario().getNome());
	}

}
