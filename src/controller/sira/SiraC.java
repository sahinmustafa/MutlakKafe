package controller.sira;

import java.awt.HeadlessException;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.hibernate.HibernateException;

import model.sira.Sira;

public class SiraC implements SiraI{

	
	
	
	public void ekle(Map<String, String> maps){
		try {
			String ad = maps.get("ad");
			String soyad = maps.get("soyad");
			int telefon = Integer.parseInt(maps.get("telefon"));
			int siraNo = Integer.parseInt(maps.get("siraNo"));
			int masaNo = Integer.parseInt(maps.get("masaNo"));
			String baslangicZamani = maps.get("baslangicSaat") + ":" + maps.get("baslangicDk");
			String bitisZamani = maps.get("bitisSaat") + ":" + maps.get("bitisDk");
			
			Sira siraBilgisi = new Sira(telefon, ad, soyad, 
					siraNo, masaNo, baslangicZamani, bitisZamani);
			
			System.out.println(siraBilgisi);
			
			ekle(siraBilgisi);
			
		} catch (NumberFormatException ex) {
			
			JOptionPane.showMessageDialog(null, "Lütfen gerekli alanlarý düzgün bir þekilde doldurunuz", 
					"Hata", JOptionPane.ERROR_MESSAGE);
	
		}
		
	}
	
	
	@Override
	public void ekle(Sira sira) {

		if(sira.getAd().equals("") || sira.getSoyad().equals("") 
				|| sira.getBaslangicSaat().equals("") || sira.getBitisSaat().equals("")){
			
			JOptionPane.showMessageDialog(null, "Lütfen gerekli alanlarý doldurunuz", 
					"Hata", JOptionPane.ERROR_MESSAGE);
			
			return ;
		}
		
		try {
			sira.ekle(sira);
			JOptionPane.showMessageDialog(null, "Sýra bilgileri baþarý ile eklendi!",
					"Sýra Eklendi", JOptionPane.INFORMATION_MESSAGE);
		
			
		} catch (HibernateException e) {
			JOptionPane.showMessageDialog(null, "Sýra bilgileri ekleme sýrasýnda bir hata oluþtu",
					"Hata", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

	@Override
	public boolean bilgiGuncelle(Sira sira, int siraID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sil(int siraID) {
		
		int sonuc = JOptionPane.showConfirmDialog(null, "Sýrayý silmek istedðinize emin misiniz?",
				"Sil", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if(sonuc != JOptionPane.YES_OPTION)
			return false;
			
		try {
			Sira sira = new Sira();
			
			if(sira.sil(siraID)){
				JOptionPane.showMessageDialog(null, "Sýra bilgileri silindi",
						"Sil", JOptionPane.INFORMATION_MESSAGE);
				return true;
			}
			
			JOptionPane.showMessageDialog(null, siraID + " 'nolu sira bilgileri bulunamadý!", 
					"Hata", JOptionPane.ERROR_MESSAGE);
			
			return false;
		} catch (HibernateException e) {
			JOptionPane.showMessageDialog(null, "Silme esnasýnda bir hata oluþtu",
					"Hata",JOptionPane.ERROR_MESSAGE);
			
			return false;
		}
		
	}

	public DefaultTableModel listModel(){
		
		DefaultTableModel dtm = new DefaultTableModel();
		
		dtm.addColumn("Ad");
		dtm.addColumn("Soyad");
		dtm.addColumn("Telefon");
		dtm.addColumn("Sýra No");
		dtm.addColumn("Masa No");
		dtm.addColumn("Baþlangýç Saati");
		dtm.addColumn("Bitiþ Saati");
		
		List<Sira> siraList = liste();
		
		for(Sira s : siraList){
			dtm.addRow(new String[]{s.getAd(), 
									s.getSoyad(), 
									s.getTelefon() + "", 
									s.getSiraNo() + "", 
									s.getMasaNo() + "", 
									s.getBaslangicSaat(), 
									s.getBitisSaat()
									});
			
		}
		 
		return dtm;
		
	}
	
	
	@Override
	public List<Sira> liste() {
		
		try{
		
			Sira sira = new Sira();
			
			return sira.liste();
		
		}catch(HibernateException ex){
			JOptionPane.showMessageDialog(null, "Listeleme esnasýnda bir hata oluþtu",
					"Hata", JOptionPane.ERROR_MESSAGE);

			return null;
		}
	}

	@Override
	public boolean sureUzat(int siraID, int saat, int dakika) {

		try{
			
			Sira sira = new Sira();
			
			if(sira.sureUzat(siraID, saat, dakika)){
				JOptionPane.showMessageDialog(null, "Süre uzatýldý!", ""
						+ "Süre uzat", JOptionPane.INFORMATION_MESSAGE);
				return true;
			}
			
			JOptionPane.showMessageDialog(null, siraID + " 'nolu sira bilgileri bulunamadý!", 
					"Hata", JOptionPane.ERROR_MESSAGE);
			
			return false;
			
		}catch(HibernateException ex){
			JOptionPane.showMessageDialog(null, "Süre uzatma esnasýnda bir hata meydana geldi", 
					"Hata", JOptionPane.ERROR_MESSAGE);
			
			return false;
		}
		
	}

}
