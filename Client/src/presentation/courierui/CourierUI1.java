package presentation.courierui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import listener.courierlistener.CourierListener1;

import javax.swing.JComboBox;
//报价与时间界面

public class CourierUI1 extends JPanel{

	
	private JTextField textField;
	private JTextField textField_1;

	CourierListener1 courierlistener;

	private JButton button;
    private int width;
    private int height;
    
	/**
	 * Create the application.
	 * @param j 
	 * @param i 
	 */
	public CourierUI1(int i, int j) {
		courierlistener = new CourierListener1(this);
		this.width=i;
		this.height=j;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBounds(136, 113, 746, 440);
		
		this.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(373, 5, 0, 0);
		this.add(label);
		
		JLabel label_1 = new JLabel("\u9884\u4F30\u65F6\u95F4\uFF1A");
		label_1.setBounds(102, 64, 72, 18);
		this.add(label_1);
		
		JLabel lblYuji = new JLabel("\u62A5\u4EF7\uFF1A");
		lblYuji.setBounds(102, 146, 55, 18);
		this.add(lblYuji);
		
		textField = new JTextField();
		textField.setBounds(212, 64, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 140, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		button = new JButton("返回");
		button.setBounds(485, 382, 90, 30);
		this.add(button);
		button.addActionListener(courierlistener);
	
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}


	public JButton getButton() {
		return button;
	}

}