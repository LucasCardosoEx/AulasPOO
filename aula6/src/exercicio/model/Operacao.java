package exercicio.model;

public class Operacao implements Livraria {
	private String tipo;
	private Double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return " Tipo:" + tipo + " Valor:" + String.format("%.2f", valorOperacao) + " Livro:" + livro;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() * 1.09;

	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 0.02 + taxaEmprestimo;

	}

}
