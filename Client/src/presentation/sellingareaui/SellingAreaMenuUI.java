/**
 * SellingAreaMenuUI是sellingarea用户的主界面
 */

package presentation.sellingareaui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import listener.sellingarealistener.SellingAreaMenuListener;
import presentation.button.MyButton;


public class SellingAreaMenuUI extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private CardLayout card;

	private MyButton button1;
	private MyButton button2;
	private MyButton button3;
	private MyButton button4;
	private MyButton button;
	private int width;
	private int height;
	private int label_height;
	SellingAreaMenuListener sellingarealistener;

	/**
	 * Create the application.
	 * @param panel1
	 */
	public SellingAreaMenuUI(CardLayout card,int width,int height, JPanel panel1) {
		this.card=card;
		sellingarealistener = new SellingAreaMenuListener(this,card,panel1);
		this.width=width;
		this.height=height;
		this.label_height = height / 10;
		initialize();
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    this.setSize(width,height);
		this.setLayout(null);

		button2 = new MyButton("接收与派件","/导航/sellingarea/接收与派件.png");//"接收与派件"
		button2.setBounds(0, label_height * 3, width, label_height);
		this.add(button2);

		button3 = new MyButton("录入收款单","/导航/sellingarea/录入收款单.png");//"收款"
		button3.setBounds(0, label_height * 4, width, label_height);
		this.add(button3);

		button1 = new MyButton("快件装车管理","/导航/sellingarea/快件装车管理.png");//"车辆装车管理"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.setClicked(true);
		this.add(button1);

		button4 = new MyButton("车辆信息管理","/导航/sellingarea/车辆信息管理.png");//"车辆信息管理"
		button4.setBounds(0, label_height * 5, width, label_height);
		this.add(button4);

		button = new MyButton("司机信息管理","/导航/sellingarea/司机信息管理.png");//"司机信息管理"
		button.setBounds(0, label_height * 6, width, label_height);
		this.add(button);

		button1.addActionListener(sellingarealistener);
		button2.addActionListener(sellingarealistener);
		button3.addActionListener(sellingarealistener);
		button4.addActionListener(sellingarealistener);
		button.addActionListener(sellingarealistener);
		button1.addMouseListener(sellingarealistener);
		button2.addMouseListener(sellingarealistener);
		button3.addMouseListener(sellingarealistener);
		button4.addMouseListener(sellingarealistener);
		button.addMouseListener(sellingarealistener);

	}


	public MyButton getButton1() {
		return button1;
	}

	public void setbutton1(MyButton button1) {
		this.button1 = button1;
	}

	public MyButton getButton2() {
		return button2;
	}

	public void setbutton2(MyButton button2) {
		this.button2 = button2;
	}

	public MyButton getButton3() {
		return button3;
	}

	public void setbutton3(MyButton button3) {
		this.button3 = button3;
	}

	public MyButton getButton4() {
		return button4;
	}

	public void setbutton4(MyButton button4) {
		this.button4 = button4;
	}

	public MyButton getButton() {
		return button;
	}

	public void setButton(MyButton button) {
		this.button = button;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}


}
