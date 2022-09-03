package exercicio5;

public class mainContato {

	public static void main(String[] args) {

		Estado estado1 = new Estado("São Paulo", "SP");
		Cidade cidade1 = new Cidade("Paraisópolis", estado1);
		Endereco endereco1 = new Endereco("DoChao", "Cascatão", "259492", cidade1);
		Contato contato1 = new Contato("Jorgin", new Telefone[2], endereco1);
		Telefone telefone1 = new Telefone("99999-99992");
		Telefone telefone2 = new Telefone("88888-88882");

		contato1.adicionarTelefone(telefone1);
		contato1.adicionarTelefone(telefone2);

		System.out.println(contato1.toString());

	}
}
