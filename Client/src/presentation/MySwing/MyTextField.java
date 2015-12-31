package presentation.MySwing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

public class MyTextField extends JTextField{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int entered=0;
    
	public MyTextField() {
		super();
		setOpaque(false); 
		setListener();
	}
	
	public MyTextField(String text) {
		super(text);
		setOpaque(false); 
		setListener();
	}

	protected void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.drawRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if (!hasFocus() && entered == 0) {
			g2d.setStroke(new BasicStroke((float) 2));
			g2d.setColor(new Color(158, 211, 240));
			g2d.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		}

		if (hasFocus() || (!hasFocus() && entered == 1)) {
			g2d.setStroke(new BasicStroke((float) 5));
			g2d.setColor(new Color(158, 211, 240));
			g2d.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		}

	}
	
	public void setListener(){
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				entered = 1;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				entered = 0;
				repaint();
			}

		});
		addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				repaint();
			}

			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}