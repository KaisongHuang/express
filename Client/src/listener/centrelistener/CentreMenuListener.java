package listener.centrelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.centreui.CentreMenuUI;
import presentation.centreui.*;

public class CentreMenuListener implements MouseListener, ActionListener {
	
	private CentreMenuUI ui;
	JPanel panel1;
	JPanel panel2;
	
	public CentreMenuListener (CentreMenuUI ui){
		
		super();
		this.ui = ui;
		panel1 = new CentreUI(ui.getFrame());
		panel2 = new CentreUI1(ui.getFrame());
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_8()){
			System.out.println("ok");
			
			panel1.doLayout();
			ui.getFrame().add(panel1);
			
			
		}else if(e.getSource()==ui.getBtnNewButton_7()){
			System.out.println("ok");
			
			panel2.setSize(763, 500);
			panel2.setLocation(100, 200);
			panel2.doLayout();
			ui.getFrame().add(panel2);
			
			
			
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
