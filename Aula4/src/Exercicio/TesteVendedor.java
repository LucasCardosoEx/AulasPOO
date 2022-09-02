package Exercicio;

import java.util.Scanner;

public class TesteVendedor {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int resposta = 0, escolha;
		double valorVenda1, valorVenda2;

		Fixo vendedora1 = new Fixo("Joana", "123.456.789-10", 2150., 0.1);
		Fixo vendedora2 = new Fixo("Maria", "109.876.543-21", 2000., 0.1);
		System.out.println("----- Sistemas de Vendas ------");

		while (resposta != 1) {
			System.out.println("Vendedores");
			System.out.println("1- " + vendedora1.getNome() + "\n2- " + vendedora2.getNome());
			escolha = input.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite o valor da venda\n");
				valorVenda1 = input.nextDouble();
				vendedora1.calcularSalario(valorVenda1);
				System.out.println("Deseja encerrar o programa? 1.Sim / 2.Não");
				resposta = input.nextInt();
				break;
			case 2:
				System.out.println("Digite o valor da venda\n");
				valorVenda2 = input.nextDouble();
				vendedora2.calcularSalario(valorVenda2);
				System.out.println("Deseja encerrar o programa? 1.Sim / 2.Não");
				resposta = input.nextInt();
				break;
			default:

				System.out.println("Opção Inválida");
				break;
			}
		}
		System.out.println("----- Salário dos Vendedores -----");
		System.out.println("Nome: " + vendedora1.getNome());
		System.out.println("Salario Bruto: " + vendedora1.getSalarioBruto());
		System.out.println("Nome: " + vendedora2.getNome());
		System.out.println("Salario Bruto: " + vendedora2.getSalarioBruto());
		System.out.println("----- Total Vendido -----");
		// Double valorTotal = (valorVenda);
		// System.out.println("Total: "+ valorTotal );

	}
}
