package Exercicio3;

public class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;

	}

	public Double calcularInss() {
		double inss = getSalario();
		return inss = inss * 0.11;
	}
	public Double calcularValeTransporte() {
		double vale = getSalario();
		return vale = vale * 0.06;
		}
	
	public Double salarioLiquido() {
		double liquido = getSalario();
		liquido = salario * 0.17;
		return salario - liquido;
		}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
}
