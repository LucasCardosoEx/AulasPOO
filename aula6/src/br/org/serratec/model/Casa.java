package br.org.serratec.model;

public class Casa extends Imovel {
	private Boolean garagem;

	public Casa(String local, Double valor, Boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	@Override
	public String toString() {
		return "\nGaragem: " + (garagem ? "Tem Garagem " : "Não tem Geragem ") + "\nLocal: " + local + "\nValor: "
				+ valor;
	}

	public Boolean getGaragem() {
		return garagem;
	}

}