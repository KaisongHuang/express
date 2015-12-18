/**
 * CourierMenuUI是courier用户的主界面
 */

package presentation.courierui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import listener.courierlistener.CourierMenuListener;
import presentation.button.NaviButton;

public class CourierMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	NaviButton button1;
	NaviButton button2;
	NaviButton button3;
	private int width;
	private int height;
	private int label_height;
	private ImageIcon icon1;
	CardLayout card;
	CourierMenuListener cml;

	public CourierMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		super();
		this.card = card;
		this.width = width;
		this.height = height;
		this.label_height = height / 10;
		cml = new CourierMenuListener(this, card,panel1);
		initialize();

	}

	private void initialize() {
		this.setSize(width,height);
		this.setLayout(null);
		this.setBackground(new Color(246,246,246));
		button1 = new NaviButton("运单录入","/导航/courier/运单录入.png");//"运单录入"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.setBackground(Color.BLUE);
		button1.setClicked(true);
		button1.addActionListener(cml);
		button1.addMouseListener(cml);
		this.add(button1);

		button2 = new NaviButton("签收确认","/导航/courier/签收确认.png");//"签收确认"
		button2.setBounds(0, label_height * 3, width, label_height);
		button2.addActionListener(cml);
		button2.addMouseListener(cml);
		this.add(button2);

		button3 = new NaviButton("订单查询","/导航/courier/订单查询.png");//"订单查询"
		button3.setBounds(0, label_height * 4, width, label_height);
		button3.addActionListener(cml);
		button3.addMouseListener(cml);
		this.add(button3);

	}

	public NaviButton getButton1() {
		return button1;
	}

	public NaviButton getButton2() {
		return button2;
	}

	public NaviButton getButton3() {
		return button3;
	}

	public CardLayout getCard() {
		return card;
	}
	
}
