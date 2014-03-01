package model.bilgisayar;

import model.kisi.Musteri;
import model.urun.*;

import java.util.ArrayList;
import java.util.Date;


public class Bilgisayar {
    //private Socket client;
    private String masaAdi;
    private Date acilisSaati;
    private Musteri musteri;
    private int sureSiniri;
    private ArrayList <Siparis> siparisler;
 
   
    public Bilgisayar(String masaAdi) {
		super();
		this.masaAdi = masaAdi;
	}

    
    /* masaAc overloadlarý baþlangýç */
	public boolean masaAc(){
        //try { client.masaAc; return true; } catch { return false; }
        acilisSaati = new Date();
        return true;
    }
    
    public boolean masaAc(int sureSiniri){
        masaAc();
        this.sureSiniri = sureSiniri;
        return true;
    }
    
    public boolean masaAc(Musteri musteri){
        masaAc();
        this.musteri = musteri;
        return true;
    }
    /* masaAc overloadlarý bitiþ */
    
    public boolean siparisEkle(Urun urun, int miktar){
    	siparisler.add(new Siparis(urun,miktar));
    	return true;
    }
    
    //geçen süreyi mikrosaniye cinsinden dönderir (1000 micsn = 1 sn)
    public long gecenSureHesapla(){
        return new Date().getTime() - acilisSaati.getTime();
    }

	public String getMasaAdi() {
		return masaAdi;
	}

	public void setMasaAdi(String masaAdi) {
		this.masaAdi = masaAdi;
	}

	public Date getAcilisSaati() {
		return acilisSaati;
	}

	public void setAcilisSaati(Date acilisSaati) {
		this.acilisSaati = acilisSaati;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public int getSureSiniri() {
		return sureSiniri;
	}

	public void setSureSiniri(int sureSiniri) {
		this.sureSiniri = sureSiniri;
	}

	public ArrayList<Siparis> getSiparisler() {
		return siparisler;
	}

	public void setSiparisler(ArrayList<Siparis> siparisler) {
		this.siparisler = siparisler;
	}
    
    
}
