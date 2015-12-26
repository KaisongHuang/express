/**
 * CentreUI2是centre用户的中转转出货运界面
 */

package presentation.centreui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.centrelistener.CentreListener2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;


public class CentreUI2 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private MyTextField textField_4;
	private MyTextField textField_5;
	private MyTextField textField_6;
	private MyTextField textField_7;
	private MyTextField textField_8;
	
	private MyButton confirm;
	private MyButton cancle;

	CentreListener2 centrelistener;
	private int width;
	private int height;

	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public CentreUI2(int i, int j) {
		width=i;
		height=j;
		centrelistener = new CentreListener2(this);
		initialize();
		this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {




		this.setBackground(Color.white);
		this.setBounds(136, 116, 746, 437);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 746, 47);
		this.add(panel_5);
		panel_5.setLayout(null);

		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(75, 59, 476, 282);
		this.add(panel_6);
		panel_6.setLayout(null);


		JLabel lblNewLabel_1 = new JLabel("中转转出");
		lblNewLabel_1.setBounds(202, 6, 100, 18);
		panel_6.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("到达日期：");
		lblNewLabel_2.setBounds(19, 44, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField = new MyTextField();
		textField.setBounds(102, 38, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		textField_1 = new MyTextField();
		textField_1.setBounds(102, 90, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new MyTextField();
		textField_2.setBounds(102, 140, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new MyTextField();
		textField_3.setBounds(102, 194, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new MyTextField();
		textField_4.setBounds(348, 38, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("中转中心编号：");
		lblNewLabel_3.setBounds(19, 96, 100, 18);
		panel_6.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("列车班号：");
		lblNewLabel_4.setBounds(19, 146, 100, 18);
		panel_6.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("货柜号：");
		lblNewLabel_5.setBounds(19, 200, 100, 18);
		panel_6.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("出发地：");
		lblNewLabel_6.setBounds(277, 44, 100, 18);
		panel_6.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("目的地：");
		lblNewLabel_7.setBounds(277, 96, 100, 18);
		panel_6.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("监装员：");
		lblNewLabel_8.setBounds(277, 146, 100, 18);
		panel_6.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("押运员：");
		lblNewLabel_9.setBounds(277, 200, 100, 18);
		panel_6.add(lblNewLabel_9);

		textField_5 = new MyTextField();
		textField_5.setBounds(348, 90, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new MyTextField();
		textField_6.setBounds(348, 140, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new MyTextField();
		textField_7.setBounds(348, 194, 122, 30);
		panel_6.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("费用：");
		lblNewLabel_10.setBounds(19, 243, 100, 18);
		panel_6.add(lblNewLabel_10);

		textField_8 = new MyTextField();
		textField_8.setBounds(102, 243, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);

		confirm = new MyButton("确认");
		confirm.setBounds(83, 379, 90, 30);
		confirm.addMouseListener(centrelistener);
		confirm.addActionListener(centrelistener);
	    this.add(confirm);

		cancle = new MyButton("清空");
		cancle.setBounds(401, 379, 90, 30);
		cancle.addMouseListener(centrelistener);
		cancle.addActionListener(centrelistener);
		this.add(cancle);

	}


	public JTextField getTextField() {
		return textField;
	}

	

	public JTextField getTextField_1() {
		return textField_1;
	}

	

	public JTextField getTextField_2() {
		return textField_2;
	}

	

	public JTextField getTextField_3() {
		return textField_3;
	}

	
	public JTextField getTextField_4() {
		return textField_4;
	}

	

	public JTextField getTextField_5() {
		return textField_5;
	}

	

	public JTextField getTextField_6() {
		return textField_6;
	}

	

	public JTextField getTextField_7() {
		return textField_7;
	}

	

	public JTextField getTextField_8() {
		return textField_8;
	}


	

	public MyButton getConfirm() {
		return confirm;
	}



	public MyButton getCancle() {
		return cancle;
	}

	

	private void setImage() {

	}
}