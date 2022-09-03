package exercicio5;

public class Telefone {

	private String numero;

	public Telefone(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "\nTelefone:" + numero;
	}	


	public String getNumero() {
		return numero;
	}
}
