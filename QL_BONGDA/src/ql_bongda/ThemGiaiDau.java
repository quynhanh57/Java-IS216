/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ql_bongda;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Nguyen Quynh Anh
 */
public class ThemGiaiDau extends javax.swing.JFrame {

    /**
     * Creates new form ThongTinBenhNhan
     */
    public ThemGiaiDau() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maGiaBox = new javax.swing.JTextField();
        tenGiaiBox = new javax.swing.JTextField();
        ngayKTBox = new javax.swing.JTextField();
        ThemButton = new javax.swing.JButton();
        ngayBDBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 248, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÊM GIẢI ĐẤU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã giải");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên giải");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày bắt đầu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        maGiaBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(maGiaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 173, -1));

        tenGiaiBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(tenGiaiBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 173, -1));

        ngayKTBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(ngayKTBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 170, 30));

        ThemButton.setBackground(new java.awt.Color(255, 255, 255));
        ThemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ThemButton.setText("Thêm");
        ThemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ThemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 90, -1));

        ngayBDBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(ngayBDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ngày kết thúc");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ql_bongda/3 (2).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        String magiai = maGiaBox.getText();
        String tengiai = tenGiaiBox.getText();
        String ngaybd = ngayBDBox.getText();
        String ngaykt = ngayKTBox.getText();
        
        if (magiai.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã giải đấu!");
        } else if (tengiai.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên giải đấu!");
        } else if (ngaybd.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập ngày bắt đầu!");
        } else if (ngaykt.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập ngày kết thúc!");
        } else if (magiai.length() > 5 ) {
            JOptionPane.showMessageDialog(this, "Mã giải đấu không vượt quá 5 ký tự!");
        } else if (tengiai.length() > 30) {
            JOptionPane.showMessageDialog(this, "Tên giải đấy không vượt quá 30 ký tự!");
        } else {
            String SQL = "INSERT INTO GIAIDAU (MAG, TENGIAI, NGAYBATDAU, NGAYKETTHUC) VALUES(?, ?, ?, ?)";
            try {
                Connection con = null;
                con = sqlServerConnection.getMysSQLConnection();
                SQLServerPreparedStatement ps = (SQLServerPreparedStatement) con.prepareStatement(SQL);

                ps.setString(1, magiai);
                ps.setString(2, tengiai);               
                ps.setString(3, ngaybd);
                ps.setString(4, ngaykt);
                int rs = ps.executeUpdate();
                if (rs == 0) {
                    JOptionPane.showMessageDialog(this, "Xảy ra lỗi");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm giải đấu thành công");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_ThemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ThemGiaiDau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemGiaiDau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemGiaiDau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemGiaiDau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemGiaiDau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ThemButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField maGiaBox;
    private javax.swing.JTextField ngayBDBox;
    private javax.swing.JTextField ngayKTBox;
    private javax.swing.JTextField tenGiaiBox;
    // End of variables declaration//GEN-END:variables
}
