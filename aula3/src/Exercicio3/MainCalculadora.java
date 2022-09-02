package Exercicio3;

import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		int opcao;
		double resultado;

		String menu = "Calculadora\n\n" + "1.Somar: " + "\n2.Subtrair: " + "\n3.Multiplicar: " + "\n4.Dividir: "
				+ "\n5.Finalizar";
		opcao = Integer.parseInt(
				JOptionPane.showInputDialog(null, menu, " Calculadora - JAVA ", JOptionPane.QUESTION_MESSAGE));

		while (opcao != 5) {

			String numero1 = JOptionPane.showInputDialog("Valor 1:");
			String numero2 = JOptionPane.showInputDialog("Valor 2:");
			resultado = calc.calcular(Double.parseDouble(numero1), Double.parseDouble(numero2), opcao);
			JOptionPane.showMessageDialog(null, resultado);
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog(null, menu, "Calculadora - JAVA ", JOptionPane.QUESTION_MESSAGE));

		}
	}

}
