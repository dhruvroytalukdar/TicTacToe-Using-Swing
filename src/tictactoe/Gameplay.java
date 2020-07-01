/**The TIC TAC TOE game by Dhruv Roy Talukdar*/
package tictactoe;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Gameplay extends javax.swing.JFrame {

    private int count=0;
    
    private boolean p1butt1 = false;
    private boolean p1butt2 = false;
    private boolean p1butt3 = false;
    private boolean p1butt4 = false;
    private boolean p1butt5 = false;
    private boolean p1butt6 = false;
    private boolean p1butt7 = false;
    private boolean p1butt8 = false;
    private boolean p1butt9 = false;
    
    private boolean p2butt1 = false;
    private boolean p2butt2 = false;
    private boolean p2butt3 = false;
    private boolean p2butt4 = false;
    private boolean p2butt5 = false;
    private boolean p2butt6 = false;
    private boolean p2butt7 = false;
    private boolean p2butt8 = false;
    private boolean p2butt9 = false;
    
    public Gameplay() {
        initComponents();
    }
    public boolean player1check_gameover()
    {
        if(p1butt1==true&&p1butt2==true&&p1butt3==true)
            return true;
        else if(p1butt4==true&&p1butt5==true&&p1butt6==true)
            return true;
        else if(p1butt7==true&&p1butt8==true&&p1butt9==true)
            return true;
        else if(p1butt1==true&&p1butt5==true&&p1butt9==true)
            return true;
        else if(p1butt3==true&&p1butt5==true&&p1butt7==true)
            return true;
        else if(p1butt1==true&&p1butt4==true&&p1butt7==true)
            return true;
        else if(p1butt2==true&&p1butt5==true&&p1butt8==true)
            return true;
        else if(p1butt3==true&&p1butt6==true&&p1butt9==true)
            return true;
        else 
            return false;
    }
    public boolean player2check_gameover()
    {
        if(p2butt1==true&&p2butt2==true&&p2butt3==true)
            return true;
        else if(p2butt4==true&&p2butt5==true&&p2butt6==true)
            return true;
        else if(p2butt7==true&&p2butt8==true&&p2butt9==true)
            return true;
        else if(p1butt2==true&&p2butt5==true&&p2butt9==true)
            return true;
        else if(p2butt3==true&&p2butt5==true&&p2butt7==true)
            return true;
        else if(p2butt1==true&&p2butt4==true&&p2butt7==true)
            return true;
        else if(p2butt2==true&&p2butt5==true&&p2butt8==true)
            return true;
        else if(p2butt3==true&&p2butt6==true&&p2butt9==true)
            return true;
        else 
            return false;
    }
    public Gameplay(String p1,String p2){
        initComponents();
        player1.setText(p1);
        player2.setText(p2);
        setLocationRelativeTo(null);
        jLabel1.setText(p1+" will start first.");
    }
    public void disable()
    {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jLabel1.setText("");
    }
    public void enable()
    {
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        player1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        player1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 51, 51));
        player1.setText("Player 1:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("O");

        player2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(0, 0, 255));
        player2.setText("Player 2:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton10.setText("Clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(count%2==0 && p1butt1==false && p2butt1==false)
        {
            jButton1.setText("O");
            count++;
            jButton1.setBackground(Color.red);
            p1butt1 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
            //jButton1.setEnabled(false);
        }
        else if(count%2!=0 && p1butt1==false && p2butt1==false)
        {
            jButton1.setText("X");
            count++;
            jButton1.setBackground(Color.blue);
            p2butt1 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(count%2==0 && p1butt2==false && p2butt2==false)
        {
            jButton2.setText("O");
            count++;
            jButton2.setBackground(Color.red);
            p1butt2 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            //jButton1.setEnabled(false);
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
        else if(count%2!=0 && p1butt2==false && p2butt2==false)
        {
            jButton2.setText("X");
            count++;
            jButton2.setBackground(Color.blue);
            p2butt2 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(count%2==0 && p1butt3==false && p2butt3==false)
        {
            jButton3.setText("O");
            count++;
            jButton3.setBackground(Color.red);
            p1butt3 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }//jButton1.setEnabled(false);
        }
        else if(count%2!=0 && p1butt3==false && p2butt3==false)
        {
            jButton3.setText("X");
            count++;
            jButton3.setBackground(Color.blue);
            p2butt3 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(count%2==0 && p1butt4==false && p2butt4==false)
        {
            jButton4.setText("O");
            count++;
            jButton4.setBackground(Color.red);
            p1butt4 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }//jButton1.setEnabled(false);
        }
        else if(count%2!=0 && p1butt4==false && p2butt4==false)
        {
            jButton4.setText("X");
            count++;
            jButton4.setBackground(Color.blue);
            p2butt4 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
                        
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(count%2==0 && p1butt5==false && p2butt5==false)
        {
            jButton5.setText("O");
            count++;
            jButton5.setBackground(Color.red);
            p1butt5 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }//jButton1.setEnabled(false);
        }
        else if(count%2!=0 && p1butt5==false && p2butt5==false)
        {
            jButton5.setText("X");
            count++;
            jButton5.setBackground(Color.blue);
            p2butt5 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }    
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(count%2==0 && p1butt6==false && p2butt6==false)
        {
            jButton6.setText("O");
            count++;
            jButton6.setBackground(Color.red);
            p1butt6 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }//jButton1.setEnabled(false);
        }
        else if(count%2!=0 && p1butt6==false &&p2butt6==false)
        {
            jButton6.setText("X");
            count++;
            jButton6.setBackground(Color.blue);
            p2butt6 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(count%2==0 && p1butt7==false && p2butt7==false)
        {
            jButton7.setText("O");
            count++;
            jButton7.setBackground(Color.red);
            p1butt7 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }//jButton1.setEnabled(false);
        }
        else if(count%2!=0 && p1butt7==false && p2butt7==false)
        {
            jButton7.setText("X");
            count++;
            jButton7.setBackground(Color.blue);
            p2butt7 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(count%2==0 && p1butt8==false && p2butt8==false)
        {
            jButton8.setText("O");
            count++;
            jButton8.setBackground(Color.red);
            p1butt8 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
//jButton1.setEnabled(false);
        }
        else if(count%2!=0 &&p1butt8==false &&p2butt8==false)
        {
            jButton8.setText("X");
            count++;
            jButton8.setBackground(Color.blue);
            p2butt8 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(count%2==0 && p1butt9==false &&p2butt9==false)
        {
            jButton9.setText("O");
            count++;
            jButton9.setBackground(Color.red);
            p1butt9 = true;
            if(player1check_gameover())
            {
                JOptionPane.showMessageDialog(this, player1.getText()+" has won.");
            }
            else if(count!=9)
                jLabel1.setText(player2.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }//jButton1.setEnabled(false);
        }
        else if(count%2!=0 && p1butt9==false && p2butt9==false)
        {
            jButton9.setText("X");
            count++;
            jButton9.setBackground(Color.blue);
            p2butt9 = true;
            if(player2check_gameover())
            {
                JOptionPane.showMessageDialog(this, player2.getText()+" has won.");
            }
            if(count!=9)
                jLabel1.setText(player1.getText()+" take your turn.");
            else
            {
                disable();
                JOptionPane.showMessageDialog(this, "Match is drawn");
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        count=0;
        jLabel1.setText(player1.getText()+" take your turn.");
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        p1butt1 = false;
        p1butt2 = false;
        p1butt3 = false;
        p1butt4 = false;
        p1butt5 = false;
        p1butt6 = false;
        p1butt7 = false;
        p1butt8 = false;
        p1butt9 = false;
        p2butt1 = false;
        p2butt2 = false;
        p2butt3 = false;
        p2butt4 = false;
        p2butt5 = false;
        p2butt6 = false;
        p2butt7 = false;
        p2butt8 = false;
        p2butt9 = false;
        enable();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gameplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    // End of variables declaration//GEN-END:variables
}
