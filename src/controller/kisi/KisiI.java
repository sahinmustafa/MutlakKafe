
package controller.kisi;

import model.kisi.Kisi;

/**
 *
 * @author MustafaS
 */
public interface KisiI {
    
    /**
     * Kullan� ad� ve �ifre alarak ki�inin kay�tl� olup olmad���n� kontrol eder.
     * @param kullaniciAdi: Kullan� Ad�
     * @param sifre : �ifre
     * @return Kullan� ad� ve �ifre do�ru ise true, de�ilse false
     */
    public boolean girisYap(String kullaniciAdi, String sifre);
    
    
    /**
     * Kullan�ya ait bilgileri getirir.
     * @param kullaniciAdi : Kullan� ad�
     * @return : Kullan� ad�na kar��l�k gelen bilgileri 
     *          Ki�i nesnesi �eklinde getirir.
     */
    public void bilgileriGetir(String kullaniciAdi);
    
    
    /**
     * Ki�i bilgisini siler.
     * @param kullaniciAdi : Kullan� Ad�
     * @return : Kullan� ad�na kar��l�k gelen alan� siler.
     *          Ve geriye true d�nderir
    */
    public boolean hesapSil(String kullaniciAdi);
    
    
    /**
     * Ki�i bilgilerini g�nceller. 
     * @param Kisi : Yeni ki�i bilgisi
     * @param  KullaniciAdi : Kullan� ad�.
     *                      E�er g�ncellenmi� ise eski kullan� ad�
     * @return : Kullan� ad�na kar��l�k gelen alan� g�nceller. 
    */
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi);
    
    
}
