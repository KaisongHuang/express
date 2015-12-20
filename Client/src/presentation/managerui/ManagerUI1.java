package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import listener.managerlistener.ManagerListener10;
import presentation.button.SubNaviButton;

public class ManagerUI1 extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private ManagerUI1_1 ui1;
	private ManagerUI1_2 ui2;
	private ManagerUI1_3 ui3;
	private ManagerUI1_4 ui4;
	private ManagerUI1_5 ui5;
	private SubNaviButton button1;
	private SubNaviButton button2;
	private SubNaviButton button3;
	private SubNaviButton button4;
	private SubNaviButton button5;
	private JPanel navi_panel;
	private JPanel panel;
	private ManagerListener10 listener;

	public ManagerUI1() {
		listener = new ManagerListener10(this);
		initialize();
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		setBackground(Color.white);
		ui1 = new ManagerUI1_1();
		ui2 = new ManagerUI1_2();
		ui3 = new ManagerUI1_3();
		ui4 = new ManagerUI1_4();
		ui5 = new ManagerUI1_5();

		panel = new JPanel();
		panel.setBounds(0, 44, 746, 394);
		add(panel);
		card = new CardLayout(0, 0);
		panel.setLayout(card);

		panel.add(ui1, "1");
		panel.add(ui2, "2");
		panel.add(ui3, "3");
		panel.add(ui4, "4");
		panel.add(ui5, "5");
		card.show(panel, "1");

		navi_panel = new JPanel();
		navi_panel.setBounds(0, 0, 746, 44);
		navi_panel.setBackground(new Color(246, 246, 246));
		this.add(navi_panel);
		navi_panel.setLayout(null);

		button1 = new SubNaviButton("查询");
		button1.setBounds(44, 8, 90, 44);
		button1.addActionListener(listener);
		button1.addMouseListener(listener);
		button1.setClicked(true);
		navi_panel.add(button1);

		button2 = new SubNaviButton("更新");
		button2.setBounds(157, 8, 90, 44);
		button2.addActionListener(listener);
		button2.addMouseListener(listener);
		navi_panel.add(button2);

		button3 = new SubNaviButton("删除");
		button3.setBounds(259, 8, 90, 44);
		button3.addActionListener(listener);
		button3.addMouseListener(listener);
		navi_panel.add(button3);

		button4 = new SubNaviButton("添加");
		button4.setBounds(361, 8, 90, 44);
		button4.addActionListener(listener);
		button4.addMouseListener(listener);
		navi_panel.add(button4);

		button5 = new SubNaviButton("日志查看");
		button5.setBounds(463, 8, 90, 44);
		button5.addActionListener(listener);
		button5.addMouseListener(listener);
		navi_panel.add(button5);
		
		add(navi_panel);

	}

	public JPanel getPanel() {
		return panel;
	}

	public CardLayout getCard() {
		return card;
	}

	public SubNaviButton getButton1() {
		return button1;
	}

	public SubNaviButton getButton2() {
		return button2;
	}

	public SubNaviButton getButton3() {
		return button3;
	}

	public SubNaviButton getButton4() {
		return button4;
	}
	
	public SubNaviButton getButton5() {
		return button5;
	}
}
