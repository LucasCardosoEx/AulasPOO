package br.edu.exercicio2;

import java.time.LocalDate;

public abstract class Carro extends Veiculo {

	private String categoria;

	public Carro(String categoria, String modelo, Double valorCobrado, LocalDate dataConserto,
			Proprietario proprietario) {
		super(modelo, valorCobrado, dataConserto, proprietario);
	}

	@Override
	public String toString() {
		return "Carro [categoria=" + categoria + ", modelo=" + modelo + ", valorCobrado=" + valorCobrado
				+ ", dataConserto=" + dataConserto + ", proprietario=" + proprietario + "]";
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public Double lavarVeiculo() {
		return null;
	}

	@Override
	public Double trocarOleo() {
		return null;
	}

	@Override
	public Double revisao() {
		return null;
	}

}
