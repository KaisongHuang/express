package presentation.MySwing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyButtonListener implements MouseListener{
	private MyButton button;
	public MyButtonListener(MyButton button){
		this.button=button;
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setEntered(false);
		button.setPressed(true);
		button.repaint();
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setEntered(true);
		button.setPressed(false);
		button.repaint();
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setEntered(true);
		button.repaint();
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setEntered(false);
		button.repaint();
		
	}

}
