
package ConexaoBanco;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
    
    public static Connection getConnection()throws SQLException{
        String url = "jdbc:mysql://127.0.0.1:3306/DGMotos";
        String usuario = "root";
        String senha = "Flutter";
        
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }
}
