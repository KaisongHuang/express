package presentation.MySwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SubNaviButton extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean clicked = false;
	private boolean entered = false;
	private JLabel label;

	public SubNaviButton() {
		this.setBorderPainted(false);
	}

	public SubNaviButton(String text) {
		label = new JLabel();
		label.setText(text);
		label.setAlignmentX(CENTER_ALIGNMENT);
		this.setBorderPainted(false);
		this.add(label);
	}

	public SubNaviButton(String text, String path) {
		label = new JLabel();
		ImageIcon icon = new ImageIcon(this.getClass().getResource(path));
		icon.setImage(icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		label.setText(text);
		label.setIcon(icon);
		label.setAlignmentX(CENTER_ALIGNMENT);
		this.setBorderPainted(false);
		this.add(label);
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (clicked) {
			label.setForeground(new Color(158, 211, 240));
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(new Color(158, 211, 240));
			g.fillRect(0, this.getHeight() - this.getHeight() / 10, this.getWidth(), this.getHeight() / 10);
		} else if (!clicked) {
			label.setForeground(Color.BLACK);
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
		}

		if (entered) {
			label.setForeground(new Color(158, 211, 240));
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
