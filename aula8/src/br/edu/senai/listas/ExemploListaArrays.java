package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {

	public static void main(String[] args) {
		List<String> cores = Arrays.asList("Amarelo", "Verde", "Azul");
		// cores.add("Branco"); << não da
		cores.set(0, "Vermelho CVRL Até o fim"); // << da pra mudar ó
		System.out.println(cores);

		if (cores.isEmpty()) {
			System.out.println("A lista está vazia!");
		} else {
			System.out.println(cores);
		}
		System.out.println("A lista contèm a cor verde?" + (cores.contains("Verde") ? " Sim" : " Não"));
		
		List<String> meses = List.of("Jan","Fev","Mar");
		//meses.set(0,"Janeiro"); // listof não da pra muda
		System.out.println(meses);
	}

}
