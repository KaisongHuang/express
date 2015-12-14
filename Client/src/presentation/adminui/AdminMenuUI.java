/**
 * AdminMenuUI是admin用户首页的界面
 */
package presentation.adminui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import listener.adminlistener.AdminMenuListener;
import presentation.button.MyButton;

public class AdminMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	AdminMenuListener adminlistener;
	private MyButton button1;
	private MyButton button2;
	private MyButton button3;
	private MyButton button4;
	private int width;
	private int height;

	/*
	 * 构造
	 */
	public AdminMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		this.card = card;
		adminlistener = new AdminMenuListener(this, card,panel1);
		this.width = width;
		this.height = height;
		initialize();
	}

	/*
	 * 初始化
	 */
	private void initialize() {

        this.setSize(width,height);
		this.setLayout(null);

		
		button3 = new MyButton();//"新增账户"
		button3.setBounds(0, 0, width, height / 10);
		ImageIcon icon1 = new ImageIcon("image/新增账户.png");
		icon1.setImage(icon1.getImage().getScaledInstance(width, height / 10, Image.SCALE_DEFAULT));
		button3.setIcon(icon1);
		button3.setBorderPainted(false);
		button3.setContentAreaFilled(false);
		button3.addActionListener(adminlistener);
		button3.addMouseListener(adminlistener);
		this.add(button3);

		button4 = new MyButton();//"权限管理"
		button4.setBounds(0, height / 6, width, height / 6);
		button4.addActionListener(adminlistener);
		button4.addMouseListener(adminlistener);
		this.add(button4);

		button2 = new MyButton();//"修改密码"
		button2.setBounds(0, 2 * height / 6, width, height / 6);
		button2.addActionListener(adminlistener);
		button2.addMouseListener(adminlistener);
		this.add(button2);

		button1 = new MyButton();//"删除账户"
		button1.setBounds(0, 3 * height / 6, width, height / 6);
		button1.addActionListener(adminlistener);
		button1.addMouseListener(adminlistener);
		this.add(button1);

	}

	public CardLayout getCard() {
		return card;
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public Component getButton3() {
		return button3;
	}

	public JButton getButton4() {
		return button4;
	}

}
