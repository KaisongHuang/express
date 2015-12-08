package presentation.warehouseui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.warehouselistener.WarehouseListener3;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class WarehouseUI3_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JButton button;
	private JButton button_1;
	WarehouseListener3 warehouseListener;

	public WarehouseUI3_1(WarehouseListener3 warehouseListener) {
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

		label_3 = new JLabel("当前比例：");
		label_3.setBounds(90, 50, 71, 16);
		contentPane.add(label_3);

		textArea = new JTextArea();
		textArea.setBounds(160, 50, 65, 16);
		textArea.setText("90");
		textArea.setEditable(false);
		contentPane.add(textArea);

		label_4 = new JLabel("重置比例：");
		label_4.setBounds(90, 78, 71, 16);
		contentPane.add(label_4);

		textArea_1 = new JTextArea();
		textArea_1.setBounds(160, 78, 65, 16);
		contentPane.add(textArea_1);

		label_1 = new JLabel("%");
		label_1.setBounds(230, 50, 16, 16);
		contentPane.add(label_1);

		label_2 = new JLabel("%");
		label_2.setBounds(230, 78, 16, 16);
		contentPane.add(label_2);

		button = new JButton("确认");
		button.setBounds(60, 130, 117, 29);
		button.addActionListener(warehouseListener);
		contentPane.add(button);

		button_1 = new JButton("取消");
		button_1.setBounds(189, 130, 117, 29);
		button_1.addActionListener(warehouseListener);
		contentPane.add(button_1);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JTextArea getTextArea_1() {
		return textArea_1;
	}
	
	public JButton getButton() {
		return button;
	}

	public JButton getButton_1() {
		return button_1;
	}
}
