package listener.warehouselistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import presentation.warehouseui.WarehouseMenuUI;

public class WarehouseMenuListener implements ActionListener{
    CardLayout card;
    WarehouseMenuUI panel;
	public WarehouseMenuListener(WarehouseMenuUI panel,CardLayout card){
		this.panel=panel;
		this.card=card;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==panel.getButton1()){
			
		}else if(e.getSource()==panel.getButton2()){
			
		}else if(e.getSource()==panel.getButton3()){
			
		}else if(e.getSource()==panel.getButton4()){
			
		}else if(e.getSource()==panel.getButton5()){
			
		}
		
	}

}