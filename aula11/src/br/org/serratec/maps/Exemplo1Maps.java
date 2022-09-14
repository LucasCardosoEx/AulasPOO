package br.org.serratec.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exemplo1Maps {

	public static void main(String[] args) {
		// Chave lado Esquerdo K / Valor no lado direito V
		// TreeMap ordena / HashMap não ordena
		// Map<String, String> estados = new HashMap<>();
		// Map<String, String> estados = new TreeMap<>();
		Map<String, String> estados = new LinkedHashMap<>();
		estados.put("AC", "Acre");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("MG", "Minas Gerais");
		estados.put("SP", "São Paulo");
		estados.put("SE", "Sergipe");

		System.out.println("----- Retorna a chave do mapa -----");
		for (String string : estados.keySet()) {
			System.out.println(string);

		}
		System.out.println("----- Retorna os valores do mapa -----");
		for (String string : estados.values()) {
			System.out.println(string);

		}
		System.out.println("----- Retorna as chaves e valores do mapa");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			//System.out.println(mapa.getKey() + " - " + mapa.getValue());
			System.out.println(mapa);
		}
	}
}
