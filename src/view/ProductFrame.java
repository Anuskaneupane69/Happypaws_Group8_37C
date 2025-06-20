
package view;

import view.AdminDashboard;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.io.File;
import java.awt.Image;
import javax.swing.JLabel;


public class ProductFrame extends javax.swing.JFrame {
   

    public ProductFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Productname = new javax.swing.JTextField();
        Productprice = new javax.swing.JTextField();
        Productrating = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Savebtn = new javax.swing.JButton();
        img = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Productid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 226, 198));

        Productname.setText("Product Name");
        Productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductnameActionPerformed(evt);
            }
        });

        Productprice.setText("Product Price");
        Productprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductpriceActionPerformed(evt);
            }
        });

        Productrating.setText("Product Rating");
        Productrating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductratingActionPerformed(evt);
            }
        });

        jLabel1.setText("Product image");

        Savebtn.setBackground(new java.awt.Color(255, 153, 102));
        Savebtn.setText("Save Product");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        img.setText("Select file");
        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });

        jButton1.setText("Back");

        Productid.setText("Id");
        Productid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(img)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Productid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Productrating, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(Productprice)
                                        .addComponent(Productname)))))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(Productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Productprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Productrating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Savebtn)
                .addGap(25, 25, 25))
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

    private void ProductnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductnameActionPerformed

    private void ProductpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductpriceActionPerformed

    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
        // TODO add your handling code here:
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("Select Profile Picture");
//
//        // Only allow image files
//        fileChooser.setAcceptAllFileFilterUsed(false);
//        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
//            "Image files", "jpg", "png", "jpeg", "gif"));
//
//    int result = fileChooser.showOpenDialog(this);
//
//    if (result == JFileChooser.APPROVE_OPTION) {
//        File selectedFile = fileChooser.getSelectedFile();
//        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
//
//        // Resize the image
//        Image img = icon.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
//
//        if(AdminDashboard.instance!= null){
//            AdminDashboard.instance.addImageToPanel(img);
//        }
//
//        }

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Select Profile Picture");

    // Only allow image files
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
        "Image files", "jpg", "png", "jpeg", "gif"));

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

        // Resize the image
        Image resizedImage = icon.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(resizedImage));

//        // Add the new image to the panel
//        imagePanel.add(imageLabel);
//        imagePanel.revalidate();  // Refresh layout
//        imagePanel.repaint();     // Redraw panel
//    }
}
        
    }//GEN-LAST:event_imgActionPerformed

    private void ProductratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductratingActionPerformed

    private void ProductidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductidActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_SavebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Productid;
    private javax.swing.JTextField Productname;
    private javax.swing.JTextField Productprice;
    private javax.swing.JTextField Productrating;
    private javax.swing.JButton Savebtn;
    private javax.swing.JButton img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
public void SavebtnListener(ActionListener listener) {
        Savebtn.addActionListener(listener);
}

public javax.swing.JTextField ProductnameField() {
        return Productname;
    }
public javax.swing.JTextField ProductratingField() {
        return Productrating;
    }
public javax.swing.JTextField ProductpriceField() {
        return Productprice;
    }
public javax.swing.JTextField ProductidField() {
        return Productid;
    }

public javax.swing.JButton imgField() {
        return img;
    }
}