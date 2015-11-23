package presentation.warehouseui;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class WarehouseUI4 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public WarehouseUI4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel label = new JLabel("快递编号:");
		label.setBounds(56, 44, 57, 15);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(125, 38, 122, 27);
		this.add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("查询");
		button_1.setBounds(259, 38, 94, 27);
		this.add(button_1);
		
		JLabel label_1 = new JLabel("/*显示该货物当前位置*/");
		label_1.setBounds(56, 100, 297, 15);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("调整至:");
		label_2.setBounds(56, 160, 57, 15);
		this.add(label_2);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBounds(56, 187, 57, 25);
		this.add(comboBox);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(152, 187, 57, 25);
		this.add(comboBox_1);
		
		JComboBox<?> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(259, 187, 57, 25);
		this.add(comboBox_2);
		
		JComboBox<?> comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(360, 187, 57, 25);
		this.add(comboBox_3);
		
		JButton button_2 = new JButton("确认");
		button_2.setBounds(115, 259, 94, 27);
		this.add(button_2);
		
		JButton button_3 = new JButton("取消");
		button_3.setBounds(222, 259, 94, 27);
		this.add(button_3);
		
		JLabel label_3 = new JLabel("区");
		label_3.setBounds(115, 192, 25, 15);
		this.add(label_3);
		
		JLabel label_4 = new JLabel("排");
		label_4.setBounds(210, 192, 25, 15);
		this.add(label_4);
		
		JLabel label_5 = new JLabel("架");
		label_5.setBounds(318, 192, 25, 15);
		this.add(label_5);
		
		JLabel label_6 = new JLabel("位");
		label_6.setBounds(418, 192, 25, 15);
		this.add(label_6);
	}
}
