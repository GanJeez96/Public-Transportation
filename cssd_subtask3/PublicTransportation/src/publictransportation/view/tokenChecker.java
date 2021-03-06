/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import publictransportation.models.Set_Of_Tokens;

/**
 *
 * @author Gangesh
 */
public class tokenChecker extends javax.swing.JFrame {

    /**
     * Creates new form tokenChecker
     */
    
    Set_Of_Tokens tk=new Set_Of_Tokens();
    
    public tokenChecker() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tokenno = new javax.swing.JTextField();
        punchticket = new javax.swing.JButton();
        gatestatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome to Stop A1");
        jLabel5.setFocusable(false);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Please Enter your Token Number");
        jLabel6.setFocusable(false);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tokenno.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        punchticket.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        punchticket.setText("Punch Ticket");
        punchticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punchticketActionPerformed(evt);
            }
        });

        gatestatus.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        gatestatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gatestatus.setText("Valid/Invalid Token");
        gatestatus.setFocusable(false);
        gatestatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(punchticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tokenno)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gatestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tokenno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(punchticket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(gatestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(363, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deserializeSetOfTokens(){
        //Deserializing Set of tokens
        try{
            System.out.println("Deserializing Set of tokens");
            FileInputStream fileInputTokens= new FileInputStream("Tokens.ser");
            ObjectInputStream objectInputTokens= new ObjectInputStream(fileInputTokens);
            tk=(Set_Of_Tokens) objectInputTokens.readObject();
            objectInputTokens.close();
            fileInputTokens.close();

            System.out.println("Deserialized Set of tokens");
        }
        catch(Exception e){
            System.out.println("Couldn't deserialize Set of tokens Error:"+e.getMessage());
        }
    }
    
    private void serializeSetOfTokens(){
        //Serialization
        System.out.println("Serializing Set of Tokens");
        try{
            FileOutputStream fileOutputToken=new FileOutputStream("Tokens.ser");
            ObjectOutputStream objectOutputToken=new ObjectOutputStream(fileOutputToken);
            objectOutputToken.writeObject(tk);
            objectOutputToken.flush();
            objectOutputToken.close();
            objectOutputToken.close();
            
            System.out.println("Serialized!");
        }
        catch(Exception e){
            System.out.println("Couldn't serialize.");
        }
    }
    
    
    private void punchticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punchticketActionPerformed
        this.deserializeSetOfTokens();
        //Set_Of_Tokens sot=new Set_Of_Tokens();
        boolean opengate;
        if(!tokenno.getText().isEmpty())
        {
            opengate=tk.validateToken(Integer.parseInt(tokenno.getText()));
            if(opengate==true)
            {
                gatestatus.setText("Open Gate");
                this.serializeSetOfTokens();
            }
            else
            {
                gatestatus.setText("Invalid Token");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please enter your token number");
        }
    }//GEN-LAST:event_punchticketActionPerformed

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
            java.util.logging.Logger.getLogger(tokenChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tokenChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tokenChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tokenChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tokenChecker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gatestatus;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton punchticket;
    private javax.swing.JTextField tokenno;
    // End of variables declaration//GEN-END:variables
}
