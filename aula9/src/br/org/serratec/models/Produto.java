package br.org.serratec.models;

import br.org.serratec.enums.EnumCategoria;

public class Produto {
	
	private int codigo;
	private String descricao;
	private double valor;
	EnumCategoria categoria;
	
	public Produto(int codigo, String descricao, double valor, EnumCategoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}
	

	@Override
	public String toString() {
		return "Codigo:" + codigo + " - Descricao:" + descricao + " - Valor Unitário:" + valor + " - Categoria:"
				+ categoria;
	}


	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public EnumCategoria getCategoria() {
		return categoria;
	}
	
	
	

}
