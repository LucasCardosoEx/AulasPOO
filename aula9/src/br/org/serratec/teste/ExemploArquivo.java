package br.org.serratec.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploArquivo {

	public static void main(String[] args) {
		int vetor[] = { 100, 200, 400 };
		int a = 10, b = 1;

		// for (int i = 0; i < vetor.length; i++) {
//		try {
//			FileReader fr = new FileReader(
//					"C:\\Users\\lucga\\OneDrive\\Área de Trabalho\\O\\Importantes\\Famosa senha.txt");
//			System.out.println("Arquivo Encontrado !");
//			System.out.println(a / b);
//			System.out.println(vetor[10]);
//		} catch (FileNotFoundException e) {
//			System.out.println("Arquivo não encontrado !");
//			// e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println("Erro divisão por zero !");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Vetor fora de faixa de valor !");
//		}
//		// }
		try {
			FileReader fr = new FileReader(
					"C:\\Users\\lucga\\OneDrive\\Área de Trabalho\\O\\Importantes\\Famosa 2senha.txt");
			System.out.println("Arquivo Encontrado !");
			System.out.println(a / b);
			System.out.println(vetor[10]);
		} // catch (Exception e) {// desse modo fica generico (má pratica)
			// System.out.println("Aconteceu algum problema !");
		catch (FileNotFoundException | ArithmeticException e) {
			System.out.println("Aconteceu algum problema !");
			e.printStackTrace();
		}
	}
}
