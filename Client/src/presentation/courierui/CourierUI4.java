/**
 * CourierUI4是courier用户的快递查询界面
 */

package presentation.courierui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import listener.courierlistener.CourierListener4;
import presentation.MySwing.Button;

//历史轨迹及货物状态
public class CourierUI4 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	private JTextArea textArea_1;

	CourierListener4 courierlistener;

	private JLabel lblNewLabel_4;

	private JLabel lblNewLabel_5;

	private Button search;
	private int width;
	private int height;
    private JLabel label1;
	/**
	 * Create the application.
	 *
	 * @param j
	 * @param i
	 */
	public CourierUI4(int i, int j) {
		courierlistener = new CourierListener4(this);
		width = i;
		height = j;
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.white);

		this.setBounds(136, 115, 746, 437);
		setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\u8D27\u8FD0\u72B6\u6001\uFF1A");
		lblNewLabel_1.setBounds(178, 124, 100, 18);
		this.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\u8BA2\u5355\u53F7\uFF1A");
		lblNewLabel_2.setBounds(178, 174, 100, 18);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u5386\u53F2\u8F68\u8FF9");
		lblNewLabel_3.setBounds(307, 196, 100, 18);
		this.add(lblNewLabel_3);

		textArea_1 = new JTextArea();
		textArea_1.setBounds(178, 226, 354, 204);
		textArea_1.setBackground(new Color(220, 220, 220));
		this.add(textArea_1);

		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(259, 174, 100, 18);
		this.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(259, 124, 100, 18);
		this.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("\u5FEB\u9012\u7F16\u53F7");
		lblNewLabel_6.setBounds(178, 73, 100, 18);
		this.add(lblNewLabel_6);

		textField = new JTextField();
		textField.setBounds(261, 73, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		search = new Button("查询");
		search.setBounds(442, 73, 100, 30);
		this.add(search);
		search.addActionListener(courierlistener);

	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField() {
		return textField;
	}

	public Button getSearch() {
		return search;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public void setTextArea_1(JTextArea textArea_1) {
		this.textArea_1 = textArea_1;
	}

	public JTextArea getTextArea_1() {
		return textArea_1;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}
	private void setImage() {

	}
}
