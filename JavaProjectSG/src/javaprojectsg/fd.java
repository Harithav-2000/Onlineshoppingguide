/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprojectsg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavya
 */
public class fd extends javax.swing.JFrame {

    /**
     * Creates new form fd
     */
    public fd() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        submit = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setText("FEEDBACK");

        rt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtActionPerformed(evt);
            }
        });

        jLabel3.setText("USERNAME");

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });

        jLabel4.setText("PRODUCT NAME");

        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submit)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(70, 70, 70)
                .addComponent(submit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void rtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtActionPerformed
        Connection con;
        
        try {
            String dburl= "jdbc:mysql://localhost:3306/shoppingguide?zeroDateTimeBehavior=convertToNull";
	    String user="root";
	    String pass="root";
	    con=DriverManager.getConnection(dburl,user,pass);
            String query="insert into feedbacks(fdbk) values(?)";
            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, rt.getText());
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"successfully inserted");
            
            
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"not connected");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rtActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
       Connection con;
        
        try {
            String dburl= "jdbc:mysql://localhost:3306/shoppingguide?zeroDateTimeBehavior=convertToNull";
	    String user="root";
	    String pass="abcd.1234";
	    con=DriverManager.getConnection(dburl,user,pass);
            String query="insert into feedbacks(uname) values(?)";
            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, un.getText());
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"successfully inserted");
            
            
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"not connected");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        Connection con;
        
        try {
            String dburl= "jdbc:mysql://localhost:3306/shoppingguide?zeroDateTimeBehavior=convertToNull";
	    String user="root";
	    String pass="abcd.1234";
	    con=DriverManager.getConnection(dburl,user,pass);
            String query="insert into feedbacks(pname) values(?)";
            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, pn.getText());
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"successfully inserted");
            
            
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"not connected");
        }       
    }//GEN-LAST:event_pnActionPerformed
*/
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         Connection con;
        
        try {
            String dburl= "jdbc:mysql://localhost:3306/shoppingguide?zeroDateTimeBehavior=convertToNull";
	    String user="root";
	    String pass="abcd.1234";
	    con=DriverManager.getConnection(dburl,user,pass);
            String query="insert into feedbacks(uname,pname,fdbk) values(?,?,?)";
            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, un.getText());
            pst.setString(2, pn.getText());
            pst.setString(3, rt.getText());
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"successfully inserted");
            
            
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"not connected");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(fd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField rt;
    private javax.swing.JButton submit;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
