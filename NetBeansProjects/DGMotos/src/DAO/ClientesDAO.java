
package DAO;
import ConexaoBanco.DatabaseConnection;
import Model.Clientes;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;



public class ClientesDAO {
    Connection con;
    
    public ClientesDAO() throws SQLException{
      
        this.con = new DatabaseConnection().connectToDatabase();
    }
    

    
    public void cadastrarCliente(Clientes obj){
        
        
            String sql = "INSERT INTO CLIENTES (DATA_CADASTRO, NOME, CPF, RG, ENDERECO, NUMERO, BAIRRO, COMPLEMENTO, CIDADE, ESTADO, TELEFONE, CELULAR, EMAIL, VEICULO, KM, OBSERVACOES)" 
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            stmt.setString(1, obj.getNome());
            
            stmt.execute();
            stmt.close();
            
        
        
    }
    
    public void alterarCliente(){
        
    }
    
    public void excluirCliente(){
        
    }
    
}
