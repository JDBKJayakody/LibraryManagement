/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_Management;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnrbook = new javax.swing.JButton();
        btnibook = new javax.swing.JButton();
        btnrbook1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnstatistics = new javax.swing.JButton();
        btnnewstudent = new javax.swing.JButton();
        btnnewbook = new javax.swing.JButton();
        btnstatistics1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miexit = new javax.swing.JMenuItem();
        milogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miabout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To The University Library!");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 204)), "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 102, 102))); // NOI18N

        btnrbook.setBackground(new java.awt.Color(153, 153, 153));
        btnrbook.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnrbook.setText("Returning Books");
        btnrbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrbookActionPerformed(evt);
            }
        });

        btnibook.setBackground(new java.awt.Color(153, 153, 153));
        btnibook.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnibook.setText("Issuing Books");
        btnibook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnibookActionPerformed(evt);
            }
        });

        btnrbook1.setBackground(new java.awt.Color(153, 153, 153));
        btnrbook1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnrbook1.setText("Penalty");
        btnrbook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpbookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnibook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnrbook, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(btnrbook1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnibook, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnrbook, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnrbook1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 280, 370));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102)), "Operation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 102, 204))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 350));

        btnstatistics.setBackground(new java.awt.Color(153, 153, 153));
        btnstatistics.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnstatistics.setText("Overview");
        btnstatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatisticsActionPerformed(evt);
            }
        });

        btnnewstudent.setBackground(new java.awt.Color(153, 153, 153));
        btnnewstudent.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnnewstudent.setText("Student Registration");
        btnnewstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewstudentActionPerformed(evt);
            }
        });

        btnnewbook.setBackground(new java.awt.Color(153, 153, 153));
        btnnewbook.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnnewbook.setText("Book Registration");
        btnnewbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewbookActionPerformed(evt);
            }
        });

        btnstatistics1.setBackground(new java.awt.Color(153, 153, 153));
        btnstatistics1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnstatistics1.setText("Book Management");
        btnstatistics1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatistics1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnewbook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnewstudent, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(btnstatistics1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnstatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnewbook, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnewstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnstatistics1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnstatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 370));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1000_F_303377923_yegp7fBAAmSnS97C0oKexs2EI94Q2XKr.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -60, 680, 570));

        jMenu1.setText("File");

        miexit.setText("Exit");
        miexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miexitActionPerformed(evt);
            }
        });
        jMenu1.add(miexit);

        milogout.setText("Logout");
        milogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milogoutActionPerformed(evt);
            }
        });
        jMenu1.add(milogout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        miabout.setText("About");
        jMenu2.add(miabout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(698, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void milogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milogoutActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_milogoutActionPerformed

    private void miexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miexitActionPerformed

    private void btnnewbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewbookActionPerformed
        NewBook ob = new NewBook();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnewbookActionPerformed

    private void btnstatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatisticsActionPerformed
        Overview ob = new Overview();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnstatisticsActionPerformed

    private void btnnewstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewstudentActionPerformed
        Student ob = new Student();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnewstudentActionPerformed

    private void btnrbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrbookActionPerformed
        Return ob = new Return();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrbookActionPerformed

    private void btnibookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnibookActionPerformed
        Issue ob = new Issue();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnibookActionPerformed

    private void btnpbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpbookActionPerformed
        PaneltyCalculatorGUI ob = new PaneltyCalculatorGUI();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpbookActionPerformed

    private void btnstatistics1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatistics1ActionPerformed
        BookManagemnt ob = new BookManagemnt();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnstatistics1ActionPerformed

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
    private javax.swing.JButton btnibook;
    private javax.swing.JButton btnnewbook;
    private javax.swing.JButton btnnewstudent;
    private javax.swing.JButton btnrbook;
    private javax.swing.JButton btnrbook1;
    private javax.swing.JButton btnstatistics;
    private javax.swing.JButton btnstatistics1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem miabout;
    private javax.swing.JMenuItem miexit;
    private javax.swing.JMenuItem milogout;
    // End of variables declaration//GEN-END:variables
}
