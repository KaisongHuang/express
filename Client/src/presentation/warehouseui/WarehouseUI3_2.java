package presentation.warehouseui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import listener.warehouselistener.WarehouseListener3;

public class WarehouseUI3_2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	private JLabel label;
	WarehouseListener3 warehouseListener;

	public WarehouseUI3_2(WarehouseListener3 warehouseListener) {
		this.warehouseListener = warehouseListener;
		initialize();
	}

	/**
	 * initialize the frame.
	 */
	private void initialize() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 360, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		button = new JButton("确认");
		button.setBounds(60, 130, 117, 29);
		button.addActionListener(warehouseListener);
		contentPane.add(button);

		button_1 = new JButton("取消");
		button_1.setBounds(189, 130, 117, 29);
		button_1.addActionListener(warehouseListener);
		contentPane.add(button_1);

		label = new JLabel("是否确认此次分区调整？");
		label.setBounds(108, 60, 143, 16);
		contentPane.add(label);
	}

	public JButton getButton() {
		return button;
	}

	public JButton getButton_1() {
		return button_1;
	}
}
