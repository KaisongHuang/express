/**
 * FinanceMenuUI是finance用户的主界面
 */

package presentation.financeui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import listener.financelistener.FinanceMenuListener;
import presentation.button.MyButton;

public class FinanceMenuUI extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	MyButton button1;
	MyButton button2;
	MyButton button3;
	MyButton button4;
	FinanceMenuListener listener;
	private int width;
	private int height;
	private int label_height;

	public FinanceMenuUI(CardLayout card, int width, int height, JPanel panel1){
		this.width=width;
		this.height=height;
		this.label_height=height/10;
		listener=new FinanceMenuListener(this,card,panel1);
		init();


	}
	private void init(){
		this.setSize(width,height);
		this.setLayout(null);

		button1=new MyButton("结算管理","/导航/finance/结算管理.png");//"结算管理"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.setClicked(true);
		button1.addActionListener(listener);
		button1.addMouseListener(listener);
		this.add(button1);

		button2=new MyButton("成本管理","/导航/finance/成本管理.png");//"成本管理"
		button2.setBounds(0, label_height * 3, width, label_height);
		button2.addActionListener(listener);
		button2.addMouseListener(listener);
		this.add(button2);

		button3=new MyButton("统计报表","/导航/finance/统计报表.png");//"统计报表"
		button3.setBounds(0, label_height * 4, width, label_height);
		button3.addActionListener(listener);
		button3.addMouseListener(listener);
		this.add(button3);

		button4=new MyButton("账户管理","/导航/finance/账户管理.png");//"账户管理"
		button4.setBounds(0, label_height * 5, width, label_height);
		button4.addActionListener(listener);
		button4.addMouseListener(listener);
		this.add(button4);

	}
	public MyButton getButton1(){
		return button1;
	}
	public MyButton getButton2(){
		return button2;
	}
	public MyButton getButton3(){
		return button3;
	}
	public MyButton getButton4(){
		return button4;
	}
}
