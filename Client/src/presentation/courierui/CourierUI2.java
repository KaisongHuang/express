/**
 * CourierUI2是courier用户的快递接收界面
 */

package presentation.courierui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import listener.courierlistener.CourierListener2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;

//收件信息输入
public class CourierUI2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;
    private MyDialog dialog;
	CourierListener2 courierlistener;
	private MyButton confirm;
	private int width;
	private int height;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public CourierUI2(int i, int j) {
		courierlistener = new CourierListener2(this);
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
		this.setBounds(136, 118, 748, 436);
		setBackground(Color.white);
		this.setLayout(null);
		
		dialog=new MyDialog();
		this.add(dialog);
		JLabel label = new JLabel("收件编号");
		label.setBounds(116, 43, 100, 18);
		this.add(label);

		textField = new MyTextField();
		textField.setBounds(231, 34, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		JLabel label_1 = new JLabel("收件人");
		label_1.setBounds(118, 109, 100, 18);
		this.add(label_1);

		textField_1 = new MyTextField();
		textField_1.setBounds(236, 105, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);

		JLabel label_2 = new JLabel("收件日期");
		label_2.setBounds(115, 187, 100, 18);
		this.add(label_2);

		textField_2 = new MyTextField();
		textField_2.setBounds(240, 182, 122, 30);
		this.add(textField_2);
		textField_2.setColumns(10);

		confirm = new MyButton("确认");
		confirm.setBounds(240, 249, 100, 30);
		this.add(confirm);
		confirm.addActionListener(courierlistener);
		confirm.addMouseListener(courierlistener);

	}
	public void setText(String s){
		dialog.setText(s);
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);
	}
	public MyTextField getTextField() {
		return textField;
	}

	public void setTextField(MyTextField textField) {
		this.textField = textField;
	}

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(MyTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(MyTextField textField_2) {
		this.textField_2 = textField_2;
	}


	public MyButton getConfirm() {
		return confirm;
	}

	private void setImage() {

	}

}
