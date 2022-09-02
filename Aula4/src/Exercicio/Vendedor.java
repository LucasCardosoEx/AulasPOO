package Exercicio;

public class Vendedor {
	protected String nome;
	protected String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Vendedor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

}
