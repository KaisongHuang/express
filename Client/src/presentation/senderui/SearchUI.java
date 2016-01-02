package presentation.senderui;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import listener.senderlistener.SenderListener;

import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;
import presentation.loginui.LoginUI;

public class SearchUI extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel state1;
	private LoginUI ui;
	private JTextArea textArea;
	private MyButton button;
	private SenderListener listen;
	private MyButton search;
	private MyTextField id;
	private MyDialog dialog;

	public SearchUI(LoginUI ui) {
		listen = new SenderListener(this);
		this.ui = ui;
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		this.setBounds(100, 100, 900, 480);
		this.setBackground(new Color(158, 211, 240));

		JLabel state = new JLabel("货运状态:");
		state.setBounds(190, 107, 84, 18);
		add(state);

		dialog = new MyDialog();
		dialog.setLocation(90, 440);
		dialog.setInvisibleColor(new Color(158, 211, 240));
		this.add(dialog);
		id = new MyTextField();
		add(id);
		id.setBounds(267, 58, 210, 30);
		search = new MyButton("查找");
		search.setBounds(541, 58, 80, 30);
		search.setMode(2);
		search.addActionListener(listen);
		add(search);

		JLabel id = new JLabel("订单编号:");
		id.setBounds(190, 64, 84, 18);
		add(id);

		state1 = new JLabel();
		state1.setBounds(267, 94, 140, 37);
		add(state1);

		textArea = new JTextArea();

		textArea.setBounds(190, 137, 519, 295);
		add(textArea);

		button = new MyButton("返回");
		button.setBounds(629, 58, 80, 30);
		button.setMode(2);
		button.addActionListener(listen);
		add(button);
		
		this.setVisible(true);

	}

	public void setMesText(String s) {
		dialog.setText(s);
	}

	public void setMesErrorText(String s) {
		dialog.setErrorText(s);
	}

	public MyButton getSearch() {
		return search;
	}

	public void setLabel2(String s) {
		state1.setText(s);
	}

	public void setText(String s) {
		textArea.append(s);
		;
	}

	public MyButton getButton() {
		return button;
	}

	public void setState1(String state1) {
		this.state1.setText(state1);
	}

	public String getText() {
		return id.getText();
	}

	public LoginUI getUi() {
		return ui;
	}
}
