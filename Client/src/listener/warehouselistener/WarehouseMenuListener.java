package listener.warehouselistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.warehouseui.WarehouseMenuUI;

public class WarehouseMenuListener implements ActionListener,MouseListener{

	WarehouseMenuUI ui;
    private CardLayout card;
    private JPanel panel1;

    private boolean button1_clicked=true;
  	private boolean button2_clicked=false;
  	private boolean button3_clicked=false;
  	private boolean button4_clicked=false;

	public WarehouseMenuListener(WarehouseMenuUI ui,CardLayout card, JPanel panel1){
		this.ui=ui;
		this.card=card;
		this.panel1=panel1;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ui.getButton1()){
			card.show(panel1, "0");
			setClicked(true,false,false,false);
			repaint();
		}else if(e.getSource()==ui.getButton2()){
			card.show(panel1, "1");
			setClicked(false,true,false,false);
			repaint();
		}else if(e.getSource()==ui.getButton3()){
			card.show(panel1, "2");
			setClicked(false,false,true,false);
			repaint();
		}else if(e.getSource()==ui.getButton4()){
			card.show(panel1, "3");
			setClicked(false,false,false,true);
			repaint();
		}

	}

	private void setClicked(boolean b1,boolean b2,boolean b3,boolean b4){
		button1_clicked=b1;
		button2_clicked=b2;
		button3_clicked=b3;
		button4_clicked=b4;
	}

	private void setUnclicked(){
		ui.getButton1().setClicked(false);
		ui.getButton2().setClicked(false);
		ui.getButton3().setClicked(false);
		ui.getButton4().setClicked(false);
	}

	private void repaint() {
		ui.getButton1().repaint();
		ui.getButton2().repaint();
		ui.getButton3().repaint();
		ui.getButton4().repaint();
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
		if (e.getSource() == ui.getButton1()) {
			ui.getButton1().setEntered(true);
			setUnclicked();
			repaint();
		} else if (e.getSource() == ui.getButton2()) {
			ui.getButton2().setEntered(true);
			setUnclicked();
			repaint();
		} else if (e.getSource() == ui.getButton3()) {
			ui.getButton3().setEntered(true);
			setUnclicked();
			repaint();
		} else if (e.getSource() == ui.getButton4()) {
			ui.getButton4().setEntered(true);
			setUnclicked();
			repaint();
		}

	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ui.getButton1().setEntered(false);
		ui.getButton2().setEntered(false);
		ui.getButton3().setEntered(false);
		ui.getButton4().setEntered(false);
		ui.getButton1().setClicked(button1_clicked);
		ui.getButton2().setClicked(button2_clicked);
		ui.getButton3().setClicked(button3_clicked);
		ui.getButton4().setClicked(button4_clicked);
		repaint();

	}

}
