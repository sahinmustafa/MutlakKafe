
package model.kisi;

import controller.kisi.KisiI;
import java.sql.Timestamp;

/**
 *
 * @author MustafaS
 */
public  class Kisi implements KisiI{
    private int kisiId;
    private String ad;
    private String soyad;
    private String telefon;
    private String kullaniciAdi;
    private String sifre;
    private Timestamp kayitTarihi;
    
    
    public Kisi(){}

    public Kisi(int kisiId, String ad, String soyad, String telefon, int tip) {
        this.kisiId = kisiId;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
    }

   
     @Override
    public  boolean girisYap(String kullaniciAdi, String sifre){return false;}
     
    @Override
    public void bilgileriGetir(String kullaniciAdi) {
        //String sql = "SELECT * from kisi where kullaniiAdi = '"+ kullaniciAdi +"'";
        //Hilbernate
        this.kisiId = 1;
        this.ad = "Mustafa";
        this.soyad = "Þahin";
        this.telefon = "1234";
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        return true;
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        return true;
    }

    public int getKisiId() {
        return kisiId;
    }

    public void setKisiId(int kisiId) {
        this.kisiId = kisiId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Timestamp getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Timestamp kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
    
    
    
}
