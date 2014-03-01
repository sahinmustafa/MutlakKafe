package controller;

import java.util.ArrayList;

import controller.bilgisayar.BilgisayarC;
import controller.kisi.KisiC;
import controller.urun.UrunC;
import model.bilgisayar.Bilgisayar;

public class MainC {
    
    private KisiC kisiCont;
    private UrunC urunCont;
    private BilgisayarC bilgisayarC;

    public MainC(){        
        kisiCont = new KisiC();
        urunCont = new UrunC();
        bilgisayarC = new BilgisayarC();
    }
    
    
    
    
    
    /****************************************************/

    public KisiC getKisiCont() {
        return kisiCont;
    }

    public void setKisiCont(KisiC kisiCont) {
        this.kisiCont = kisiCont;
    }

    public UrunC getUrunCont() {
        return urunCont;
    }

    public void setUrunCont(UrunC urunCont) {
		this.urunCont = urunCont;
	}
    
	public BilgisayarC getBilgisayarC() {
		return bilgisayarC;
	}

	public void setBilgisayarC(BilgisayarC bilgisayarC) {
		this.bilgisayarC = bilgisayarC;
	}  
    

}
