/**
 * ManagerUI3是manager用户的查看统计分析的界面
 */

package presentation.managerui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;
import listener.managerlistener.ManagerListener30;

public class ManagerUI3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ManagerListener30 managerlistener;

	/**
	 * Create the application.
	 */
	public ManagerUI3() {
		managerlistener = new ManagerListener30(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBackground(Color.white);
		this.setBounds(136, 115, 746, 443);

		this.setLayout(null);
		this.setBackground(Color.WHITE);

	}



}
