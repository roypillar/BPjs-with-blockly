/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.PL.Consumer;

import Server.BL.ActiveCoupon;
import Server.BL.Coupon;
import Server.BL.IconsumerController;
import Server.BL.User;
import java.util.Vector;

/**
 *
 * @author Guy
 */
public class DisplayOrdersWindow extends javax.swing.JFrame {
    private IconsumerController consumerController;
    private javax.swing.JFrame back;
    private User user;
     Vector<ActiveCoupon> activeCouponVec;
    public DisplayOrdersWindow(User user,IconsumerController userController,javax.swing.JFrame back) {
        this.back=back;
        back.setVisible(false);
        this.consumerController=userController;
        this.user=user;
        activeCouponVec=consumerController.getUnusedCoupons(user.getUserName());
        initComponents();
        //checkNotifications();
        this.setVisible(true);
    }
    /**
     * Creates new form displayOrders
     */
    private DisplayOrdersWindow() {
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
        deadlinejLabel = new javax.swing.JLabel();
        discountPricejLabel = new javax.swing.JLabel();
        pricejLabel = new javax.swing.JLabel();
        categoryjLabel = new javax.swing.JLabel();
        descriptionjLabel = new javax.swing.JLabel();
        serialNumberjLabel = new javax.swing.JLabel();
        serialNumberjLabel1 = new javax.swing.JLabel();
        descriptionjLabel1 = new javax.swing.JLabel();
        categoryjLabel1 = new javax.swing.JLabel();
        pricejLabel1 = new javax.swing.JLabel();
        discountjLable1 = new javax.swing.JLabel();
        deadlinejLabel1 = new javax.swing.JLabel();
        couponsjComboBox = new javax.swing.JComboBox();
        backjButton = new javax.swing.JButton();
        logojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titlejLabel.setText("Orders");

        deadlinejLabel.setVisible(false);
        deadlinejLabel.setText("Deadline:");

        discountPricejLabel.setVisible(false);
        discountPricejLabel.setText("Discount Price:");

        pricejLabel.setVisible(false);
        pricejLabel.setText("Price:");

        categoryjLabel.setVisible(false);
        categoryjLabel.setText("Category:");

        descriptionjLabel.setVisible(false);
        descriptionjLabel.setText("Description:");

        serialNumberjLabel.setText("Serial Number:");

        serialNumberjLabel1.setText("         ");

        descriptionjLabel1.setText("           ");

        categoryjLabel1.setText("           ");

        pricejLabel1.setText("           ");

        discountjLable1.setText("           ");

        deadlinejLabel1.setText("           ");

        String [] coupons=new String[activeCouponVec.size()];
        if(activeCouponVec!=null&&activeCouponVec.size()>0){
            for(int i=0;i<coupons.length;i++){
                coupons[i]=activeCouponVec.elementAt(i).getCoupon().getName()+","+activeCouponVec.elementAt(i).getSerialNumber();
            }
        }
        couponsjComboBox.setModel(new javax.swing.DefaultComboBoxModel(coupons));
        couponsjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponsjComboBoxActionPerformed(evt);
            }
        });

        backjButton.setText("back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
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
                        .addComponent(logojLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(serialNumberjLabel)
                                .addGap(18, 18, 18)
                                .addComponent(serialNumberjLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descriptionjLabel)
                                    .addComponent(categoryjLabel)
                                    .addComponent(pricejLabel)
                                    .addComponent(discountPricejLabel)
                                    .addComponent(deadlinejLabel))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deadlinejLabel1)
                                    .addComponent(descriptionjLabel1)
                                    .addComponent(categoryjLabel1)
                                    .addComponent(pricejLabel1)
                                    .addComponent(discountjLable1)))
                            .addComponent(couponsjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(couponsjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumberjLabel)
                            .addComponent(serialNumberjLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionjLabel)
                            .addComponent(descriptionjLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryjLabel)
                            .addComponent(categoryjLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pricejLabel)
                            .addComponent(pricejLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discountPricejLabel)
                            .addComponent(discountjLable1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deadlinejLabel)
                            .addComponent(deadlinejLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logojLabel)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void couponsjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couponsjComboBoxActionPerformed
        Coupon c=activeCouponVec.get(couponsjComboBox.getSelectedIndex()).getCoupon();
        descriptionjLabel1.setText(c.getDescription());
        discountjLable1.setText(c.getDiscountPrice());
        deadlinejLabel1.setText(c.getDeadLine());
        pricejLabel1.setText(c.getPrice());
        categoryjLabel1.setText(c.getCategory());
        int index=couponsjComboBox.getSelectedIndex();
        ActiveCoupon ac=activeCouponVec.get(index); 
        String txt=ac.getSerialNumber();
        serialNumberjLabel1.setText(txt);
    }//GEN-LAST:event_couponsjComboBoxActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayOrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayOrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayOrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayOrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayOrdersWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel categoryjLabel;
    private javax.swing.JLabel categoryjLabel1;
    private javax.swing.JComboBox couponsjComboBox;
    private javax.swing.JLabel deadlinejLabel;
    private javax.swing.JLabel deadlinejLabel1;
    private javax.swing.JLabel descriptionjLabel;
    private javax.swing.JLabel descriptionjLabel1;
    private javax.swing.JLabel discountPricejLabel;
    private javax.swing.JLabel discountjLable1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logojLabel;
    private javax.swing.JLabel pricejLabel;
    private javax.swing.JLabel pricejLabel1;
    private javax.swing.JLabel serialNumberjLabel;
    private javax.swing.JLabel serialNumberjLabel1;
    private javax.swing.JLabel titlejLabel;
    // End of variables declaration//GEN-END:variables
}
