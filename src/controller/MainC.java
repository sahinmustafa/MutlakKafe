package controller;

import java.util.ArrayList;

import controller.kisi.KisiC;
import controller.sira.SiraC;
import controller.urun.UrunC;
import model.bilgisayar.Bilgisayar;

public class MainC {
	private ArrayList <Bilgisayar> bilgisayarlar;
    
    private KisiC kisiCont;
    private UrunC urunCont;
    private SiraC siraCont;

    public MainC(){
        bilgisayarlar = new ArrayList<Bilgisayar>();
        
        kisiCont = new KisiC();
        urunCont = new UrunC();
        siraCont = new SiraC();
    }
    
    
    
    public ArrayList<Bilgisayar> getBilgisayarlar() {
        return bilgisayarlar;
    }

    public void setBilgisayarlar(ArrayList<Bilgisayar> bilgisayarlar) {
        this.bilgisayarlar = bilgisayarlar;
    }

    public KisiC getKisiCont() {
        return kisiCont;
    }

    public UrunC getUrunCont() {
        return urunCont;
    }

	public SiraC getSiraCont() {
		return siraCont;
	}

    

}
