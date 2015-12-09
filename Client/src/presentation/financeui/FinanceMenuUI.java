/**
 * FinanceMenuUI是finance用户的主界面
 */

package presentation.financeui;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import listener.financelistener.FinanceMenuListener;

public class FinanceMenuUI extends JPanel{

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	FinanceMenuListener listener;
	private int width;
	private int height;
	public FinanceMenuUI(CardLayout card, int width, int height, JPanel panel1){
		this.width=width;
		this.height=height;
		listener=new FinanceMenuListener(this,card,panel1);
		init();


	}
	private void init(){
		this.setSize(width,height);
		this.setLayout(null);
		button1=new JButton("结算管理");
		button1.setBounds(0,0,width,height/6);
		this.add(button1);
		button1.addActionListener(listener);
		button2=new JButton("成本管理");
		button2.setBounds(0,height/6,width,height/6);
		this.add(button2);
		button2.addActionListener(listener);
		button3=new JButton("统计报表");
		button3.setBounds(0,2*height/6,width,height/6);
		this.add(button3);
		button3.addActionListener(listener);
		button4=new JButton("账户管理");
		button4.setBounds(0,3*height/6,width,height/6);
		this.add(button4);
		button4.addActionListener(listener);

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
	public JButton getButton4(){
		return button4;
	}
}
