package exerciciosAula2;

import java.util.Scanner;

public class Tabuada6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1;

		System.out.println("Digite um numero: ");
		num1 = input.nextInt();

		for (int loop = 1; loop <= 9; loop++) {
			System.out.println(num1 + " x " + loop + " = " + num1 * loop);
		}
	}
}