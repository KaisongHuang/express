package presentation.MySwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MyDialog extends JLabel {

	private String content;
	private Boolean isVisible = false;
	private Boolean right = true;
	private Color invisibleColor = Color.white;

	public MyDialog() {
		super();
		content = "";
		this.setBounds(0, 440, 720, 40);
		new Time().start();
	}

	public void setText(String s) {
		content = s;
		right = true;
		isVisible = true;
		this.repaint();
		new Time().start();
	}

	public void setErrorText(String s) {
		content = s;
		right = false;
		isVisible = true;
		this.repaint();
		new Time().start();
	}

	public void paintComponent(Graphics g) {
		if (isVisible) {
			if (right)
				g.setColor(new Color(96, 203, 151));
			else
				g.setColor(new Color(248, 190, 192));
			g.fillRect(0, 0, 720, 40);
			g.setFont(new Font("Adobe Fan Heiti Std", Font.PLAIN, 20));
			g.setColor(Color.BLACK);
			g.drawString(content, 200, 30);
		}
		if (!isVisible) {
			g.setColor(invisibleColor);
			g.fillRect(0, 0, 720, 40);
		}

	}

	public void setVisible() {

		isVisible = false;
		repaint();
	}

	class Time extends Thread {
		public void run() {
			time();
		}

		public void time() {
			long time1 = System.currentTimeMillis();
			long time2 = System.currentTimeMillis();
			while (true) {
				time1 = System.currentTimeMillis();
				if (isVisible) {

					while (time2 - time1 < 2000) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						time2 = System.currentTimeMillis();
					}
					setVisible();
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public void setInvisibleColor(Color invisibleColor) {
		this.invisibleColor = invisibleColor;
	}

}
