package presentation.senderui;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import listener.senderlistener.SenderListener;

import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;

import javax.swing.JFrame;


public class SearchUI extends JFrame{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
    private JLabel state1;

    private JTextArea textArea;
    private MyButton button;
    private SenderListener listen;
    private MyButton search;
    private MyTextField id;
    private MyDialog dialog;
	public SearchUI() {
		listen=new SenderListener(this);
		initialize();
		this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.white);
		getContentPane().setLayout(null);
		this.setBounds(100,100,900,600);
		JLabel state = new JLabel("货运状态:");
		state.setBounds(65, 73, 84, 18);
		getContentPane().add(state);

		dialog=new MyDialog();
		this.add(dialog);
		id=new MyTextField();
		getContentPane().add(id);
		id.setBounds(134,22,140,30);
		search=new MyButton("查找");
		getContentPane().add(search);
		search.setBounds(333,22,80,30);
		search.addActionListener(listen);

		JLabel id = new JLabel("订单编号:");
		id.setBounds(65, 27, 84, 18);
		getContentPane().add(id);

		state1=new JLabel();
		state1.setBounds(134, 62, 140, 37);
		getContentPane().add(state1);

		textArea = new JTextArea();

		textArea.setBounds(102, 137, 519, 307);
		getContentPane().add(textArea);

		button = new MyButton("返回");
		button.setBounds(333, 64, 80, 30);
		getContentPane().add(button);
		button.addActionListener(listen);


		this.setVisible(true);

	}

	public void setMesText(String s){
		dialog.setText(s);
	}
	public void setMesErrorText(String s){
		dialog.setErrorText(s);
	}
	public MyButton getSearch(){
		return search;
	}

	public void setLabel2(String s){
		state1.setText(s);
	}


	public void  setText(String s){
	    textArea.append(s);;
	}
	private void setImage() {
	}

	public MyButton getButton() {
		return button;
	}

	public void setState1(String state1) {
		this.state1.setText(state1);
	}

    public String getText(){
    	return id.getText();
    }

}
