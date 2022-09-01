package exerciciosAula2;

import javax.swing.JOptionPane;

public class Exercicio2JOptionPane {

	public static void main(String[] args)

	{

		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
		String email = JOptionPane.showInputDialog("Digite seu email: ");
		String salario = JOptionPane.showInputDialog("Quanto você ganha (calc. acrescimo +10%: ");
		
		Double salario1 = Double.parseDouble(salario);
		double salario2 = salario1 + (salario1 * 10 /100);

		JOptionPane.showInternalMessageDialog(null,
				"Olá, " + nome + "! De acordo com seu registro, seu telfone é: " + telefone);
		JOptionPane.showInternalMessageDialog(null, " e seu email é: " + email + ". Seu salário de: " + salario1
				+ " com acréscimo de 10% fica: " + salario2);

	}

}
