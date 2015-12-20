package presentation.sellingareaui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import listener.sellingarealistener.SellingAreaListener3;
import presentation.button.SubNaviButton;

public class SellingAreaUI3 extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private SellingAreaUI3_1 ui1;
	private SellingAreaUI3_2 ui2;
	private SellingAreaUI3_3 ui3;
	private SellingAreaUI3_4 ui4;
	private SubNaviButton button1;
	private SubNaviButton button2;
	private SubNaviButton button3;
	private SubNaviButton button4;
	private int width;
	private int height;
	
	private JPanel navi_panel;
	private JPanel panel;
	private SellingAreaListener3 listener;
	
	public SellingAreaUI3(int i,int j){
		width=i;
		height=j;
		listener=new SellingAreaListener3(this);
		initialize();
	}
	
	private void initialize(){
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		setBackground(Color.white);
		ui1 = new SellingAreaUI3_1(width,height);
		ui2 = new SellingAreaUI3_2(width,height);
		ui3 = new SellingAreaUI3_3(width,height);
		ui4 = new SellingAreaUI3_4(width,height);

		panel=new JPanel();
		panel.setBounds(0,44, 746, 394);
		add(panel);
		card = new CardLayout(0, 0);
		panel.setLayout(card);
		
		panel.add(ui1, "1");
		panel.add(ui2, "2");
		panel.add(ui3, "3");
		panel.add(ui4, "4");
		card.show(panel, "1");
		
		
		navi_panel = new JPanel();
		navi_panel.setBounds(0, 0, 746, 44);
		navi_panel.setBackground(new Color(246,246,246));
		this.add(navi_panel);
		navi_panel.setLayout(null);

		button1 = new SubNaviButton("查询");
		button1.setBounds(44, 8, 90, 44);
		button1.addActionListener(listener);
		button1.addMouseListener(listener);
		button1.setClicked(true);
		navi_panel.add(button1);

		button2 = new SubNaviButton("更新");
		button2.setBounds(194, 8, 90, 44);
		button2.addActionListener(listener);
		button2.addMouseListener(listener);
		navi_panel.add(button2);

		button3 = new SubNaviButton("删除");
		button3.setBounds(348, 8, 90, 44);
		button3.addActionListener(listener);
		button3.addMouseListener(listener);
		navi_panel.add(button3);

		button4 = new SubNaviButton("添加");
		button4.setBounds(525, 8, 90, 44);
		button4.addActionListener(listener);
		button4.addMouseListener(listener);
		navi_panel.add(button4);
		
		add(navi_panel);
		
		
	}

	public JPanel getPanel() {
		return panel;
	}

	public CardLayout getCard() {
		return card;
	}

	public SubNaviButton getButton1() {
		return button1;
	}

	public SubNaviButton getButton2() {
		return button2;
	}

	public SubNaviButton getButton3() {
		return button3;
	}

	public SubNaviButton getButton4() {
		return button4;
	}
}
