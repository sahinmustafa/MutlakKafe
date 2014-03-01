
package controller.urun;

import model.urun.Urun;
import java.util.List;

/**
 *
 * @author MustafaS
 */
public interface UrunI{
    
    
    /**
     * Urun bilgilerini veritaban�na ekler
     * @param urun: Urun bilgisinin bulundu�u URUN tipinde nesne.
     */
    public void urunEkle(Urun urun);
    
    
    /**
     * Ur�n bilgilerinin bulundu�u bir liste olu�turur.
     * @return �r�n listesi
     */
    public List<Urun> urunListesi();
    
    
    /**
     * Gelen �r�nNosuna kar��l�k gelen sat�r� siler.
     * @param urunAdi Urun icin ay�rt edici olan alan.
     * @return Kay�t var ise true de�ilse false d�ner.
     */
    public boolean urunSil(int urunID);
    
    
    /**
     * UrunNo ya kar��k gelen bilgileri yeni bilgiler ile de�i�tirir.
     * @param urunAdi Urun i�in ay�r edici olan alan.
     * @param yeniUrun G�ncelennecek olan bilgiler.
     */
    public boolean urunGuncelle(int urunID , Urun yeniUrun);
    
    
    /**
     * Sat�lan �r�n�n veritaban�ndaki bilgileri g�nceller.
     * @param urunAdi �r�n i�in ay�rt edici olan alan
     * @param miktar Sat�lan �r�n miktar�.
     */
    public void urunSat(int urunID, int miktar);
    
    
    /**
     * Al�nan �r�n�n veritaban�ndaki bilgileri g�nceller.
     * @param miktar Al�nan �r�n miktar�.
     */
    public void urunAl(int urunID, int miktar);
    
}
