package br.edu.senai.model;

import java.util.Arrays;

public class Time {

	private String nomeTime;
	private String treinador;
	private Atleta[] atletas;

	public Time(String nomeTime, String treinador, Atleta[] atletas) {
		this.nomeTime = nomeTime;
		this.treinador = treinador;
		this.atletas = atletas;
	}
	

	@Override
	public String toString() {
		return "Time [nomeTime=" + nomeTime + ", treinador=" + treinador + ", atletas=" + Arrays.toString(atletas)
				+ "]";
	}


	public String getNomeTime() {
		return nomeTime;
	}

	public String getTreinador() {
		return treinador;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void adicionarAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;

			}
		}
	}
	
	public void listarAtletas() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getNomeAtleta());
		}
	}

}
