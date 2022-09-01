package exerciciosAula2;

public class Dados {

	public String nome;
	public double peso, altura;

	public double getPeso() {
		Double maiorKg = 0.;

		if (maiorKg < peso) {
			maiorKg = peso;
		}
		return peso;
	}
}
