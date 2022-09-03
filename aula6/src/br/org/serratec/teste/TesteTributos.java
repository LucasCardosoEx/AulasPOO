package br.org.serratec.teste;

import br.org.serratec.model.Empresa;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.TotalImposto;

public class TesteTributos {

	public static void main(String[] args) {

		Empresa e = new Empresa("Dom Atacadista ", 259000.);
		Pessoa p = new Pessoa("Marcos ", 82000.);
		TotalImposto t = new TotalImposto();
		
		System.out.println(e + "\nTributos à pagar: ICMS " + e.calcularICMS() + " IR: " + e.calcularImpostoDeRenda());
		System.out.println(p + "\nTributos a pagar: IR: " + p.calcularImpostoDeRenda());
		
		t.totalImpostos(p);
		t.totalImpostos(e);
		
		System.out.println("Totalização dos tributos:" + t.getTotal());
	}

}
