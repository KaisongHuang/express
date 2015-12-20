/**
 * ManagerUI14是manager用户的日志查询界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import listener.managerlistener.ManagerListener1_5;


public class ManagerUI1_5 extends JPanel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btnNewButton_15;
	private JButton btnNewButton_16;


	private JTextArea textArea;

	ManagerListener1_5 managerlistener;


	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI1_5() {
		managerlistener = new ManagerListener1_5(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(new Color(158, 211, 238));
		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);


		btnNewButton_15 = new JButton("确定");
		btnNewButton_15.setBounds(162, 333, 100, 30);
		this.add(btnNewButton_15);

		btnNewButton_16 = new JButton("清空");
		btnNewButton_16.setBounds(493, 333, 100, 30);
		this.add(btnNewButton_16);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(119, 40, 536, 281);
		this.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setColumnHeaderView(textArea);

		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_16.addActionListener(managerlistener);

	}

	public JButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(JButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}

	public JButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(JButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}


}
