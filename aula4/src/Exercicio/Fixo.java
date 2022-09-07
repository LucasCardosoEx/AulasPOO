package Exercicio;

public class Fixo extends Vendedor {

	protected Double salarioBase;
	protected Double salarioBruto;
	protected Double comissao;

	public Fixo(String nome, String cpf, Double salarioBase, Double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		//this.salarioBruto = salarioBruto;
		this.comissao = comissao;
		salarioBruto = salarioBase;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCpf: " + cpf + "\nSalario Base: " + salarioBase + "\nComissao: " + comissao + ".\n";
	}

	public Double getSalarioBase() {
		return salarioBase;

	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Double getcomissao() {
		return comissao;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public void setcomissao(Double comissao) {
		this.comissao = comissao;
	}

	public void calcularSalario(double valorVenda) {
		salarioBruto = salarioBase + valorVenda * comissao;
	}

}
