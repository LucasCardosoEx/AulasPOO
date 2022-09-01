package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.Produto;

public class TesteProduto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o código: ");
			Integer codigo = scan.nextInt();

			System.out.println("Digite o descricao: ");
			String descricao = scan.next();

			System.out.println("Digite o valor: ");
			Double valor = scan.nextDouble();

			Produto produto = new Produto(codigo, descricao, valor);
			System.out.println("Total geral de produtos cadastrados: "+Produto.getTotalProdutos());
		}

	}

}
