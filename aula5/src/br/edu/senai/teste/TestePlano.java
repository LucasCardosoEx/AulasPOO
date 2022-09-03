package br.edu.senai.teste;

import br.edu.senai.control.ControlePagamento;
import br.edu.senai.model.Anestesista;
import br.edu.senai.model.Clinica;
import br.edu.senai.model.Medico;

public class TestePlano {
	
	//static double total = 0;

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Xandy Clinicas", "Checkup", "1234");
		Medico medico = new Medico("Xandy Empresas", 3212, "Xandy Medicos");
		Anestesista anestesista = new Anestesista("Xandy Anestesista", 3465, "Xandy Agulha", "Geral");
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		cp.calcularTotalPag(clinica);
		
		medico.calcularPagamento();
		cp.calcularTotalPag(medico);
		
		anestesista.calcularPagamento();
		cp.calcularTotalPag(anestesista);
		
		//total = clinica.calcularPagamento() + medico.calcularPagamento() + anestesista.calcularPagamento();

		System.out.println(clinica + "Valor a Receber do plano: " + clinica.getValorPago());
		System.out.println(medico + "Valor a Receber do plano: " + medico.getValorPago());
		System.out.println(anestesista + "Valor a Receber do plano: " + anestesista.getValorPago());
		System.out.println("Total geral pago pelos planos: " + cp.getTotalGeral());
	}

}
