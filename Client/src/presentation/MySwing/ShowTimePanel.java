package presentation.MySwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowTimePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 时间格式
	private SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");

	public ShowTimePanel() {
		
		setLayout(null);
		JLabel label=new JLabel("欢迎回来！");
		label.setForeground(new Color(233,150,122));
		label.setBounds(12, 0, 80, 15);
		label.setBackground(new Color(246,246,246));
		TimePanel1 panel1=new TimePanel1();
		panel1.setBackground(new Color(246,246,246));
		TimePanel panel = new TimePanel();
		panel.setBackground(new Color(246,246,246));
		panel1.setBounds(0, 20, 80, 10);
		panel.setBounds(12, 35, 80, 10);
		add(label);
		add(panel1);
		add(panel);
		// 显示
		setVisible(true);

		// 设置时间变化的任务
		Timer timer = new Timer();
		timer.schedule(new ShowTime(), new Date(), 1000);

	}

	class TimePanel1 extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g) {
			super.paint(g);
			// 显示时间
			g.setColor(new Color(233,150,122));
			g.drawString(sdf1.format(new Date()), 0, 10);
			
		}
	}

	class TimePanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g) {
			super.paint(g);
			// 显示时间
			g.setColor(new Color(233,150,122));
			g.drawString(sdf2.format(new Date()), 0, 10);
		}

	}

	class ShowTime extends TimerTask {

		public void run() {
			// 刷新
			repaint();
		}
	}
}