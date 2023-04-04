
package ConexaoBanco;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


public class ConectaBanco {
    
    public Connection getConnection(){
        Properties props = new Properties();
                try (InputStream in = getClass().getResourceAsStream("/database.properties")) {
                            props.load(in);
                    } catch (IOException e) {
    // trate a exceção
                        }

String username = props.getProperty("db.username");
String password = props.getProperty("db.password");

// use as variáveis "username" e "password" para conectar ao banco de dados

        try {
            
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/DGMotos",username, password);
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
        
    }
    
}
