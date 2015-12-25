package presentation.MySwing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MySeperator extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MySeperator() {

	}

	public MySeperator(String text) {
		super(text);
	}


	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(new Color(220,220,220));
		g.drawLine(0, 0, this.getWidth(), 0);
	}
	
}
