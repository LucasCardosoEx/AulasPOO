package br.edu.senai.varargs;

public class ExemploVarArgs {

	public static void main(String[] args) {
		// String a = "qualquer coisa";
		// System.out.printf("%s %d", 9 , "t" , 9090 , true);
		// varargs System.out.printf
		
		System.out.println(somarNumeros(10,20,30,40));
		
	}

	public static int somarNumeros(int... numeros) {
		int soma = 0;
		for (int valor : numeros) {
			soma += valor;
		}
		return soma;
	}

}
