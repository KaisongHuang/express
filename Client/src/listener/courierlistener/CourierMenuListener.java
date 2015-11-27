package listener.courierlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.courierui.CourierMenuUI;

public class CourierMenuListener implements ActionListener{
	CourierMenuUI menu;
    public CourierMenuListener(CourierMenuUI menu){
    	this.menu=menu;
    }
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu.getButton1()){
			CardLayout card=menu.getCard();
			
		}
		else if(e.getSource()==menu.getButton2()){
			CardLayout card=menu.getCard();
		}else{
			CardLayout card=menu.getCard();
		}
		
	}

}
