package Scarpati.inf.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	static private final String jdbcUrl = "jdbc:mysql://localhost/cittaitaliane?user=root&password=";
	static private Connection connection = null;

	public static Connection getConnection() {

		try {
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection(jdbcUrl);
			}
			return connection;

		} catch (SQLException e) {

			e.printStackTrace();
			throw new RuntimeException("Cannot get connection " + jdbcUrl, e);
		}
	}
}
