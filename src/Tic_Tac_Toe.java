
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sumit Agrahari
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {

    /**
     * Creates new form Tic_Tac_Toe
     */
    int turn =2;
    int buttonused[]={0,0,0,0,0,0,0,0,0};
    int p_Xwon[]={0,0,0,0,0,0,0,0,0};
    int p_Owon[]={0,0,0,0,0,0,0,0,0};
    int p_Xwon(){
        if(p_Xwon[0]== 1 && p_Xwon [1]==1 && p_Xwon[2]==1)
        {
            return 1;
        }
        if(p_Xwon[3]== 1 && p_Xwon [4]==1 && p_Xwon[5]==1)
        {
            return 1;
        }
        if(p_Xwon[6]== 1 && p_Xwon [7]==1 && p_Xwon[8]==1)
        {
            return 1;
        }
        if(p_Xwon[0]== 1 && p_Xwon [3]==1 && p_Xwon[6]==1)
        {
            return 1;
        }
        if(p_Xwon[1]== 1 && p_Xwon [4]==1 && p_Xwon[7]==1)
        {
            return 1;
        }
        if(p_Xwon[2]== 1 && p_Xwon [5]==1 && p_Xwon[8]==1)
        {
            return 1;
        }
        if(p_Xwon[0]== 1 && p_Xwon [4]==1 && p_Xwon[8]==1)
        {
            return 1;
        }
        if(p_Xwon[2]== 1 && p_Xwon [4]==1 && p_Xwon[6]==1)
        {
            return 1;
        }
        return 0;
    }
    int p_Owon(){
        if(p_Owon[0]== 1 && p_Owon [1]==1 && p_Owon[2]==1)
        {
            return 1;
        }
        if(p_Owon[3]== 1 && p_Owon [4]==1 && p_Owon[5]==1)
        {
            return 1;
        }
        if(p_Owon[6]== 1 && p_Owon [7]==1 && p_Owon[8]==1)
        {
            return 1;
        }
        if(p_Owon[0]== 1 && p_Owon [3]==1 && p_Owon[6]==1)
        {
            return 1;
        }
        if(p_Owon[1]== 1 && p_Owon [4]==1 && p_Owon[7]==1)
        {
            return 1;
        }
        if(p_Owon[2]== 1 && p_Owon [5]==1 && p_Owon[8]==1)
        {
            return 1;
        }
        if(p_Owon[0]== 1 && p_Owon [4]==1 && p_Owon[8]==1)
        {
            return 1;
        }
        if(p_Owon[2]== 1 && p_Owon [4]==1 && p_Owon[6]==1)
        {
            return 1;
        }
        return 0;
    }
    public Tic_Tac_Toe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btexit = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt1.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 51, 0));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 68, 133, 126));

        bt2.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 51, 51));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 133, 126));

        bt0.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt0.setForeground(new java.awt.Color(255, 51, 102));
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        getContentPane().add(bt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 68, 133, 126));

        bt5.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt5.setForeground(new java.awt.Color(255, 51, 0));
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 212, 133, 126));

        bt4.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt4.setForeground(new java.awt.Color(255, 51, 51));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 212, 133, 126));

        bt6.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt6.setForeground(new java.awt.Color(255, 51, 0));
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 350, 133, 126));

        bt7.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt7.setForeground(new java.awt.Color(255, 51, 0));
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 350, 133, 126));

        bt8.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt8.setForeground(new java.awt.Color(255, 51, 0));
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 350, 133, 126));

        bt3.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        bt3.setForeground(new java.awt.Color(255, 51, 0));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 212, 133, 126));

        btexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btexit.setText("Exit");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });
        getContentPane().add(btexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 80, 30));

        btReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btReset.setText("Play Again");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        getContentPane().add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 487, -1, 30));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("PLAY!!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4]==0){
                if(turn%2==0){
                 turn ++;
                 bt4.setText("x");
                 p_Xwon[4]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt4.setText("o");
            buttonused[4]=1;
            p_Owon[4]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        
    }      
    }//GEN-LAST:event_bt4ActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        bt0.setText("");
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        turn =2;
        for(int i=0;i<9;i++){
            buttonused[i]=0;
            
        }
        for(int i=0;i<9;i++){
         p_Xwon[i]=0;
            
        }
        for(int i=0;i<9;i++){
         p_Owon[i]=0;
            
        }
             
    }//GEN-LAST:event_btResetActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        // TODO add your handling code here:
        if(buttonused[0]==0){
                if(turn%2==0){
                 turn ++;
                 bt0.setText("x");
                 p_Xwon[0]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt0.setText("o");
            buttonused[0]=1;
            p_Owon[0]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        }
    }//GEN-LAST:event_bt0ActionPerformed
 private JFrame frame;
    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        int response = JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Currency Converter",
                        JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0); // Exit the application
                }
                 
    }//GEN-LAST:event_btexitActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1]==0){
                if(turn%2==0){
                 turn ++;
                 bt1.setText("x");
                 p_Xwon[1]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt1.setText("o");
            buttonused[1]=1;
            p_Owon[1]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        }
    
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2]==0){
                if(turn%2==0){
                 turn ++;
                 bt2.setText("x");
                 p_Xwon[2]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt2.setText("o");
            buttonused[2]=1;
            p_Owon[2]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        }
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[3]==0){
                if(turn%2==0){
                 turn ++;
                 bt3.setText("x");
                 p_Xwon[3]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt3.setText("o");
            buttonused[3]=1;
            p_Owon[3]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        }
    
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5]==0){
                if(turn%2==0){
                 turn ++;
                 bt5.setText("x");
                 p_Xwon[5]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt5.setText("o");
            buttonused[5]=1;
            p_Owon[5]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        
    }      
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[6]==0){
                if(turn%2==0){
                 turn ++;
                 bt6.setText("x");
                 p_Xwon[0]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt6.setText("o");
            buttonused[6]=1;
            p_Owon[6]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        
    }      
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7]==0){
                if(turn%2==0){
                 turn ++;
                 bt7.setText("x");
                 p_Xwon[7]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt7.setText("o");
            buttonused[7]=1;
            p_Owon[7]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        
    }      
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[8]==0){
                if(turn%2==0){
                 turn ++;
                 bt8.setText("x");
                 p_Xwon[8]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
                 }
        
        else{
            turn++;
            bt8.setText("o");
            buttonused[0]=1;
            p_Owon[8]=1;
                 int result1 =p_Xwon();
                 int result2 =p_Owon();
                 if(result1==1){
                   
                     JOptionPane.showMessageDialog(rootPane, "Player X won");
               
                 }
                 else if( result2==1){
                       JOptionPane.showMessageDialog(rootPane, "Player O won");
                    }
            
        }}
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON ALREADY USED");
        
    }      
    }//GEN-LAST:event_bt8ActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btexit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
