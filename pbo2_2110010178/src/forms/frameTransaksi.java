/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import database.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rudia
 */
public class frameTransaksi extends javax.swing.JFrame {
        koneksi koneksi;
        
        public DefaultTableModel modelTableTransaksi;
            
    /**
     * Creates new form frameTransaksi
     */
    public frameTransaksi() {
        initComponents();
        this.setLocationRelativeTo(null);
        koneksi = new koneksi();
        modelTableTransaksi = new DefaultTableModel();
        tableTransaksi.setModel(modelTableTransaksi);
        modelTableTransaksi.addColumn("Id Transaksi");
        modelTableTransaksi.addColumn("Tanggal Transaksi Masuk");
        modelTableTransaksi.addColumn("Jenis Paket");
        modelTableTransaksi.addColumn("Tanggal Transaksi Keluar");
        modelTableTransaksi.addColumn("Total");
        tampilDataTransaksi();
    }
    
     public void tampilDataTransaksi(){
        try {
            modelTableTransaksi.getDataVector().removeAllElements();
            modelTableTransaksi.fireTableDataChanged();
            
            PreparedStatement query = koneksi.connect.prepareStatement("SELECT * FROM transaksi");
            ResultSet data = query.executeQuery();
            while (data.next()) {                
                Object[] baris = new Object[5];
                baris[0] = data.getString("id_transaksi");
                baris[1] = data.getString("tgl_transaksimasuk");
                baris[2] = data.getString("jenis_paket");
                baris[3] = data.getString("tgl_transaksikeluar");
                baris[4] = data.getString("total");
                modelTableTransaksi.addRow(baris);
            }
            query.close();
            data.close();
        } catch (Exception e) {
        }
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
        txtidtransaksi = new javax.swing.JTextField();
        txttglmasuk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtjenis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttglkeluar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnsimpanprepare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransaksi = new javax.swing.JTable();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Transaksi");

        jLabel2.setText("Tanggal Transaksi Masuk");

        jLabel3.setText("Jenis Paket");

        jLabel4.setText("Tanggal Transaksi Keluar");

        jLabel5.setText("Total");

        btnsimpan.setText("Simpan Statement");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnsimpanprepare.setText("Simpan Prepare Statement");
        btnsimpanprepare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanprepareActionPerformed(evt);
            }
        });

        tableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTransaksi);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttglkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsimpanprepare)
                        .addGap(38, 38, 38))))
            .addComponent(jScrollPane1)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtidtransaksi, txtjenis, txttglkeluar, txttglmasuk, txttotal});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtidtransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttglkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnubah)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapus)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnsimpanprepare))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try {
            if(txtidtransaksi.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "id belum diisi");
               txtidtransaksi.requestFocus();
            } else if(txttglmasuk.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "tanggal transaksi masuk belum diisi");
               txttglmasuk.requestFocus();
            } else if(txtjenis.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "jenis paket belum diisi");
               txtjenis.requestFocus();
            } else if(txttglkeluar.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "tanggal transaksi keluar belum diisi");
               txttglkeluar.requestFocus();
             } else if(txttotal.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "total belum diisi");
               txttotal.requestFocus();    
            }else{
                String sql = "insert into transaksi value('"+txtidtransaksi.getText()+"','"+txttglmasuk.getText()+"','"+txtjenis.getText()+"','"+txttglkeluar.getText()+"','"+txttotal.getText()+"')";
                koneksi.connect.createStatement().execute(sql);
                tampilDataTransaksi();
                JOptionPane.showMessageDialog(this, "data berhasil disimpan");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnsimpanprepareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanprepareActionPerformed
        // TODO add your handling code here:
          
           try {
            if(txtidtransaksi.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "id belum diisi");
               txtidtransaksi.requestFocus();
            } else if(txttglmasuk.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Tanggal Transaksi Masuk belum diisi");
               txttglmasuk.requestFocus();
            } else if(txtjenis.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Jenis Paket belum diisi");
               txtjenis.requestFocus();
            } else if(txttglkeluar.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Tanggal Transaksi Keluar belum diisi");
               txttglkeluar.requestFocus();
            } else if(txttotal.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Total belum diisi");
               txttotal.requestFocus();
            } else{
               String sqlCari = "SELECT * FROM transaksi WHERE id_transaksi ='"+txtidtransaksi.getText()+"'";
               ResultSet cari = koneksi.connect.createStatement().executeQuery(sqlCari);
               if (cari.next()){
                    JOptionPane.showMessageDialog(this, "ID sudah terdaftar");
                                        
                       txttglmasuk.setText(cari.getString(2));
                       txtjenis.setText(cari.getString(3));                   
                       txttglkeluar.setText(cari.getString(4));                   
                       txttotal.setText(cari.getString(5));                   
               }else{
                    String sql = "INSERT INTO transaksi VALUE(?,?,?,?,?)";
                    PreparedStatement simpan = koneksi.connect.prepareStatement(sql);
                    simpan.setString(1, txtidtransaksi.getText());
                    simpan.setString(2, txttglmasuk.getText());
                    simpan.setString(3, txtjenis.getText());
                    simpan.setString(4, txttglkeluar.getText());
                    simpan.setString(5, txttotal.getText());
                    simpan.executeUpdate();
                    tampilDataTransaksi();
                    JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
               }
               
           }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnsimpanprepareActionPerformed

    private void tableTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTransaksiMouseClicked
        // TODO add your handling code here:
        
        int baris = tableTransaksi.getSelectedRow();
        String id = tableTransaksi.getValueAt(baris, 0).toString();
        String tglmasuk = tableTransaksi.getValueAt(baris, 1).toString();
        String jenis = tableTransaksi.getValueAt(baris, 2).toString();
        String tglkeluar = tableTransaksi.getValueAt(baris, 3).toString();
        String total = tableTransaksi.getValueAt(baris, 4).toString();
        txtidtransaksi.setText(id);
        txttglmasuk.setText(tglmasuk);
        txtjenis.setText(jenis);
        txttglkeluar.setText(tglkeluar);
        txttotal.setText(total);
    }//GEN-LAST:event_tableTransaksiMouseClicked

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
        
            try {
            if (
                    (txtidtransaksi.getText().isEmpty()) &&
                    (txttglmasuk.getText().isEmpty()) &&
                    (txtjenis.getText().isEmpty()) &&
                    (txttglkeluar.getText().isEmpty()) &&
                    (txttotal.getText().isEmpty()) 
               ){
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
            }else
            {
                String sql = "UPDATE transaksi Set tgl_transaksimasuk=?,jenis_paket=?,tgl_transaksikeluar=?,total=? WHERE id_transaksi=?";
                PreparedStatement ubah = koneksi.connect.prepareStatement(sql);
                ubah.setString(1, txttglmasuk.getText());
                ubah.setString(2, txtjenis.getText());
                ubah.setString(3, txttglmasuk.getText());
                ubah.setString(4, txttotal.getText());
                ubah.setString(5, txtidtransaksi.getText());
                ubah.executeUpdate();
                tampilDataTransaksi();
                JOptionPane.showMessageDialog(this, "Data Telah Diubah");
            }
        } catch (Exception e) {
        }
    
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        
            try {
            if (
                    (txtidtransaksi.getText().isEmpty()) &&
                    (txttglmasuk.getText().isEmpty()) &&
                    (txtjenis.getText().isEmpty()) &&
                    (txttglkeluar.getText().isEmpty()) &&
                    (txttotal.getText().isEmpty()) 
               ){
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
            }else
            {
                String sql = "DELETE FROM transaksi WHERE id_transaksi=?";
                PreparedStatement hapus = koneksi.connect.prepareStatement(sql);
                hapus.setString(1, txtidtransaksi.getText());
                hapus.executeUpdate();
                tampilDataTransaksi();
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
            java.util.logging.Logger.getLogger(frameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnsimpanprepare;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTransaksi;
    private javax.swing.JTextField txtidtransaksi;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txttglkeluar;
    private javax.swing.JTextField txttglmasuk;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
