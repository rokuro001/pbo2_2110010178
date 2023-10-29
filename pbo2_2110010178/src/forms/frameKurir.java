/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import database.koneksi ;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rudia
 */
public class frameKurir extends javax.swing.JFrame {
            koneksi koneksi;
            
            public DefaultTableModel modelTabelKurir;

    /**
     * Creates new form frameKurir
     */
    public frameKurir() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        koneksi = new koneksi();
        modelTabelKurir = new DefaultTableModel();
        tableKurir.setModel(modelTabelKurir);
        modelTabelKurir.addColumn("Id Kurir");
        modelTabelKurir.addColumn("Nama Admin");
        modelTabelKurir.addColumn("No Telepon");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtidkurir = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttelpon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKurir = new javax.swing.JTable();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Kurir");

        jLabel2.setText("Nama Admin");

        jLabel3.setText("No Telepon");

        jButton1.setText("Simpan Prepare Statement");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableKurir.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKurir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKurirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKurir);

        btnubah.setText("Ubah Data");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus Data");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan Statement");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72)
                        .addComponent(txttelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidkurir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(62, 62, 62)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtidkurir, txtnama, txttelpon});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidkurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnubah))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public void tampilDataKurir(){
          try {
            modelTabelKurir.getDataVector().removeAllElements();
            modelTabelKurir.fireTableDataChanged();
            
            PreparedStatement query = koneksi.connect.prepareStatement("SELECT * FROM kurir");
            ResultSet data = query.executeQuery();
            while (data.next()) {                
                Object[] baris = new Object[3];
                baris[0] = data.getString("id_kurir");
                baris[1] = data.getString("nama_admin");
                baris[2] = data.getString("no_telp");                
                modelTabelKurir.addRow(baris);
            }
            query.close();
            data.close();
        } catch (Exception e) {
        }
     }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
           if(txtidkurir.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Id belum diisi");
               txtidkurir.requestFocus();
           } else if(txtnama.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "nama belum diisi");
               txtnama.requestFocus();                               
           } else if(txttelpon.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "telpon belum diisi");
               txttelpon.requestFocus();
           } else{
               String sqlCari = "SELECT * FROM kurir WHERE id_kurir ='"+txtidkurir.getText()+"'";
               ResultSet cari = koneksi.connect.createStatement().executeQuery(sqlCari);
               if (cari.next()){
                    JOptionPane.showMessageDialog(this, "Id sudah terdaftar");
                                        
                       txtnama.setText(cari.getString(2));
                       txttelpon.setText(cari.getString(3));                   
               }else{
                    String sql = "INSERT INTO kurir VALUE(?,?,?)";
                    PreparedStatement simpan = koneksi.connect.prepareStatement(sql);
                    simpan.setString(1, txtidkurir.getText());
                    simpan.setString(2, txtnama.getText());
                    simpan.setString(3, txttelpon.getText());
                    simpan.executeUpdate();
                    tampilDataKurir();
                    JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
               }
               
           }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
          try {
            if(txtidkurir.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "id belum diisi");
               txtidkurir.requestFocus();
            } else if(txtnama.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "nama admin belum diisi");
               txtnama.requestFocus();
            } else if(txttelpon.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "no telepon belum diisi");
               txttelpon.requestFocus();
            }else{
                String sql = "insert into kurir value('"+txtidkurir.getText()+"','"+txtnama.getText()+"','"+txttelpon.getText()+"')";
                koneksi.connect.createStatement().execute(sql);
                tampilDataKurir();
                JOptionPane.showMessageDialog(this, "data berhasil disimpan");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tableKurirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKurirMouseClicked
        // TODO add your handling code here:
         int baris = tableKurir.getSelectedRow();
        String id = tableKurir.getValueAt(baris, 0).toString();
        String nama = tableKurir.getValueAt(baris, 1).toString();
        String telpon = tableKurir.getValueAt(baris, 2).toString();
        txtidkurir.setText(id);
        txtnama.setText(nama);
        txttelpon.setText(telpon);
    }//GEN-LAST:event_tableKurirMouseClicked

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
        try {
            if (
                    (txtidkurir.getText().isEmpty()) &&
                    (txtnama.getText().isEmpty()) &&
                    (txttelpon.getText().isEmpty())
               ){
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
            }else
            {
                String sql = "UPDATE kurir Set nama_admin=?,no_telp=? WHERE id_kurir=?";
                PreparedStatement ubah = koneksi.connect.prepareStatement(sql);
                ubah.setString(1, txtnama.getText());
                ubah.setString(2, txttelpon.getText());
                ubah.setString(3, txtidkurir.getText());
                ubah.executeUpdate();
                tampilDataKurir();
                JOptionPane.showMessageDialog(this, "Data Telah Diubah");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        try {
            if (
                    (txtidkurir.getText().isEmpty()) &&
                    (txtnama.getText().isEmpty()) &&
                    (txttelpon.getText().isEmpty()) 
               ){
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
            }else
            {
                String sql = "DELETE FROM kurir WHERE id_kurir=?";
                PreparedStatement hapus = koneksi.connect.prepareStatement(sql);
                hapus.setString(1, txtidkurir.getText());
                hapus.executeUpdate();
                tampilDataKurir();
                JOptionPane.showMessageDialog(this, "Data Telah Dihapus");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnhapusActionPerformed

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
            java.util.logging.Logger.getLogger(frameKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameKurir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnubah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKurir;
    private javax.swing.JTextField txtidkurir;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelpon;
    // End of variables declaration//GEN-END:variables
}
