
package DAO;

import Frames.Clientes;
import Model.ClientesModel;
import SGBDMySQL.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class ClientesDAO {
    
    private Connection conecta;
    
    
    public ClientesDAO(){
          try {
        this.conecta = ConnectionFactory.getConnection();
    } catch (SQLException e) {
        // Lidar com a exceção SQLException aqui.
        e.printStackTrace(); // Exemplo simples de tratamento de exceção.
    }
    }
    
    public void cadastrarCliente(ClientesModel obj){
        try {
            //QUERY DO SQL
            String sql = "INSERT INTO CLIENTES ("
                    +    "NOME, "
                    +    "CPF, "
                    +    "ENDERECO, "
                    +    "BAIRRO,"
                    +    "NUMERO,"
                    +    "COMPLEMENTO,"
                    +    "CIDADE,"
                    +    "CELULAR,"
                    +    "EMAIL,"
                    +    "ESTADO) VALUES ("
                    +    "?,"
                    +    "?,"
                    +    "?,"
                    +    "?,"
                    +    "?,"
                    +    "?,"
                    +    "?,"
                    +    "?,"
                    +    "?,"
                    +    "?)";
            //CONECTAR O BANCO DE DADOS
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEndereco());
            stmt.setString(4, obj.getBairro());
            stmt.setString(5, obj.getNumero());
            stmt.setString(6, obj.getComplemento());
            stmt.setString(7, obj.getCidade());
            stmt.setString(8, obj.getCelular());
            stmt.setString(9, obj.getEmail());
            stmt.setString(10, String.valueOf(obj.getEstado()));
            
            //EXECUTA E FECHA A CONEXAO
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro" + e);
        }
        
    }
    
    public List<ClientesModel> listarClientes(){
        
         try {
            
            //1 passo - cris lista
            List<ClientesModel> lista = new ArrayList<>();
            
            //2 passo - criar SQL
            String sql = "SELECT * FROM CLIENTES;";
            
           
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                ClientesModel obj = new ClientesModel();
                
                obj.setId(rs.getInt("ID"));
                obj.setNome(rs.getString("NOME"));
                obj.setCpf(rs.getString("CPF"));
                obj.setEndereco(rs.getString("ENDERECO"));
                obj.setBairro(rs.getString("BAIRRO"));
                obj.setNumero(rs.getString("NUMERO"));
                obj.setComplemento(rs.getString("COMPLEMENTO"));
                obj.setCidade(rs.getString("CIDADE"));
                obj.setCelular(rs.getString("CELULAR"));
                obj.setEmail(rs.getString("EMAIL"));
                obj.setEstado(rs.getInt("ESTADO"));
                
                lista.add(obj);
                
            } return lista;
                
            
            
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
        return null;
        
    }
    
    public void excluirCliente(ClientesModel obj){
        try {
            //QUERY DO SQL
            String sql = "DELETE FROM CLIENTES"
                       + "WHERE ID = ?";
            

            //CONECTAR O BANCO DE DADOS
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
          
            //EXECUTA E FECHA A CONEXAO
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso");
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão" + e);
        }
    }
    
    public void alterarCliente(ClientesModel obj){
        
        try {
            //QUERY DO SQL
            String sql = "UPDATE CLIENTES SET "
                    +    "NOME = ?, "
                    +    "CPF = ?, "
                    +    "ENDERECO = ?, "
                    +    "BAIRRO = ?,"
                    +    "NUMERO = ?,"
                    +    "COMPLEMENTO = ?,"
                    +    "CIDADE = ?,"
                    +    "CELULAR = ?,"
                    +    "EMAIL = ?,"
                    +    "ESTADO = ?"
                    +    "WHERE ID = ?";
                    
            
            
            //CONECTAR O BANCO DE DADOS
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEndereco());
            stmt.setString(4, obj.getBairro());
            stmt.setString(5, obj.getNumero());
            stmt.setString(6, obj.getComplemento());
            stmt.setString(7, obj.getCidade());
            stmt.setString(8, obj.getCelular());
            stmt.setString(9, obj.getEmail());
            stmt.setString(10, String.valueOf(obj.getEstado()));
            stmt.setInt(11, obj.getId());
            
            //EXECUTA E FECHA A CONEXAO
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na alteração" + e);
        }
    }
  
   
}
