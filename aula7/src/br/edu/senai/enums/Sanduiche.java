package br.edu.senai.enums;

public enum Sanduiche {
	HAMBURGUER("Hamburguer", 12.), MISTO("Misto Quente", 8.), HOTDOG("Cahorro Quente", 8.);

	private String tipoSanduiche;
	private Double valorSanduiche;

	private Sanduiche(String tipoSanduiche, Double valorSanduiche) {
		this.tipoSanduiche = tipoSanduiche;
		this.valorSanduiche = valorSanduiche;
	}

	public String getTipo() {
		return tipoSanduiche;
	}

	public Double getValor() {
		return valorSanduiche;
	}

	@Override
	public String toString() {
		return "Tipo:" + tipoSanduiche + " Valor:" + valorSanduiche;
	}
}
