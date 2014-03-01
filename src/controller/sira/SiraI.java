package controller.sira;

import java.util.List;

import model.sira.Sira;

public interface SiraI {

	/**
     * Gelen sira nesnesini veritabanýna kayýt eder.
     * @param sira : Sira bilgilerinin tutulduðu nesne
     * 
     */
	public void ekle(Sira sira);
	
	
	/**
     * Gelen sira nesnesi bilgilerini var olan bilgiler ile deðiþtirir
     * @param sira : Sira bilgilerinin tutulduðu nesne
     * @param siraID : Sira için ayýr edici deðiþken
     * @return :Sýra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean bilgiGuncelle(Sira sira, int siraID);
	
	
	/**
     * Gelen siraID ye karþýlýk gelen sira bilgilerini siler
     * @param siraID : Sira için ayýr edici deðiþken
     * @return :Sýra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean sil(int siraID);
	
	
	/**
     * Bütün sira bilgilerini getirir
     * @return :Sira bilgileri util.List tipinde geriye döner
     * 
     */
	public List<Sira> liste();
	
	
	/**
     * Gelen sira ID ye karþýlýk gelen alaný belirtilen miktar kadar uzatýr
     * @param siraID : Sira için ayýr edici deðiþken
     * @param saat : Uzatýlacak saat miktarý
     * @param dakika : Uzatýlacak dakika miktarý
     * @return :Sýra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean sureUzat(int siraID, int saat, int dakika);
	
	
	
	
}
