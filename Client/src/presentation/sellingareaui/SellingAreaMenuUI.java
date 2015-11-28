package presentation.sellingareaui;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import listener.sellingarealistener.SellingAreaMenuListener;


public class SellingAreaMenuUI extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CardLayout card;
	
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_12;
	private JButton button;
	private int width;
	private int height;
	SellingAreaMenuListener sellingarealistener;

	/**
	 * Create the application.
	 * @param frame 
	 */
	public SellingAreaMenuUI(CardLayout card,int width,int hght, JFrame frame) {
		this.card=card;
		sellingarealistener = new SellingAreaMenuListener(this,card,frame);
		width=width;
		height=height;
		
		initialize();
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    this.setSize(width,height);
		this.setLayout(null);
		
		btnNewButton_8 = new JButton("接受与派件");
		btnNewButton_8.setBounds(0, height/6, width, height/6);
		this.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("收款");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(0, 2*height/6, 137, 55);
		this.add(btnNewButton_9);
		
		btnNewButton_7 = new JButton("车辆装车管理");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, width, height/6);
		this.add(btnNewButton_7);
		
		btnNewButton_12 = new JButton("车辆信息管理");
		btnNewButton_12.setBounds(0, 3*height/6, 137, 55);
		this.add(btnNewButton_12);
		
		button = new JButton("司机信息管理");
		button.setBounds(0, 4*height/65, width, height/6);
		this.add(button);
		
		btnNewButton_7.addActionListener(sellingarealistener);
		btnNewButton_8.addActionListener(sellingarealistener);
		btnNewButton_9.addActionListener(sellingarealistener);
		btnNewButton_12.addActionListener(sellingarealistener);
		button.addActionListener(sellingarealistener);
	
	}


	public JButton getBtnNewButton_7() {
		return btnNewButton_7;
	}

	public void setBtnNewButton_7(JButton btnNewButton_7) {
		this.btnNewButton_7 = btnNewButton_7;
	}

	public JButton getBtnNewButton_8() {
		return btnNewButton_8;
	}

	public void setBtnNewButton_8(JButton btnNewButton_8) {
		this.btnNewButton_8 = btnNewButton_8;
	}

	public JButton getBtnNewButton_9() {
		return btnNewButton_9;
	}

	public void setBtnNewButton_9(JButton btnNewButton_9) {
		this.btnNewButton_9 = btnNewButton_9;
	}

	public JButton getBtnNewButton_12() {
		return btnNewButton_12;
	}

	public void setBtnNewButton_12(JButton btnNewButton_12) {
		this.btnNewButton_12 = btnNewButton_12;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}
	
	
}
