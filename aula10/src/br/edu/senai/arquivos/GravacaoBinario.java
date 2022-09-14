package br.edu.senai.arquivos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravacaoBinario {

	public static void main(String[] args) {
		try {
			//outro método para gravar
			FileOutputStream gravar = new FileOutputStream("/exemplos/teste.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(gravar);
			gravarArquivo.writeChars("Voodo é pra jacu !");
			gravarArquivo.close();

		} catch (Exception e) {
			System.out.println("Erro na gravação do arquivo !");
		}
	}

}
