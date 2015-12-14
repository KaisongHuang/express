package listener.courierlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.courierui.CourierMenuUI;

public class CourierMenuListener implements ActionListener ,MouseListener{
	CourierMenuUI menu;
	CardLayout card;
	JPanel panel;
	private boolean button1_clicked = true;
	private boolean button2_clicked = false;
	private boolean button3_clicked = false;
	
	public CourierMenuListener(CourierMenuUI courierMenuUI, CardLayout card, JPanel panel1) {
		this.menu = courierMenuUI;
		this.card = card;
		this.panel = panel1;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getButton1()) {
			card.show(panel, "0");
			setClicked(true,false,false);
			repaint();
		} else if (e.getSource() == menu.getButton2()) {
			card.show(panel, "1");
			setClicked(false,true,false);
			repaint();
		} else {
			card.show(panel, "2");
			setClicked(false,false,true);
			repaint();
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
		if (e.getSource() == menu.getButton1()) {
			menu.getButton1().setEntered(true);
			setUnclicked();
			repaint();
		} else if (e.getSource() == menu.getButton2()) {
			menu.getButton2().setEntered(true);
			setUnclicked();
			repaint();
		} else if (e.getSource() == menu.getButton3()) {
			menu.getButton3().setEntered(true);
			setUnclicked();
			repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		menu.getButton1().setEntered(false);
		menu.getButton2().setEntered(false);
		menu.getButton3().setEntered(false);
		menu.getButton1().setClicked(button1_clicked);
		menu.getButton2().setClicked(button2_clicked);
		menu.getButton3().setClicked(button3_clicked);
		repaint();
	}
	
	private void setClicked(boolean b1,boolean b2,boolean b3){
		button1_clicked=b1;
		button2_clicked=b2;
		button3_clicked=b3;
	}
	
	private void setUnclicked(){
		menu.getButton1().setClicked(false);
		menu.getButton2().setClicked(false);
		menu.getButton3().setClicked(false);
	}
	
	private void repaint() {
		menu.getButton1().repaint();
		menu.getButton2().repaint();
		menu.getButton3().repaint();
	}
}
