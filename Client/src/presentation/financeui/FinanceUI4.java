package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		label.setBounds(105, 137, 143, 15);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(260, 131, 254, 27);
		this.add(textField);
		textField.setColumns(10);
		
		JButton button_3 = new JButton("查询");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(528, 131, 55, 27);
		this.add(button_3);
		
		JLabel label_1 = new JLabel("账号:");
		label_1.setBounds(105, 228, 33, 15);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("余额:");
		label_2.setBounds(319, 228, 33, 15);
		this.add(label_2);
		
		JButton button_5 = new JButton("修改");
		button_5.setBounds(526, 222, 57, 27);
		this.add(button_5);
		
		JButton button_6 = new JButton("删除");
		button_6.setBounds(584, 222, 57, 27);
		this.add(button_6);
		
		JButton button_4 = new JButton("新增");
		button_4.setBounds(584, 131, 57, 27);
		this.add(button_4);
		
		JButton button_1 = new JButton("期初建账");
		button_1.setBounds(211, 53, 94, 27);
		this.add(button_1);
		
		JButton button_2 = new JButton("期初信息");
		button_2.setBounds(105, 53, 94, 27);
		this.add(button_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(140, 222, 167, 27);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(347, 222, 167, 27);
		add(textArea_1);
	}
}
