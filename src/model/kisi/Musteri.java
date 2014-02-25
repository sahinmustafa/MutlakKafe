package model.kisi;

/**
 *
 * @author MustafaS
 */
public class Musteri extends Kisi{
    private int kredi;
    private int harcanan;
    private float borc;
    private int indrim;
    
    
    @Override
    public boolean girisYap(String kullaniciAdi, String sifre){
        return true;
    }
 
}
