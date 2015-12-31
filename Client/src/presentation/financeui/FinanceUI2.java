package presentation.financeui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import listener.financelistener.FinanceListener2;
import presentation.MySwing.MySeperator;
import presentation.MySwing.SubNaviButton;

public class FinanceUI2 extends JPanel {

	private FinanceUI2_1 ui1;
	private FinanceUI2_2 ui2;
	private CardLayout card;
	private JPanel panel;
	private SubNaviButton button1;
	private SubNaviButton button2;
	private MySeperator line;
	private JPanel navi_panel;
	private FinanceListener2 listener;

	public FinanceUI2() {
		listener = new FinanceListener2(this);
		initialize();
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		setBackground(Color.WHITE);
		setLayout(null);

		ui1 = new FinanceUI2_1();
		ui2 = new FinanceUI2_2();

		card = new CardLayout(0, 0);
		panel = new JPanel();
		panel.setBounds(0,50, 746, 394);
		panel.setBackground(Color.white);

		panel.setLayout(card);
		panel.add(ui2, "2");
		panel.add(ui1, "1");
		card.show(panel, "2");

		add(panel);
		
		navi_panel = new JPanel();
		navi_panel.setBounds(0, 0, 746, 44);
		navi_panel.setBackground(Color.WHITE);
		this.add(navi_panel);
		navi_panel.setLayout(null);
		
		button1 = new SubNaviButton("新建付款单");
		button1.setBounds(44, 0, 100, 44);
		button1.addActionListener(listener);
		button1.addMouseListener(listener);
		button1.setClicked(true);
		navi_panel.add(button1);

		button2 = new SubNaviButton("成本收益表");
		button2.setBounds(144, 0, 100, 44);
		button2.addActionListener(listener);
		button2.addMouseListener(listener);
		navi_panel.add(button2);
		
		line=new MySeperator();
		line.setBounds(44, 44, 630, 10);
		add(line);
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
