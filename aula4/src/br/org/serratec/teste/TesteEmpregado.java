package br.org.serratec.teste;

import br.org.serratec.model.CalcularSalario;
import br.org.serratec.model.Empregado;
import br.org.serratec.model.Programador;
import br.org.serratec.model.Tecnico;

public class TesteEmpregado {

	public static void main(String[] args) {
		/*Empregado empregado = new Empregado("Jorge", "jorge@gmeial.com", 5800.);*/
		Tecnico tecnico = new Tecnico ("Jorge", "jorge@gmeial.com", 5800.);
		Programador programador = new Programador ("Ana" , "ana@gmail.com" , 6200., "Python");
		//Polimorfismo - acontece Somente na herança
		//Empregado empreegado = new Tecnico ("Ana", "ana@gmail.com", 1300.);
		Empregado empregado = tecnico;
		empregado = programador;
		System.out.println(tecnico);
		
		CalcularSalario cs = new CalcularSalario();
		cs.folhaPagamento(programador);
		
	}

}
