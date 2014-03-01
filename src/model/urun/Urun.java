package model.urun;

import hibernate.HbmIslemler;
import controller.urun.UrunI;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;

/**
 *
 * @author MustafaS
 */
public class Urun implements UrunI{
       
    private int barkod,stok, urunID;
    private double birimFiyat;
    private String urunAdi;
    
    public Urun(){}

    public Urun(int barkod, int stok, double birimFiyat, String urunAdi) {
        this.barkod = barkod;
        this.stok = stok;
        this.birimFiyat = birimFiyat;
        this.urunAdi = urunAdi.toUpperCase();
    }
    
    
    
    @Override
    public void urunEkle(Urun urun) {
        
        HbmIslemler hbm = new HbmIslemler();        
        hbm.ekle(urun);
    }

    @Override
    public List<Urun> urunListesi() {
        
        HbmIslemler hbm = new HbmIslemler();
        ArrayList<Urun> list =  (ArrayList<Urun>) hbm.list("from Urun");
        
        return list;
    }

    @Override
    public boolean urunSil(int urunID) {
        
        HbmIslemler hbm = new HbmIslemler();
        
        try {
            return hbm.sil(urunID, Urun.class);
        } catch (HibernateException ex) {         
            ex.printStackTrace();
            throw ex;
        }         
    }

    @Override
    public boolean urunGuncelle(int urunID, Urun yeniUrun) {
        
        HbmIslemler hbm = new HbmIslemler();
        
        try{
        	
            return hbm.guncelle(urunID, yeniUrun);
        }catch(HibernateException ex){
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void urunSat(int urunID, int miktar) {
        
        HbmIslemler hbm = new HbmIslemler();
        Urun urun = (Urun) hbm.bilgiGetir(urunID, getClass());
        
        int yeniStok = urun.getStok() - miktar;
        
        urun.setStok(yeniStok);
        hbm.guncelle(urunID, urun);
               
    }

    @Override
    public void urunAl(int urunID, int miktar) {
        
        HbmIslemler hbm = new HbmIslemler();        
        Urun urun = (Urun) hbm.bilgiGetir(urunID, getClass());
        
        int yeniMiktar = urun.getStok() + miktar;        
        urun.setStok(yeniMiktar);
        hbm.guncelle(urunID, urun);        
    }
    
    
    
    //GETTER AND SETTER
    
    
    public int getBarkod() {
        return barkod;
    }

    public int getUrunID() {
		return urunID;
	}

	public void setUrunID(int urunID) {
		this.urunID = urunID;
	}

	public void setBarkod(int barkod) {
        this.barkod = barkod;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    
    
    
    
}
