package presentation.warehouseui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.warehouselistener.WarehouseListener50;

import javax.swing.JButton;
import javax.swing.JLabel;

public class WarehouseUI5_SaveInfo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		
		this.setLayout(null);

		button = new JButton("保存");
		button.setBounds(86, 75, 117, 29);
		button.addActionListener(warehouseListener50);
		this.add(button);

		button_1 = new JButton("继续修改");
		button_1.setBounds(245, 75, 117, 29);
		button_1.addActionListener(warehouseListener50);
		this.add(button_1);

		JLabel label = new JLabel("是否保存新建的库存信息？");
		label.setBounds(149, 47, 244, 16);
		this.add(label);
	}

	public JButton getButton() {
		return button;
	}

	public JButton getButton_1() {
		return button_1;
	}
}
