package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import listener.financelistener.FinanceListener4;

public class FinanceUI4_3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private FinanceListener4 financeListener4;

	public FinanceUI4_3(FinanceListener4 financeListener4) {
		this.financeListener4=financeListener4;
		initialize();
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		label = new JLabel("请输入银行账号关键字段:");
		label.setBounds(105, 137, 143, 15);
		this.add(label);

		textField = new JTextField();
		textField.setBounds(260, 131, 254, 27);
		this.add(textField);
		textField.setColumns(10);

		button_3 = new JButton("查询");
		button_3.setBounds(528, 131, 55, 27);
		button_3.addActionListener(financeListener4);
		this.add(button_3);

		label_1 = new JLabel("账号:");
		label_1.setBounds(105, 228, 33, 15);
		this.add(label_1);

		label_2 = new JLabel("余额:");
		label_2.setBounds(319, 228, 33, 15);
		this.add(label_2);

		button_5 = new JButton("修改");
		button_5.setBounds(526, 222, 57, 27);
		button_5.addActionListener(financeListener4);
		this.add(button_5);

		button_6 = new JButton("删除");
		button_6.setBounds(584, 222, 57, 27);
		button_6.addActionListener(financeListener4);
		this.add(button_6);

		button_4 = new JButton("新增");
		button_4.setBounds(584, 131, 57, 27);
		button_4.addActionListener(financeListener4);
		this.add(button_4);

		button_1 = new JButton("期初建账");
		button_1.setBounds(211, 53, 94, 27);
		button_1.addActionListener(financeListener4);
		this.add(button_1);

		button_2 = new JButton("期初信息");
		button_2.setBounds(105, 53, 94, 27);
		button_2.addActionListener(financeListener4);
		this.add(button_2);

		textArea = new JTextArea();
		textArea.setBounds(140, 222, 167, 27);
		add(textArea);

		textArea_1 = new JTextArea();
		textArea_1.setBounds(347, 222, 167, 27);
		add(textArea_1);

	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JTextArea getTextArea_1() {
		return textArea_1;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public JButton getButton_3() {
		return button_3;
	}

	public JButton getButton_4() {
		return button_4;
	}

	public JButton getButton_5() {
		return button_5;
	}

	public JButton getButton_6() {
		return button_6;
	}

}