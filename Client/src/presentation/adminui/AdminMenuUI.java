package presentation.adminui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import listener.adminlistener.AdminMenuListener;

public class AdminMenuUI extends JPanel {

	private CardLayout card;
	AdminMenuListener adminlistener;
	private JButton btnNewButton_12;
	private JButton btnNewButton_9;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private int width;
	private int height;

	public AdminMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		this.card = card;
		adminlistener = new AdminMenuListener(this, card,panel1);
		width = width=120;
		height = height=600;
		initialize();
	}

	private void initialize() {
		
        this.setSize(width,height);
		this.setLayout(null);

		btnNewButton_7 = new JButton("新增账户");
		btnNewButton_7.setBounds(0, 0, width, height / 6);
		btnNewButton_7.addActionListener(adminlistener);
		this.add(btnNewButton_7);

		btnNewButton_8 = new JButton("权限管理");
		btnNewButton_8.setBounds(0, height / 6, width, height / 6);
		btnNewButton_8.addActionListener(adminlistener);
		this.add(btnNewButton_8);

		btnNewButton_9 = new JButton("修改密码");
		btnNewButton_9.setBounds(0, 2 * height / 6, width, height / 6);
		btnNewButton_9.addActionListener(adminlistener);
		this.add(btnNewButton_9);

		btnNewButton_12 = new JButton("删除账户");
		btnNewButton_12.setBounds(0, 3 * height / 6, width, height / 6);
		btnNewButton_12.addActionListener(adminlistener);
		this.add(btnNewButton_12);

	}

	public CardLayout getCard() {
		return card;
	}

	public JButton getBtnNewButton_12() {
		return btnNewButton_12;
	}

	public JButton getBtnNewButton_9() {
		return btnNewButton_9;
	}

	public Component getBtnNewButton_7() {
		return btnNewButton_7;
	}

	public JButton getBtnNewButton_8() {
		return btnNewButton_8;
	}

}
