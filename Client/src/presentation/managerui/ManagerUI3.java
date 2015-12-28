/**
 * ManagerUI3是manager用户的查看统计分析的界面
 */

package presentation.managerui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import listener.managerlistener.ManagerListener30;
import presentation.financeui.FinanceUI3;

public class ManagerUI3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private CardLayout card;
	private FinanceUI3 ui1;
	
	
//	ManagerListener30 managerlistener;

	/**
	 * Create the application.
	 */
	public ManagerUI3() {
//		managerlistener = new ManagerListener30(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBackground(Color.white);
		this.setBounds(136, 115, 746, 493);

		this.setLayout(null);
		
		card=new CardLayout(0,0);
		
		ui1=new FinanceUI3();
		
		
		panel=new JPanel();
		panel.setLayout(card);
		panel.add(ui1, "1");
		panel.setBounds(0,45,740,443);
		add(panel);

	}



}
