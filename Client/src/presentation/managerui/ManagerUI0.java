package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import listener.managerlistener.ManagerListener00;
import presentation.button.SubNaviButton;

public class ManagerUI0 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private ManagerUI0_1 ui1;
	private ManagerUI0_2 ui2;
	private ManagerUI0_3 ui3;
	private ManagerUI0_4 ui4;
	private SubNaviButton button1;
	private SubNaviButton button2;
	private SubNaviButton button3;
	private SubNaviButton button4;

	private JPanel navi_panel;
	private JPanel panel;
	private ManagerListener00 listener;

	public ManagerUI0() {
		listener = new ManagerListener00(this);
		initialize();
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		setBackground(new Color(158, 211, 238));
		ui1 = new ManagerUI0_1();
		ui2 = new ManagerUI0_2();
		ui3 = new ManagerUI0_3();
		ui4 = new ManagerUI0_4();

		panel = new JPanel();
		panel.setBounds(0, 44, 746, 394);
		add(panel);
		card = new CardLayout(0, 0);
		panel.setLayout(card);

		panel.add(ui1, "1");
		panel.add(ui2, "2");
		panel.add(ui3, "3");
		panel.add(ui4, "4");
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
		button2.setBounds(194, 8, 90, 44);
		button2.addActionListener(listener);
		button2.addMouseListener(listener);
		navi_panel.add(button2);

		button3 = new SubNaviButton("删除");
		button3.setBounds(348, 8, 90, 44);
		button3.addActionListener(listener);
		button3.addMouseListener(listener);
		navi_panel.add(button3);

		button4 = new SubNaviButton("添加");
		button4.setBounds(525, 8, 90, 44);
		button4.addActionListener(listener);
		button4.addMouseListener(listener);
		navi_panel.add(button4);

//		navi_panel.setBackground(new Color(158, 211, 240));
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
}
