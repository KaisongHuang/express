/**
 * CourierUI1是courier用户的报价和时间界面
 */

package presentation.courierui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JButton;

import listener.courierlistener.CourierListener1;
import presentation.MySwing.MyTextField;

public class CourierUI1 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;

	CourierListener1 courierlistener;

	private JButton button;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public CourierUI1(int i, int j) {
		courierlistener = new CourierListener1(this);
		this.width=i;
		this.height=j;
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(136, 113, 746, 440);

		this.setLayout(null);
	
		JLabel label = new JLabel("");
		label.setBounds(373, 5, 0, 0);
		this.add(label);

		JLabel label_1 = new JLabel("\u9884\u4F30\u65F6\u95F4\uFF1A");
		label_1.setBounds(102, 64, 72, 18);
		this.add(label_1);

		JLabel lblYuji = new JLabel("\u62A5\u4EF7\uFF1A");
		lblYuji.setBounds(102, 146, 55, 18);
		this.add(lblYuji);

		textField = new MyTextField();
		textField.setBounds(212, 64, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		textField_1 = new MyTextField();
		textField_1.setBounds(212, 140, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);

		button = new JButton("返回");
		button.setBounds(485, 382, 90, 30);
		this.add(button);
		button.addActionListener(courierlistener);

	}

	public MyTextField getTextField() {
		return textField;
	}

	

	public MyTextField getTextField_1() {
		return textField_1;
	}



	public JButton getButton() {
		return button;
	}
	private void setImage() {

	}
}