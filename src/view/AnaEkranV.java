/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author yetishbey
 */
public class AnaEkranV extends javax.swing.JFrame {

    /**
     * Creates new form AnaEkran
     */
    public AnaEkranV() {
        initComponents();
        String masaAdlari[] = {"Masa 1", "Masa 2", "Masa 3", "Masa 4", "Masa 5","Masa 6"};

        masalar1.init(masaAdlari);
        masalar1.masaEkle("Masa X");
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        masalar1 = new view.MasalarV();
        siraPanel1 = new view.SiraV();
        pnlKisayollar = new javax.swing.JPanel();
        toolbox1 = new view.AracCubuguV();
        masaBilgisi1 = new view.MasaBilgisiV();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDosya = new javax.swing.JMenu();
        menuItemCikis = new javax.swing.JMenuItem();
        menuRapor = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuGorunum = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        menuAraclar = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem24 = new javax.swing.JMenuItem();
        menuYardim = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu7.setText("jMenu7");

        jMenuItem17.setText("jMenuItem17");

        jMenuItem20.setText("jMenuItem20");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout masalar1Layout = new javax.swing.GroupLayout(masalar1);
        masalar1.setLayout(masalar1Layout);
        masalar1Layout.setHorizontalGroup(
            masalar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        masalar1Layout.setVerticalGroup(
            masalar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Masalar", masalar1);
        jTabbedPane1.addTab("Siralar", siraPanel1);

        javax.swing.GroupLayout pnlKisayollarLayout = new javax.swing.GroupLayout(pnlKisayollar);
        pnlKisayollar.setLayout(pnlKisayollarLayout);
        pnlKisayollarLayout.setHorizontalGroup(
            pnlKisayollarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisayollarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toolbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKisayollarLayout.setVerticalGroup(
            pnlKisayollarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisayollarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toolbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuDosya.setText("Dosya");

        menuItemCikis.setText("Çýkýþ");
        menuDosya.add(menuItemCikis);

        jMenuBar1.add(menuDosya);

        menuRapor.setText("Rapor");

        jMenu2.setText("Ýþlemler");

        jMenuItem3.setText("Genel");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Üyeler");
        jMenu2.add(jMenuItem4);

        jMenuItem6.setText("Zamanlayici");
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("Bilet");
        jMenu2.add(jMenuItem5);

        jMenuItem7.setText("Sipariþler");
        jMenu2.add(jMenuItem7);

        menuRapor.add(jMenu2);

        jMenu3.setText("Kasa");

        jMenuItem8.setText("Genel");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Gelir");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Gider");
        jMenu3.add(jMenuItem10);

        menuRapor.add(jMenu3);
        menuRapor.add(jSeparator1);

        jMenuItem1.setText("Kafeterya");
        menuRapor.add(jMenuItem1);

        jMenuItem2.setText("Üye Borçlari");
        menuRapor.add(jMenuItem2);

        jMenuBar1.add(menuRapor);

        menuGorunum.setText("Görünüm");

        jMenu6.setText("Yönetim");
        buttonGroup1.add(jMenu6);

        buttonGroup1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("Simgesel");
        jMenu6.add(jRadioButtonMenuItem1);

        buttonGroup1.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Detayli");
        jMenu6.add(jRadioButtonMenuItem2);
        jMenu6.add(jSeparator4);

        jMenuItem11.setText("Küçük simgeleri kullan");
        jMenu6.add(jMenuItem11);
        jMenu6.add(jSeparator5);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Hücresel");
        jMenu6.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Menü");
        jMenu6.add(jCheckBoxMenuItem5);

        menuGorunum.add(jMenu6);

        jMenu5.setText("Zamanlayicilar");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Hücresel");
        jMenu5.add(jCheckBoxMenuItem3);

        menuGorunum.add(jMenu5);

        jMenu4.setText("Kisayollar");
        jMenu4.add(jSeparator2);

        buttonGroup2.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Simgesel");
        jMenu4.add(jRadioButtonMenuItem3);

        buttonGroup2.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Detayli");
        jMenu4.add(jRadioButtonMenuItem4);
        jMenu4.add(jSeparator6);

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Hücresel");
        jMenu4.add(jCheckBoxMenuItem6);

        menuGorunum.add(jMenu4);
        menuGorunum.add(jSeparator3);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Toolbar");
        menuGorunum.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Statusbar");
        menuGorunum.add(jCheckBoxMenuItem2);

        jMenuBar1.add(menuGorunum);

        menuAraclar.setText("Araçlar");

        jMenuItem12.setText("Bilet");
        menuAraclar.add(jMenuItem12);
        menuAraclar.add(jSeparator10);

        jMenu8.setText("Bilgisayarlari Aç");

        jMenuItem13.setText("Bütün AÄŸ");
        jMenu8.add(jMenuItem13);

        jMenuItem15.setText("Bilgisayar Seçin");
        jMenu8.add(jMenuItem15);

        menuAraclar.add(jMenu8);
        menuAraclar.add(jSeparator9);

        jMenuItem14.setText("Server Durumu");
        menuAraclar.add(jMenuItem14);

        jMenuItem16.setText("IP Monitor");
        menuAraclar.add(jMenuItem16);

        jMenuItem18.setText("Kafeterya");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        menuAraclar.add(jMenuItem18);

        jMenuItem19.setText("Kasa");
        menuAraclar.add(jMenuItem19);
        menuAraclar.add(jSeparator8);

        jMenuItem21.setText("Yazi Tipleri");
        menuAraclar.add(jMenuItem21);

        jMenuItem22.setText("Kisitlamalar");
        menuAraclar.add(jMenuItem22);

        jMenuItem23.setText("Seçenekler");
        menuAraclar.add(jMenuItem23);
        menuAraclar.add(jSeparator7);

        jMenuItem24.setText("Bilgisayari Süre ile Kapat");
        menuAraclar.add(jMenuItem24);

        jMenuBar1.add(menuAraclar);

        menuYardim.setText("Yardim");

        jMenuItem26.setText("Lisans Güncelle");
        menuYardim.add(jMenuItem26);

        jMenuItem25.setText("Lisans Bilgilerimi Kaybettim");
        menuYardim.add(jMenuItem25);

        jMenuItem27.setText("Lisans Bilgisi");
        menuYardim.add(jMenuItem27);
        menuYardim.add(jSeparator12);

        jMenuItem28.setText("Yardim");
        menuYardim.add(jMenuItem28);

        jMenuItem29.setText("Mutlak Kafe Online");
        menuYardim.add(jMenuItem29);

        jMenuItem30.setText("Güncellemelere Gözat");
        menuYardim.add(jMenuItem30);

        jMenuItem31.setText("Destek");
        menuYardim.add(jMenuItem31);

        jMenuItem32.setText("Ýrtibat");
        menuYardim.add(jMenuItem32);
        menuYardim.add(jSeparator11);

        jMenuItem33.setText("Yeniden Kayit");
        menuYardim.add(jMenuItem33);

        jMenuItem34.setText("Hakkinda");
        menuYardim.add(jMenuItem34);

        jMenuBar1.add(menuYardim);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKisayollar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masaBilgisi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlKisayollar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masaBilgisi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkranV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkranV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkranV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkranV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkranV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private view.MasaBilgisiV masaBilgisi1;
    private view.MasalarV masalar1;
    private javax.swing.JMenu menuAraclar;
    private javax.swing.JMenu menuDosya;
    private javax.swing.JMenu menuGorunum;
    private javax.swing.JMenuItem menuItemCikis;
    private javax.swing.JMenu menuRapor;
    private javax.swing.JMenu menuYardim;
    private javax.swing.JPanel pnlKisayollar;
    private view.SiraV siraPanel1;
    private view.AracCubuguV toolbox1;
    // End of variables declaration//GEN-END:variables
}
