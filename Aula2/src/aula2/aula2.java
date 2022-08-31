//ExemploVariaveis (tentei dar rename mas não deu)

package aula2;

public class aula2 {

	public static void main(String[] args) {
		// Tipos Primitivos - Um tipo primitivo armazena valores
		// String é uma clsse "new String"
		String nome = "Ana";
		//Integer idade = new Integer(20);
		final int idade = 20;
		float altura = 1.85f;
		double peso = 89.90;

		System.out.println("Dados: " + nome + "\n" + idade + "\n" + altura + "\n" + peso);
		System.out.println(nome.toUpperCase());
		double a = 10.5;
		int b = (int) a;
		System.out.println(a);

	}

}
