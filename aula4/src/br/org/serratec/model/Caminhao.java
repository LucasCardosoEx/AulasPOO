package br.org.serratec.model;

public class Caminhao extends Veículo {

	private Integer cargaMaxima;

	public Caminhao(String chassi, String placa, String cor, Double valor, Integer cargaMaxima) {
		super(chassi, placa, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}
	
	public String toString() {
		return super.toString()+ cargaMaxima;
	}

	public Integer getCargaMaxima() {
		return cargaMaxima;
	}
	//Sobrescrita - Override
	
	@Override
	public void calcularIPVA() {
		valorIPVA = valor * 0.08;
	}

}
