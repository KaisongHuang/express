package presentation.senderui;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import listener.senderlistener.SenderListener1;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class SearchUI1 extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1;
    private JLabel state1;
    private JLabel id1;
    private JTextArea textArea;
    private JButton button;
    private SenderListener1 listen;
	public SearchUI1() {
		listen=new SenderListener1(this);
		initialize();
		this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.white);
		this.setLayout(null);
		this.setBounds(100,100,900,600);
		JLabel state = new JLabel("货运状态:");
		state.setBounds(60, 28, 84, 18);
		this.add(state);

		label1=new JLabel();
		label1.setBounds(160, 28, 127, 31);
		JLabel id = new JLabel("订单编号:");
		id.setBounds(60, 60, 84, 18);
		this.add(id);

		state1=new JLabel();
		state1.setBounds(163, 27, 132, 18);
		this.add(state1);

		JLabel label_1 = new JLabel("历史轨迹");
		label_1.setBounds(344, 92, 72, 18);
		this.add(label_1);

		textArea = new JTextArea();

		textArea.setBounds(99, 131, 519, 307);
		this.add(textArea);

		button = new JButton("返回");
		button.setBounds(700, 499, 92, 27);
		this.add(button);
		button.addActionListener(listen);

		id1 = new JLabel();
		id1.setBounds(163, 62, 132, 18);
		add(id1);

	}
	public JLabel getLabel1(){
		return label1;
	}
	public JLabel getLabel2(){
		return state1;
	}

	public void  setText(String s){
	    textArea.append(s);;
	}
	private void setImage() {
	}
}
