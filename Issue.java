/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_Management;

import DBHelper.DatabaseHelper;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Issue extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    
    public Issue() {
        initComponents();
        con = DatabaseHelper.getConnection();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        txtbid = new javax.swing.JTextField();
        txtpub = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        txtedition = new javax.swing.JTextField();
        btnbsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtbranch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcourse = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        txtsemister = new javax.swing.JTextField();
        btnssearch = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtdoi = new javax.swing.JTextField();
        btnissue = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Book");
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 102)), "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Author");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtprice.setEditable(false);
        txtprice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edition");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtstock.setEditable(false);
        txtstock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 200, 30));

        txtbid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 30));

        txtpub.setEditable(false);
        txtpub.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Stock");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        txtbname.setEditable(false);
        txtbname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 200, 30));

        txtedition.setEditable(false);
        txtedition.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 200, 30));

        btnbsearch.setBackground(new java.awt.Color(153, 153, 153));
        btnbsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnbsearch.setText("Search");
        btnbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 140, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Semister");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));
        jPanel2.add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 82, 192, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Student ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtsname.setEditable(false);
        jPanel2.add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 132, 192, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Year");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txtbranch.setEditable(false);
        jPanel2.add(txtbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 192, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtfname.setEditable(false);
        jPanel2.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 182, 192, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Surname");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Course");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Faculty");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtcourse.setEditable(false);
        jPanel2.add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 232, 192, 30));

        txtyear.setEditable(false);
        jPanel2.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 192, 30));

        txtsemister.setEditable(false);
        jPanel2.add(txtsemister, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 192, 31));

        btnssearch.setBackground(new java.awt.Color(153, 153, 153));
        btnssearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnssearch.setText("Search");
        btnssearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnssearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnssearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 30, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("DATE OF ISSUE");

        btnissue.setBackground(new java.awt.Color(204, 204, 204));
        btnissue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnissue.setText("Issue");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(204, 204, 204));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdoi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnissue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtdoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnback)
                            .addComponent(btnissue))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        Home ob = new Home();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbsearchActionPerformed
        String sql = "select * from book where book_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtbid.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("name");
                txtbname.setText(add1);

                String add2 = rs.getString("edition");
                txtedition.setText(add2);

                String add3 = rs.getString("publisher");
                txtpub.setText(add3);

                String add4 = rs.getString("price");
                txtprice.setText(add4);

                String add5 = rs.getString("stock");
                txtstock.setText(add5);
                rs.close();
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "Book is not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnbsearchActionPerformed

    private void btnssearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnssearchActionPerformed
        String sql = "select * from student where student_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtsid.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                String add6 = rs.getString("name");
                txtsname.setText(add6);

                String add7 = rs.getString("fathers_name");
                txtfname.setText(add7);

                String add8 = rs.getString("course");
                txtcourse.setText(add8);

                String add9 = rs.getString("branch");
                txtbranch.setText(add9);

                String add10 = rs.getString("year");
                txtyear.setText(add10);

                String add11 = rs.getString("semister");
                txtsemister.setText(add11);
                rs.close();
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "Student ID not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnssearchActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        String sql = "insert into issue(book_id, b_name, edition, publisher, price,"
                + "stock, stu_id, s_name, f_name, course, branch, year, semister, doi)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtbid.getText());
            ps.setString(2, txtbname.getText());
            ps.setString(3, txtedition.getText());
            ps.setString(4, txtpub.getText());
            ps.setString(5, txtprice.getText());
            ps.setString(6, txtstock.getText());
            ps.setString(7, txtsid.getText());
            ps.setString(8, txtsname.getText());
            ps.setString(9, txtfname.getText());
            ps.setString(10, txtcourse.getText());
            ps.setString(11, txtbranch.getText());
            ps.setString(12, txtyear.getText());
            ps.setString(13, txtsemister.getText());
            ps.setString(14, txtdoi.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Book issued");
            update();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnissueActionPerformed

    public void update(){
        int st = Integer.parseInt(txtstock.getText());
        int q = 1;
        int sup = st - q;
        String s = String.valueOf(sup);
        txtstock.setText(s);
        try {
            int n = Integer.parseInt(s);
            if (n>0){
            String val1= txtbid.getText();
            String val2 = txtstock.getText();
            String sql = "update book set book_id='"+val1+"', "
                    + "stock='"+val2+"' where book_id='"+val1+"'";
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated");
            }else{
                JOptionPane.showMessageDialog(null, "Book is not issued");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                ps.close();
            } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, e);
            }
        }
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
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbsearch;
    private javax.swing.JButton btnissue;
    private javax.swing.JButton btnssearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtdoi;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpub;
    private javax.swing.JTextField txtsemister;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsname;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables

}
