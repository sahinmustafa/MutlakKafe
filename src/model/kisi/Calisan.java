
package model.kisi;

import hibernate.HbmIslemler;
import java.util.List;

/**
 *
 * @author MustafaS
 */
public class Calisan extends Kisi{
    private String adres;
    private float maas;
    private int tip;
    
    
     @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
     
         String hql ="from Kisi "
                 + "where kullaniciAdi = '" + kullaniciAdi 
                 + "' and sifre = '" + sifre + "'";
         
         HbmIslemler hbm = new HbmIslemler();
         List<Kisi> calisan = (List<Kisi>) hbm.list(hql);

        if(calisan.size() > 0)
            return true; 
        
        return false;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
     
     
     
}
