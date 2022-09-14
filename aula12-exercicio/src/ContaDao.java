import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContaDao {

	private Connection connection;

	public ContaDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void inserirConta(Conta conta) {
		try {
			String sql = "Insert into cont a(numero_conta, titular, saldo) values (?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, conta.getNumeroConta());
			stmt.setString(2, conta.getConta());
			stmt.setDouble(3, conta.getSaldo());
			stmt.execute();
			stmt.close();
			connection.close();

		} catch (Exception e) {
			System.out.println("Não foi possível gravar o registro");
		}
	}

}
