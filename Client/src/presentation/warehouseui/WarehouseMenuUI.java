/**
 * WarehouseMenuUI是Warehouse用户的主界面
 */

package presentation.warehouseui;

import java.awt.CardLayout;
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
	private ImageIcon icon1;

	WarehouseMenuListener listen;

	public WarehouseMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		this.width = width;
		this.height = height;

		listen = new WarehouseMenuListener(this, card, panel1);
		getImage();
        init();
	}

	public void init() {
		this.setSize(width, height);
		this.setLayout(null);

		button1 = new MyButton();//"出库入库"
		button1.setBounds(0, 0, width, height / 6);
		button1.addActionListener(listen);
		button1.addMouseListener(listen);
		button1.setIcon(icon1);
		this.add(button1);

		button2 = new MyButton();//"库存盘点"
		button2.setBounds(0, height / 6, width, height / 6);
		button2.addActionListener(listen);
		button2.addMouseListener(listen);
		this.add(button2);

		button3 = new MyButton();//"库存报警"
		button3.setBounds(0, 2 * height / 6, width, height / 6);
		button3.addActionListener(listen);
		button3.addMouseListener(listen);
		this.add(button3);

		button4 = new MyButton();//"库存信息初始化"
		button4.setBounds(0, 3 * height / 6, width, height / 6);
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

	private void getImage(){
		icon1 = new ImageIcon(this.getClass().getResource("/出库入库.png"));
//		icon1.setImage(icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));

	}
}
