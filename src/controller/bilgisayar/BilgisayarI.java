package controller.bilgisayar;

import model.bilgisayar.Bilgisayar;

public interface BilgisayarI {
	
	/**
     * Gelen masa ad�na ait masa olu�turur.
     * @param masaAdi: Yeni olu�turulacak masa ad�
     * @return Masa ba�ar�l� bir �ekilde olu�turulursa true
     */
    boolean masaEkle(String masaAdi);
    
    /**
     * Gelen isme ait masay� bulur ve siler
     * @param masaAdi: Silinecek masa ad�
     * @return Masa ba�ar�l� bir �ekilde silinirse true
     */
    boolean masaSil(String masaAdi);
	
	
	/**
     * Gelen masa ad�na ait bilgisayar� bulur ve a�ar
     * @param masaAdi: Kay�tl� masa ad�
     * @return Masa a��lma i�lemi ba�ar�l� ise true d�ner.
     */
    public boolean masaAc(String masaAdi);
    
    
    /**
     * Gelen masa ad�na ait bilgisayar� bulur d�nderir (!!private metod olmas�)
     * @param masaAdi: Kay�tl� masa ad�
     * @return Masa ad� bulunamazsa null, bulunursa ilgili bilgisayar� d�nderir
     */
    Bilgisayar masaBul(String masaAdi);
}
