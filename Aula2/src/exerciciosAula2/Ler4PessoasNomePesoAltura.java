package exerciciosAula2;

import exerciciosAula2.Dados;
import java.util.Scanner;

public class Ler4PessoasNomePesoAltura {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dados dados1 = new Dados();
		System.out.print("Digite o Nome da primeira pessoa: ");
		dados1.nome = sc.next();
		System.out.print("Digite a altura da primeira pessoa: ");
		dados1.altura = sc.nextDouble();
		System.out.print("Digite o peso da primeira pessoa: ");
		dados1.peso = sc.nextDouble();
	
		Dados dados2 = new Dados();
		System.out.print("\nDigite o Nome da segunda pessoa: ");
		dados2.nome = sc.next();
		System.out.print("Digite a altura da segunda pessoa: ");
		dados2.altura = sc.nextDouble();
		System.out.print("Digite o peso da segunda pessoa: ");
		dados2.peso = sc.nextDouble();
		
		Dados dados3 = new Dados();
		System.out.println("\nDigite o Nome da terceira pessoa: ");
		dados3.nome = sc.next();
		System.out.print("Digite a altura da terceira pessoa: ");
		dados3.altura = sc.nextDouble();
		System.out.print("Digite o peso da terceira pessoa: ");
		dados3.peso = sc.nextDouble();
		
		Dados dados4 = new Dados();
		System.out.println("\nDigite o Nome da quarta pessoa: ");
		dados4.nome = sc.next();
		System.out.print("Digite a altura da quarta pessoa: ");
		dados4.altura = sc.nextDouble();
		System.out.print("Digite o peso da quarta pessoa: ");
		dados4.peso = sc.nextDouble();
		
		System.out.println("De acordo com os registros"+ peso.getPeso());
	}
}
