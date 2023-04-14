
package com.mysql.jdbc;

import ConexaoBanco.DatabaseConnection;
import javax.swing.JOptionPane;


public class TestarConexao {
    
    public static void main(String[] args) {
        
        try {
            new DatabaseConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar no banco:" + e);
        }
    }
    
}
