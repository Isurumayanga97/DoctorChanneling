/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UserController;
import dto.UserDTO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class User extends javax.swing.JFrame {
    
    private DefaultTableModel dtm;

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        dtm=(DefaultTableModel)tbluserdetails.getModel();
        getAllUsers();
        autoSettime();
        settDate();
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnshedule = new javax.swing.JButton();
        btnspecialtype = new javax.swing.JButton();
        btnusers = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        txtusertimepereod = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtuserbirthday = new javax.swing.JTextField();
        txtuseraddress = new javax.swing.JTextField();
        txtuseridnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtusersalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtuserworkingday = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbluserdetails = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnusersave = new javax.swing.JButton();
        btnuserupadate = new javax.swing.JButton();
        btnuserdelete = new javax.swing.JButton();
        btnuserrefresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(194, 216, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Home2_48px.png"))); // NOI18N
        jButton1.setText("HOME");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 110, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/User Account_60px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("MANAGE USER");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 390, 60));

        btnshedule.setBackground(new java.awt.Color(0, 0, 153));
        btnshedule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnshedule.setForeground(new java.awt.Color(255, 255, 255));
        btnshedule.setText("DOCTORS");
        btnshedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnshedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsheduleActionPerformed(evt);
            }
        });
        jPanel2.add(btnshedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 110, 50));

        btnspecialtype.setBackground(new java.awt.Color(0, 0, 153));
        btnspecialtype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnspecialtype.setForeground(new java.awt.Color(255, 255, 255));
        btnspecialtype.setText("SHEDULE");
        btnspecialtype.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnspecialtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspecialtypeActionPerformed(evt);
            }
        });
        jPanel2.add(btnspecialtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 110, 50));

        btnusers.setBackground(new java.awt.Color(0, 0, 153));
        btnusers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnusers.setForeground(new java.awt.Color(255, 255, 255));
        btnusers.setText("SPECIAL TYPE");
        btnusers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusersActionPerformed(evt);
            }
        });
        jPanel2.add(btnusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 110, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 80));

        jPanel4.setBackground(new java.awt.Color(232, 228, 228));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel5.setText("User ID");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel16.setText("User Name");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel17.setText("ID Number");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel18.setText("Salary");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 190, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel19.setText("User Address");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel20.setText("Birth Day");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtuserid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtuserid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseridActionPerformed(evt);
            }
        });
        jPanel4.add(txtuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 230, 30));

        txtusertimepereod.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtusertimepereod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtusertimepereod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusertimepereodActionPerformed(evt);
            }
        });
        jPanel4.add(txtusertimepereod, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 30));

        txtusername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel4.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 240, 30));

        txtuserbirthday.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtuserbirthday.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtuserbirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserbirthdayActionPerformed(evt);
            }
        });
        jPanel4.add(txtuserbirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 230, 30));

        txtuseraddress.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtuseraddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtuseraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseraddressActionPerformed(evt);
            }
        });
        jPanel4.add(txtuseraddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 240, 30));

        txtuseridnum.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtuseridnum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtuseridnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseridnumActionPerformed(evt);
            }
        });
        jPanel4.add(txtuseridnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel2.setText("Working Day");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 190, 40));

        txtusersalary.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtusersalary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtusersalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusersalaryActionPerformed(evt);
            }
        });
        jPanel4.add(txtusersalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/two.png"))); // NOI18N
        jLabel6.setText("Time Period");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 40));

        txtuserworkingday.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtuserworkingday.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtuserworkingday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserworkingdayActionPerformed(evt);
            }
        });
        jPanel4.add(txtuserworkingday, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 240, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1030, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbluserdetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbluserdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Working Day", "Time Period", "User Name", "ID Number", "User Address", "Birth Day", "Salary"
            }
        ));
        tbluserdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbluserdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbluserdetails);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1030, 270));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Details");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 270, 40));

        lbldate.setBackground(new java.awt.Color(0, 0, 0));
        lbldate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbldate.setForeground(new java.awt.Color(0, 51, 204));
        lbldate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Calendar_30px.png"))); // NOI18N
        lbldate.setText("Date");
        jPanel3.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 290, 40));

        lbltime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltime.setForeground(new java.awt.Color(0, 51, 204));
        lbltime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Time_30px.png"))); // NOI18N
        lbltime.setText("time");
        jPanel3.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 260, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 1030, 360));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnusersave.setBackground(new java.awt.Color(0, 102, 255));
        btnusersave.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnusersave.setText("SAVE USER");
        btnusersave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnusersave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusersaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnusersave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 50));

        btnuserupadate.setBackground(new java.awt.Color(255, 255, 204));
        btnuserupadate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnuserupadate.setText("UPDATE USER");
        btnuserupadate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnuserupadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserupadateActionPerformed(evt);
            }
        });
        jPanel5.add(btnuserupadate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 190, 50));

        btnuserdelete.setBackground(new java.awt.Color(255, 0, 51));
        btnuserdelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnuserdelete.setText("DELETE USER");
        btnuserdelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnuserdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserdeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnuserdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 190, 50));

        btnuserrefresh.setBackground(new java.awt.Color(0, 153, 51));
        btnuserrefresh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnuserrefresh.setText("REFRESH");
        btnuserrefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnuserrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserrefreshActionPerformed(evt);
            }
        });
        jPanel5.add(btnuserrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 190, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Ok_60px.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Update_60px.png"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Delete_60px.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Refresh_60px.png"))); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 310, 290));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/bright-cardiac-cardiology-433267.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 400, 310, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new ReceptionDash().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtuserworkingdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserworkingdayActionPerformed
            txtusertimepereod.requestFocus();
    }//GEN-LAST:event_txtuserworkingdayActionPerformed

    private void txtusertimepereodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusertimepereodActionPerformed
        txtusername.requestFocus();
    }//GEN-LAST:event_txtusertimepereodActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        txtuseridnum.requestFocus();
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtuseridnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseridnumActionPerformed
        txtuseraddress.requestFocus();
    }//GEN-LAST:event_txtuseridnumActionPerformed

    private void txtuseraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseraddressActionPerformed
        txtuserbirthday.requestFocus();
    }//GEN-LAST:event_txtuseraddressActionPerformed

    private void txtuserbirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserbirthdayActionPerformed
        txtusersalary.requestFocus();
    }//GEN-LAST:event_txtuserbirthdayActionPerformed

    private void txtusersalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusersalaryActionPerformed
        btnusersave.requestFocus();
        btnusersave.doClick();
    }//GEN-LAST:event_txtusersalaryActionPerformed

    private void btnusersaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusersaveActionPerformed
        try {
            String UserId=txtuserid.getText();
            String WorkDay=txtuserworkingday.getText();
            String TimePeri=txtusertimepereod.getText();
            String UserName=txtusername.getText();
            String UserIdNum=txtuseridnum.getText();
            String UserAdd=txtuseraddress.getText();
            String UserBirth=txtuserbirthday.getText();
            double UserSal=Double.parseDouble(txtusersalary.getText());
            UserDTO useModel = new UserDTO( UserId,WorkDay, TimePeri, UserName, UserIdNum, UserAdd, UserBirth, UserSal);
            boolean addUser=UserController.addUser(useModel);
            if(addUser){
                JOptionPane.showMessageDialog(this, "Aded");
                clearAll();
                getAllUsers();
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnusersaveActionPerformed

    private void btnuserupadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserupadateActionPerformed
        try {
            String UserId=txtuserid.getText();
            String WorkDay=txtuserworkingday.getText();
            String TimePeri=txtusertimepereod.getText();
            String UserName=txtusername.getText();
            String UserIdNum=txtuseridnum.getText();
            String UserAdd=txtuseraddress.getText();
            String UserBirth=txtuserbirthday.getText();
            double UserSal=Double.parseDouble(txtusersalary.getText());
            UserDTO useModel = new UserDTO( UserId,WorkDay, TimePeri, UserName, UserIdNum, UserAdd, UserBirth, UserSal);
            boolean updateUser=UserController.updateUser(useModel);
            if(updateUser){
                getAllUsers();
                clearAll();
                JOptionPane.showMessageDialog(this, "Updated");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnuserupadateActionPerformed

    private void btnuserrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserrefreshActionPerformed
        clearAll();
        getAllUsers();
    }//GEN-LAST:event_btnuserrefreshActionPerformed

    private void btnuserdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserdeleteActionPerformed
        try {
            String UserId =txtuserid.getText();
            boolean deleteUser = deleteUser(UserId);
            
            if(deleteUser){
                JOptionPane.showMessageDialog(this, "Deleted");
                clearAll();
                getAllUsers();
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnuserdeleteActionPerformed

    private void tbluserdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluserdetailsMouseClicked
       int selectedRow=tbluserdetails.getSelectedRow();
       String ui=dtm.getValueAt(selectedRow, 0).toString();
       String wd=dtm.getValueAt(selectedRow, 1).toString();
       String tp=dtm.getValueAt(selectedRow, 2).toString();
       String un=dtm.getValueAt(selectedRow, 3).toString();
       String in=dtm.getValueAt(selectedRow, 4).toString();
       String add=dtm.getValueAt(selectedRow, 5).toString();
       String birth=dtm.getValueAt(selectedRow, 6).toString();
       String sal=dtm.getValueAt(selectedRow, 7).toString();
       txtuserid.setText(ui);
       txtuserworkingday.setText(wd);
       txtusertimepereod.setText(tp);
       txtusername.setText(un);
       txtuseridnum.setText(in);
       txtuseraddress.setText(add);
       txtuserbirthday.setText(birth);
       txtusersalary.setText(sal);
    }//GEN-LAST:event_tbluserdetailsMouseClicked

    private void btnsheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsheduleActionPerformed

        new MangeDoctors().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsheduleActionPerformed

    private void btnspecialtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspecialtypeActionPerformed
        new Shedule().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnspecialtypeActionPerformed

    private void btnusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusersActionPerformed
        new SpecialType().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnusersActionPerformed

    private void txtuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseridActionPerformed
        String userID=txtuserid.getText();
        try {
            clearAll();
            UserDTO searchUser=UserController.searchSpecialtype(userID);
            txtuserid.setText(searchUser.getUserId());
            txtuserworkingday.setText(searchUser.getWorkDay());
            txtusertimepereod.setText(searchUser.getTimePeri());
            txtusername.setText(searchUser.getUserName());
            txtuseridnum.setText(searchUser.getUserIdNum());
            txtuseraddress.setText(searchUser.getUserAdd());
            txtuserbirthday.setText(searchUser.getUserBirth());
            txtusersalary.setText(searchUser.getUserSal()+"");
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_txtuseridActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnshedule;
    private javax.swing.JButton btnspecialtype;
    private javax.swing.JButton btnuserdelete;
    private javax.swing.JButton btnuserrefresh;
    private javax.swing.JButton btnusers;
    private javax.swing.JButton btnusersave;
    private javax.swing.JButton btnuserupadate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTable tbluserdetails;
    private javax.swing.JTextField txtuseraddress;
    private javax.swing.JTextField txtuserbirthday;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtuseridnum;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtusersalary;
    private javax.swing.JTextField txtusertimepereod;
    private javax.swing.JTextField txtuserworkingday;
    // End of variables declaration//GEN-END:variables

    private void clearAll() {
       txtuserid.setText("");
       txtuserworkingday.setText("");
       txtusertimepereod.setText("");
       txtusername.setText("");
       txtuseridnum.setText("");
       txtuseraddress.setText("");
       txtuserbirthday.setText("");
       txtusersalary.setText("");
       
    }

    private void getAllUsers() {
        try {
            dtm.setRowCount(0);
            ArrayList<UserDTO> allUsers=UserController.getAllUser();
            for(UserDTO us:allUsers){
                Object[] rowData={us.getUserId(),us.getWorkDay(),us.getTimePeri(),us.getUserName(),us.getUserIdNum(),us.getUserAdd(),us.getUserBirth(),us.getUserSal()};
                dtm.addRow(rowData);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean deleteUser(String UserId) throws ClassNotFoundException, SQLException {
       return UserController.deleteUser(UserId);
    }

   private void autoSettime() {
       new Thread (new Runnable() {
            @Override
            public void run() {
                while(true){   
                    Date curDate = new Date();
                    SimpleDateFormat dateFormat =new SimpleDateFormat("HH:mm:ss:aa");
                    String currentTime =dateFormat.format(curDate);
                    lbltime.setText(currentTime);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException ex){
                        
                    }
                    
                }
            }
        }).start();
    }

    private void settDate() {
       lbldate.setText(LocalDate.now().toString()); 
    }
    
}