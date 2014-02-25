
package controller.urun;

import model.urun.Urun;
import hibernate.HbmIslemler;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author MustafaS
 */
public class UrunC implements UrunI{

    
    
    public void urunEkle(int barkod, int stok, 
                         double birimFiyat, String urunAdi){
    
        if(urunAdi.equals("") )
            JOptionPane.showMessageDialog(null, 
                    "Urun adı boş olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
        else if(birimFiyat < 0)
            JOptionPane.showMessageDialog(null, 
                    "Urun fiyatı 0'dan küçük olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
        else
            urunEkle(new Urun(barkod, stok, birimFiyat, urunAdi));
    }
    
    @Override
    public void urunEkle(Urun urun) {
        try {
            urun.urunEkle(urun);
            
            JOptionPane.showMessageDialog(null,
                    urun.getUrunAdi() + " ürünü eklendi!",
                    "Ekle", JOptionPane.INFORMATION_MESSAGE);
        } catch (HibernateException ex) {
            
            JOptionPane.showMessageDialog(null,
                    urun.getUrunAdi() + " ürünü eklenemiyor!",
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public List<Urun> urunListesi() {
        Urun urun = new Urun();
        return urun.urunListesi();
    }
    

    @Override
    public boolean urunSil(String urunAdi) {
        
        try {
            Urun urun = new Urun();
            if (urun.urunSil(urunAdi)) {
                JOptionPane.showMessageDialog(null,
                        urunAdi + " no'lu ürün silindi!",
                        "Sil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        urunAdi + " no'lu ürün bulunamadı!",
                        "Hata", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, 
                    urunAdi + " no'lu ürün silinmesi sırasında hata oluştu!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }finally{
            return false;
        }
    }

    @Override
    public boolean urunGuncelle(String urunAdi, Urun yeniUrun) {
        try {
            Urun urun = new Urun();
            if (urun.urunGuncelle(urunAdi, yeniUrun)) {
                JOptionPane.showMessageDialog(null,
                        urunAdi + " no'lu ürün Güncellendi!",
                        "Güncelleme", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        urunAdi + " no'lu ürün bulunamadı!",
                        "Hata", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, 
                    urunAdi + " no'lu ürün güncellenmesi sırasında hata oluştu!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }finally{
            return false;
        }
    }

    @Override
    public void urunSat(String urunAdi, int miktar) {

        if(miktar > 0){
            HbmIslemler hbm = new HbmIslemler();
            
            Urun urun = (Urun) hbm.bilgiGetir(urunAdi, Urun.class);
            
            if((urun.getStok() - miktar) > 0)
                urun.urunSat(urunAdi, miktar);
            else
                JOptionPane.showMessageDialog(null, 
                    "Yeterli miktar bulunmamaktadır.!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
        }else
            JOptionPane.showMessageDialog(null, 
                    "Urun miktarı negatif olamaz!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
    }

    @Override
    public void urunAl(String urunAdi, int miktar) {
        if(miktar > 0){
            Urun urun = new Urun();
            urun.urunAl(urunAdi, miktar);
        
        }else
            JOptionPane.showMessageDialog(null, 
                    "Urun miktarı negatif olamaz!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
    }

    
    
}
