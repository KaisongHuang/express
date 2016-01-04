/**
 * ManagerUI3是manager用户的查看统计分析的界面
 */

package presentation.managerui;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

import listener.managerlistener.ManagerListener30;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MySeperator;
import presentation.MySwing.SubNaviButton;
import presentation.financeui.FinanceUI2_1;
import presentation.financeui.FinanceUI3;

public class ManagerUI3 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	public JPanel getPanel() {
		return panel;
	}

	public CardLayout getCard() {
		return card;
	}

	private CardLayout card;
	private FinanceUI3 ui1;
	private FinanceUI2_1 ui2;
	private JPanel navi_panel;
	private SubNaviButton button1;
	private SubNaviButton button2;
	private MySeperator line;
	private ManagerListener30 listener;
    private MyDialog dialog;
	/**
	 * Create the application.
	 */
	public ManagerUI3() {
		listener = new ManagerListener30(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBackground(Color.white);
		this.setBounds(136, 115, 720, 480);

		this.setLayout(null);

		card=new CardLayout(0,0);
		dialog=new MyDialog();
		this.add(dialog);
		ui1=new FinanceUI3();
//		ui1.getComboBox_3().setBounds(159, 47, 88, 25);
//		ui1.getComboBox().setBounds(159, 20, 88, 25);
		ui2=new FinanceUI2_1();
		ui2.setBackground(Color.WHITE);

		panel=new JPanel();
		panel.setLayout(card);

		panel.add(ui1, "1");
		panel.add(ui2, "2");

		panel.setBounds(0,45,740,443);
		add(panel);

		navi_panel = new JPanel();
		navi_panel.setBounds(0, 0, 746, 44);
		navi_panel.setBackground(Color.WHITE);
		this.add(navi_panel);
		navi_panel.setLayout(null);

		button1 = new SubNaviButton("经营情况表");
		button1.setBounds(44, 0, 118, 44);
		button1.addActionListener(listener);
		button1.addMouseListener(listener);
		button1.setClicked(true);
		navi_panel.add(button1);

		button2 = new SubNaviButton("成本收益表");
		button2.setBounds(162, 0, 118, 44);
		button2.addActionListener(listener);
		button2.addMouseListener(listener);
		navi_panel.add(button2);

		line=new MySeperator();
		line.setBounds(44, 44, 630, 10);
		add(line);
		add(navi_panel);
	}
	public void setText(String s){
		dialog.setText(s);
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);
	}
	public SubNaviButton getButton1() {
		return button1;
	}

	public SubNaviButton getButton2() {
		return button2;
	}

}
