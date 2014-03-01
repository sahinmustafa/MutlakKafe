package controller.bilgisayar;

import java.util.ArrayList;

import model.bilgisayar.Bilgisayar;

public class BilgisayarC implements BilgisayarI{
	
	private ArrayList <Bilgisayar> bilgisayarlar;
	
	
	
	public BilgisayarC() {
		super();
		bilgisayarlar = new ArrayList<Bilgisayar>();
	}

	@Override 
	public boolean masaEkle(String masaAdi){
		bilgisayarlar.add(new Bilgisayar(masaAdi));
		//başarılı ise (bilgisayar sayısı 1 arttıysa kontrolü)
		return true;
	}

	@Override
	public boolean masaSil(String masaAdi){
		bilgisayarlar.remove(masaBul(masaAdi));
		//başarılı ise (bilgisayar sayısı 1 azaldıysa kontrolü)
		return true;
	}
	
	
	@Override
    public boolean masaAc(String masaAdi){
    	Bilgisayar b = masaBul(masaAdi);
    	if(b != null){
    		if(b.masaAc()){
    			return true;
    		}
    	}
    	return false;
	}
    
    
	@Override
    public Bilgisayar masaBul(String masaAdi){
    	for (Bilgisayar b : bilgisayarlar) {
			if(b.getMasaAdi() == masaAdi)
				return b;
		}
    	return null;
    }
}
