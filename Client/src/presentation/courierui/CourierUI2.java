/**
 * CourierUI2是courier用户的快递接收界面
 */

package presentation.courierui;

import javax.swing.JPanel;
import javax.swing.JLabel;

<<<<<<< HEAD
import java.awt.Image;

import javax.swing.ImageIcon;
=======
import java.awt.Color;

>>>>>>> origin/hks
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.courierlistener.CourierListener2;

//收件信息输入
public class CourierUI2 extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	CourierListener2 courierlistener;
	private JButton button;
	private int width;
	private int height;
    private JLabel label1;
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
		this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(136, 118, 748, 436);

		this.setLayout(null);
		 this.setBackground(new Color(158,211,240));
		JLabel label = new JLabel("收件编号");
		label.setBounds(116, 43, 100, 18);
		this.add(label);

		textField = new JTextField();
		textField.setBounds(231, 34, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		JLabel label_1 = new JLabel("收件人");
		label_1.setBounds(118, 109, 100, 18);
		this.add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(236, 105, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);

		JLabel label_2 = new JLabel("收件日期");
		label_2.setBounds(115, 187, 100, 18);
		this.add(label_2);

		textField_2 = new JTextField();
		textField_2.setBounds(240, 182, 122, 30);
		this.add(textField_2);
		textField_2.setColumns(10);

		button = new JButton("确认");
		button.setBounds(374, 347, 100, 30);
		this.add(button);
	    button.addActionListener(courierlistener);

	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}


	public JButton getButton() {
		return button;
	}

	private void setImage() {
		label1 = new JLabel();
		label1.setBounds(0, 0, width,height);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/蓝色背景.png"));
		icon1.setImage(icon1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

		label1.setIcon(icon1);
		this.add(label1);
	}

}
