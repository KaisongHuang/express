/**
 * CourierUI4是courier用户的快递查询界面
 */

package presentation.courierui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import listener.courierlistener.CourierListener4;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;

//历史轨迹及货物状态
public class CourierUI4 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private MyTextField textField;

	private JTextArea textArea;

	CourierListener4 courierlistener;

	private JLabel lblNewLabel_4;

	private JLabel lblNewLabel_5;

	private MyButton search;
	private int width;
	private int height;
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

		JLabel lblNewLabel_1 = new JLabel("订单号：");
		lblNewLabel_1.setBounds(178, 124, 100, 18);
		this.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("货运状态：");
		lblNewLabel_2.setBounds(371, 124, 100, 18);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u5386\u53F2\u8F68\u8FF9");
		lblNewLabel_3.setBounds(303, 164, 100, 18);
		this.add(lblNewLabel_3);

		textArea = new JTextArea();
		textArea.setBounds(178, 186, 354, 204);
        textArea.setFont(new Font(Font.DIALOG,10,20));
		this.add(textArea);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(442, 124, 100, 18);
		this.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(259, 124, 100, 18);
		this.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("\u5FEB\u9012\u7F16\u53F7");
		lblNewLabel_6.setBounds(178, 73, 100, 18);
		this.add(lblNewLabel_6);

		textField = new MyTextField();
		textField.setBounds(261, 73, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		search = new MyButton("查询");
		search.setBounds(408, 73, 100, 30);
		this.add(search);
		search.addActionListener(courierlistener);
		search.addMouseListener(courierlistener);

	}

	public void setTextField(MyTextField textField) {
		this.textField = textField;
	}

	public MyTextField getTextField() {
		return textField;
	}

	public MyButton getSearch() {
		return search;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}



	public void setAreaContent(String s){
		textArea.append(s);
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
