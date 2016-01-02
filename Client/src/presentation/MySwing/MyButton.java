package presentation.MySwing;

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
	private boolean pressed = false;
	private boolean entered = false;
	private int mode = 1;
	private JLabel label;
	private MyButtonListener listener;

	public MyButton() {
		listener = new MyButtonListener(this);
		this.setBorderPainted(false);
		this.addMouseListener(listener);
	}

	public MyButton(String text) {
		listener = new MyButtonListener(this);
		this.setBorderPainted(false);
		label = new JLabel();
		label.setText(text);
		label.setAlignmentX(CENTER_ALIGNMENT);
		this.addMouseListener(listener);
		this.add(label);
	}

	public MyButton(String text, String path) {
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
			switch (mode) {
			case 1:
				g.setColor(new Color(158, 211, 240));
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				// g.fillRoundRect(0, 0, this.getWidth(),
				// this.getHeight(),15,15);
				label.setForeground(new Color(246, 246, 246));
				break;
			case 2:
				g.setColor(new Color(250, 205, 137));
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				label.setForeground(new Color(246, 246, 246));
				break;
			}
		}

		if (entered) {
			switch (mode) {
			case 1:
				label.setForeground(Color.BLACK);
				g.setColor(new Color(158, 211, 240));
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				// g.fillRoundRect(0, 0, this.getWidth(),
				// this.getHeight(),15,15);
				g.setColor(new Color(246, 246, 246));
				g.fillRect(this.getWidth() / 30, this.getWidth() / 30, this.getWidth() - this.getWidth() / 15,
						this.getHeight() - this.getWidth() / 15);
				// g.fillRoundRect(this.getWidth() / 30, this.getWidth() / 30,
				// this.getWidth() - this.getWidth() / 15,
				// this.getHeight() - this.getWidth() / 15,15,15);
				break;
			case 2:
				label.setForeground(Color.BLACK);
				g.setColor(new Color(250, 205, 137));
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				g.setColor(new Color(246, 246, 246));
				g.fillRect(this.getWidth() / 30, this.getWidth() / 30, this.getWidth() - this.getWidth() / 15,
						this.getHeight() - this.getWidth() / 15);
				break;
			}
		} else if (!entered && !pressed) {
			switch (mode) {
			case 1:
				label.setForeground(Color.BLACK);
				g.setColor(new Color(246, 246, 246));
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				// g.fillRoundRect(0, 0, this.getWidth(),
				// this.getHeight(),15,15);
				break;
			case 2:
				label.setForeground(Color.BLACK);
				g.setColor(new Color(246, 246, 246));
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				break;

			}
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

	public void setMode(int mode) {
		this.mode = mode;
	}
}
