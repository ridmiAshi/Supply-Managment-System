
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachini Nayanathara
 */
public class Home extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        con=DBconnect.getconnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userBtn = new javax.swing.JButton();
        supplier = new javax.swing.JButton();
        order = new javax.swing.JButton();
        product = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userBtn.setBackground(new java.awt.Color(0, 0, 0));
        userBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userBtn.setForeground(new java.awt.Color(255, 255, 255));
        userBtn.setText("User");
        userBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBtnActionPerformed(evt);
            }
        });
        getContentPane().add(userBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 230, 70));

        supplier.setBackground(new java.awt.Color(0, 0, 0));
        supplier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supplier.setForeground(new java.awt.Color(255, 255, 255));
        supplier.setText("Supplier");
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        getContentPane().add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 240, 70));

        order.setBackground(new java.awt.Color(0, 0, 0));
        order.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        order.setForeground(new java.awt.Color(255, 255, 255));
        order.setText("Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        getContentPane().add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 230, 70));

        product.setBackground(new java.awt.Color(0, 0, 0));
        product.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        product.setForeground(new java.awt.Color(255, 255, 255));
        product.setText("Product");
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        getContentPane().add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/product1.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/order1.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 200));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 190, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel4.setText("jLabel1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
        // TODO add your handling code here:
        Users users = new Users();
        users.setVisible(true);
    }//GEN-LAST:event_userBtnActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code here:
        supplier supplier = new supplier();
        supplier.setVisible(true);
    }//GEN-LAST:event_supplierActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        // TODO add your handling code here:
        product product = new product();
        product.setVisible(true);
    }//GEN-LAST:event_productActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        Orders orders = new Orders();
        orders.setVisible(true);
    }//GEN-LAST:event_orderActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton order;
    private javax.swing.JButton product;
    private javax.swing.JButton supplier;
    private javax.swing.JButton userBtn;
    // End of variables declaration//GEN-END:variables
}