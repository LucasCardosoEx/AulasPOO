package br.org.serratec.model;

//Uma interface não pode ter instâncias
//Não posso fazer - Conta conta = new conta();
//Interface é uma forma de substituir a herança em alguns casos
//Toda interface é criada para ter somente assinaturas
//Interfaces não tem implementação.

public interface Conta {
	//static final esta implicito
	Double taxaBancaria = 2.50;

	// Não é necessário colocar o abstract porque fica implicito
	// ja é public
	Boolean saque(Double valor);

	Boolean deposito(Double valor);
}
