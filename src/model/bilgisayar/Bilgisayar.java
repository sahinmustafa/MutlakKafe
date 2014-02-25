package model.bilgisayar;

import model.kisi.Musteri;
import model.urun.Siparis;

import java.util.ArrayList;
import java.util.Date;


public class Bilgisayar {
    //private Socket client;
    private String masaAdi;
    private Date acilisSaati;
    private Musteri musteri;
    private int sureSiniri;
    private ArrayList <Siparis> siparisler;
 
    
    /* masaAc overloadları başlangıç */
    
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
    /* masaAc overloadları bitiş */
    
    //geçen süresi mikrosaniye cinsinden dönderir (1000 micsn = 1 sn)
    public long gecenSureHesapla(){
        return new Date().getTime() - acilisSaati.getTime();
    }
}
