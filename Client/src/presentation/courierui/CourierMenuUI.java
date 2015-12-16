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
import presentation.button.MyButton;

public class CourierMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	MyButton button1;
	MyButton button2;
	MyButton button3;
	private int width;
	private int height;
	private ImageIcon icon1;
	CardLayout card;
	CourierMenuListener cml;

	public CourierMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		super();
		this.card = card;
		this.width = width;
		this.height = height;
		cml = new CourierMenuListener(this, card,panel1);
		getImage();
		initialize();

	}

	private void initialize() {
		this.setSize(width,height);
		this.setLayout(null);
		
		button1 = new MyButton();//"订单输入"
		button1.setBounds(0, 0, width, height / 6);
		button1.setBackground(Color.BLUE);
		button1.setClicked(true);
		button1.addActionListener(cml);
		button1.addMouseListener(cml);
		this.add(button1);

		button2 = new MyButton();//"收件信息输入"
		button2.setBounds(0, height / 6, width, height / 6);
		button2.addActionListener(cml);
		button2.addMouseListener(cml);
		this.add(button2);

		button3 = new MyButton();//"订单查询"
		button3.setBounds(0, 2 * height / 6, width, height / 6);
		button3.addActionListener(cml);
		button3.addMouseListener(cml);
		this.add(button3);

	}

	public MyButton getButton1() {
		return button1;
	}

	public MyButton getButton2() {
		return button2;
	}

	public MyButton getButton3() {
		return button3;
	}

	public CardLayout getCard() {
		return card;
	}
	
	private void getImage(){
		icon1 = new ImageIcon(this.getClass().getResource("/出库入库.png"));
		icon1.setImage(icon1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		
	}
}
