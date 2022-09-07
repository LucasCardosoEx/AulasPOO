package br.edu.senai.teste;

import br.edu.senai.enums.MarcaTV;
import br.edu.senai.model.TV;

public class TesteTV {

	public static void main(String[] args) {
		TV tv = new TV("SN/23234",42.,MarcaTV.SAMSUNG);
		System.out.println(tv);
	}

}
