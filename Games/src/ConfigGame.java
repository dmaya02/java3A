import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class ConfigGame extends javax.swing.JFrame {

    public ConfigGame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnContinue = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAddOf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SETTINGS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 420, 30);

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 240, 130, 40);

        btnContinue.setBackground(new java.awt.Color(153, 153, 153));
        btnContinue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnContinue.setText("CONTINUE");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinue);
        btnContinue.setBounds(220, 240, 130, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add number of players :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 90, 420, 22);

        txtAddOf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddOf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddOf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddOfActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddOf);
        txtAddOf.setBounds(110, 140, 190, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Config.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 70, 64);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Config.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 10, 70, 64);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       NumberRace NumberRace = new NumberRace();          
       NumberRace.setVisible(true);      
       this.setVisible(false);
        
    }//GEN-LAST:event_btnBackActionPerformed
    public void txtAddKeyTyped(java.awt.event.KeyEvent evt) {                                     
    char validar = evt.getKeyChar();
    if(Character.isLetter(validar)){
     getToolkit().beep();
     evt.consume();
    }else{        
    }
    } 
    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
       if(ConfigGame.txtAddOf.getText().isEmpty()){
       JOptionPane.showMessageDialog(this,"No se completo la validacion.","Mensaje",WARNING_MESSAGE);  
             //JOptionPane.showMessageDialog(this,"No dejar este espacio vacios.","Mensaje",WARNING_MESSAGE);  
       }else{
       NumberRace NumberRace = new NumberRace();          
       NumberRace.setVisible(true);      
       this.setVisible(false);
       }               
    }//GEN-LAST:event_btnContinueActionPerformed

    private void txtAddOfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddOfActionPerformed
        // TODO add your handling code here:
   
    
    }//GEN-LAST:event_txtAddOfActionPerformed

public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfigGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtAddOf;
    // End of variables declaration//GEN-END:variables
}
