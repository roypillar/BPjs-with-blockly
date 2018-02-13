/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.PL.Consumer;

import Server.BL.Business;
import Server.BL.Coupon;
import Server.BL.IconsumerController;
import Server.BL.User;
import java.util.Vector;

/**
 *
 * @author Guy
 */
public class SearchCouponByBusinessWindow extends javax.swing.JFrame {
    private IconsumerController consumerController;
    private javax.swing.JFrame back;
    private User consumer;
    private Vector<Business> businessesVec;
    private Vector<Coupon> couponsVec;
    private Coupon coupon;
    public SearchCouponByBusinessWindow(User user,IconsumerController userController,javax.swing.JFrame back) {
        this.back=back;
        back.setVisible(false);
        coupon=null;
        this.consumerController=userController;
        this.consumer=user;
        businessesVec=consumerController.getAllbusiness();
        initComponents();
        buyjButton.setVisible(false);
        //checkNotifications();
        this.setVisible(true);
    }
    /**
     * Creates new form searchCoupon
     */
    private SearchCouponByBusinessWindow() {
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
        businessjComboBox = new javax.swing.JComboBox();
        couponjComboBox = new javax.swing.JComboBox();
        descriptionjLabel = new javax.swing.JLabel();
        categoryjLabel = new javax.swing.JLabel();
        pricejLabel = new javax.swing.JLabel();
        discountPricejLabel = new javax.swing.JLabel();
        ratingjLabel = new javax.swing.JLabel();
        deadlinejLabel = new javax.swing.JLabel();
        descriptionjLabel1 = new javax.swing.JLabel();
        categoryjLabel1 = new javax.swing.JLabel();
        pricejLabel1 = new javax.swing.JLabel();
        discountjLable1 = new javax.swing.JLabel();
        deadlinejLabel1 = new javax.swing.JLabel();
        ratingjLabel1 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        buyjButton = new javax.swing.JButton();
        logojLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titlejLabel.setText("search coupon by business");

        String [] business=new String[businessesVec.size()];
        if(businessesVec!=null&&businessesVec.size()>0){
            for(int i=0;i<business.length;i++){
                business[i]=businessesVec.elementAt(i).getName();
            }
        }
        businessjComboBox.setModel(new javax.swing.DefaultComboBoxModel(business));
        businessjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessjComboBoxActionPerformed(evt);
            }
        });

        couponjComboBox.setVisible(false);
        couponjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        couponjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponjComboBoxActionPerformed(evt);
            }
        });

        descriptionjLabel.setVisible(false);
        descriptionjLabel.setText("Description:");

        categoryjLabel.setVisible(false);
        categoryjLabel.setText("Category:");

        pricejLabel.setVisible(false);
        pricejLabel.setText("Price:");

        discountPricejLabel.setVisible(false);
        discountPricejLabel.setText("Discount Price:");

        ratingjLabel.setVisible(false);
        ratingjLabel.setText("Rating:");

        deadlinejLabel.setVisible(false);
        deadlinejLabel.setText("Deadline:");

        descriptionjLabel1.setText("           ");

        categoryjLabel1.setText("           ");

        pricejLabel1.setText("           ");

        discountjLable1.setText("           ");

        deadlinejLabel1.setText("           ");

        ratingjLabel1.setText("            ");

        backjButton.setText("back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        buyjButton.setText("buy that coupon");
        buyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyjButtonActionPerformed(evt);
            }
        });

        logojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Client/PL/Images/logoSmall.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titlejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(businessjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(couponjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(backjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionjLabel)
                            .addComponent(categoryjLabel)
                            .addComponent(pricejLabel)
                            .addComponent(discountPricejLabel)
                            .addComponent(ratingjLabel)
                            .addComponent(deadlinejLabel))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deadlinejLabel1)
                            .addComponent(descriptionjLabel1)
                            .addComponent(categoryjLabel1)
                            .addComponent(pricejLabel1)
                            .addComponent(discountjLable1)
                            .addComponent(ratingjLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logojLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(buyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(businessjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(couponjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(ratingjLabel)
                    .addComponent(ratingjLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deadlinejLabel)
                    .addComponent(deadlinejLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logojLabel1)
                    .addComponent(buyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void businessjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessjComboBoxActionPerformed
        couponsVec=consumerController.getCouponsOfBusiness(businessesVec.elementAt( businessjComboBox.getSelectedIndex()));
        String [] coupons=new String[couponsVec.size()];
        if(businessesVec!=null&&couponsVec.size()>0){
            for(int i=0;i<coupons.length;i++){
                coupons[i]=couponsVec.elementAt(i).getName();
            }
        }           
        couponjComboBox.setModel(new javax.swing.DefaultComboBoxModel(coupons));
        couponjComboBox.setVisible(true);
        descriptionjLabel1.setText("");
        discountjLable1.setText("");
        deadlinejLabel1.setText("");
        pricejLabel1.setText("");
        categoryjLabel1.setText("");
        ratingjLabel1.setText("");
        
    }//GEN-LAST:event_businessjComboBoxActionPerformed

    private void couponjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couponjComboBoxActionPerformed
        descriptionjLabel.setVisible(true);
        discountPricejLabel.setVisible(true);
        deadlinejLabel.setVisible(true);
        pricejLabel.setVisible(true);
        ratingjLabel.setVisible(true);
        categoryjLabel.setVisible(true);
        Coupon c=couponsVec.get(couponjComboBox.getSelectedIndex());
        descriptionjLabel1.setText(c.getDescription());
        discountjLable1.setText(c.getDiscountPrice());
        deadlinejLabel1.setText(c.getDeadLine());
        pricejLabel1.setText(c.getPrice());
        categoryjLabel1.setText(c.getCategory());
        ratingjLabel1.setText(c.getRating());
        coupon=c;
        buyjButton.setVisible(true);
        pack();
        this.setVisible(true);
    }//GEN-LAST:event_couponjComboBoxActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backjButtonActionPerformed

    private void buyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyjButtonActionPerformed
        if(coupon!=null)
        new BuyCouponWindow(consumer, consumerController, this, coupon);
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
            java.util.logging.Logger.getLogger(SearchCouponByBusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCouponByBusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCouponByBusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCouponByBusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCouponByBusinessWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JComboBox businessjComboBox;
    private javax.swing.JButton buyjButton;
    private javax.swing.JLabel categoryjLabel;
    private javax.swing.JLabel categoryjLabel1;
    private javax.swing.JComboBox couponjComboBox;
    private javax.swing.JLabel deadlinejLabel;
    private javax.swing.JLabel deadlinejLabel1;
    private javax.swing.JLabel descriptionjLabel;
    private javax.swing.JLabel descriptionjLabel1;
    private javax.swing.JLabel discountPricejLabel;
    private javax.swing.JLabel discountjLable1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logojLabel1;
    private javax.swing.JLabel pricejLabel;
    private javax.swing.JLabel pricejLabel1;
    private javax.swing.JLabel ratingjLabel;
    private javax.swing.JLabel ratingjLabel1;
    private javax.swing.JLabel titlejLabel;
    // End of variables declaration//GEN-END:variables
}
