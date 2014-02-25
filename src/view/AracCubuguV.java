
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author MustafaS
 */
public class AracCubuguV extends javax.swing.JPanel {

    public AracCubuguV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnSecenek = new javax.swing.JButton();
        btnKasiyer = new javax.swing.JButton();
        btnKafeterya = new javax.swing.JButton();
        btnBilet = new javax.swing.JButton();

        btnSecenek.setText("Se�enekler");
        btnSecenek.setPreferredSize(new java.awt.Dimension(60, 60));
        btnSecenek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecenekActionPerformed(evt);
            }
        });

        btnKasiyer.setText("Kasiyer");
        btnKasiyer.setPreferredSize(new java.awt.Dimension(100, 100));

        btnKafeterya.setText("Kafeterya");
        btnKafeterya.setPreferredSize(new java.awt.Dimension(100, 100));
        btnKafeterya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKafeteryaMousePressed(evt);
            }
        });

        btnBilet.setText("Bilet");
        btnBilet.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSecenek, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKasiyer, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKafeterya, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBilet, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSecenek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKasiyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKafeterya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBilet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSecenekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecenekActionPerformed
        if(mutlakkafe.MutlakKafe.mainCont.getKisiCont().getKullanici().getTip()!=1){
            JOptionPane.showMessageDialog(null, "Admine özel", "Uyarı", 
                     JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSecenekActionPerformed

    private void btnKafeteryaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKafeteryaMousePressed

        UrunV urunFrame = new UrunV();
        urunFrame.show();
        
    }//GEN-LAST:event_btnKafeteryaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilet;
    private javax.swing.JButton btnKafeterya;
    private javax.swing.JButton btnKasiyer;
    private javax.swing.JButton btnSecenek;
    // End of variables declaration//GEN-END:variables
}
