package br.edu.senai.enums;

public enum PeriodoCurso {
	TARDE("Terça e Quinta", 40, 2500.), NOTURNO("Segunda e Quarda", 20, 1000.), INTEGRAL("Sexta", 80, 3200.);

	// Um constrtutor no enum é privado
	// Serve para organizar a ordem de inserção dos campos

	private String diasDaSemana;
	private Integer cargaHorario;
	private Double valor;

	private PeriodoCurso(String diasDaSemana, Integer cargaHorario, Double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHorario = cargaHorario;
		this.valor = valor;
	}

	public String getDiasDaSemana() {
		return diasDaSemana;
	}

	public Integer getCargaHorario() {
		return cargaHorario;
	}

	public Double getValor() {
		return valor;
	}

}
