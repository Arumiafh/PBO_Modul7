
import javax.swing.JOptionPane;
public class FrameIdeal extends javax.swing.JFrame {

    Double tinggi,berat,h1;
    String temp = "";
    
    public FrameIdeal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kberat = new javax.swing.JTextField();
        knama = new javax.swing.JTextField();
        kideal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Keluar = new javax.swing.JButton();
        Hitung = new javax.swing.JButton();
        Coba = new javax.swing.JButton();
        ktinggi = new javax.swing.JTextField();
        saran = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 20, 460, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 360, 460, 40);

        jLabel3.setText("cm");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 120, 30, 30);

        jLabel4.setText("Tinggi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 60, 30);

        jLabel5.setText("Breat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 80, 30);

        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 200, 100, 30);

        jLabel7.setText("Nama");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 80, 60, 30);

        jLabel8.setText("Berat Badan Ideal Anda adalah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 310, 170, 30);

        kberat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(kberat);
        kberat.setBounds(130, 160, 80, 30);

        knama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(knama);
        knama.setBounds(130, 80, 300, 30);

        kideal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kideal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidealActionPerformed(evt);
            }
        });
        getContentPane().add(kideal);
        kideal.setBounds(260, 310, 50, 30);

        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 310, 30, 30);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 160, 30, 30);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(340, 250, 90, 30);

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(30, 250, 90, 30);

        Coba.setText("Coba Lagi");
        Coba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobaActionPerformed(evt);
            }
        });
        getContentPane().add(Coba);
        Coba.setBounds(190, 250, 90, 30);

        ktinggi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ktinggi);
        ktinggi.setBounds(130, 120, 80, 30);

        saran.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(saran);
        saran.setBounds(30, 440, 400, 30);

        hasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(hasil);
        hasil.setBounds(30, 400, 400, 30);

        buttonGroup1.add(rbLaki);
        rbLaki.setText("Laki-Laki");
        rbLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLakiActionPerformed(evt);
            }
        });
        getContentPane().add(rbLaki);
        rbLaki.setBounds(130, 200, 90, 30);

        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");
        rbPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPerempuanActionPerformed(evt);
            }
        });
        getContentPane().add(rbPerempuan);
        rbPerempuan.setBounds(250, 200, 90, 30);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 460, 490);

        setBounds(0, 0, 472, 528);
    }// </editor-fold>//GEN-END:initComponents

    private void kidealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidealActionPerformed

    }//GEN-LAST:event_kidealActionPerformed

    private void rbLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLakiActionPerformed
       rbLaki.setSelected(false);
    }//GEN-LAST:event_rbLakiActionPerformed

    private void rbPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPerempuanActionPerformed
        rbPerempuan.setSelected(false);
    }//GEN-LAST:event_rbPerempuanActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
       if(kberat.getText().equals("") || ktinggi.getText().equals("")
          || knama.getText().equals(""))
               {
                    JOptionPane.showMessageDialog(null, "Kotak isian belum diisi!");
               }
       
       else if (rbLaki.isSelected() || rbPerempuan.isSelected())
       {
           try 
           {
               Proses();
           }
           catch (Exception e)
           {
               JOptionPane.showMessageDialog(null, "Inputan ada yang salah!");
           }
           
       }
       
       else
           {
               JOptionPane.showMessageDialog(null, "");
           }
    }//GEN-LAST:event_HitungActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
      dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void CobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobaActionPerformed
       knama.setText("");
       ktinggi.setText("");
       kberat.setText("");
       kideal.setText("");
       buttonGroup1.clearSelection();
       hasil.setText("");
       saran.setText("");
    }//GEN-LAST:event_CobaActionPerformed

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
            java.util.logging.Logger.getLogger(FrameIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameIdeal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Coba;
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Keluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kberat;
    private javax.swing.JTextField kideal;
    private javax.swing.JTextField knama;
    private javax.swing.JTextField ktinggi;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextField saran;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
       
           tinggi = Double.valueOf(ktinggi.getText());
           berat = Double.valueOf(kberat.getText());
           
           if(rbLaki.isSelected())
           {
               h1 = (tinggi - 100) * 1;
           }
           else if(rbPerempuan.isSelected())
           {
               h1 = (tinggi - 104) *1;
           }
           
           temp = Double.toString(h1.intValue());
           
           if(h1 < berat)
           {
               kideal.setText(temp);
               hasil.setText("Maaf " + knama.getText() + " , Sepertinya anda Overweight");
               saran.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
           }
           else if(h1 > berat)
           {
               kideal.setText(temp);
               hasil.setText("Maaf " + knama.getText() + " , Sepertinya Anda Underweight");
               saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
           }
           else
           {
               kideal.setText(temp);
               hasil.setText("Hallo " + knama.getText() + " , Berat badan Anda sudah ideal");
               saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
           }
    }
}
