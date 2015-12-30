package presentation.MySwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MyTextField extends JTextField{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    boolean enter;
	public MyTextField() {
		super();
		enter=false;
		setOpaque(false); 
	}
	
	public MyTextField(String text) {
		super(text);
		setOpaque(false); 
	}

	protected void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
//		g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(new Color(158, 211, 240));
		g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
//		g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		enter=true;
		repaint();
		enter=false;
	}

}