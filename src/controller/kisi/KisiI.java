
package controller.kisi;

import model.kisi.Kisi;

/**
 *
 * @author MustafaS
 */
public interface KisiI {
    
    /**
     * Kullaný adý ve þifre alarak kiþinin kayýtlý olup olmadýðýný kontrol eder.
     * @param kullaniciAdi: Kullaný Adý
     * @param sifre : Þifre
     * @return Kullaný adý ve þifre doðru ise true, deðilse false
     */
    public boolean girisYap(String kullaniciAdi, String sifre);
    
    
    /**
     * Kullanýya ait bilgileri getirir.
     * @param kullaniciAdi : Kullaný adý
     * @return : Kullaný adýna karþýlýk gelen bilgileri 
     *          Kiþi nesnesi þeklinde getirir.
     */
    public void bilgileriGetir(String kullaniciAdi);
    
    
    /**
     * Kiþi bilgisini siler.
     * @param kullaniciAdi : Kullaný Adý
     * @return : Kullaný adýna karþýlýk gelen alaný siler.
     *          Ve geriye true dönderir
    */
    public boolean hesapSil(String kullaniciAdi);
    
    
    /**
     * Kiþi bilgilerini günceller. 
     * @param Kisi : Yeni kiþi bilgisi
     * @param  KullaniciAdi : Kullaný adý.
     *                      Eðer güncellenmiþ ise eski kullaný adý
     * @return : Kullaný adýna karþýlýk gelen alaný günceller. 
    */
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi);
    
    
}
