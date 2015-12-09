/**
 * AdminMenuUI是admin用户首页的界面
 */
package presentation.adminui;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JPanel;

import listener.adminlistener.AdminMenuListener;

public class AdminMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	AdminMenuListener adminlistener;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
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

		button3 = new JButton("新增账户");
		button3.setBounds(0, 0, width, height / 6);
		button3.addActionListener(adminlistener);
		this.add(button3);

		button4 = new JButton("权限管理");
		button4.setBounds(0, height / 6, width, height / 6);
		button4.addActionListener(adminlistener);
		this.add(button4);

		button2 = new JButton("修改密码");
		button2.setBounds(0, 2 * height / 6, width, height / 6);
		button2.addActionListener(adminlistener);
		this.add(button2);

		button1 = new JButton("删除账户");
		button1.setBounds(0, 3 * height / 6, width, height / 6);
		button1.addActionListener(adminlistener);
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
