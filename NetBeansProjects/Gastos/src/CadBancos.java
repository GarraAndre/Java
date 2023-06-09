
public class CadBancos extends javax.swing.JFrame {

    
    public CadBancos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCODIGO = new javax.swing.JLabel();
        edCODIGO = new javax.swing.JTextField();
        lbDESCRI = new javax.swing.JLabel();
        edDESCRI = new javax.swing.JTextField();
        lbCONTA = new javax.swing.JLabel();
        edCONTA = new javax.swing.JTextField();
        lbDIG = new javax.swing.JLabel();
        lbSALDO = new javax.swing.JLabel();
        edDIG = new javax.swing.JTextField();
        edSALDO = new javax.swing.JTextField();
        lbTIPO = new javax.swing.JLabel();
        coTIPO = new javax.swing.JComboBox<>();
        lbCHEQUE = new javax.swing.JLabel();
        edCHEQUE = new javax.swing.JTextField();
        btCONFIRMAR = new javax.swing.JButton();
        btCANCELAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bancos");

        lbCODIGO.setText("Código:");

        lbDESCRI.setText("Descrição:");

        edDESCRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edDESCRIActionPerformed(evt);
            }
        });

        lbCONTA.setText("Conta:");

        lbDIG.setText("Dígito:");

        lbSALDO.setText("Saldo:");

        lbTIPO.setText("Tipo de Conta:");

        coTIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTA CORRENTE", "POUPANÇA" }));

        lbCHEQUE.setText("Cheque Especial:");

        edCHEQUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edCHEQUEActionPerformed(evt);
            }
        });

        btCONFIRMAR.setText("Confirmar");

        btCANCELAR.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTIPO)
                    .addComponent(lbCONTA)
                    .addComponent(lbDESCRI)
                    .addComponent(lbCODIGO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edDESCRI, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edCONTA, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDIG))
                            .addComponent(coTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edDIG, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSALDO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edSALDO, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCHEQUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edCHEQUE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCONFIRMAR)
                                .addGap(23, 23, 23)
                                .addComponent(btCANCELAR)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCODIGO)
                    .addComponent(edCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDESCRI)
                    .addComponent(edDESCRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCONTA)
                    .addComponent(edCONTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDIG)
                    .addComponent(lbSALDO)
                    .addComponent(edDIG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edSALDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTIPO)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(coTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCHEQUE)
                        .addComponent(edCHEQUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCONFIRMAR)
                    .addComponent(btCANCELAR))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edCHEQUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCHEQUEActionPerformed
       
    }//GEN-LAST:event_edCHEQUEActionPerformed

    private void edDESCRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edDESCRIActionPerformed
        
    }//GEN-LAST:event_edDESCRIActionPerformed

    
    public static void main(String args[]) {
     
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadBancos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCANCELAR;
    private javax.swing.JButton btCONFIRMAR;
    private javax.swing.JComboBox<String> coTIPO;
    private javax.swing.JTextField edCHEQUE;
    private javax.swing.JTextField edCODIGO;
    private javax.swing.JTextField edCONTA;
    private javax.swing.JTextField edDESCRI;
    private javax.swing.JTextField edDIG;
    private javax.swing.JTextField edSALDO;
    private javax.swing.JLabel lbCHEQUE;
    private javax.swing.JLabel lbCODIGO;
    private javax.swing.JLabel lbCONTA;
    private javax.swing.JLabel lbDESCRI;
    private javax.swing.JLabel lbDIG;
    private javax.swing.JLabel lbSALDO;
    private javax.swing.JLabel lbTIPO;
    // End of variables declaration//GEN-END:variables
}
