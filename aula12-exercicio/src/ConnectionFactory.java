

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
	private String usuario = "postgres";
	private String senha = "54321";
	private Connection connection;

	public Connection getConnection() {
		try {
			System.out.println("Conectando");
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
					if(connection != null) {
						System.out.println("Connected!");
					}else {
						System.out.println("Não");
					}
		} catch (Exception e) {
		System.out.println("Driver não encontrado");
		}
		return connection;
	}

}
