package br.org.serratec.model;

public class Produto {
	private Integer codigo;
	private String derscricao;
	private Double valor;
	private static int totalProdutos;

	// Main - não pode fazer o new Produto()

	public Produto(Integer codigo, String derscricao, Double valor) {
		super();
		this.codigo = codigo;
		this.derscricao = derscricao;
		this.valor = valor;
		totalProdutos+=1;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDerscricao() {
		return derscricao;
	}

	public Double getValor() {
		return valor;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}

}
