package alatoutdoor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmMain extends javax.swing.JFrame {
    
    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btMn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btMn2 = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbNama = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tbDesc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tbHarga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnl3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tbHarga1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laundry Kiloan");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        btMn1.setBackground(new java.awt.Color(255, 255, 255));
        btMn1.setText("Tambah Barang");
        btMn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btMn1);
        btMn1.setBounds(10, 60, 260, 32);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TESLA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 180, 50);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sedia Alat Outdoor");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 10, 180, 50);

        btMn2.setBackground(new java.awt.Color(255, 255, 255));
        btMn2.setText("Penualan");
        btMn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btMn2);
        btMn2.setBounds(280, 60, 230, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 100);

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("Barang Masuk");
        pnl2.add(jLabel8);
        jLabel8.setBounds(30, 20, 270, 50);

        jLabel9.setText("Nama Barang");
        pnl2.add(jLabel9);
        jLabel9.setBounds(30, 80, 180, 16);

        tbNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNamaActionPerformed(evt);
            }
        });
        pnl2.add(tbNama);
        tbNama.setBounds(30, 100, 440, 24);

        jLabel11.setText("Desc");
        pnl2.add(jLabel11);
        jLabel11.setBounds(30, 130, 100, 16);

        tbDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDescActionPerformed(evt);
            }
        });
        pnl2.add(tbDesc);
        tbDesc.setBounds(30, 150, 440, 24);

        jLabel12.setText("Harga");
        pnl2.add(jLabel12);
        jLabel12.setBounds(30, 180, 100, 16);
        pnl2.add(tbHarga);
        tbHarga.setBounds(30, 200, 440, 24);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnl2.add(jButton1);
        jButton1.setBounds(380, 240, 90, 32);

        getContentPane().add(pnl2);
        pnl2.setBounds(80, 290, 440, 130);

        pnl3.setBackground(new java.awt.Color(255, 255, 255));
        pnl3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setText("Penjualan");
        pnl3.add(jLabel10);
        jLabel10.setBounds(30, 20, 270, 50);

        jLabel15.setText("Jumlah");
        pnl3.add(jLabel15);
        jLabel15.setBounds(260, 80, 100, 16);
        pnl3.add(tbHarga1);
        tbHarga1.setBounds(260, 100, 200, 24);

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Beli");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnl3.add(jButton2);
        jButton2.setBounds(370, 130, 90, 32);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Desc", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnl3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 210, 230);

        getContentPane().add(pnl3);
        pnl3.setBounds(0, 100, 520, 320);

        setSize(new java.awt.Dimension(531, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMn1ActionPerformed
        // TODO add your handling code here:
        pnl2.setVisible(true);
        pnl3.setVisible(false);
    }//GEN-LAST:event_btMn1ActionPerformed

    private void btMn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMn2ActionPerformed
        // TODO add your handling code here:
        pnl2.setVisible(false);
        pnl3.setVisible(true);
        
       load();
    }//GEN-LAST:event_btMn2ActionPerformed

    private void load(){
        String kolom[] = {"No","Nama","Desc","Harga"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM barang";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String nama = rs.getString(2);
               String desc = rs.getString(3);
               String harga = rs.getString(4);
               String data [] = {no,nama,desc,harga};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       jTable1.setModel(dtm);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pnl2.setVisible(true);
        pnl3.setVisible(false);
    }//GEN-LAST:event_formWindowOpened


    private void tbDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDescActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Iki save lur
        String SQL = "INSERT INTO barang (id,nama_barang,deskripsi,harga) "
                + "VALUES(NULL,'"+tbNama.getText()+"','"+tbDesc.getText()+"',"
                + "'"+tbHarga.getText()+"')";
        System.out.println(SQL);
        int status = DBConn.execute(SQL);
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNamaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int total = Integer.valueOf(tbHarga1.getText());
        int harga = 0;
        
        int baris = jTable1.getSelectedRow();
        if(baris != -1){
            harga = Integer.valueOf(jTable1.getValueAt(baris,3).toString());
            JOptionPane.showMessageDialog(this, "Total = Rp. "+ total*harga +" . Terima kasih telah berbelanja", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMn1;
    private javax.swing.JButton btMn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JTextField tbDesc;
    private javax.swing.JTextField tbHarga;
    private javax.swing.JTextField tbHarga1;
    private javax.swing.JTextField tbNama;
    // End of variables declaration//GEN-END:variables

}
