package exerciciosAula2;

public class Fatorial {
	public static void main(String[] args) {

		int fatorial = 1, n = 0;

		for (n = 1; n <= 10; n++) {
			fatorial = n * fatorial;
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
	}
}