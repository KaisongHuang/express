package listener.warehouselistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.warehouseui.WarehouseMenuUI;

public class WarehouseMenuListener implements ActionListener,MouseListener{

	WarehouseMenuUI panel;
    private CardLayout card;
    private JPanel panel1;

    private boolean button1_clicked=true;
  	private boolean button2_clicked=false;
  	private boolean button3_clicked=false;
  	private boolean button4_clicked=false;

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
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
