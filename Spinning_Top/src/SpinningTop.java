import java.util.Random;
import javax.swing.ImageIcon;

public class SpinningTop extends javax.swing.JFrame {
    
    int i = 1, p1= 0, p2=0, p3=0, p4=0,C;
    int counter;

    
    public SpinningTop() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/icons/spinning-top.png")).getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblP1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblP2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblP4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblP3 = new javax.swing.JLabel();
        lblPiri = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbPlay = new javax.swing.JComboBox<>();
        btnPlay = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblAcu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblWin = new javax.swing.JLabel();
        lblWin1 = new javax.swing.JLabel();
        btnPirinola = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spinning Top");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Play Zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Player 1");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 20, 60, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Player 2");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 130, 60, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Player 4");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 130, 60, 22);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Player 3");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 220, 60, 22);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Coins");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 40, 35, 14);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Coins");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 150, 35, 14);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Coins");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 150, 35, 14);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Coins");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(180, 240, 35, 14);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblP1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblP1.setForeground(new java.awt.Color(0, 0, 255));
        lblP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(150, 60, 80, 60);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblP2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblP2.setForeground(new java.awt.Color(0, 0, 204));
        lblP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(28, 170, 80, 60);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblP4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblP4.setForeground(new java.awt.Color(0, 0, 204));
        lblP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP4.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(268, 170, 80, 60);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblP3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblP3.setForeground(new java.awt.Color(0, 0, 204));
        lblP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP3.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblP3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(160, 260, 80, 60);

        lblPiri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/0.png"))); // NOI18N
        jPanel1.add(lblPiri);
        lblPiri.setBounds(140, 130, 110, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 20, 370, 340);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Config Zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Coins Per Player :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 20, 130, 30);

        cmbPlay.setEditable(true);
        cmbPlay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbPlay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "30" }));
        jPanel2.add(cmbPlay);
        cmbPlay.setBounds(140, 20, 140, 30);

        btnPlay.setBackground(new java.awt.Color(255, 255, 255));
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/play-button.png"))); // NOI18N
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlay);
        btnPlay.setBounds(40, 60, 70, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(390, 20, 290, 140);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Acomulated"));

        lblAcu.setFont(new java.awt.Font("Tahoma", 1, 52)); // NOI18N
        lblAcu.setForeground(new java.awt.Color(255, 0, 0));
        lblAcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcu.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblAcu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblAcu)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(390, 170, 290, 90);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Winner"));

        lblWin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblWin.setText("?");

        lblWin1.setFont(new java.awt.Font("Tahoma", 1, 5)); // NOI18N
        lblWin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/campeon.png"))); // NOI18N
        lblWin1.setText(".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWin1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblWin)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(390, 270, 290, 90);

        btnPirinola.setBackground(new java.awt.Color(255, 0, 0));
        btnPirinola.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPirinola.setForeground(new java.awt.Color(255, 255, 255));
        btnPirinola.setText("Spin around -> Player #");
        btnPirinola.setEnabled(false);
        btnPirinola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPirinolaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPirinola);
        btnPirinola.setBounds(10, 380, 370, 40);

        btnReset.setBackground(new java.awt.Color(0, 0, 255));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("restart game");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(390, 380, 290, 40);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-40, -30, 694, 265);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo-colorido-videojuego-diseno-plano_23-2147567954.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 0, 640, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPirinolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPirinolaActionPerformed
        // TODO add your handling code here:
        Random P = new Random();
        int p = 0 ;
        C = Integer.parseInt(cmbPlay.getSelectedItem().toString());
            if (i == 1){
                i = i + 1;
                if (p1 > 0){
                    btnPirinola.setText("Spin around -> Player 1");
                    p =(int) (P.nextDouble()* 6 + 1);
                    if (p == 1){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon1.png")));
                        if (p1 >= 1){
                            p1 = p1 -1;
                            lblP1.setText(String.valueOf(p1));
                            counter = counter +1;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 2){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon2.png")));
                        if (p1 >= 2){
                            p1 = p1 - 2;
                            lblP1.setText(String.valueOf(p1));
                            counter = counter +2;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 3){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma1.png")));
                        if (counter >= 1){
                            p1 = p1 + 1;
                            lblP1.setText(String.valueOf(p1));
                            counter = counter -1;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 4){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma2.png")));
                        if (counter >= 2){
                            p1 = p1 +2;
                            lblP1.setText(String.valueOf(p1));
                            counter = counter -2;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 5){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/tomatodo.png")));
                        if (counter > 0){
                            p1 = p1 + counter;
                            lblP1.setText(String.valueOf(p1));
                            counter = counter - counter;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 6){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/todospoen.png")));
                        if (p1 >= 1){
                            p1 = p1 - 1;   
                            counter = counter + 1;
                            lblP1.setText(String.valueOf(p1));
                        }
                        if (p2 >= 1){
                            p2 = p2 - 1; 
                            counter = counter + 1;
                            lblP2.setText(String.valueOf(p2));
                        }
                        if (p3 >= 1){
                            p3 = p3 - 1;
                            counter = counter + 1;
                            lblP3.setText(String.valueOf(p3));
                        }
                        if (p4 >= 1){
                            p4 = p4 - 1;
                            counter = counter + 1;
                            lblP4.setText(String.valueOf(p1));
                        }
                        lblAcu.setText(String.valueOf(counter));
                    }
                }else if(p1 <= 0){
                    //lblP1.setIcon(new ImageIcon(getClass().getResource("/icons/gameover.png")));
                    lblP1.setText("GAME OVER");
                }
            }else if (i == 2){
                i = i + 1;
                if (p2 > 0){
                    btnPirinola.setText("Spin around -> Player 2");
                    p =(int) (P.nextDouble()* 6 + 1);
                    if (p == 1){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon1.png")));
                        if (p2 >= 1){
                            p2 = p2 -1;
                            lblP2.setText(String.valueOf(p2));
                            counter = counter +1;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 2){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon2.png")));
                        if (p2 >= 1){
                            p2 = p2 - 2;
                            lblP2.setText(String.valueOf(p2));
                            counter = counter +2;
                            lblAcu.setText(String.valueOf(counter));
                        }    
                    }else if (p == 3){
                        if (counter >= 1){
                            lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma1.png")));
                            p2 = p2 + 1;
                            lblP2.setText(String.valueOf(p2));
                            counter = counter -1;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 4){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma2.png")));
                        if (counter >= 2){
                            p2 = p2 +2;
                            lblP2.setText(String.valueOf(p2));
                            counter = counter -2;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 5){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/tomatodo.png")));
                        if (counter > 0){
                            p2 = p2 + counter;
                            lblP2.setText(String.valueOf(p2));
                            counter = counter - counter;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 6){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/todospoen.png")));
                        if (p1 >= 1){
                            p1 = p1 - 1;  
                            counter = counter + 1;
                            lblP1.setText(String.valueOf(p1));
                        }
                        if (p2 >= 1){
                            p2 = p2 - 1; 
                            counter = counter + 1;
                            lblP2.setText(String.valueOf(p2));
                        }
                        if (p3 >= 1){
                            p3 = p3 - 1; 
                            counter = counter + 1;
                            lblP3.setText(String.valueOf(p3));
                        }
                        if (p4 >= 1){
                            p4 = p4 - 1;
                            counter = counter + 1;
                            lblP4.setText(String.valueOf(p4));
                        }
                        lblAcu.setText(String.valueOf(counter));
                    }    
                }else if(p2 <= 0){
                    //lblP2.setIcon(new ImageIcon(getClass().getResource("/icons/gameover.png")));
                    lblP2.setText("GAME OVER");
                }    
        }else if (i == 3){
                i = i + 1;
                if (p3 > 0){
                    btnPirinola.setText("Spin around -> Player 3");
                    p =(int) (P.nextDouble()* 6 + 1);
                    if (p == 1){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon1.png")));
                        if (p3 >= 1){ 
                            p3 = p3 -1;
                            lblP3.setText(String.valueOf(p3));
                            counter = counter +1;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 2){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon2.png")));
                        if (p3 >= 1){
                            p3 = p3 - 2;
                            lblP3.setText(String.valueOf(p3));
                            counter = counter + 2;
                            lblAcu.setText(String.valueOf(counter));
                        }    
                    }else if (p == 3){
                        if (counter >= 1){
                            lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma1.png")));
                            p3 = p3 + 1;
                            lblP3.setText(String.valueOf(p3));
                            counter = counter -1;
                            lblAcu.setText(String.valueOf(lblAcu));
                        }
                    }else if (p == 4){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma2.png")));
                        if (counter >= 2){
                            p3 = p3 + 2;
                            lblP3.setText(String.valueOf(p3));
                            counter = counter - 2;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 5){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/tomatodo.png")));
                        if (counter > 0){
                            p3 = p3 + counter;
                            lblP3.setText(String.valueOf(p3));
                            counter = counter - counter;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 6){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/todospoen.png")));
                        if (p1 >= 1){
                            p1 = p1 - 1;    
                            counter = counter + 1;
                            lblP1.setText(String.valueOf(p1));
                        }
                        if (p2 >= 1){
                            p2 = p2 - 1; 
                            counter = counter+ 1;
                            lblP2.setText(String.valueOf(p2));
                        }
                        if (p3 >= 1){
                            p3 = p3 - 1; 
                            counter = counter + 1;
                            lblP3.setText(String.valueOf(p3));
                        }
                        if (p4 >= 1){
                            p4 = p4 - 1;
                            counter = counter + 1;
                            lblP4.setText(String.valueOf(p4));
                        }
                        lblAcu.setText(String.valueOf(counter));
                    }
                }else if(p3 <= 0){
                   //lblP3.setIcon(new ImageIcon(getClass().getResource("/icons/gameover.png")));
                   lblP3.setText("GAME OVER");
                }       
        }else if (i == 4){
                i = i - 3;
                if (p4 > 0){
                    btnPirinola.setText("Spin around -> Player 4");
                    p =(int) (P.nextDouble() * 6 + 1);
                    if (p == 1){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon1.png")));
                        if (p4 >= 1){ 
                            p4 = p4 - 1;
                            lblP4.setText(String.valueOf(p4));
                            counter = counter + 1;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 2){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/pon2.png")));
                        if (p4 >= 1){
                            p4 = p4 - 2;
                            lblP4.setText(String.valueOf(p4));
                            counter = counter +2;
                            lblAcu.setText(String.valueOf(counter));
                        }    
                    }else if (p == 3){
                        if (counter >= 1){
                            lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma1.png")));
                            p4 = p4 + 1;
                            lblP4.setText(String.valueOf(p4));
                            counter = counter - 1;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 4){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/toma2.png")));
                        if (counter >= 2){
                            p4 = p4 +2;
                            lblP4.setText(String.valueOf(p4));
                            counter = counter - 2;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 5){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/tomatodo.png")));
                        if (counter > 0){
                            p4 = p4 + counter;
                            lblP4.setText(String.valueOf(p4));
                            counter = counter - counter;
                            lblAcu.setText(String.valueOf(counter));
                        }
                    }else if (p == 6){
                        lblPiri.setIcon(new ImageIcon(getClass().getResource("/icons/todospoen.png")));
                        if (p1 >= 1){
                            p1 = p1 - 1; 
                            counter = counter + 1;
                            lblP1.setText(String.valueOf(p1));
                        }
                        if (p2 >= 1){
                            p2 = p2 - 1; 
                            counter = counter + 1;
                            lblP2.setText(String.valueOf(p2));
                        }
                        if (p3 >= 1){
                            p3 = p3 - 1; 
                            counter = counter + 1;
                            lblP3.setText(String.valueOf(p3));
                        }
                        if (p4 >= 1){
                            p4 = p4 - 1;
                            counter = counter + 1;
                            lblP4.setText(String.valueOf(p4));
                        }
                        lblAcu.setText(String.valueOf(counter));
                    }
                }else if(p4 <= 0){
                    //lblP4.setIcon(new ImageIcon(getClass().getResource("/icons/gameover.png")));
                    lblP4.setText("GAME OVER");
                }    
            }
            if (p1 >= 1 && p2 <= 0 && p3 <= 0 && p4 <= 0){
                lblWin.setText("Player 1");
                //lblWin1.setIcon(new ImageIcon(getClass().getResource("/icons/campeon.png")));
                i = 0;
                btnPirinola.setText("Spin around -> Player #");
                btnPirinola.setEnabled(false);
            }else if (p2 >= 1 && p1 <= 0 && p3 <= 0 && p4 <= 0){
                lblWin.setText("Player 2");
                //lblWin1.setIcon(new ImageIcon(getClass().getResource("/icons/campeon.png")));
                i = 0;
                btnPirinola.setText("Spin around -> Player #");
                btnPirinola.setEnabled(false);
            }else if (p3 >= 1 && p1 <= 0 && p2 <= 0 && p4 <= 0){
                lblWin.setText("Player 3");
                //lblWin1.setIcon(new ImageIcon(getClass().getResource("/icons/campeon.png")));
                i = 0;
                btnPirinola.setText("Spin around -> Player #");
                btnPirinola.setEnabled(false);
            }else if (p4 >= 1 && p1 <= 0 && p2 <= 0 && p3 <= 0){
                lblWin.setText("Player 4");
                //lblWin1.setIcon(new ImageIcon(getClass().getResource("/icons/campeon.png")));
                i = 0;
                btnPirinola.setText("Spin around -> Player #");
                btnPirinola.setEnabled(false);
            }
       
    }//GEN-LAST:event_btnPirinolaActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        C = Integer.parseInt(cmbPlay.getSelectedItem().toString());
        if (C == 5){
            p1 = 5;
            p2 = 5;
            p3 = 5;
            p4 = 5;
        }else if (C == 10){
            p1 = 10;
            p2 = 10;
            p3 = 10;
            p4 = 10;
        }else if (C == 20){ 
            p1 = 20;
            p2 = 20;
            p3 = 20;
            p4 = 20;
        }else if (C == 30){
            p1 = 30;
            p2 = 30;
            p3 = 30;
            p4 = 30;
    }
        
        lblP1.setText(String.valueOf(p1));
        lblP2.setText(String.valueOf(p2));
        lblP3.setText(String.valueOf(p3));
        lblP4.setText(String.valueOf(p4));
        btnPirinola.setText("Spin around -> Player 1");

        btnPirinola.setEnabled(true);
        btnReset.setEnabled(true);
        btnPlay.setEnabled(false);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
       //Reset botones
        btnPirinola.setEnabled(false);
        btnReset.setEnabled(false);
        btnPlay.setEnabled(true);
        //Reset labels
        p1 = 0;
        p2 = 0;
        p3 = 0;
        p4 = 0;
        counter = 0;
        lblP1.setText("0");
        lblP2.setText("0");
        lblP3.setText("0");
        lblP4.setText("0");
        lblAcu.setText("0");
        btnPirinola.setText("Spin around -> Player #");
        lblWin.setText("?");
        lblPiri.setIcon(new ImageIcon(getClass().getResource("icons/0.png")));
        lblWin1.setText("?");
        
        
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpinningTop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPirinola;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAcu;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblP3;
    private javax.swing.JLabel lblP4;
    private javax.swing.JLabel lblPiri;
    private javax.swing.JLabel lblWin;
    private javax.swing.JLabel lblWin1;
    // End of variables declaration//GEN-END:variables
}