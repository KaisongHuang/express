/**
 * CourierMenuUI是courier用户的主界面
 */

package presentation.courierui;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import listener.courierlistener.CourierMenuListener;

public class CourierMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JButton button1;
	JButton button2;
	JButton button3;
	private int width;
	private int height;
	CardLayout card;
	CourierMenuListener cml;

	public CourierMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		super();
		this.card = card;
		this.width = width;
		this.height = height;
		cml = new CourierMenuListener(this, card,panel1);
		initialize();

	}

	private void initialize() {
		this.setSize(width,height);
		this.setLayout(null);
		button1 = new JButton("订单输入");
		button1.setBounds(0, 0, width, height / 6);
		button1.addActionListener(cml);
		this.add(button1);

		button2 = new JButton("收件信息输入");
		button2.setBounds(0, height / 6, width, height / 6);
		button2.addActionListener(cml);
		this.add(button2);

		button3 = new JButton("订单查询");
		button3.setBounds(0, 2 * height / 6, width, height / 6);
		button3.addActionListener(cml);
		this.add(button3);

	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public CardLayout getCard() {
		return card;
	}
}
