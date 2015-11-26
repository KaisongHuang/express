package presentation.warehouseui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.warehouselistener.WarehouseListener50;

import javax.swing.JButton;
import javax.swing.JLabel;

public class WarehouseUI5_SaveInfo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	WarehouseListener50 warehouseListener50;

	/**
	 * Create the frame.
	 */
	public WarehouseUI5_SaveInfo() {
		initialize();
	}

	public void initialize() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		button = new JButton("保存");
		button.setBounds(86, 75, 117, 29);
		button.addActionListener(warehouseListener50);
		contentPane.add(button);

		button_1 = new JButton("继续修改");
		button_1.setBounds(245, 75, 117, 29);
		button_1.addActionListener(warehouseListener50);
		contentPane.add(button_1);

		JLabel label = new JLabel("是否保存新建的库存信息？");
		label.setBounds(149, 47, 244, 16);
		contentPane.add(label);
	}

	public JButton getButton() {
		return button;
	}

	public JButton getButton_1() {
		return button_1;
	}
	
	public JFrame getJFrame(){
		return this;
	}
}
