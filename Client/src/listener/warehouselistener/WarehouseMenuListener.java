package listener.warehouselistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.warehouseui.WarehouseMenuUI;

public class WarehouseMenuListener implements ActionListener{
    CardLayout card;
    WarehouseMenuUI panel;
    private JPanel panel1;
	public WarehouseMenuListener(WarehouseMenuUI panel,CardLayout card, JPanel panel1){
		this.panel=panel;
		this.card=card;
		this.panel1=panel1;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==panel.getButton1()){
			card.show(panel1, "0");
		}else if(e.getSource()==panel.getButton2()){
			card.show(panel1, "1");
		}else if(e.getSource()==panel.getButton3()){
			card.show(panel1, "2");
		}else if(e.getSource()==panel.getButton4()){
			card.show(panel1, "3");
		}
		
	}

}
