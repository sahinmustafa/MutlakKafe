/*
        MEVCUT FONKSÄ°YONLAR :

    public void init(String [] masaAdlari); - Ä°lk açýlýþta masalarýn oluþturulmasý
    public void masaEkle(String masaAdi); - Ã‡alýþma esnasýnda masa oluþturma
    public void masaSil(String masaAdi); - Ã‡alýþma esnasýnda masanýn silinmesi
    private JLabel masaBul(String masaAdi); - Masanýn adýndan masa Labelini getirir

    public enum Durum {ACIK, KAPALI, SURELI};
    public void durumDegis(String masaAdi, Durum durum); - Masanýn görüntüsünü deÄŸiþtirir.
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

    
    //Açýlýþtaki masalarýn labellerini oluþturarak ekler
    public void init(String [] masaAdlari){        
        //FlowLayout için padding deÄŸerleri ( _ , Pad1, Pad2)
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 20, 20);
        //Layoutu hangi nesne için kullanacaÄŸýmýz. Direk eklemek için getContntPane().setLayout(_);
        this.setLayout(layout);
        // FlowLayoutun sola veya saÄŸa göre konumlandýrmasýný saÄŸlar
        //this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

         
        
        //Masalarýn eklenmesi
        for(int i=0; i<masaAdlari.length; i++){
            masaEkle(masaAdlari[i]);
        }

    }
    
    //Program çalýþma esnasýnda kapalý halde yeni bir masa ekler
    public void masaEkle(String masaAdi){
            
            JLabel jLabel1 = new JLabel();
        
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kapali.png"))); 
            jLabel1.setText(masaAdi);
            jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            
            //Bilgisayarlarýn etrafýna padding ekleme 
            javax.swing.border.Border paddingBorder = javax.swing.BorderFactory.createEmptyBorder(10,10,10,10);
            jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null,paddingBorder));
            
            
            //Mouse listener ekle, týklandýÄŸýnda jLabelMouseClicked çalýþmasý için
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    jLabelMouseClicked(evt);
                }
             });
            
            
            //Label popup ekleme 
            jLabel1.setComponentPopupMenu(getPopUpMenu(jLabel1.getText()));
                 
        
            //Bilgisayar controllerinde bilgisayarý oluþturur. Baþarýlý ise viewe ekle
            if(mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaEkle(masaAdi)){
            	//labeli labeller dizisine atar
            	labeller.add(jLabel1);
            	//Oluþturulan labeli konteynýrýna ekler
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
        //Eski seçili bilgisayarý varsayýlan haline getir
        if(seciliLabel!=null){
            seciliLabel.setForeground(Color.black);
            seciliLabel.setOpaque(false);
        }
        
        //Týklanýlan nesneyi al
        seciliLabel = yeniLabel;
        
        //yeni seçili nesnenin arkaplanýný gri yap
        seciliLabel.setOpaque(true);
        seciliLabel.setForeground(Color.blue);
        seciliLabel.setBackground(Color.lightGray);
        
        //!!!!seçili bilgisayar bilgilerini göster
    }
    
    //Program çalýþma esnasýnda bir masayý siler
    public void masaSil(String masaAdi){
        JLabel jLabel1 = masaBul(masaAdi);
    
        if(mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaSil(masaAdi)){
        	labeller.remove(jLabel1); 
            //Silinen labeli konteynýrýndan siler
            this.remove(jLabel1);
        }          
    }
  
    //Masa isminden masaya ait JLabel nesnesini döndürür
    private JLabel masaBul(String masaAdi){
        for(int i=0;i<labeller.size();i++){
            if(labeller.get(i).getText() == masaAdi){
                return labeller.get(i);
            }
        }
        return null;
    }
    
    
    //Duruma göre masaya ait iconu günceller
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
            //System.out.println(seciliLabel.getText()+ "["+ event.getActionCommand() + "] týklandý");            
            switch(event.getActionCommand()){
            	case "Masa Aç":
            		masaAc(seciliLabel.getText());
            		System.out.println(seciliLabel.getText()+ "Açýldý");
            		break;
            	case "Masa Kapat":
            		System.out.println(seciliLabel.getText()+ "Kapandý");
            		break;
            	case "Süreli Aç":
            		break;
            }
        }
    };
    
    //Popup menu içeriði
    private JPopupMenu getPopUpMenu(String masaAdi){
        String [] liste = {"-","Masa Aç", "Süreli Aç","Masa Kapat"};
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
