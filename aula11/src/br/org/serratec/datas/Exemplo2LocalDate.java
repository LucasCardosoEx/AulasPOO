package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo2LocalDate {
	
	public static void main(String[] args) {
		LocalDate dataNascimento = LocalDate.of(1975, 6, 11);
		LocalDate dataAtual = LocalDate.now();
		
		Period period = Period.between(dataNascimento, dataAtual);
		System.out.println("Idade em anos:" + period.getYears());
		System.out.println(period.getMonths() + " Meses");
		System.out.println(period.getDays() + " dias");
	}
}
