package SGBDMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/CONTROLEVENDAS";
    private static final String USUARIO = "root";
    private static final String SENHA = "8011";
    
  

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            return conn;
        } catch (SQLException e) {
            throw new SQLException("Erro na conexão com o banco de dados: " + e.getMessage(), e);
        }
    }
}
 
