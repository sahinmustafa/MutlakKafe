
package view;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.Action;

/**
 *
 * @author MustafaS
 */
public class SiraV extends javax.swing.JPanel {


    public SiraV() {
        initComponents();
    }

    
    
    private void btnEkleMousePressed(java.awt.event.MouseEvent evt){
    	
    	HashMap<String, String> values = new HashMap<>();
    	
    	values.put("ad", txtAd.getText().trim());
    	values.put("soyad", txtSoyad.getText().trim());
    	values.put("telefon", txtTelefon.getText().trim());
    	values.put("siraNo", spnSiraNo.getValue().toString());
    	values.put("masaNo", spnMasaNo.getValue().toString());
    	values.put("baslangicSaat", spnBaslangicSaat.getValue().toString());
    	values.put("baslangicDk", spnBaslangicDk.getValue().toString());
    	values.put("bitisSaat", spnBitisSaat.getValue().toString());
    	values.put("bitisDk", spnBitisDk.getValue().toString());
    	
    	mutlakkafe.MutlakKafe.mainCont.getSiraCont().ekle(values);
    	
    	tblSira.setModel(mutlakkafe.MutlakKafe.mainCont.getSiraCont().listModel());
    	
    }
    
    private void btnSilMousePressed(java.awt.event.MouseEvent evt){
    	int siraID = Integer.parseInt(tblSira.getValueAt(tblSira.getSelectedRow(), 3).toString());
    	
    	
    	mutlakkafe.MutlakKafe.mainCont.getSiraCont().sil(siraID);
    }
    
    private void btnVazgecMousePressed(java.awt.event.MouseEvent evt){
    	temizle();
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt){
    	
    	tblSira.setModel(mutlakkafe.MutlakKafe.mainCont.getSiraCont().listModel());
    	txtToplamKisi.setText(tblSira.getModel().getRowCount() + "");
    }
    
    private void temizle(){
    	
    	this.txtAd.setText("");
    	this.txtSoyad.setText("");
    	this.txtTelefon.setText("");
    	this.spnBaslangicDk.setValue(0);
    	this.spnBaslangicSaat.setValue(0);
    	this.spnBitisDk.setValue(0);
    	this.spnBitisSaat.setValue(0);
    	this.spnMasaNo.setValue(0);
    	this.spnSiraNo.setValue(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtToplamKisi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSil = new javax.swing.JButton();
        txtSoyad = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        txtAd = new javax.swing.JTextField();
        spnBitisDk = new javax.swing.JSpinner();
        spnBitisSaat = new javax.swing.JSpinner();
        txtTelefon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spnSiraNo = new javax.swing.JSpinner();
        spnMasaNo = new javax.swing.JSpinner();
        spnBaslangicSaat = new javax.swing.JSpinner();
        spnBaslangicDk = new javax.swing.JSpinner();
        btnVazgec = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSira = new javax.swing.JTable();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        
        txtToplamKisi.setEnabled(false);

        btnSil.setText("Sil");
        btnSil.setPreferredSize(new java.awt.Dimension(80, 23));
        btnSil.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSilMousePressed(evt);
        	}
        });

        btnEkle.setText("Ekle");
        btnEkle.setPreferredSize(new java.awt.Dimension(80, 23));
        btnEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEkleMousePressed(evt);
            }
        });

        spnBitisDk.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, Integer.valueOf(60), Integer.valueOf(1)));
        spnBitisDk.setToolTipText("Dakika");
        spnBitisDk.setPreferredSize(new java.awt.Dimension(50, 20));

        spnBitisSaat.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, Integer.valueOf(24), Integer.valueOf(1)));
        spnBitisSaat.setToolTipText("Saat");
        spnBitisSaat.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel1.setText("Ad :");

        jLabel4.setText("Sýra No :");

        jLabel2.setText("Soyad :");

        jLabel3.setText("Telefon :");

        jLabel7.setText("Bitiþ Saati :");

        jLabel6.setText("Baþlangýç Saati :");

        jLabel5.setText("Masa No :");

        spnSiraNo.setMinimumSize(new java.awt.Dimension(50, 20));
        spnSiraNo.setPreferredSize(new java.awt.Dimension(50, 20));

        spnMasaNo.setPreferredSize(new java.awt.Dimension(50, 20));

        spnBaslangicSaat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        spnBaslangicSaat.setToolTipText("Saat");
        spnBaslangicSaat.setMinimumSize(new java.awt.Dimension(50, 20));
        spnBaslangicSaat.setPreferredSize(new java.awt.Dimension(50, 20));

        spnBaslangicDk.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBaslangicDk.setToolTipText("Dakika");

        btnVazgec.setText("Vazgeç");
        btnVazgec.setPreferredSize(new java.awt.Dimension(80, 23));
        btnVazgec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVazgecMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2)
        				.addComponent(jLabel3))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(txtTelefon)
        				.addComponent(txtSoyad)
        				.addComponent(txtAd, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel4)
        						.addComponent(jLabel5))
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(spnMasaNo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(spnSiraNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(34)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel6)
        							.addGap(18)
        							.addComponent(spnBaslangicSaat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(spnBaslangicDk, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel7)
        							.addGap(18)
        							.addComponent(spnBitisSaat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(spnBitisDk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(btnEkle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnVazgec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(23)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(txtAd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(14)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtSoyad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(spnSiraNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel6)
        						.addComponent(spnBaslangicSaat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(spnBaslangicDk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(spnBitisDk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(3))
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(spnBitisSaat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel7)
        							.addComponent(spnMasaNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel5)))))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(txtTelefon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel3))
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(btnEkle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(btnSil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(btnVazgec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jLabel8.setText("Toplam Sýrada ki kiþi :");

        tblSira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ad", "Soyad", "Telefon", "Sýra No", "Masa No", "Baþlangýç Saati", "Bitiþ Saati"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSira);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, Alignment.LEADING))
        			.addGap(144))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(403, Short.MAX_VALUE)
        			.addComponent(jLabel8)
        			.addGap(18)
        			.addComponent(txtToplamKisi, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addGap(143))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(txtToplamKisi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnBaslangicDk;
    private javax.swing.JSpinner spnBaslangicSaat;
    private javax.swing.JSpinner spnBitisDk;
    private javax.swing.JSpinner spnBitisSaat;
    private javax.swing.JSpinner spnMasaNo;
    private javax.swing.JSpinner spnSiraNo;
    private javax.swing.JTable tblSira;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtToplamKisi;
    // End of variables declaration//GEN-END:variables
	
}
