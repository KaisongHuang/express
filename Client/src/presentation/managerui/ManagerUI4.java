package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import listener.managerlistener.ManagerListener40;
import presentation.button.SubNaviButton;

public class ManagerUI4 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private ManagerUI4_1 ui1;
	private ManagerUI4_2 ui2;
	private SubNaviButton button1;
	private SubNaviButton button2;
	private JPanel navi_panel;
	private JPanel panel;
	private ManagerListener40 listener;

	public ManagerUI4() {
		listener = new ManagerListener40(this);
		initialize();
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		setBackground(Color.white);
		ui1 = new ManagerUI4_1();
		ui2 = new ManagerUI4_2();

		panel = new JPanel();
		panel.setBounds(0, 44, 746, 394);
		add(panel);
		card = new CardLayout(0, 0);
		panel.setLayout(card);

		panel.add(ui1, "1");
		panel.add(ui2, "2");
		card.show(panel, "1");

		navi_panel = new JPanel();
		navi_panel.setBounds(0, 0, 746, 44);
		navi_panel.setBackground(new Color(246, 246, 246));
		this.add(navi_panel);
		navi_panel.setLayout(null);

		button1 = new SubNaviButton("制定薪水策略");
		button1.setBounds(44, 8, 90, 44);
		button1.addActionListener(listener);
		button1.addMouseListener(listener);
		button1.setClicked(true);
		navi_panel.add(button1);

		button2 = new SubNaviButton("制定距离价格");
		button2.setBounds(194, 8, 90, 44);
		button2.addActionListener(listener);
		button2.addMouseListener(listener);
		navi_panel.add(button2);

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
}
