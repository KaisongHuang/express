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
	private int label_height;
	/*
	 * 构造
	 */
	public AdminMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		this.card = card;
		adminlistener = new AdminMenuListener(this, card,panel1);
		this.width = width;
		this.height = height;
		this.label_height=height/10;
		initialize();
	}

	/*
	 * 初始化
	 */
	private void initialize() {

        this.setSize(width,height);
		this.setLayout(null);

		
		button3 = new MyButton("新增账户","/导航/admin/新增账户.png");//"新增账户"
		button3.setBounds(0, label_height * 2, width, label_height);
		button3.setClicked(true);
		button3.addActionListener(adminlistener);
		button3.addMouseListener(adminlistener);
		this.add(button3);

		button4 = new MyButton("权限管理","/导航/admin/权限管理.png");//"权限管理"
		button4.setBounds(0, label_height * 3, width, label_height);
		button4.addActionListener(adminlistener);
		button4.addMouseListener(adminlistener);
		this.add(button4);

		button2 = new MyButton("修改密码","/导航/admin/修改密码.png");//"修改密码"
		button2.setBounds(0, label_height * 4, width, label_height);
		button2.addActionListener(adminlistener);
		button2.addMouseListener(adminlistener);
		this.add(button2);

		button1 = new MyButton("删除账户","/导航/admin/删除帐户.png");//"删除账户"
		button1.setBounds(0, label_height * 5, width, label_height);
		button1.addActionListener(adminlistener);
		button1.addMouseListener(adminlistener);
		this.add(button1);

	}

	public CardLayout getCard() {
		return card;
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

	public MyButton getButton4() {
		return button4;
	}

}
