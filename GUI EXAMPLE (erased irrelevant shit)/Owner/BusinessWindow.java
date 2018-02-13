/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.PL.Owner;

import Server.BL.Business;
import Server.BL.IownerController;
import Server.BL.Owner;

/**
 *
 * @author Guy
 */
public class BusinessWindow extends javax.swing.JFrame {

    /**
     * Creates new form BusinessWindow
     */
    Owner owner;
    Business business;
    IownerController ownerController;
    private javax.swing.JFrame back;
    public BusinessWindow(Owner owner,Business business,IownerController ownerController,javax.swing.JFrame back) {
       this.back=back;
       back.setVisible(false);
        this.owner= owner;
        this.business= business;
        this.ownerController= ownerController;
        initComponents();
        this.setVisible(true);
    }

    private BusinessWindow() {
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
        searchCouponjButton = new javax.swing.JButton();
        implementCouponjButton = new javax.swing.JButton();
        showCouponAndRatingjButton = new javax.swing.JButton();
        showActiveCouponjButton = new javax.swing.JButton();
        addCouponjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        logojLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        searchCouponjButton.setText("search coupon");
        searchCouponjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCouponjButtonActionPerformed(evt);
            }
        });

        implementCouponjButton.setText("implement coupon");
        implementCouponjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                implementCouponjButtonActionPerformed(evt);
            }
        });

        showCouponAndRatingjButton.setText("show coupon and rating");
        showCouponAndRatingjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCouponAndRatingjButtonActionPerformed(evt);
            }
        });

        showActiveCouponjButton.setText("show active coupon");
        showActiveCouponjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActiveCouponjButtonActionPerformed(evt);
            }
        });

        addCouponjButton.setText("add coupon");
        addCouponjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCouponjButtonActionPerformed(evt);
            }
        });

        backjButton.setText("back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        logojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Client/PL/Images/logoSmall.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(showActiveCouponjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showCouponAndRatingjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(implementCouponjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchCouponjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCouponjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logojLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backjButton)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showActiveCouponjButton)
                .addGap(18, 18, 18)
                .addComponent(showCouponAndRatingjButton)
                .addGap(18, 18, 18)
                .addComponent(implementCouponjButton)
                .addGap(18, 18, 18)
                .addComponent(searchCouponjButton)
                .addGap(18, 18, 18)
                .addComponent(addCouponjButton)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backjButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logojLabel1)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActiveCouponjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActiveCouponjButtonActionPerformed
        new showActiveCouponWindow(owner, business, ownerController,this);
    }//GEN-LAST:event_showActiveCouponjButtonActionPerformed

    private void implementCouponjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_implementCouponjButtonActionPerformed
       new aproveCouponWindow(owner, business, ownerController,this);
    }//GEN-LAST:event_implementCouponjButtonActionPerformed

    private void showCouponAndRatingjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCouponAndRatingjButtonActionPerformed
        new showCouponRatingWindow(owner, business, ownerController,this);
    }//GEN-LAST:event_showCouponAndRatingjButtonActionPerformed

    private void searchCouponjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCouponjButtonActionPerformed
        new searchCouponWindow(owner, business, ownerController,this);
    }//GEN-LAST:event_searchCouponjButtonActionPerformed

    private void addCouponjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCouponjButtonActionPerformed
        new addCouponWindow(owner, business, ownerController,this);
    }//GEN-LAST:event_addCouponjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusinessWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusinessWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCouponjButton;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton implementCouponjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logojLabel1;
    private javax.swing.JButton searchCouponjButton;
    private javax.swing.JButton showActiveCouponjButton;
    private javax.swing.JButton showCouponAndRatingjButton;
    // End of variables declaration//GEN-END:variables
}