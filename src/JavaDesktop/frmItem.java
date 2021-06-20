package JavaDesktop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmItem extends javax.swing.JFrame {

    private DefaultTableModel DtmItem;
    private String SQL;

    public frmItem() {
        initComponents();

        try {
            this.TampilData();
            System.out.println("Application viewed");

            btnSave.setEnabled(false);

        } catch (NullPointerException e) {
            System.out.println("");
            System.out.println("Database not yet activated!!");
        } finally {
            System.out.println("Application run");
        }
        this.setLocationRelativeTo(null); //to make form run to center screen
    }

    public void TampilData() {
        DtmItem = new DefaultTableModel();
        DtmItem.addColumn("ITEM CODE");
        DtmItem.addColumn("ITEM NAME");
        DtmItem.addColumn("PRICE");
        DtmItem.addColumn("MEASURE");
        DtmItem.addColumn("STOCK");
        tblBarang.setModel(DtmItem);

        Connection conn = DbConnection.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from item";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DtmItem.addRow(new Object[]{
                    res.getString("itemcode"),
                    res.getString("itemname"),
                    res.getString("price"),
                    res.getString("measure"),
                    res.getString("stock")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtMeasure = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 730));
        setPreferredSize(new java.awt.Dimension(1030, 790));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Item Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Item Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Measure");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtItemCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, -1));

        txtItemName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 280, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 130, -1));

        txtMeasure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtMeasure, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 110, -1));

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, -1));

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 40));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, 40));

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 110, 40));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 110, 40));

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 690, 100, 40));

        tblBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBarang.setAutoscrolls(false);
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1000, 340));

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCari.setText("Find");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, -1, 40));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("X");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 50, 40));

        txtFind.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 220, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Type To Search");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtItemCode.setText("");
        txtItemCode.requestFocus();
        btnSave.setEnabled(true);

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Connection conn = DbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into item(itemcode, itemname, price, measure, stock) values(?,?,?,?,?)");
            stmt.setString(1, txtItemCode.getText());
            stmt.setString(2, txtItemName.getText());
            stmt.setString(3, txtPrice.getText());
            stmt.setString(4, txtMeasure.getText());
            stmt.setString(5, txtStock.getText());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Record saved successfully", "Pesan", JOptionPane.INFORMATION_MESSAGE);

            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            Connection conn = DbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update item set itemname=?, price=?, measure=?, stock=? where itemcode=?");
            stmt.setString(1, txtItemName.getText());
            stmt.setString(2, txtPrice.getText());
            stmt.setString(3, txtMeasure.getText());
            stmt.setString(4, txtStock.getText());
            stmt.setString(5, txtItemCode.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Changed Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        int baris = tblBarang.getSelectedRow();
        txtItemCode.setText(DtmItem.getValueAt(baris, 0).toString());
        txtItemName.setText(DtmItem.getValueAt(baris, 1).toString());
        txtPrice.setText(DtmItem.getValueAt(baris, 2).toString());
        txtMeasure.setText(DtmItem.getValueAt(baris, 3).toString());
        txtStock.setText(DtmItem.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tblBarangMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection conn = DbConnection.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from item where itemcode ='" + txtItemCode.getText() + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record deleted successfully..", "Message", JOptionPane.INFORMATION_MESSAGE);
                TampilData();
                txtItemCode.setText("");
                txtItemName.setText("");
                txtPrice.setText("");
                txtMeasure.setText("");
                txtStock.setText("");
                txtItemCode.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Record failed to delete" + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        this.TampilDataCari();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtFind.setText("");
        this.TampilData();
    }//GEN-LAST:event_btnClearActionPerformed

    public void TampilDataCari() {
        DtmItem = new DefaultTableModel();
        DtmItem.addColumn("ITEM CODE");
        DtmItem.addColumn("ITEM NAME");
        DtmItem.addColumn("PRICE");
        DtmItem.addColumn("MEASURE");
        DtmItem.addColumn("STOCK");
        tblBarang.setModel(DtmItem);

        Connection conn = DbConnection.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            //SELECT * FROM `item` WHERE itemname like '%kaca%' 

            SQL = "select * from item where itemname like '%" + txtFind.getText() + "%'";

            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DtmItem.addRow(new Object[]{
                    res.getString("itemcode"),
                    res.getString("itemname"),
                    res.getString("price"),
                    res.getString("measure"),
                    res.getString("stock")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
            java.util.logging.Logger.getLogger(frmItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new frmItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtMeasure;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
