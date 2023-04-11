
package ConexaoBanco;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.InputStream;
import java.util.Properties;




public class DatabaseConnection {
    private Connection connection;

    public Connection connectToDatabase() throws SQLException {
        Properties props = new Properties();
        InputStream is = null;
        try {
            is = getClass().getResourceAsStream("/database.properties");
            props.load(is);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }

        String user = props.getProperty("db.username");
        String password = props.getProperty("db.password");
        String url = "jdbc:mysql://127.0.0.1/DGMotos";

        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        try {
            connection.connectToDatabase();
            // Use a conexão com o banco de dados aqui...
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}


