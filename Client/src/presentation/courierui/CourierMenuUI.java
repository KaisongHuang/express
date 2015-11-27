package presentation.courierui;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;



import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class CourierMenuUI extends JPanel{


	JButton button1;
	JButton button2;
	JButton button3;
	CardLayout card;
	public CourierMenuUI(CardLayout card) {
		this.card=card;
		initialize();
		
	}

	
	private void initialize() {

        this.setBounds(136, 58, 746, 58);
	
        this.setLayout(null);
		
		button1 = new JButton("订单输入");
		button1.setBackground(new Color(255, 248, 220));
		button1.setBounds(0, 0, 137, 55);
		this.add(button1);
		
		button2 = new JButton("收件信息输入");
		button2.setBounds(137, 0, 137, 55);
		this.add(button2);
		
		button3 = new JButton("订单查询");
		
		button3.setBounds(271, 0, 130, 55);
		this.add(button3);
		
	}

	public JButton getButton1(){
		return button1;
	}
	public JButton getButton2(){
		return button2;
	}
	
	public JButton getButton3(){
		return button3;
	}
	
	public CardLayout getCard(){
		return card;
	}
}
