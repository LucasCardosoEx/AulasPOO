package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class ExemploListas {

	public static void main(String[] args) {

		List listaTimes = new ArrayList<>();

		listaTimes.add("Flamengo");
		listaTimes.add("Vasco");
		listaTimes.add("Botafogo");
		listaTimes.add("Fluminense");
		listaTimes.add("Floresta");
		System.out.println("Tamanho da Lista: " + listaTimes.size());
		listaTimes.remove(4);
		listaTimes.set(1, "América");
		System.out.println(listaTimes.get(0));
		System.out.println(listaTimes);
		System.out.println("Tamanho da Lista: " + listaTimes.size());

	}

}
