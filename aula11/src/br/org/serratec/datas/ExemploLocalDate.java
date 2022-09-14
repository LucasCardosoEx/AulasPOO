package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataDeEntrada = LocalDate.of(2022, 9, 12);
		System.out.println("Sistema " + dataAtual);
		System.out.println("Manual " + dataDeEntrada);
		LocalDate dataConvertida = LocalDate.parse("2022-09-11");
		System.out.println("Convertida " + dataConvertida);
		System.out.println("Após 3 dias " + dataAtual.plusDays(3));
		System.out.println("Menos vinte dias " + dataAtual.minusDays(20));
		System.out.println("3 meses atrás " + dataAtual.minus(3, ChronoUnit.MONTHS));
	}

}
