package listener.courierlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import presentation.courierui.CourierMenuUI;

public class CourierMenuListener implements ActionListener {
	CourierMenuUI menu;
	CardLayout card;
	JPanel panel;

	public CourierMenuListener(CourierMenuUI courierMenuUI, CardLayout card, JPanel panel1) {
		this.menu = courierMenuUI;
		this.card = card;
		this.panel = panel1;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getButton1()) {
			card.show(panel, "0");

		} else if (e.getSource() == menu.getButton2()) {
			card.show(panel, "1");
		} else {
			card.show(panel, "2");
		}

	}

}
