package br.edu.senai.teste;

import br.edu.senai.enums.PeriodoCurso;
import br.edu.senai.model.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java", PeriodoCurso.INTEGRAL);
		
		System.out.println("Nome do Curso: " + curso.getNome());
		System.out.println("Periodo: " + PeriodoCurso.INTEGRAL.getDiasDaSemana());
	}

}
