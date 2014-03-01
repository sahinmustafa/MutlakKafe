
package controller.urun;

import model.urun.Urun;
import java.util.List;

/**
 *
 * @author MustafaS
 */
public interface UrunI{
    
    
    /**
     * Urun bilgilerini veritabanýna ekler
     * @param urun: Urun bilgisinin bulunduðu URUN tipinde nesne.
     */
    public void urunEkle(Urun urun);
    
    
    /**
     * Urün bilgilerinin bulunduðu bir liste oluýturur.
     * @return ürün listesi
     */
    public List<Urun> urunListesi();
    
    
    /**
     * Gelen ürünNosuna karýýlýk gelen satýrý siler.
     * @param urunAdi Urun icin ayýrt edici olan alan.
     * @return Kayýt var ise true deðilse false döner.
     */
    public boolean urunSil(int urunID);
    
    
    /**
     * UrunNo ya karýýk gelen bilgileri yeni bilgiler ile deðiýtirir.
     * @param urunAdi Urun için ayýr edici olan alan.
     * @param yeniUrun Güncelennecek olan bilgiler.
     */
    public boolean urunGuncelle(int urunID , Urun yeniUrun);
    
    
    /**
     * Satýlan ürünün veritabanýndaki bilgileri günceller.
     * @param urunAdi ürün için ayýrt edici olan alan
     * @param miktar Satýlan ürün miktarý.
     */
    public void urunSat(int urunID, int miktar);
    
    
    /**
     * Alýnan ürünün veritabanýndaki bilgileri günceller.
     * @param miktar Alýnan ürün miktarý.
     */
    public void urunAl(int urunID, int miktar);
    
}
