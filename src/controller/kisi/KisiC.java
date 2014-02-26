
package controller.kisi;

import model.kisi.Calisan;
import model.kisi.Kisi;

import javax.swing.JOptionPane;

import view.AnaEkranV;

/**
 *
 * @author MustafaS
 */
public class KisiC implements KisiI{
    private Calisan kullanici;
    
     @SuppressWarnings("deprecation")
	@Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
         if (!kullaniciAdi.isEmpty() && !sifre.isEmpty()) {
             kullanici = new Calisan();
             if (kullanici.girisYap(kullaniciAdi, sifre)) {
                 kullanici.bilgileriGetir(kullaniciAdi);
                 
                 AnaEkranV ana = new AnaEkranV();
                 ana.show();
                 return true;
             }
              JOptionPane.showMessageDialog(null, "Yanlýs kullanýcý adý sifre",
                        "Hata", JOptionPane.ERROR_MESSAGE);
         }
         else 
             JOptionPane.showMessageDialog(null, "Lütfen alanlarý doldurunuz.",
                        "Hata", JOptionPane.ERROR_MESSAGE);
         return false;
        
    }

    @Override
    public void bilgileriGetir(String kullaniciAdi) {
        
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        return true;
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        return true;
    }

    public Calisan getKullanici() {
        return kullanici;
    }

    public void setKullanici(Calisan kullanici) {
        this.kullanici = kullanici;
    }
    
}
