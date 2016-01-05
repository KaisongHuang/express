/**
 * ManagerUI14是manager用户的日志查询界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import listener.managerlistener.ManagerListener1_5;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;


public class ManagerUI1_5 extends JPanel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MyButton btnNewButton_15;


    private MyDialog dialog;
	private JTextArea textArea;

	private ManagerListener1_5 managerlistener;


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

		setBackground(Color.white);
		this.setBounds(0, 44, 720, 480);

		this.setLayout(null);

        dialog=new MyDialog();
        this.add(dialog);
		btnNewButton_15 = new MyButton("刷新");
		btnNewButton_15.setBounds(162, 333, 100, 30);
		this.add(btnNewButton_15);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(119, 40, 536, 281);
		this.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setColumnHeaderView(textArea);

		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_15.addMouseListener(managerlistener);
	
	}
	public void setText(String s){
		dialog.setText(s);
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);
	}
	public MyButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(MyButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}



	public void setTextArea(String s) {
		textArea.append(s+"\n");
	}


}
