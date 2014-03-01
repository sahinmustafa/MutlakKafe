package controller.sira;

import java.util.List;

import model.sira.Sira;

public interface SiraI {

	/**
     * Gelen sira nesnesini veritaban�na kay�t eder.
     * @param sira : Sira bilgilerinin tutuldu�u nesne
     * 
     */
	public void ekle(Sira sira);
	
	
	/**
     * Gelen sira nesnesi bilgilerini var olan bilgiler ile de�i�tirir
     * @param sira : Sira bilgilerinin tutuldu�u nesne
     * @param siraID : Sira i�in ay�r edici de�i�ken
     * @return :S�ra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean bilgiGuncelle(Sira sira, int siraID);
	
	
	/**
     * Gelen siraID ye kar��l�k gelen sira bilgilerini siler
     * @param siraID : Sira i�in ay�r edici de�i�ken
     * @return :S�ra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean sil(int siraID);
	
	
	/**
     * B�t�n sira bilgilerini getirir
     * @return :Sira bilgileri util.List tipinde geriye d�ner
     * 
     */
	public List<Sira> liste();
	
	
	/**
     * Gelen sira ID ye kar��l�k gelen alan� belirtilen miktar kadar uzat�r
     * @param siraID : Sira i�in ay�r edici de�i�ken
     * @param saat : Uzat�lacak saat miktar�
     * @param dakika : Uzat�lacak dakika miktar�
     * @return :S�ra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean sureUzat(int siraID, int saat, int dakika);
	
	
	
	
}
