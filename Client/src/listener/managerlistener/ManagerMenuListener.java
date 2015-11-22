package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.managerui.*;

public class ManagerMenuListener implements MouseListener, ActionListener {
	
	private ManagerMenuUI ui;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	
	
public ManagerMenuListener (ManagerMenuUI ui){
		
		super();
		this.ui = ui;
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_7()){
		
		}else if(e.getSource()==ui.getBtnNewButton_8()){

		}else if(e.getSource()==ui.getBtnNewButton_9()){

		}else if(e.getSource()==ui.getBtnNewButton_10()){

		}else if(e.getSource()==ui.getBtnNewButton_16()){

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
