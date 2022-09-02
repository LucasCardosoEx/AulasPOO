package Exercicio3;

import java.util.Scanner;

public class mainProduto {

	public static void main(String[] args) {

		int escolha = 0;
		double total;
		Scanner input = new Scanner(System.in);

		Produto produto1 = new Produto("Arroz", 25., 2);

		while (escolha != 1) {
		System.out.println("Produto:\n" + produto1.getDescricao() + "\nValor:\n" + produto1.getValor()
		+ "\nQuantidade:" + produto1.getQuantidade());
		System.out.println("Descricao:" + produto1.getDescricao());
		System.out.println("Valor:" + produto1.getValor());
		total = (produto1.getValor() * produto1.getQuantidade());
		System.out.println("Total:" + total);
		System.out.println("IMCS:" + produto1.calcularIcms());
		System.out.println("Deseja fechar o programa?\n1. Sim\n2. Não");
		escolha = input.nextInt();
		System.out.println("\n");
		}
	}
}
