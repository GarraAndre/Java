
package DAO;
import ConexaoBanco.DatabaseConnection;
import Model.Clientes;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;



public class ClientesDAO {
    

    
    public void cadastrarCliente(Clientes obj) throws SQLException{
        try {
            String inserir = "INSERT INTO CLIENTES (data_cadastro, nome, cpf, rg, endereco, numero, bairro, complemento, cidade, estado, telefone, celular, email, veiculo, km, observacoes)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
            Connection conexao = DatabaseConnection.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(inserir);
            stmt.setString(1, obj.getData_cadastro());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getRg());
            stmt.setString(5, obj.getEndereco());
            stmt.setString(6, obj.getNumero());
            stmt.setString(7, obj.getBairro());
            stmt.setString(8, obj.getComplemento());
            stmt.setString(9, obj.getCidade());
            stmt.setInt(10, obj.getEstado());
            stmt.setString(11, obj.getTelefone());
            stmt.setString(12, obj.getCelular());
            stmt.setString(13, obj.getEmail());
            stmt.setString(14, obj.getVeiculo());
            stmt.setString(15, obj.getKm());
            stmt.setString(16, obj.getObservacoes());
            
            stmt.execute();
            stmt.close();
            
            
            stmt.executeUpdate();
            stmt.close();
            
        } catch (Exception e) {
        }
        
        
            
        
        
    }
    
    public void alterarCliente(){
        
    }
    
    public void excluirCliente(){
        
    }
    
}
