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
	
	public CentreMenuListener (CentreMenuUI ui){
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_8()){
			System.out.println("ok");
			JPanel panel = new CentreUI(ui.getFrame());
			panel.doLayout();
			ui.getFrame().add(panel);
			
			
		}else if(e.getSource()==ui.getBtnNewButton_7()){
			System.out.println("ok");
			JPanel panel = new CentreUI1(ui.getFrame());
			panel.setSize(763, 500);
			panel.setLocation(100, 200);
			panel.doLayout();
			ui.getFrame().add(panel);
			
			
			
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
