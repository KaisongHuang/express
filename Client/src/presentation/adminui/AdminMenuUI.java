package presentation.adminui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;

import listener.adminlistener.AdminMenuListener;

public class AdminMenuUI extends JPanel {
	
	private CardLayout card;
	
	AdminMenuListener adminlistener;

	private JButton btnNewButton_12;

	private JButton btnNewButton_9;

	private Component btnNewButton_7;

	private JButton btnNewButton_8;
	private int width;
	private int height;
	public AdminMenuUI (CardLayout card){
		this.card=card;
		adminlistener = new AdminMenuListener(this);
		width=this.getWidth();
		height=this.getHeight();
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		
		this.setLayout(null);
	
		
		btnNewButton_7 = new JButton("新增账户");
		btnNewButton_7.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_7.setBounds(0, 0, width, height/5);
		this.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("权限管理");
		btnNewButton_8.setBounds(0, height/5, width, height/5);
		this.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("修改密码");
		btnNewButton_9.setBounds(0, 2*height/5, width, height/5);
		this.add(btnNewButton_9);
		
		btnNewButton_12 = new JButton("删除账户");
	
		btnNewButton_12.setBounds(0, 3*height/5, width, height/5);
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
