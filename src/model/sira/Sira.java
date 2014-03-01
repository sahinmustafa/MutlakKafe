
package model.sira;

import hibernate.HbmIslemler;

import java.util.List;

import org.hibernate.HibernateException;

import controller.sira.SiraI;

/**
 *
 * @author MustafaS
 */
public class Sira implements SiraI{
    private int telefon;
    private String ad;
    private String soyad;
    private int siraNo;
    private int masaNo;
    private String baslangicSaat;
    private String bitisSaat;
    
    public Sira(){}
    
    
    
    public Sira(int telefon, String ad, String soyad, int siraNo, int masaNo,
			String baslangicSaat, String bitisSaat) {
		super();
		this.telefon = telefon;
		this.ad = ad;
		this.soyad = soyad;
		this.siraNo = siraNo;
		this.masaNo = masaNo;
		this.baslangicSaat = baslangicSaat;
		this.bitisSaat = bitisSaat;
	}



	@Override
	public void ekle(Sira sira) {
		try {
			HbmIslemler hbm = new HbmIslemler();
			hbm.ekle(sira);
		} catch (HibernateException e) {
			throw e;
		}
		
	}


	@Override
	public boolean bilgiGuncelle(Sira sira, int siraID) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean sil(int siraID) {
		
		try {
			HbmIslemler hbm = new HbmIslemler();
			return hbm.sil(siraID, this.getClass());
		} catch (HibernateException e) {
			throw e;
		}
		
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Sira> liste() {

		try {
			HbmIslemler hbm = new HbmIslemler();
			
			return (List<Sira>) hbm.list("from Sira");
			
		} catch (HibernateException e) {
			throw e;
		}	
	}


	@Override
	public boolean sureUzat(int siraID, int saat, int dakika) {
	
		try {
			HbmIslemler hbm = new HbmIslemler();
			
			Sira siraBilgisi = (Sira) hbm.bilgiGetir(siraID , this.getClass());
			
			if(siraBilgisi == null)
				return false;
			
			saat += Integer.parseInt(siraBilgisi.getBaslangicSaat().split(":")[0]);
			dakika += Integer.parseInt(siraBilgisi.getBaslangicSaat().split(":")[1]);
			
			if(dakika > 59){
				saat ++;
				dakika -= 60;
			}
			
			siraBilgisi.setBaslangicSaat(saat + " : " + dakika);
			
			return this.bilgiGuncelle(siraBilgisi, siraID);
		
		} catch (HibernateException e) {
			throw e;
		}
		
	}
	
	

    
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
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
	public int getSiraNo() {
		return siraNo;
	}
	public void setSiraNo(int siraNo) {
		this.siraNo = siraNo;
	}
	public int getMasaNo() {
		return masaNo;
	}
	public void setMasaNo(int masaNo) {
		this.masaNo = masaNo;
	}
	public String getBaslangicSaat() {
		return baslangicSaat;
	}
	public void setBaslangicSaat(String baslangicSaat) {
		this.baslangicSaat = baslangicSaat;
	}
	public String getBitisSaat() {
		return bitisSaat;
	}
	public void setBitisSaat(String bitisSaat) {
		this.bitisSaat = bitisSaat;
	}



	@Override
	public String toString() {
		return "Sira [telefon=" + telefon + ", ad=" + ad + ", soyad=" + soyad
				+ ", siraNo=" + siraNo + ", masaNo=" + masaNo
				+ ", baslangicSaat=" + baslangicSaat + ", bitisSaat="
				+ bitisSaat + "]";
	}


	    
    
    
    
}
