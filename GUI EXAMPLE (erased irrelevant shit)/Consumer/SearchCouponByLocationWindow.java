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
public class SearchCouponByLocationWindow extends javax.swing.JFrame {
    private IconsumerController consumerController;
    private javax.swing.JFrame back;
    private User consumer;
    private Vector<Coupon> couponsVec;
    private Vector<String> citiesVec;
    private Coupon coupon;
    public SearchCouponByLocationWindow(User user,IconsumerController userController,javax.swing.JFrame back) {
        this.back=back;
        back.setVisible(false);
        this.consumerController=userController;
        this.consumer=user;
        citiesVec=consumerController.getAllCities();
        initComponents();
        buyjButton.setVisible(false);
        
        //checkNotifications();
        this.setVisible(true);
    }
    /**
     * Creates new form searchCouponByLocation
     */
    private SearchCouponByLocationWindow() {
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
        ratingjLabel = new javax.swing.JLabel();
        discountPricejLabel = new javax.swing.JLabel();
        pricejLabel = new javax.swing.JLabel();
        categoryjLabel = new javax.swing.JLabel();
        descriptionjLabel = new javax.swing.JLabel();
        descriptionjLabel1 = new javax.swing.JLabel();
        categoryjLabel1 = new javax.swing.JLabel();
        pricejLabel1 = new javax.swing.JLabel();
        discountjLable1 = new javax.swing.JLabel();
        ratingjLabel1 = new javax.swing.JLabel();
        deadlinejLabel1 = new javax.swing.JLabel();
        couponjComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        cityjComboBox = new javax.swing.JComboBox();
        businessjLabel1 = new javax.swing.JLabel();
        businessjLabel = new javax.swing.JLabel();
        buyjButton = new javax.swing.JButton();
        logojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titlejLabel.setText("search coupon by loaction");

        deadlinejLabel.setVisible(false);
        deadlinejLabel.setText("Deadline:");

        ratingjLabel.setVisible(false);
        ratingjLabel.setText("Rating:");

        discountPricejLabel.setVisible(false);
        discountPricejLabel.setText("Discount Price:");

        pricejLabel.setVisible(false);
        pricejLabel.setText("Price:");

        categoryjLabel.setVisible(false);
        categoryjLabel.setText("Category:");

        descriptionjLabel.setVisible(false);
        descriptionjLabel.setText("Description:");

        descriptionjLabel1.setText("           ");

        categoryjLabel1.setText("           ");

        pricejLabel1.setText("           ");

        discountjLable1.setText("           ");

        ratingjLabel1.setText("            ");

        deadlinejLabel1.setText("           ");

        couponjComboBox.setVisible(false);
        //couponjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        couponjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponjComboBoxActionPerformed(evt);
            }
        });

        backjButton1.setText("back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        String [] cities=new String[citiesVec.size()];
        if(citiesVec!=null&&citiesVec.size()>0){
            for(int i=0;i<cities.length;i++){
                cities[i]=citiesVec.elementAt(i);
            }
        }
        cityjComboBox.setModel(new javax.swing.DefaultComboBoxModel(cities));
        cityjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityjComboBoxActionPerformed(evt);
            }
        });

        businessjLabel1.setText("           ");

        businessjLabel.setVisible(false);
        businessjLabel.setText("Business:");

        buyjButton.setBackground(new java.awt.Color(255, 255, 255));
        buyjButton.setText("buy that coupon");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cityjComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titlejLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descriptionjLabel)
                                    .addComponent(categoryjLabel)
                                    .addComponent(pricejLabel)
                                    .addComponent(discountPricejLabel)
                                    .addComponent(ratingjLabel)
                                    .addComponent(deadlinejLabel))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(businessjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deadlinejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ratingjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(discountjLable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pricejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(categoryjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(couponjComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backjButton1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(businessjLabel)
                            .addComponent(logojLabel))
                        .addGap(31, 31, 31)
                        .addComponent(buyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton1))
                .addGap(4, 4, 4)
                .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(businessjLabel)
                    .addComponent(businessjLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logojLabel))
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

    private void couponjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couponjComboBoxActionPerformed
        descriptionjLabel.setVisible(true);
        discountPricejLabel.setVisible(true);
        deadlinejLabel.setVisible(true);
        pricejLabel.setVisible(true);
        ratingjLabel.setVisible(true);
        categoryjLabel.setVisible(true);
        businessjLabel.setVisible(true);
        Coupon c=couponsVec.get(couponjComboBox.getSelectedIndex());
        descriptionjLabel1.setText(c.getDescription());
        discountjLable1.setText(c.getDiscountPrice());
        deadlinejLabel1.setText(c.getDeadLine());
        pricejLabel1.setText(c.getPrice());
        categoryjLabel1.setText(c.getCategory());
        ratingjLabel1.setText(c.getRating());
        businessjLabel1.setText(c.getBusinessName());
        coupon=c;
        
        buyjButton.setVisible(true);
        pack();
        this.setVisible(true);
    }//GEN-LAST:event_couponjComboBoxActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void cityjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityjComboBoxActionPerformed
        couponsVec=consumerController.getCouponsOfCity(citiesVec.elementAt( cityjComboBox.getSelectedIndex()));
        String [] coupons=new String[couponsVec.size()];
        if(couponsVec!=null&&couponsVec.size()>0){
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
        businessjLabel1.setText("");
    }//GEN-LAST:event_cityjComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCouponByLocationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCouponByLocationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCouponByLocationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCouponByLocationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCouponByLocationWindow().setVisible(true);
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
    private javax.swing.JComboBox cityjComboBox;
    private javax.swing.JComboBox couponjComboBox;
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
    private javax.swing.JLabel ratingjLabel;
    private javax.swing.JLabel ratingjLabel1;
    private javax.swing.JLabel titlejLabel;
    // End of variables declaration//GEN-END:variables
}
