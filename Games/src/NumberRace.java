import java.util.Random;
import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
import java.util.ArrayList;

public class NumberRace extends javax.swing.JFrame {
    
    String Playertx = "",Leveltx = "" , a , b , c , letraingresada, newc;
    int Player = 0 ,Level = 0 ,newlevel , D1 , D2 , i , P , A ,counter = 0, x = -1, bro=0;
    int[] Advanced= new int [1000];
    int[] Missing= new int [1000];
    int[] Return= new int [1000];
    int[] Pars= new int [1000];
    
    public NumberRace() {
        initComponents();
        
        lbld1.setIcon(new ImageIcon(getClass().getResource("images/question.png")));
        lbld2.setIcon(new ImageIcon(getClass().getResource("images/question.png")));
        btnStart.setEnabled(true);
        cmb1.setEnabled(false);  
        cmb2.setEnabled(false);  
        btnAgain.setEnabled(false);
        btnDados.setEnabled(false);
        
    }
    public void Play(){
        
        x++;
        if(x<=Player-1){
            
            Advanced[x]=A+Advanced[x];   
            Missing[x]=(Level-Advanced[x]);
            Return[x]=bro+Return[x];
            Pars[x]=P+Pars[x];
            lblJugador.setText(Integer.toString(x+1));
     
        }else{
            
            x=0; 
            Advanced[x]=A+Advanced[x];   
            Missing[x]=(Level-Advanced[x]);
            Return[x]=bro+Return[x];
            Pars[x]=P+Pars[x];
            lblJugador.setText(Integer.toString(x+1));
        } 
        
        if(Advanced[x]>=Level||Pars[x]==3){
              
            String W=lblJugador.getText();
            lblWin.setText("Player " + W + " Win.");
            btnAgain.setEnabled(false);
            btnStart.setEnabled(true);  
        }else{
           
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbld1 = new javax.swing.JLabel();
        lbld2 = new javax.swing.JLabel();
        btnDados = new javax.swing.JButton();
        btnAgain = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPair = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblWin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmb2 = new javax.swing.JComboBox<>();
        btnStart = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        lblAdvans = new javax.swing.JLabel();
        lblMissing = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblReturns = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NumberRice");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pickup-car.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 40);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Play zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel2.setLayout(null);

        lbld1.setBackground(new java.awt.Color(0, 255, 255));
        lbld1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbld1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N
        jPanel2.add(lbld1);
        lbld1.setBounds(40, 40, 70, 68);

        lbld2.setBackground(new java.awt.Color(0, 255, 255));
        lbld2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbld2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N
        jPanel2.add(lbld2);
        lbld2.setBounds(120, 40, 86, 70);

        btnDados.setBackground(new java.awt.Color(51, 102, 255));
        btnDados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDados.setText("PLAY");
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDados);
        btnDados.setBounds(70, 120, 90, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 290, 240, 170);

        btnAgain.setBackground(new java.awt.Color(153, 153, 153));
        btnAgain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgain.setText("Try Again");
        btnAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgainActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgain);
        btnAgain.setBounds(570, 110, 210, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Number Rice");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 30, 800, 30);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pairs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lblPair.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblPair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPair.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblPair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(290, 290, 250, 170);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lblWin.setBackground(new java.awt.Color(0, 153, 255));
        lblWin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWin.setText("?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWin, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblWin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(560, 290, 230, 170);

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Config Zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Number of players:");
        jLabel4.setToolTipText("");

        cmb1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Level :");

        cmb2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic[50]", "Intermediato[100]", "Advanced[150]" }));
        cmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb2ActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(153, 153, 153));
        btnStart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnStart.setText("Start Game");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(cmb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb2, 0, 186, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 60, 240, 220);

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Turn Player :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Advanced positions :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Missing positions :");

        lblJugador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblJugador.setText("#");

        lblAdvans.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAdvans.setText("#");

        lblMissing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMissing.setText("#");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Returns :");

        lblReturns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReturns.setText("#");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMissing))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(64, 64, 64)
                                .addComponent(lblAdvans)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJugador))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAdvans))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblMissing))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblReturns))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(290, 70, 250, 210);

        btnAbout.setBackground(new java.awt.Color(153, 153, 153));
        btnAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAbout.setText("About of");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbout);
        btnAbout.setBounds(570, 190, 210, 40);

        btnConfig.setBackground(new java.awt.Color(153, 153, 153));
        btnConfig.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Config.png"))); // NOI18N
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfig);
        btnConfig.setBounds(730, 10, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 480);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(560, 70, 230, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        // TODO add your handling code here:
        Random D = new Random();
       
        int d1= 0, d2 = 0;
        d1=(int)(D.nextDouble()* 6 + 1);
        d2=(int)(D.nextDouble()* 6 + 1);
       
        counter = counter + (d1 + d2);
        lblAdvans.setText(Integer.toString(counter));
        //lbld1.setText(Integer.toString(d1));
        //lbld2.setText(Integer.toString(d2));
        A = 0 ;
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
        //if(d1 == 1 && d2 == 1){
        //JOptionPane.showMessageDialog(null, "::: YOU WIN :::");
        // }
        //if(Turn<=Player-1){
        // lblJugador.setText(Integer.toString(Turn+1));
        // }else if(Turn==Turn){
        // lblJugador.setText(Integer.toString(1+Turn-Turn));
        // }
        // lblJugador.setText(Integer.toString(Turn));       
        //if(Turn<=Player-1){          
        //    Turn++;
        //}else if(Turn==Player){
        //  Turn=1;  
        // }
        lblPair.setText(Integer.toString(P));
        
        if(d1 == d2){
            P++;
        }
        if(d1==d2&&d1==6){ 
            A=(21)+A;
        }else{  
            A=(d1+d2)+A;
        
        if(d1==d2&&d1==6){
        btnDados.setText(Integer.toString(21));
        }else{
        btnDados.setText(Integer.toString(d1+d2));
        }
        }  
        Play();
        lblAdvans.setText(Integer.toString(Advanced[x])); 
        lblMissing.setText(Integer.toString(Missing[x])); 
        lblReturns.setText(Integer.toString(Return[x])); 
        lblPair.setText(Integer.toString(Pars[x]));
        //System.out.println("Jugador: "+x+"||Posicion: "+Advanced[x]+"||Faltantes: "+Missing[x]+"||Pares: "+Pars[x]); 
       
    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgainActionPerformed
        // TODO add your handling code here:
        //lbld1.setText("?");
        //lbld2.setText("?");
        lbld1.setIcon(new ImageIcon(getClass().getResource("images/question.png")));
        lbld2.setIcon(new ImageIcon(getClass().getResource("images/question.png")));
        btnStart.setEnabled(true);
        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic[50]", "Intermediato[100]", "Advanced[200]" }));
    }//GEN-LAST:event_btnAgainActionPerformed

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        // TODO add your handling code here:
        //Configuracion numero de jugadores
        Playertx = cmb1.getSelectedItem().toString();
        Player = Integer.parseInt(Playertx);
        System.out.println(Player);
        cmb1.setEnabled(false);
        if(Player!=0&&Level>=50){
        btnDados.setEnabled(true);
        } 
    }//GEN-LAST:event_cmb1ActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // TODO add your handling code here:
        //LLeva a configuraciones
        ConfigGame ConfigGame = new ConfigGame();
        ConfigGame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConfigActionPerformed

    private void cmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb2ActionPerformed
        // TODO add your handling code here:
        Leveltx = cmb2.getSelectedItem().toString();         
        cmb2.setEnabled(false); 
        switch (Leveltx){
            
            case "Basic[50]":Level=50;
                break;
            case "Intermediato[100]":Level=100;
                break;
            case "Advanced[150]":Level=150;
                break; 
            default:
                break;
        }
    }//GEN-LAST:event_cmb2ActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        //Da informacion del juego
        About About = new About();
        About.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        cmb1.setEnabled(true);
        cmb2.setEnabled(true);  
        btnAgain.setEnabled(true);
        btnDados.setEnabled(true);

        if(!"".equals(b));
        if(ConfigGame.txtAddOf.getText().isEmpty()){
        }else{
           NumberRace.cmb1.addItem(ConfigGame.txtAddOf.getText());
        }  
        btnStart.setEnabled(false);
    }//GEN-LAST:event_btnStartActionPerformed

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
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnAgain;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnStart;
    public static javax.swing.JComboBox<String> cmb1;
    private javax.swing.JComboBox<String> cmb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel lblAdvans;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblMissing;
    private javax.swing.JLabel lblPair;
    private javax.swing.JLabel lblReturns;
    private javax.swing.JLabel lblWin;
    private javax.swing.JLabel lbld1;
    private javax.swing.JLabel lbld2;
    // End of variables declaration//GEN-END:variables
}
