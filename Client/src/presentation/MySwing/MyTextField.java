package presentation.MySwing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTextField;

public class MyTextField extends JTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyTextField() {
		super();
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

}