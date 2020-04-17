import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class NumberRace extends javax.swing.JFrame {

   int counter = 0;
    public NumberRace() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbld1 = new javax.swing.JLabel();
        lbld2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NumberRice");
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pickup-car.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 610, 40);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel2.setLayout(null);

        lbld1.setBackground(new java.awt.Color(0, 255, 255));
        lbld1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbld1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N
        jPanel2.add(lbld1);
        lbld1.setBounds(70, 60, 70, 68);

        lbld2.setBackground(new java.awt.Color(0, 255, 255));
        lbld2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbld2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N
        jPanel2.add(lbld2);
        lbld2.setBounds(60, 160, 86, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 60, 220, 260);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("PLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 330, 90, 40);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Try Again");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(120, 330, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Number Rice");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 30, 610, 30);

        lblCounter.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCounter.setText("0");
        jPanel1.add(lblCounter);
        lblCounter.setBounds(340, 130, 140, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Random D = new Random();
       
        int d1= 0, d2 = 0;
        d1=(int)(D.nextDouble()* 6 + 1);
        d2=(int)(D.nextDouble()* 6 + 1);
       
        counter = counter + (d1 + d2);
        lblCounter.setText(Integer.toString(counter));
        //lbld1.setText(Integer.toString(d1));
        //lbld2.setText(Integer.toString(d2));
        
        switch(d1){
            case 1:
                lbld1.setIcon(new ImageIcon(getClass().getResource("images/1.png")));
                break;
            case 2:
                lbld1.setIcon(new ImageIcon(getClass().getResource("images/2.png")));
                break;
            case 3:
                lbld1.setIcon(new ImageIcon(getClass().getResource("images/3.png")));
                break;
            case 4:
                lbld1.setIcon(new ImageIcon(getClass().getResource("images/4.png")));
                break;
            case 5:
                lbld1.setIcon(new ImageIcon(getClass().getResource("images/5.png")));
                break;
            case 6:
                lbld1.setIcon(new ImageIcon(getClass().getResource("images/6.png")));
                break;
            default:
                break;
        }
        switch(d2){
             case 1:
                lbld2.setIcon(new ImageIcon(getClass().getResource("images/1.png")));
                break;
            case 2:
                lbld2.setIcon(new ImageIcon(getClass().getResource("images/2.png")));
                break;
            case 3:
                lbld2.setIcon(new ImageIcon(getClass().getResource("images/3.png")));
                break;
            case 4:
                lbld2.setIcon(new ImageIcon(getClass().getResource("images/4.png")));
                break;
            case 5:
                lbld2.setIcon(new ImageIcon(getClass().getResource("images/5.png")));
                break;
            case 6:
                lbld2.setIcon(new ImageIcon(getClass().getResource("images/6.png")));
                break;
            default:
                break;
        }
        
        if(d1 == 1 && d2 == 1){
        
            JOptionPane.showMessageDialog(null, "::: YOU WIN :::");
        
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //lbld1.setText("?");
        //lbld2.setText("?");
        lbld1.setIcon(new ImageIcon(getClass().getResource("images/question.png")));
        lbld2.setIcon(new ImageIcon(getClass().getResource("images/question.png")));
        
        lblCounter.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberRace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCounter;
    private javax.swing.JLabel lbld1;
    private javax.swing.JLabel lbld2;
    // End of variables declaration//GEN-END:variables
}
