package br.edu.senai.teste;

import br.edu.senai.model.Cliente;
import br.edu.senai.persistence.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Robertinha da Silvinha", "22223456789", "arobss@gmail.com");
		ClienteDao ClienteDao = new ClienteDao();

		// ClienteDao.inserirCliente(cliente);
		// ClienteDao.atualizarCliente(cliente);
		// ClienteDao.removerCliente(cliente);
		
		// for para listar todos os clientes no console(alterar linha 74)
		// 74 String sql = "select * from cliente;
		
//		for (Cliente c : ClienteDao.listarClientes()) {
//			System.out.println(c);
//		}
		System.out.println(ClienteDao.listarClientes("A"));
	}
}
