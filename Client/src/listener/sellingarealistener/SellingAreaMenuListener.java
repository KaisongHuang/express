package listener.sellingarealistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaMenuUI;

public class SellingAreaMenuListener implements ActionListener,MouseListener {

	private SellingAreaMenuUI ui;
	private CardLayout card;
    private JPanel panel;
    private boolean button1_clicked=false;
  	private boolean button2_clicked=true;
  	private boolean button3_clicked=false;
  	private boolean button4_clicked=false;
  	private boolean button_clicked=false;

	public SellingAreaMenuListener(SellingAreaMenuUI sellingAreaMenuUI, CardLayout card, JPanel panel1) {
		super();
		this.ui = sellingAreaMenuUI;
		this.card = card;
		this.panel=panel1;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton()) {
              card.show(panel, "7");
		} else if (e.getSource() == ui.getbutton1()) {
			card.show(panel, "0");
		} else if (e.getSource() == ui.getbutton2()) {
			card.show(panel, "1");
		} else if (e.getSource() == ui.getbutton3()) {
			card.show(panel, "2");
		} else if (e.getSource() == ui.getbutton4()) {
			card.show(panel, "3");
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
