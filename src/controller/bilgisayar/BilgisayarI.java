package controller.bilgisayar;

import model.bilgisayar.Bilgisayar;

public interface BilgisayarI {
	
	/**
     * Gelen masa adýna ait masa oluþturur.
     * @param masaAdi: Yeni oluþturulacak masa adý
     * @return Masa baþarýlý bir þekilde oluþturulursa true
     */
    boolean masaEkle(String masaAdi);
    
    /**
     * Gelen isme ait masayý bulur ve siler
     * @param masaAdi: Silinecek masa adý
     * @return Masa baþarýlý bir þekilde silinirse true
     */
    boolean masaSil(String masaAdi);
	
	
	/**
     * Gelen masa adýna ait bilgisayarý bulur ve açar
     * @param masaAdi: Kayýtlý masa adý
     * @return Masa açýlma iþlemi baþarýlý ise true döner.
     */
    public boolean masaAc(String masaAdi);
    
    
    /**
     * Gelen masa adýna ait bilgisayarý bulur dönderir (!!private metod olmasý)
     * @param masaAdi: Kayýtlý masa adý
     * @return Masa adý bulunamazsa null, bulunursa ilgili bilgisayarý dönderir
     */
    Bilgisayar masaBul(String masaAdi);
}
