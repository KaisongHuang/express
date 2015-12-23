package presentation.MySwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Button extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean pressed = false;
	private boolean entered = false;
	private JLabel label;

	public Button() {
		this.setBorderPainted(false);
	}

	public Button(String text) {
		this.setBorderPainted(false);
		label = new JLabel();
		label.setText(text);
		label.setAlignmentX(CENTER_ALIGNMENT);
		this.add(label);
	}

	public Button(String text, String path) {
		this.setBorderPainted(false);
		JLabel label = new JLabel();
		ImageIcon icon = new ImageIcon(this.getClass().getResource(path));
		icon.setImage(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		label.setText(text);
		label.setIcon(icon);
		label.setAlignmentX(CENTER_ALIGNMENT / 2);
		this.add(label);
	}

	protected void paintComponent(Graphics g) {
		if (pressed) {
			g.setColor(new Color(158, 211, 240));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			label.setForeground(Color.WHITE);
		}

		if (entered) {
			label.setForeground(Color.BLACK);
			g.setColor(new Color(158, 211, 240));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.WHITE);
			g.fillRect(this.getWidth() / 30, this.getWidth() / 30, this.getWidth() - this.getWidth() / 15,
					this.getHeight() - this.getWidth() / 15);

		} else if (!entered && !pressed) {
			label.setForeground(Color.BLACK);
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
	}

	public boolean isPressed() {
		return pressed;
	}

	public boolean isEntered() {
		return entered;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public void setEntered(boolean entered) {
		this.entered = entered;
	}

}
