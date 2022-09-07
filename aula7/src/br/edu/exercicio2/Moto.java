package br.edu.exercicio2;

import java.time.LocalDate;

public class Moto extends Veiculo {

	public int cilindradas = 0;

	public Moto(int cilindradas, String modelo, Double valorCobrado, LocalDate dataConserto,
			Proprietario proprietario) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + ", modelo=" + modelo + ", valorCobrado=" + valorCobrado
				+ ", dataConserto=" + dataConserto + ", proprietario=" + proprietario + "]";
	}

	@Override
	public Double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public Double trocarOleo() {
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public Double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}

}
