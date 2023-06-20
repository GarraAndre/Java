
import Classes.Frame;


public class CadDividas extends javax.swing.JFrame {

    
    public CadDividas() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCODIGO = new javax.swing.JLabel();
        lbNOME = new javax.swing.JLabel();
        lbPIX = new javax.swing.JLabel();
        edPIX = new javax.swing.JFormattedTextField();
        lbCONTA = new javax.swing.JLabel();
        lbBANCO = new javax.swing.JLabel();
        lbTIPO = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCONTAS = new javax.swing.JTable();
        edCODIGO = new javax.swing.JTextField();
        edNOME = new javax.swing.JTextField();
        edCONTA = new javax.swing.JTextField();
        edBANCO = new javax.swing.JTextField();
        edTELE = new javax.swing.JTextField();
        lbOBSER = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        edOBSERV = new javax.swing.JTextPane();
        btCANCELAR = new javax.swing.JButton();
        btGRAVAR = new javax.swing.JButton();
        btPESQUISAR = new javax.swing.JButton();
        lbCHAVE = new javax.swing.JLabel();
        cbCHAVE = new javax.swing.JComboBox<>();
        cbTIPO = new javax.swing.JComboBox<>();
        lbTELE = new javax.swing.JLabel();
        lbEMAIL = new javax.swing.JLabel();
        edEMAIL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Pessoas");
        setResizable(false);

        lbCODIGO.setText("Código:");

        lbNOME.setText("Nome:");

        lbPIX.setText("PIX:");

        lbCONTA.setText("Conta:");

        lbBANCO.setText("Banco:");

        lbTIPO.setText("Tipo:");

        tbCONTAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Valor", "Parcela", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCONTAS);

        lbOBSER.setText("Observ:");

        jScrollPane2.setViewportView(edOBSERV);

        btCANCELAR.setText("Cancelar");

        btGRAVAR.setText("Gravar");
        btGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGRAVARActionPerformed(evt);
            }
        });

        btPESQUISAR.setText("Pesquisar");

        lbCHAVE.setText("Chave:");

        cbCHAVE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "Email", "Número", "Endereço", "Chave Aleatória" }));

        cbTIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Poupança" }));

        lbTELE.setText("Telefone:");

        lbEMAIL.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btPESQUISAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btGRAVAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCANCELAR)
                        .addGap(43, 43, 43))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbTELE)
                                        .addComponent(lbCHAVE)
                                        .addComponent(lbNOME)
                                        .addComponent(lbCODIGO))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(lbOBSER)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbCHAVE, 0, 1, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCONTA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edCONTA, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbTIPO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(lbBANCO)
                                        .addGap(170, 170, 170))
                                    .addComponent(edCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(edTELE, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbEMAIL))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(452, 452, 452)
                                .addComponent(lbPIX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edBANCO, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPIX, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(edEMAIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCODIGO)
                    .addComponent(edCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNOME)
                    .addComponent(lbPIX)
                    .addComponent(edPIX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCHAVE)
                    .addComponent(cbCHAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCONTA)
                    .addComponent(edCONTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBANCO)
                    .addComponent(edBANCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTIPO)
                    .addComponent(cbTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edTELE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTELE)
                    .addComponent(lbEMAIL)
                    .addComponent(edEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOBSER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCANCELAR)
                    .addComponent(btGRAVAR)
                    .addComponent(btPESQUISAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGRAVARActionPerformed
       if (edNOME.getText().isEmpty()) {
           edNOME.requestFocus();
           Frame.aviso("Campo Nome obrigatório, verifique!");
       }
       if (edPIX.getText().isEmpty()){
           edPIX.requestFocus();
           Frame.aviso("Chave PIX obrigatório, verifique!");
       }
    }//GEN-LAST:event_btGRAVARActionPerformed

   
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadDividas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCANCELAR;
    private javax.swing.JButton btGRAVAR;
    private javax.swing.JButton btPESQUISAR;
    private javax.swing.JComboBox<String> cbCHAVE;
    private javax.swing.JComboBox<String> cbTIPO;
    private javax.swing.JTextField edBANCO;
    private javax.swing.JTextField edCODIGO;
    private javax.swing.JTextField edCONTA;
    private javax.swing.JTextField edEMAIL;
    private javax.swing.JTextField edNOME;
    private javax.swing.JTextPane edOBSERV;
    private javax.swing.JFormattedTextField edPIX;
    private javax.swing.JTextField edTELE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbBANCO;
    private javax.swing.JLabel lbCHAVE;
    private javax.swing.JLabel lbCODIGO;
    private javax.swing.JLabel lbCONTA;
    private javax.swing.JLabel lbEMAIL;
    private javax.swing.JLabel lbNOME;
    private javax.swing.JLabel lbOBSER;
    private javax.swing.JLabel lbPIX;
    private javax.swing.JLabel lbTELE;
    private javax.swing.JLabel lbTIPO;
    private javax.swing.JTable tbCONTAS;
    // End of variables declaration//GEN-END:variables
}
