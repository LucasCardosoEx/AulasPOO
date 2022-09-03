package br.edu.senai.teste;

import br.edu.senai.model.Imovel;
import br.edu.senai.model.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Andrézin", "andrézin@gmail.com");
		Pessoa pessoa2 = new Pessoa("Paulin", "paulin@gmail.com");

		Imovel imovel1 = new Imovel("Casa", "Centro", 350500., pessoa2);
		Imovel imovel2 = new Imovel("Apto", "Centro", 350500., pessoa1);

		System.out.println(imovel1.getLocal() + ":" + imovel1.getPessoa());
		System.out.println(imovel2.getLocal() + ":" + imovel2.getPessoa());
	}

}
