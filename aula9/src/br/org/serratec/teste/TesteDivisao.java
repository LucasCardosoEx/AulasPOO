package br.org.serratec.teste;

import br.org.serratec.calculo.CalculoMedia;

public class TesteDivisao {

	public static void main(String[] args) {

		try {// comandos
			System.out.println(CalculoMedia.calcular(10, 0));

		} catch (Exception e) {// tratamento de erro
			System.out.println("Erro ! Divisão por zero ! Verifique seu código");
			//e.printStackTrace(); // imprimir a rota de erro
		} finally {// sempre vai aparecer
			System.out.println("Finaly sempre é executado independente se cair ou não no catch");
		}
	}

}
