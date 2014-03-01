/*
        MEVCUT FONKSİYONLAR :

    public void init(String [] masaAdlari); - İlk a��l��ta masalar�n olu�turulmas�
    public void masaEkle(String masaAdi); - Çal��ma esnas�nda masa olu�turma
    public void masaSil(String masaAdi); - Çal��ma esnas�nda masan�n silinmesi
    private JLabel masaBul(String masaAdi); - Masan�n ad�ndan masa Labelini getirir

    public enum Durum {ACIK, KAPALI, SURELI};
    public void durumDegis(String masaAdi, Durum durum); - Masan�n g�r�nt�s�n� deği�tirir.
*/

package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import mutlakkafe.MutlakKafe;

/**
 *
 * @author yetishbey
 */
public class MasalarV extends javax.swing.JPanel {
    public ArrayList<JLabel> labeller = new ArrayList<JLabel>();
    public JLabel seciliLabel;
    /**
     * Creates new form Masalar
     */
    public MasalarV() {
        initComponents();
    }

    
    //A��l��taki masalar�n labellerini olu�turarak ekler
    public void init(String [] masaAdlari){        
        //FlowLayout i�in padding değerleri ( _ , Pad1, Pad2)
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 20, 20);
        //Layoutu hangi nesne i�in kullanacağ�m�z. Direk eklemek i�in getContntPane().setLayout(_);
        this.setLayout(layout);
        // FlowLayoutun sola veya sağa g�re konumland�rmas�n� sağlar
        //this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

         
        
        //Masalar�n eklenmesi
        for(int i=0; i<masaAdlari.length; i++){
            masaEkle(masaAdlari[i]);
        }

    }
    
    //Program �al��ma esnas�nda kapal� halde yeni bir masa ekler
    public void masaEkle(String masaAdi){
            
            JLabel jLabel1 = new JLabel();
        
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kapali.png"))); 
            jLabel1.setText(masaAdi);
            jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            
            //Bilgisayarlar�n etraf�na padding ekleme 
            javax.swing.border.Border paddingBorder = javax.swing.BorderFactory.createEmptyBorder(10,10,10,10);
            jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null,paddingBorder));
            
            
            //Mouse listener ekle, t�kland�ğ�nda jLabelMouseClicked �al��mas� i�in
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    jLabelMouseClicked(evt);
                }
             });
            
            
            //Label popup ekleme 
            jLabel1.setComponentPopupMenu(getPopUpMenu(jLabel1.getText()));
                 
        
            //Bilgisayar controllerinde bilgisayar� olu�turur. Ba�ar�l� ise viewe ekle
            if(mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaEkle(masaAdi)){
            	//labeli labeller dizisine atar
            	labeller.add(jLabel1);
            	//Olu�turulan labeli konteyn�r�na ekler
                this.add(jLabel1);
            }
            
            
    }
    
    
    private void masaAc(String masaAdi){
    	if(mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaAc(masaAdi)){
     		durumDegis(masaAdi, Durum.ACIK);
    	}
    }
    
    
    private void jLabelMouseClicked(java.awt.event.MouseEvent evt) { 
        seciliMasaDegis((JLabel) evt.getSource());
    }
    
    
    private void seciliMasaDegis(JLabel yeniLabel){
        //Eski se�ili bilgisayar� varsay�lan haline getir
        if(seciliLabel!=null){
            seciliLabel.setForeground(Color.black);
            seciliLabel.setOpaque(false);
        }
        
        //T�klan�lan nesneyi al
        seciliLabel = yeniLabel;
        
        //yeni se�ili nesnenin arkaplan�n� gri yap
        seciliLabel.setOpaque(true);
        seciliLabel.setForeground(Color.blue);
        seciliLabel.setBackground(Color.lightGray);
        
        //!!!!se�ili bilgisayar bilgilerini g�ster
    }
    
    //Program �al��ma esnas�nda bir masay� siler
    public void masaSil(String masaAdi){
        JLabel jLabel1 = masaBul(masaAdi);
    
        if(mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaSil(masaAdi)){
        	labeller.remove(jLabel1); 
            //Silinen labeli konteyn�r�ndan siler
            this.remove(jLabel1);
        }          
    }
  
    //Masa isminden masaya ait JLabel nesnesini d�nd�r�r
    private JLabel masaBul(String masaAdi){
        for(int i=0;i<labeller.size();i++){
            if(labeller.get(i).getText() == masaAdi){
                return labeller.get(i);
            }
        }
        return null;
    }
    
    
    //Duruma g�re masaya ait iconu g�nceller
    public enum Durum {ACIK, KAPALI, SURELI};
    public void durumDegis(String masaAdi, Durum durum){
        JLabel masaLabel = masaBul(masaAdi);
        if(masaLabel != null) {
            switch(durum) {
                case ACIK:
                    masaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/acik.png"))); 
                break;

                case KAPALI:
                     masaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kapali.png")));      
                break;

                case SURELI:
                     masaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/acik.png")));
                break;
            }
        }
    }
    
    //Popup listener
    ActionListener menuListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {
            //System.out.println(seciliLabel.getText()+ "["+ event.getActionCommand() + "] t�kland�");            
            switch(event.getActionCommand()){
            	case "Masa A�":
            		masaAc(seciliLabel.getText());
            		System.out.println(seciliLabel.getText()+ "A��ld�");
            		break;
            	case "Masa Kapat":
            		System.out.println(seciliLabel.getText()+ "Kapand�");
            		break;
            	case "S�reli A�":
            		break;
            }
        }
    };
    
    //Popup menu i�eri�i
    private JPopupMenu getPopUpMenu(String masaAdi){
        String [] liste = {"-","Masa A�", "S�reli A�","Masa Kapat"};
        JPopupMenu popup = new JPopupMenu();
        
        popup.add(masaAdi);
        for (String item : liste) {
            if(item == "-"){
                popup.addSeparator();
            }else{
                JMenuItem menu = new JMenuItem(item);
                menu.addActionListener(menuListener);
                popup.add(menu);
            }
        } 
        return popup;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
