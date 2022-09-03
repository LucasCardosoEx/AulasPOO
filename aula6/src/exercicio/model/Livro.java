package exercicio.model;

public class Livro{
	private String autor;
	private String titulo;
	protected Double valor;

	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return " Autor:" + autor + " Titulo:" + titulo + " Valor:" + String.format("%.2f",valor);
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getValor() {
		return valor;
	}

	public void reajuste(Double valorReajuste) {
		valor = valor * 1.06;
	}
}
