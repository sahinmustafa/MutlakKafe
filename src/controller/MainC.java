package controller;

import java.util.ArrayList;

import controller.kisi.KisiC;
import controller.urun.UrunC;
import model.bilgisayar.Bilgisayar;

public class MainC {
	private ArrayList <Bilgisayar> bilgisayarlar;
    
    private KisiC kisiCont;
    private UrunC urunCont;

    public MainC(){
        bilgisayarlar = new ArrayList<Bilgisayar>();
        
        kisiCont = new KisiC();
        urunCont = new UrunC();
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

    public void setKisiCont(KisiC kisiCont) {
        this.kisiCont = kisiCont;
    }

    public UrunC getUrunCont() {
        return urunCont;
    }

}
