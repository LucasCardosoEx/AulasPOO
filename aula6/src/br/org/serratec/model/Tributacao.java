package br.org.serratec.model;

public interface Tributacao extends Taxas , ImpostoDeRenda {
//Interface pode herdar de outras	
	Double calcularICMS();

}
