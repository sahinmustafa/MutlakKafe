package mutlakkafe;

import view.GirisV;
import controller.MainC;


public class MutlakKafe {

	public static MainC mainCont;
		 
    public static void main(String[] args) {
        mainCont = new MainC();

        GirisV g = new GirisV();
        g.show();
        
    }
}
	