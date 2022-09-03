package exercicio.teste;

import exercicio.model.Livro;
import exercicio.model.Operacao;

public class testeLivro {

	public static void main(String[] args) {

		Livro livro1 = new Livro(" John Flanagan ", " Rangers Ordem dos Arqueiros ", 85.0);
		Livro livro2 = new Livro(" Art Spiegelman ", " MAUS ", 98.0);

		Operacao o1 = new Operacao("Venda ", livro1);
		Operacao o2 = new Operacao("Emprestimo ", livro2);

		livro1.reajuste(null);
		o1.venderLivro();
		o2.emprestarLivro();

		System.out.println("Tipo:" + o1.getTipo() + " Valor:" + o1.getValorOperacao() + " Autor:" + livro1.getAutor()
				+ " Livro:" + livro1.getTitulo());
		
		System.out.println("Tipo:" + o2.getTipo() + " Valor:" + o2.getValorOperacao() + " Autor:" + livro2.getAutor()
		+ " Livro:" + livro2.getTitulo());

	}

}
