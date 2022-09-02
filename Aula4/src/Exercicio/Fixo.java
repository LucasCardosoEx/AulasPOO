package Exercicio;

public class Fixo extends Vendedor {

	protected static Double salarioBase;
	protected static Double salarioBruto;
	protected static Double comissao;

	public Fixo(String nome, String cpf, Double salarioBase, Double comissao) {
		super(nome, cpf);
		Fixo.salarioBase = salarioBase;
		// Fixo.salarioBruto = salarioBruto;
		Fixo.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCpf: " + cpf + "\nSalario Base: " + salarioBase + "\nComissao: " + comissao + ".\n";
	}

	public Double getSalarioBase() {
		return salarioBase;

	}

	public Double getSalarioBruto() {
		return calcularSalario(null);
	}

	public Double getcomissao() {
		return comissao;
	}

	public void setSalarioBase(Double salarioBase) {
		Fixo.salarioBase = salarioBase;
	}

	public void setSalarioBruto(Double salarioBruto) {
		Fixo.salarioBruto = salarioBruto;
	}

	public void setcomissao(Double comissao) {
		Fixo.comissao = comissao;
	}

	public void calcularSalario(Double valorVenda) {
		salarioBruto = salarioBase;
		salarioBruto = valorVenda * comissao;
		salarioBruto += salarioBase;
	}

}
