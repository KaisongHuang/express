/**
 * WarehouseMenuUI是Warehouse用户的主界面
 */

package presentation.warehouseui;

import java.awt.CardLayout;

import javax.swing.*;

import listener.warehouselistener.WarehouseMenuListener;

public class WarehouseMenuUI extends JPanel {

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	private int width;
	private int height;
	WarehouseMenuListener listen;

	public WarehouseMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		this.width = width;
		this.height = height;

		listen = new WarehouseMenuListener(this, card, panel1);
        init();
	}

	public void init() {
		this.setSize(width, height);
		this.setLayout(null);

		button1 = new JButton("出库入库");
		button1.setBounds(0, 0, width, height / 6);
		button1.addActionListener(listen);
		this.add(button1);

		button2 = new JButton("库存盘点");
		button2.setBounds(0, height / 6, width, height / 6);
		button2.addActionListener(listen);
		this.add(button2);

		button3 = new JButton("库存报警");
		button3.setBounds(0, 2 * height / 6, width, height / 6);
		button3.addActionListener(listen);
		this.add(button3);

		button4 = new JButton("库存信息初始化");
		button4.setBounds(0, 3 * height / 6, width, height / 6);
		button4.addActionListener(listen);
		this.add(button4);
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public JButton getButton4() {
		return button4;
	}

	public JButton getButton5() {
		return button5;
	}
}
