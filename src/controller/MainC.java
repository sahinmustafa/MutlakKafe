package controller;

import controller.bilgisayar.BilgisayarC;
import controller.kisi.KisiC;
import controller.sira.SiraC;
import controller.urun.UrunC;

public class MainC {
    
    private KisiC kisiCont;
    private UrunC urunCont;

    private SiraC siraCont;

    private BilgisayarC bilgisayarC;


    public MainC(){        
        kisiCont = new KisiC();
        urunCont = new UrunC();

        siraCont = new SiraC();

        bilgisayarC = new BilgisayarC();

    }
    
    
    
    
    
    /****************************************************/

    public KisiC getKisiCont() {
        return kisiCont;
    }

    public UrunC getUrunCont() {
        return urunCont;
    }

	public SiraC getSiraCont() {
		return siraCont;
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
