package exerciciosAula2;

import java.util.Scanner;

public class AntecessorSucessor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número que queira saber o antecessor e sucessor: ");
		int numero = sc.nextInt();

		int antecessor;

		antecessor = numero - 1;

		int sucessor;

		sucessor = numero + 1;

		System.out.println("O antecessor de "+ numero +" é "+ antecessor +".\nE o sucessor é "+ sucessor +".");
	}

}
