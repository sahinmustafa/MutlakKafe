package model.urun;


public class Siparis {
    private Urun urun;
    private int miktar;
    
    
    
	public Siparis(Urun urun, int miktar) {
		super();
		this.urun = urun;
		this.miktar = miktar;
	}
	
	
	public Urun getUrun() {
		return urun;
	}
	public void setUrun(Urun urun) {
		this.urun = urun;
	}
	public int getMiktar() {
		return miktar;
	}
	public void setMiktar(int miktar) {
		this.miktar = miktar;
	}
    
    
}
