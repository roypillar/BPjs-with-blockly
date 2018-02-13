/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iot_proj.iot_proj.gui;
import com.iot_proj.iot_proj.SanityTest;
import java.io.File;
import javax.swing.JFileChooser;
/**
 *
 * @author omri basch
 */
public class MainFrame extends javax.swing.JFrame {

	private MainFrameFuncs funcs;
    private final JFileChooser fc;
    private String javaFolderAbsPath;
	private final String relPathJsFolder;
    private String currFileName; 
   

	public String getJavaFolderAbsPath() {
		return javaFolderAbsPath;
	}

	public void setJavaFolderAbsPath(String javaFolderAbsPath) {
		this.javaFolderAbsPath = javaFolderAbsPath;
	}

	public String getCurrFileName() {
		return currFileName;
	}

	public void setCurrFileName(String currFileName) {
		this.currFileName = currFileName;
	}

	public String getRelPathJsFolder() {
		return relPathJsFolder;
	}

	
	//the empty constructor
	public MainFrame() {
        initComponents();
        this.funcs = new MainFrameFuncs();
        this.javaFolderAbsPath = System.getProperty("user.dir") + "/src/main/java/";
        System.out.println(javaFolderAbsPath);
        this.relPathJsFolder = "our_resources/examples/";
        this.fc = new JFileChooser(javaFolderAbsPath + relPathJsFolder);
        this.currFileName = "";
       
    }
	
	
	

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        runButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chooseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(500, 250));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setName("MainFrame"); // NOI18N
        setResizable(false);

        runButton.setBackground(new java.awt.Color(255, 255, 255));
        runButton.setText("Run selected file");
        runButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Behavioral Programming with Blockly");

        chooseButton.setText("Choose .js file");
        chooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButton)
                    .addComponent(chooseButton))
                .addGap(155, 155, 155))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseButtonActionPerformed
    		//open the dialog box
            int returnVal = fc.showOpenDialog(MainFrame.this);
            
            //check that the file selection succeeded  
            if (returnVal == JFileChooser.APPROVE_OPTION) {
            	File file = fc.getSelectedFile();
                 
                System.out.println("Chosen file: " + file.getAbsolutePath());
                
                //update the chosen file's name
                setCurrFileName(file.getName());
                
            } else {
                System.out.println("Open command cancelled by user." );
            }
        }
    //GEN-LAST:event_chooseButtonActionPerformed

    //click event listener for the run button
    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    	if(!getCurrFileName().equals("")){
    	
    		try {
    			//run the chosen js file 
    			getFuncs().runBprog(relPathJsFolder + currFileName);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
			}
    	}
    	
    }

    public MainFrameFuncs getFuncs() {
		return funcs;
	}

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton runButton;
    private javax.swing.JButton chooseButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
