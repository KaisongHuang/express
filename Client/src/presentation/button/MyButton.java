package presentation.button;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MyButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean clicked = false;
	private boolean entered = false;

	public MyButton() {
	}

	public MyButton(String text){
		JLabel label=new JLabel();
		label.setText(text);
		label.setAlignmentX(CENTER_ALIGNMENT);
		this.add(label);
	}
	
	public MyButton(String text,String path){
		JLabel label=new JLabel();
		ImageIcon icon = new ImageIcon(this.getClass().getResource(path));
		icon.setImage(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		label.setText(text);
		label.setIcon(icon);
		label.setAlignmentX(CENTER_ALIGNMENT/2);
		this.add(label);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if (clicked) {
			g.setColor(new Color(158, 211, 240));
			g.fillRect(0, 0, this.getWidth() / 20, this.getHeight());
			g.setColor(new Color(228, 228, 228));
			g.fillRect(this.getWidth() / 20, 0, this.getWidth() - this.getWidth() / 20, this.getHeight());
		} else if (!clicked) {
			g.setColor(new Color(246, 246, 246));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
		}

		if (entered) {
			g.setColor(new Color(210, 240, 255));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
	}

	public boolean isClicked() {
		return clicked;
	}

	public boolean isEntered() {
		return entered;
	}

	public void setClicked(boolean clicked) {
		this.clicked = clicked;
	}

	public void setEntered(boolean entered) {
		this.entered = entered;
	}

}
