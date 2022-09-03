package br.org.serratec.model;

public class TotalImposto {

	private Double total = 0.0;

	public Double getTotal() {
		return total;
	}

	// Quem implementa uma interface também pode utilizar o polimorfismo
	public void totalImpostos(Tributacao t) {
		total += t.calcularICMS() + t.calcularImpostoDeRenda();
	}

}
