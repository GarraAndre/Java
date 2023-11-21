
package SGBDMySQL;

import javax.swing.JOptionPane;


public class TestarConexao {
    
    public static void main(String[]args){
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "MySQL Conectado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MySQL nao conectado"+ e);
        }
    }

   
}
