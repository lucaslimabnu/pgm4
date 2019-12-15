package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

//	private static String USER_ROOT = System.getProperty("user.dir");
	private static String HOST = "jdbc:sqlite:C:\\Users\\Usuario\\Desktop\\Workspace\\Java\\Prog4-bla\\resources\\db\\prog4.db";
	private static Connection conexao;

	public static Connection obterConexao() {
		try {
			conexao = DriverManager.getConnection(HOST);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;
	}

	public static void fecharConexao() {
		try {
			if (conexao != null) {
				conexao.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}