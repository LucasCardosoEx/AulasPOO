package br.edu.senai.enums;

public enum Bebida {
	REFRIGERANTE("Refrigerante", 5.99), AGUA("Água", 2.59), SUCO("Pai de Família", 6.99), CERVEJA("Cerveja", 7.99);

	private String tipoBebida;
	private Double valorBebida;
	private Bebida(String tipoBebida, Double valorBebida) {
		this.tipoBebida = tipoBebida;
		this.valorBebida = valorBebida;
	}
	public String getTipo() {
		return tipoBebida;
	}
	public Double getValor() {
		return valorBebida;
	}
	
	@Override
	public String toString() {
		return "Tipo:" + tipoBebida + " Valor:" + valorBebida;
	}

}
