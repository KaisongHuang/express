package presentation.MySwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MyTextField extends JTextField implements ActionListener {
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
		if(!enter){
		    g.setColor(getBackground());
		    g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
//		    g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
		    super.paintComponent(g);
		}
		else if(enter){
			g.setColor(getBackground());
			for(int i=0;i<5;i++){
				g.drawRect(i, i, getWidth()-2*i, getHeight()-2*i);
			}
		}
	}

	protected void paintBorder(Graphics g) {
		g.setColor(new Color(158, 211, 240));
		g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
//		g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		enter=true;
		repaint();
		enter=false;
	}

}