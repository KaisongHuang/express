package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinanceUI4 extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	public FinanceUI4() {
		initialize();
	}

	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel label = new JLabel("请输入银行账号关键字段:");
		label.setBounds(60, 41, 143, 15);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(215, 35, 143, 27);
		this.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("查询");
		button.setBounds(370, 35, 94, 27);
		this.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(60, 95, 398, 27);
		this.add(textArea);
		
		JLabel label_1 = new JLabel("账号");
		label_1.setBounds(96, 80, 57, 15);
		this.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("余额");
		lblNewLabel_1.setBounds(380, 80, 57, 15);
		this.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("操作");
		label_2.setBounds(582, 137, 57, 15);
		this.add(label_2);
		
		JButton btnNewButton_10 = new JButton("修改");
		btnNewButton_10.setBounds(572, 164, 57, 27);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("删除");
		btnNewButton_11.setBounds(470, 95, 57, 27);
		this.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("新增");
		btnNewButton_13.setBounds(572, 245, 57, 27);
		this.add(btnNewButton_13);
		
		JButton button_1 = new JButton("期初建账");
		button_1.setBounds(565, 35, 94, 27);
		this.add(button_1);
		
		JButton btnNewButton_14 = new JButton("期初信息");
		btnNewButton_14.setBounds(575, 74, 94, 27);
		this.add(btnNewButton_14);
	}
}
