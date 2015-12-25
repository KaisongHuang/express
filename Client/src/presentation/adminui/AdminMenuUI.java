/**
 * AdminMenuUI是admin用户首页的界面
 */
package presentation.adminui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

import listener.adminlistener.AdminMenuListener;
import presentation.MySwing.MySeperator;
import presentation.MySwing.NaviButton;

public class AdminMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	AdminMenuListener adminlistener;
	private NaviButton button1;
	private NaviButton button2;
	private NaviButton button3;
	private NaviButton button4;
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
		this.setBackground(new Color(246,246,246));
		
		MySeperator line=new MySeperator();
		line.setBounds(width/20, label_height*7/4, width*9/10, label_height);
		add(line);
		
		button3 = new NaviButton("新增账户","/导航/admin/新增账户.png");//"新增账户"
		button3.setBounds(0, label_height * 2, width, label_height);
		button3.setClicked(true);
		button3.addActionListener(adminlistener);
		button3.addMouseListener(adminlistener);
		this.add(button3);

		button4 = new NaviButton("权限管理","/导航/admin/权限管理.png");//"权限管理"
		button4.setBounds(0, label_height * 3, width, label_height);
		button4.addActionListener(adminlistener);
		button4.addMouseListener(adminlistener);
		this.add(button4);

		button2 = new NaviButton("修改密码","/导航/admin/修改密码.png");//"修改密码"
		button2.setBounds(0, label_height * 4, width, label_height);
		button2.addActionListener(adminlistener);
		button2.addMouseListener(adminlistener);
		this.add(button2);

		button1 = new NaviButton("删除账户","/导航/admin/删除帐户.png");//"删除账户"
		button1.setBounds(0, label_height * 5, width, label_height);
		button1.addActionListener(adminlistener);
		button1.addMouseListener(adminlistener);
		this.add(button1);

	}

	public CardLayout getCard() {
		return card;
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

	public NaviButton getButton4() {
		return button4;
	}

}
