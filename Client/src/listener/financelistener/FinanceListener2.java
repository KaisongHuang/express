package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import presentation.financeui.FinanceUI2;

public class FinanceListener2 implements ActionListener, MouseListener {

	private FinanceUI2 ui;
	private boolean button1_clicked = true;
	private boolean button2_clicked = false;
	
	public FinanceListener2(FinanceUI2 ui) {
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton1()) {
			ui.getCard().show(ui.getPanel(), "2");
			setClicked(true,false);
			repaint();
		}
		if(e.getSource()==ui.getButton2()){
			ui.getCard().show(ui.getPanel(), "1");
			setClicked(false,true);
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
		if (e.getSource() == ui.getButton1()) {
			ui.getButton1().setEntered(true);
			setUnclicked();
			repaint();
		} else if (e.getSource() == ui.getButton2()) {
			ui.getButton2().setEntered(true);
			setUnclicked();
			repaint();
		} 
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ui.getButton1().setEntered(false);
		ui.getButton2().setEntered(false);
		ui.getButton1().setClicked(button1_clicked);
		ui.getButton2().setClicked(button2_clicked);
		repaint();
	}
	private void setClicked(boolean b1,boolean b2){
		button1_clicked=b1;
		button2_clicked=b2;
	}

	private void setUnclicked(){
		ui.getButton1().setClicked(false);
		ui.getButton2().setClicked(false);
	}

	private void repaint() {
		ui.getButton1().repaint();
		ui.getButton2().repaint();
	}
}
