package Exercicio3;

import javax.swing.JOptionPane;

public class CalcularInssExec1 {
	public static void main(String[] args) {

		new Funcionario("Lucas", 1200);
		Funcionario funcionario1 = new Funcionario("Lucas", 3000);

		JOptionPane.showInternalMessageDialog(null,
				"\nNome: " + funcionario1.getNome() + "\nSalário: " + funcionario1.getSalario() + "\nINSS: "
						+ funcionario1.calcularInss() + "\nVale Transporte: " + funcionario1.calcularValeTransporte()
						+ "\nSalário Líquido: " + funcionario1.salarioLiquido());
	}
}
