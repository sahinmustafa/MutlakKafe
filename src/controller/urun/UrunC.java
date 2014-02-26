
package controller.urun;

import model.urun.Urun;
import hibernate.HbmIslemler;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
                    "Urun adý boþ olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
        else if(birimFiyat < 0)
            JOptionPane.showMessageDialog(null, 
                    "Urun fiyatý 0'dan küçük olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
        else{
        	urunEkle(new Urun(barkod, stok, birimFiyat, urunAdi));
        }
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
    
    public DefaultTableModel urunListesiModel(){
    	
    	DefaultTableModel dtm = new DefaultTableModel();
    	
    	dtm.addColumn("Ürün Adý");
    	dtm.addColumn("Barkod");
    	dtm.addColumn("Birim Fiyatý");
    	dtm.addColumn("Stok");
    	
    	List<Urun> urunList = urunListesi();
    	
    	for(Urun u : urunList){
    		dtm.addRow(new String[]{	u.getUrunAdi(), 
    									u.getBarkod()+"", 
    									u.getBirimFiyat() + " TL", 
    									u.getStok() + ""
									});
    	}
    	
    	return dtm;
    }
    

    @SuppressWarnings("finally")
	@Override
    public boolean urunSil(String urunAdi) {
        int cevap = JOptionPane.showConfirmDialog(null, 
        						urunAdi + " Ürününü silmek istedðinize emin misiniz?", 
    							"Sil", JOptionPane.YES_NO_OPTION, 
    							JOptionPane.QUESTION_MESSAGE);
        
        if(cevap == JOptionPane.YES_OPTION){
	        try {
	            Urun urun = new Urun();
	            if (urun.urunSil(urunAdi)) {
	                JOptionPane.showMessageDialog(null,
	                        urunAdi + " no'lu ürün silindi!",
	                        "Sil", JOptionPane.INFORMATION_MESSAGE);
	                return true;
	            } else {
	                JOptionPane.showMessageDialog(null,
	                        urunAdi + " no'lu ürün bulunamadý!",
	                        "Hata", JOptionPane.WARNING_MESSAGE);
	            }
	        } catch (HibernateException ex) {
	            JOptionPane.showMessageDialog(null, 
	                    urunAdi + " no'lu ürün silinmesi sýrasýnda hata oluþtu!", 
	                    "Hata", JOptionPane.ERROR_MESSAGE);
	            
	        }
        }
        return false;
    }

    @SuppressWarnings("finally")
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
                        urunAdi + " no'lu ürün bulunamadý!",
                        "Hata", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, 
                    urunAdi + " no'lu ürün güncellenmesi sýrasýnda hata oluþtu!", 
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
                    "Yeterli miktar bulunmamaktadýr.!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
        }else
            JOptionPane.showMessageDialog(null, 
                    "Urun miktarý negatif olamaz!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
    }

    @Override
    public void urunAl(String urunAdi, int miktar) {
        if(miktar > 0){
            Urun urun = new Urun();
            urun.urunAl(urunAdi, miktar);
        
        }else
            JOptionPane.showMessageDialog(null, 
                    "Urun miktarý negatif olamaz!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
    }

    
    
}
