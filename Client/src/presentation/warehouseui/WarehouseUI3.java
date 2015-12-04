package presentation.warehouseui;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class WarehouseUI3 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;


	/**
	 * Create the application.
	 */
	public WarehouseUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(135, 40, 57, 15);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("设置警戒比例:");
		lblNewLabel_2.setBounds(261, 40, 86, 15);
		this.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(342, 34, 57, 27);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("当前比例设置:");
		label_1.setBounds(49, 40, 86, 15);
		this.add(label_1);
		
		JButton btnNewButton_10 = new JButton("确认");
		btnNewButton_10.setBounds(399, 34, 57, 27);
		this.add(btnNewButton_10);
	}
}
