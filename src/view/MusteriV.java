
package view;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author MustafaS
 */
public class MusteriV extends javax.swing.JPanel {

  
    private static final String[] STRINGS = {
	    "Tarih", "Bilgisayar", "Baþlangýç", "Bitiþ", "Açýklama", "Kullanýlan", "Ücret", "Alýnan"
	};
	public MusteriV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pnlList = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKullaniciListesi = new javax.swing.JList();
        pnlAra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKullaniciAdiAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        lblToplamKayit = new javax.swing.JLabel();
        tabPageKullanici = new javax.swing.JTabbedPane();
        pnlKullaniciBilgisi = new javax.swing.JPanel();
        lblDurum = new javax.swing.JLabel();
        pnlKisiselBilgiler = new javax.swing.JPanel();
        lblResim = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        pnlHesapBilgileri = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtSifreTekrar = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        comboGun = new javax.swing.JComboBox();
        comboAy = new javax.swing.JComboBox();
        comboYil = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtKullanilanSure = new javax.swing.JTextField();
        txtKalanSure = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnSurekEkleCikar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtBorc = new javax.swing.JTextField();
        txtIndirim = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pnlUcretSecenekleri = new javax.swing.JPanel();
        radioStandar = new javax.swing.JRadioButton();
        radioUyeUcreti = new javax.swing.JRadioButton();
        radioUcretsiz = new javax.swing.JRadioButton();
        pnlUcretSecenekleri1 = new javax.swing.JPanel();
        radioOnceden = new javax.swing.JRadioButton();
        radioSonradan = new javax.swing.JRadioButton();
        pnlButonGrup = new javax.swing.JPanel();
        btnYeniKullanici = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnUgula = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        lblKayitTarihi = new javax.swing.JLabel();
        pnlGecmis = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKullaniciGecmis = new javax.swing.JTable();

        pnlList.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kullanýcý Listesi");
        jLabel1.setOpaque(true);

        jScrollPane1.setViewportView(lstKullaniciListesi);

        jLabel2.setText("Kullanýcý Adý");

        btnAra.setText("Ara");

        javax.swing.GroupLayout pnlAraLayout = new javax.swing.GroupLayout(pnlAra);
        pnlAra.setLayout(pnlAraLayout);
        pnlAraLayout.setHorizontalGroup(
            pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAraLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKullaniciAdiAra)))
                .addContainerGap())
        );
        pnlAraLayout.setVerticalGroup(
            pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKullaniciAdiAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblToplamKayit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblToplamKayit.setText("Toplam Kayýt : 0");

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pnlAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListLayout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addComponent(lblToplamKayit))
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addComponent(pnlAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToplamKayit)
                .addContainerGap())
        );

        lblDurum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDurum.setForeground(new java.awt.Color(0, 51, 255));
        lblDurum.setText("Durum : Kapalý");

        pnlKisiselBilgiler.setBorder(javax.swing.BorderFactory.createTitledBorder("Kiþisel Bilgiler"));

        lblResim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Ad :");

        jLabel4.setText("Soyad :");

        jLabel5.setText("Telefon :");

        javax.swing.GroupLayout pnlKisiselBilgilerLayout = new javax.swing.GroupLayout(pnlKisiselBilgiler);
        pnlKisiselBilgiler.setLayout(pnlKisiselBilgilerLayout);
        pnlKisiselBilgilerLayout.setHorizontalGroup(
            pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKisiselBilgilerLayout.setVerticalGroup(
            pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addComponent(lblResim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHesapBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesap Bilgileri"));

        jLabel6.setText("Kullanýcý Adý :");

        jLabel7.setText("Þifre :");

        jLabel8.setText("Þifre Tekrar :");

        jLabel9.setText("Bitiþ Tarihi :");

        comboGun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", 
        		"8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", 
        		"25", "26", "27", "28", "29", "30", "31" }));

        comboAy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ocak", 
									"Þubat", "Mart", "Nisan", "Mayýs", "Haziran", "Temmuz", 
									"Aðustos", "Eylül", "Ekim", "Kasým", "Aralýk" }));

        comboYil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        jLabel10.setText("Kullanýlan Süre :");

        jLabel11.setText("Kalan Süre :");

        btnSurekEkleCikar.setText("+/-");
        btnSurekEkleCikar.setToolTipText("Süre Ekle Ã‡ýkar");

        jLabel12.setText("Borç :");

        jLabel13.setText("Ýndirim (%) :");

        pnlUcretSecenekleri.setBorder(javax.swing.BorderFactory.createTitledBorder("Ücret Seçenekleri"));

        buttonGroup1.add(radioStandar);
        radioStandar.setText("Standart");

        buttonGroup1.add(radioUyeUcreti);
        radioUyeUcreti.setSelected(true);
        radioUyeUcreti.setText("Üye Ücreti");

        buttonGroup1.add(radioUcretsiz);
        radioUcretsiz.setText("Ücretsiz");

        javax.swing.GroupLayout pnlUcretSecenekleriLayout = new javax.swing.GroupLayout(pnlUcretSecenekleri);
        pnlUcretSecenekleri.setLayout(pnlUcretSecenekleriLayout);
        pnlUcretSecenekleriLayout.setHorizontalGroup(
            pnlUcretSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUcretSecenekleriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUcretSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioStandar)
                    .addComponent(radioUyeUcreti)
                    .addComponent(radioUcretsiz))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlUcretSecenekleriLayout.setVerticalGroup(
            pnlUcretSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUcretSecenekleriLayout.createSequentialGroup()
                .addComponent(radioStandar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioUyeUcreti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioUcretsiz))
        );

        pnlUcretSecenekleri1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Seçenekleri"));

        buttonGroup2.add(radioOnceden);
        radioOnceden.setSelected(true);
        radioOnceden.setText("Önceden Ödenmiþ");

        buttonGroup2.add(radioSonradan);
        radioSonradan.setText("Sonra Ödenecek");

        javax.swing.GroupLayout pnlUcretSecenekleri1Layout = new javax.swing.GroupLayout(pnlUcretSecenekleri1);
        pnlUcretSecenekleri1.setLayout(pnlUcretSecenekleri1Layout);
        pnlUcretSecenekleri1Layout.setHorizontalGroup(
            pnlUcretSecenekleri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUcretSecenekleri1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioOnceden)
                .addContainerGap())
            .addGroup(pnlUcretSecenekleri1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioSonradan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUcretSecenekleri1Layout.setVerticalGroup(
            pnlUcretSecenekleri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUcretSecenekleri1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioOnceden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioSonradan)
                .addContainerGap())
        );

        btnYeniKullanici.setText("Yeni Kullanýcý");
        btnYeniKullanici.setPreferredSize(new java.awt.Dimension(100, 25));

        btnSil.setText("Sil");
        btnSil.setMinimumSize(new java.awt.Dimension(100, 25));
        btnSil.setPreferredSize(new java.awt.Dimension(100, 25));

        btnUgula.setText("Uygula");
        btnUgula.setPreferredSize(new java.awt.Dimension(100, 25));

        btnVazgec.setText("Vazgeç");
        btnVazgec.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout pnlButonGrupLayout = new javax.swing.GroupLayout(pnlButonGrup);
        pnlButonGrupLayout.setHorizontalGroup(
        	pnlButonGrupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, pnlButonGrupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnYeniKullanici, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnSil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnUgula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnVazgec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(55, Short.MAX_VALUE))
        );
        pnlButonGrupLayout.setVerticalGroup(
        	pnlButonGrupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlButonGrupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(pnlButonGrupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnYeniKullanici, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnSil, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnUgula, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnVazgec, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlButonGrup.setLayout(pnlButonGrupLayout);

        javax.swing.GroupLayout pnlHesapBilgileriLayout = new javax.swing.GroupLayout(pnlHesapBilgileri);
        pnlHesapBilgileri.setLayout(pnlHesapBilgileriLayout);
        pnlHesapBilgileriLayout.setHorizontalGroup(
            pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                        .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSifre)
                                    .addComponent(txtKullanilanSure)
                                    .addComponent(txtBorc, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                        .addGap(23, 23, 23)
                        .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addComponent(comboGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAy, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboYil, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addComponent(txtKalanSure, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSurekEkleCikar))
                            .addComponent(txtIndirim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                        .addComponent(pnlUcretSecenekleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlUcretSecenekleri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addComponent(pnlButonGrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHesapBilgileriLayout.setVerticalGroup(
            pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(comboGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtKullanilanSure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtKalanSure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSurekEkleCikar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUcretSecenekleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlUcretSecenekleri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButonGrup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblKayitTarihi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKayitTarihi.setForeground(new java.awt.Color(255, 0, 0));
        lblKayitTarihi.setText("Kayýt Tarihi :09.02.2014");

        javax.swing.GroupLayout pnlKullaniciBilgisiLayout = new javax.swing.GroupLayout(pnlKullaniciBilgisi);
        pnlKullaniciBilgisi.setLayout(pnlKullaniciBilgisiLayout);
        pnlKullaniciBilgisiLayout.setHorizontalGroup(
            pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKisiselBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                        .addComponent(lblDurum)
                        .addGap(291, 291, 291)
                        .addComponent(lblKayitTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlHesapBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlKullaniciBilgisiLayout.setVerticalGroup(
            pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDurum)
                    .addComponent(lblKayitTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlKisiselBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHesapBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPageKullanici.addTab("Kullanýcý Bilgisi", pnlKullaniciBilgisi);

        tblKullaniciGecmis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {"Tarih", "Bilgisayar", "Baþlangýç", "Bitiþ", "Açýklama", "Kullanýlan", "Ücret", "Alýnan"}
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblKullaniciGecmis);

        javax.swing.GroupLayout pnlGecmisLayout = new javax.swing.GroupLayout(pnlGecmis);
        pnlGecmis.setLayout(pnlGecmisLayout);
        pnlGecmisLayout.setHorizontalGroup(
            pnlGecmisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );
        pnlGecmisLayout.setVerticalGroup(
            pnlGecmisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        tabPageKullanici.addTab("Geçmiþ", pnlGecmis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPageKullanici))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabPageKullanici)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnSurekEkleCikar;
    private javax.swing.JButton btnUgula;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JButton btnYeniKullanici;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox comboAy;
    private javax.swing.JComboBox comboGun;
    private javax.swing.JComboBox comboYil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDurum;
    private javax.swing.JLabel lblKayitTarihi;
    private javax.swing.JLabel lblResim;
    private javax.swing.JLabel lblToplamKayit;
    private javax.swing.JList lstKullaniciListesi;
    private javax.swing.JPanel pnlAra;
    private javax.swing.JPanel pnlButonGrup;
    private javax.swing.JPanel pnlGecmis;
    private javax.swing.JPanel pnlHesapBilgileri;
    private javax.swing.JPanel pnlKisiselBilgiler;
    private javax.swing.JPanel pnlKullaniciBilgisi;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlUcretSecenekleri;
    private javax.swing.JPanel pnlUcretSecenekleri1;
    private javax.swing.JRadioButton radioOnceden;
    private javax.swing.JRadioButton radioSonradan;
    private javax.swing.JRadioButton radioStandar;
    private javax.swing.JRadioButton radioUcretsiz;
    private javax.swing.JRadioButton radioUyeUcreti;
    private javax.swing.JTabbedPane tabPageKullanici;
    private javax.swing.JTable tblKullaniciGecmis;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtBorc;
    private javax.swing.JTextField txtIndirim;
    private javax.swing.JTextField txtKalanSure;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtKullaniciAdiAra;
    private javax.swing.JTextField txtKullanilanSure;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JPasswordField txtSifreTekrar;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
