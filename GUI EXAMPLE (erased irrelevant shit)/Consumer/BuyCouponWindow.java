/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.PL.Consumer;

import Server.BL.Coupon;
import Server.BL.IconsumerController;
import Server.BL.User;
import java.util.Vector;

/**
 *
 * @author Guy
 */
public class BuyCouponWindow extends javax.swing.JFrame {
    
    private IconsumerController consumerController;
    private javax.swing.JFrame back;
    private User consumer;
    private Coupon coupon;
    public BuyCouponWindow(User user,IconsumerController userController,javax.swing.JFrame back,Coupon coupon) {
        this.back=back;
        back.setVisible(false);
        this.consumerController=userController;
        this.consumer=user;
        this.coupon=coupon;
        initComponents();
        namejLabel1.setText(coupon.getName());
        categoryjLabel1.setText(coupon.getCategory());
        businessjLabel1.setText(coupon.getBusinessName());
        descriptionjLabel1.setText(coupon.getDescription());
        discountjLable1.setText(coupon.getDiscountPrice());
        ratingjLabel1.setText(coupon.getRating());
        pricejLabel1.setText(coupon.getPrice());
        deadlinejLabel1.setText(coupon.getDeadLine());
        //checkNotifications();
        this.setVisible(true);
    }
    /**
     * Creates new form buyCouponwindow
     */
    private BuyCouponWindow() {
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

        jPanel1 = new javax.swing.JPanel();
        titlejLabel = new javax.swing.JLabel();
        categoryjLabel1 = new javax.swing.JLabel();
        ratingjLabel1 = new javax.swing.JLabel();
        pricejLabel = new javax.swing.JLabel();
        descriptionjLabel1 = new javax.swing.JLabel();
        pricejLabel1 = new javax.swing.JLabel();
        deadlinejLabel1 = new javax.swing.JLabel();
        deadlinejLabel = new javax.swing.JLabel();
        descriptionjLabel = new javax.swing.JLabel();
        ratingjLabel = new javax.swing.JLabel();
        discountPricejLabel = new javax.swing.JLabel();
        discountjLable1 = new javax.swing.JLabel();
        categoryjLabel = new javax.swing.JLabel();
        businessjLabel = new javax.swing.JLabel();
        businessjLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        namejLabel = new javax.swing.JLabel();
        namejLabel1 = new javax.swing.JLabel();
        buyjButton = new javax.swing.JButton();
        logojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titlejLabel.setText("Buy Coupon");

        categoryjLabel1.setText("           ");

        ratingjLabel1.setText("            ");

        pricejLabel.setText("Price:");

        descriptionjLabel1.setText("           ");

        pricejLabel1.setText("           ");

        deadlinejLabel1.setText("           ");

        deadlinejLabel.setText("Deadline:");

        descriptionjLabel.setText("Description:");

        ratingjLabel.setText("Rating:");

        discountPricejLabel.setText("Discount Price:");

        discountjLable1.setText("           ");

        categoryjLabel.setText("Category:");

        businessjLabel.setText("Business:");

        businessjLabel1.setText("           ");

        backjButton1.setText("back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        namejLabel.setText("Name:");

        namejLabel1.setText("                  ");

        buyjButton.setText("buy!");
        buyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyjButtonActionPerformed(evt);
            }
        });

        logojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Client/PL/Images/logoSmall.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titlejLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descriptionjLabel)
                                    .addComponent(categoryjLabel)
                                    .addComponent(pricejLabel)
                                    .addComponent(discountPricejLabel)
                                    .addComponent(ratingjLabel)
                                    .addComponent(deadlinejLabel)
                                    .addComponent(businessjLabel)
                                    .addComponent(namejLabel))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(businessjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deadlinejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ratingjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(discountjLable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pricejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(categoryjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
                        .addGap(81, 81, 81)
                        .addComponent(buyjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backjButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namejLabel)
                            .addComponent(namejLabel1)))
                    .addComponent(buyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionjLabel)
                            .addComponent(descriptionjLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryjLabel)
                            .addComponent(categoryjLabel1))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pricejLabel)
                            .addComponent(pricejLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discountPricejLabel)
                            .addComponent(discountjLable1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ratingjLabel)
                            .addComponent(ratingjLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deadlinejLabel)
                            .addComponent(deadlinejLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(businessjLabel)
                            .addComponent(businessjLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(logojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backjButton1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void buyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyjButtonActionPerformed
        consumerController.buyCoupon(consumer,coupon);
    }//GEN-LAST:event_buyjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BuyCouponWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyCouponWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyCouponWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyCouponWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyCouponWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel businessjLabel;
    private javax.swing.JLabel businessjLabel1;
    private javax.swing.JButton buyjButton;
    private javax.swing.JLabel categoryjLabel;
    private javax.swing.JLabel categoryjLabel1;
    private javax.swing.JLabel deadlinejLabel;
    private javax.swing.JLabel deadlinejLabel1;
    private javax.swing.JLabel descriptionjLabel;
    private javax.swing.JLabel descriptionjLabel1;
    private javax.swing.JLabel discountPricejLabel;
    private javax.swing.JLabel discountjLable1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logojLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel namejLabel1;
    private javax.swing.JLabel pricejLabel;
    private javax.swing.JLabel pricejLabel1;
    private javax.swing.JLabel ratingjLabel;
    private javax.swing.JLabel ratingjLabel1;
    private javax.swing.JLabel titlejLabel;
    // End of variables declaration//GEN-END:variables
}