//hash NAO ACEITA elementos duplicados
//treeSet mais lento porém organiza
package br.edu.senai.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		// Set<String> cores = new HashSet<>();
		Set<String> cores = new TreeSet<>();

		cores.add("Azul");
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Laranja");
		cores.add("Branco");
		cores.add("Azul");

		System.out.println(cores);

	}

}
