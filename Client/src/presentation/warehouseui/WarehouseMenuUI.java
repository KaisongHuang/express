/**
 * WarehouseMenuUI是Warehouse用户的主界面
 */

package presentation.warehouseui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

import listener.warehouselistener.WarehouseMenuListener;
import presentation.button.MyButton;

public class WarehouseMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyButton button1;
	private MyButton button2;
	private MyButton button3;
	private MyButton button4;
	private MyButton button5;
	private int width;
	private int height;
	private int label_height;
	private ImageIcon icon1;

	WarehouseMenuListener listen;

	public WarehouseMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		this.width = width;
		this.height = height;
		this.label_height = height / 10;
		listen = new WarehouseMenuListener(this, card, panel1);
		init();
	}

	public void init() {
		this.setSize(width, height);
		this.setLayout(null);
		this.setBackground(new Color(246, 246, 246));

		button1 = new MyButton("出库入库","/导航/warehouse/出库入库.png");// "出库入库"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.setClicked(true);
		button1.addActionListener(listen);
		button1.addMouseListener(listen);
		button1.setIcon(icon1);
		this.add(button1);

		button2 = new MyButton("库存盘点","/导航/warehouse/库存盘点.png");// "库存盘点"
		button2.setBounds(0, label_height * 3, width, label_height);
		button2.addActionListener(listen);
		button2.addMouseListener(listen);
		this.add(button2);

		button3 = new MyButton("库存报警","/导航/warehouse/库存报警.png");// "库存报警"
		button3.setBounds(0, label_height * 4, width, label_height);
		button3.addActionListener(listen);
		button3.addMouseListener(listen);
		this.add(button3);

		button4 = new MyButton("库存初始化","/导航/warehouse/初始化.png");// "库存信息初始化"
		button4.setBounds(0, label_height * 5, width, label_height);
		button4.addActionListener(listen);
		button4.addMouseListener(listen);
		this.add(button4);
	}

	public MyButton getButton1() {
		return button1;
	}

	public MyButton getButton2() {
		return button2;
	}

	public MyButton getButton3() {
		return button3;
	}

	public MyButton getButton4() {
		return button4;
	}

	public MyButton getButton5() {
		return button5;
	}

}
