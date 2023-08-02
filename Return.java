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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Return extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
  
    public Return() {
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
        jLabel12 = new javax.swing.JLabel();
        txtcourse = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtsemister = new javax.swing.JTextField();
        txtbid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtedition = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtpub = new javax.swing.JTextField();
        txtbranch = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtdoi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        txtsid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtreturn = new javax.swing.JTextField();
        btnreturn = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Return Book");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)), "Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(204, 0, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Course");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtcourse.setEditable(false);
        jPanel1.add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 192, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Student ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtstock.setEditable(false);
        txtstock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Author");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        txtsemister.setEditable(false);
        jPanel1.add(txtsemister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 192, 30));

        txtbid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 170, 30));

        txtbname.setEditable(false);
        txtbname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 170, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Semister");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edition");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        txtedition.setEditable(false);
        txtedition.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 170, 30));

        btnsearch.setBackground(new java.awt.Color(204, 204, 204));
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Stock");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        txtpub.setEditable(false);
        txtpub.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 170, 30));

        txtbranch.setEditable(false);
        jPanel1.add(txtbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 192, 30));

        txtfname.setEditable(false);
        jPanel1.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 192, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        txtsname.setEditable(false);
        jPanel1.add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 192, 30));

        txtprice.setEditable(false);
        txtprice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 170, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Date of Issue");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        txtdoi.setEditable(false);
        jPanel1.add(txtdoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 170, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Faculty");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtyear.setEditable(false);
        jPanel1.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 192, 30));
        jPanel1.add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 192, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Year");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Father's Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 810, 395));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Return Date");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));
        getContentPane().add(txtreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 170, -1));

        btnreturn.setBackground(new java.awt.Color(204, 204, 204));
        btnreturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreturn.setText("Return");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 110, 30));

        btnback.setBackground(new java.awt.Color(204, 204, 204));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 119, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        Home ob = new Home();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String sql = "select * from issue where stu_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtsid.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                String add6 = rs.getString("s_name");
                txtsname.setText(add6);

                String add7 = rs.getString("f_name");
                txtfname.setText(add7);

                String add8 = rs.getString("course");
                txtcourse.setText(add8);

                String add9 = rs.getString("branch");
                txtbranch.setText(add9);

                String add10 = rs.getString("year");
                txtyear.setText(add10);

                String add11 = rs.getString("semister");
                txtsemister.setText(add11);
                
                String add13 = rs.getString("book_id");
                txtbid.setText(add13);
                
                String add1 = rs.getString("b_name");
                txtbname.setText(add1);

                String add2 = rs.getString("edition");
                txtedition.setText(add2);

                String add3 = rs.getString("publisher");
                txtpub.setText(add3);

                String add4 = rs.getString("price");
                txtprice.setText(add4);

                String add5 = rs.getString("stock");
                txtstock.setText(add5);
                
                String add12 = rs.getString("doi");
                txtdoi.setText(add12);
                
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
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        delete();
        returnUpdate();
    }//GEN-LAST:event_btnreturnActionPerformed

    public void delete(){
        String sql = "delete from issue where stu_id=?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, txtsid.getText());
                ps.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
}
    public void returnUpdate(){
        String sql = "insert into returntbl(book_id, b_name, edition, publisher, price,"
                + "stock, stu_id, s_name, f_name, course, branch, year, semister, doi, doreturn)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setString(15, txtreturn.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Book Returned");
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
    }
    
    public void update(){
        int st = Integer.parseInt(txtstock.getText());
        int q = 1;
        int sup = st + q;
        String s = String.valueOf(sup);
        txtstock.setText(s);
        try {
            String val1= txtbid.getText();
            String val2 = txtstock.getText();
            String sql = "update book set book_id='"+val1+"', "
                    + "stock='"+val2+"' where book_id='"+val1+"'";
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated");
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
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtdoi;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpub;
    private javax.swing.JTextField txtreturn;
    private javax.swing.JTextField txtsemister;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsname;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
