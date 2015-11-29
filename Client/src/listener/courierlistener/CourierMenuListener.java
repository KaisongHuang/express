package listener.courierlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import presentation.courierui.CourierMenuUI;

public class CourierMenuListener implements ActionListener{
	CourierMenuUI menu;
	CardLayout card;
	JFrame frame;
	public CourierMenuListener(CourierMenuUI courierMenuUI, CardLayout card, JFrame frame) {
		this.menu=courierMenuUI;
		this.card=card;
		this.frame=frame;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu.getButton1()){
			card.show(frame, "0");
			
		}
		else if(e.getSource()==menu.getButton2()){
			card.show(frame, "1");
		}else{
			card.show(frame, "2");
		}
		
	}

}
