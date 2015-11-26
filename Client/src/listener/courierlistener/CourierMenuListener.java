package listener.courierlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import presentation.courierui.CourierMenuUI;

public class CourierMenuListener implements MouseListener, ActionListener {

	private CourierMenuUI ui;
	CourierBlService courier = new Courier();
	
	public CourierMenuListener (CourierMenuUI ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_7()){
			
		}else if(e.getSource()==ui.getBtnNewButton_8()){
			
		}else if(e.getSource()==ui.getBtnNewButton_9()){
			
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
