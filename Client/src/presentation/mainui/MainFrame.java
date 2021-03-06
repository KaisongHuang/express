/**
 * 主界面
 */

package presentation.mainui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import presentation.adminui.*;
import presentation.centreui.*;
import presentation.courierui.*;
import presentation.financeui.*;
import presentation.managerui.*;
import presentation.sellingareaui.*;
import presentation.warehouseui.*;
import _enum.EmployeeMes;

public class MainFrame implements ActionListener {

	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label2;
	private int height = 600;
	private int width = 900;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private CardLayout Card;
	static Point origin = new Point();

	public static void main(String[] args) {
		new MainFrame().init();

	}

	public void init() {

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		EmployeeMes.employeePosition = "总经理";

		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setSize(width, height);
		frame.setLocation(100, 100);
		frame.addMouseListener(new MouseAdapter() {
			// 按下（mousePressed 不是点击，而是鼠标被按下没有抬起）
			public void mousePressed(MouseEvent e) {
				// 当鼠标按下的时候获得窗口当前的位置
				origin.x = e.getX();
				origin.y = e.getY();
			}
		});
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			// 拖动（mouseDragged 指的不是鼠标在窗口中移动，而是用鼠标拖动）
			public void mouseDragged(MouseEvent e) {
				// 当鼠标拖动时获取窗口当前位置
				Point p = frame.getLocation();
				// 设置窗口的位置
				// 窗口当前的位置 + 鼠标当前在窗口的位置 - 鼠标按下的时候在窗口的位置
				frame.setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
			}
		});

		panel1 = new JPanel();
		panel2 = new JPanel();

		Card = new CardLayout();
		panel1.setLayout(Card);

		setCard();
		getPanel3();

		Card.show(panel1, "0");

		panel2.setLayout(null);
		label2 = new JLabel();

		label2.setBounds(0, 0, width, height / 5);

		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/背景/卡车装饰图.png"));

		icon2.setImage(icon2.getImage().getScaledInstance(width, height / 5, Image.SCALE_SMOOTH));

		label2.setIcon(icon2);

		button1 = new JButton();
		button1.setBorderPainted(false);
		ImageIcon bi1 = new ImageIcon(this.getClass().getResource("/按钮/黄色按钮.png"));
		bi1.setImage(bi1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		button1.setIcon(bi1);
		button1.setContentAreaFilled(false);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setExtendedState(JFrame.ICONIFIED);
			}
		});

//		button2 = new JButton();
//		button2.setBorderPainted(false);
//		ImageIcon bi2 = new ImageIcon(this.getClass().getResource("/按钮/绿色按钮.png"));
//		bi2.setImage(bi2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
//		button2.setIcon(bi2);
//		button2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//			}
//		});
//		button2.setContentAreaFilled(false);
		button3 = new JButton();
		button3.setBorderPainted(false);
		ImageIcon bi3 = new ImageIcon(this.getClass().getResource("/按钮/红色按钮.png"));
		bi3.setImage(bi3.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		button3.setIcon(bi3);
		button3.setContentAreaFilled(false);

		button1.setBounds(width - 40, 0, 20, 20);
//		button2.setBounds(width - 40, 0, 20, 20);
		button3.setBounds(width - 20, 0, 20, 20);

		panel1.setBounds(width / 5, height / 5, 4 * width / 5, 4 * height / 5);
		panel2.setBounds(0, 0, width, height / 5);
		panel3.setLocation(0, height / 5);

		button3.addActionListener(this);

		panel2.add(button1);
//		panel2.add(button2);
		panel2.add(button3);

		panel2.add(label2);

		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		frame.getContentPane().add(panel3);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button3)
			System.exit(0);
	}

	public CardLayout getCard() {
		return Card;
	}

	public void setCard() {
		if (EmployeeMes.employeePosition.equals("快递员")) {
			panel1.add(new CourierUI(4 * width / 5, 4 * height / 5), "0");
			panel1.add(new CourierUI2(4 * width / 5, 4 * height / 5), "1");
			panel1.add(new CourierUI4(4 * width / 5, 4 * height / 5), "2");

		} else if (EmployeeMes.employeePosition.equals("营业厅业务员")) {
			panel1.add(new SellingAreaUI(4 * width / 5, 4 * height / 5), "0");
			panel1.add(new SellingAreaUI1(4 * width / 5, 4 * height / 5), "1");
			panel1.add(new SellingAreaUI2(4 * width / 5, 4 * height / 5), "2");
			panel1.add(new SellingAreaUI3(4 * width / 5, 4 * height / 5), "3");
			panel1.add(new SellingAreaUI4(4 * width / 5, 4 * height / 5), "4");
		} else if (EmployeeMes.employeePosition.equals("中转中心业务员")) {
			panel1.add(new CentreUI(4 * width / 5, 4 * height / 5), "0");
			panel1.add(new CentreUI1(4 * width / 5, 4 * height / 5), "1");
			panel1.add(new CentreUI2(4 * width / 5, 4 * height / 5), "2");
			panel1.add(new CentreUI3(4 * width / 5, 4 * height / 5), "3");
		} else if (EmployeeMes.employeePosition.equals("仓库管理员")) {
			panel1.add(new WarehouseUI1(), "0");
			panel1.add(new WarehouseUI2(), "1");
			panel1.add(new WarehouseUI3(), "2");
			panel1.add(new WarehouseUI4(), "3");

		} else if (EmployeeMes.employeePosition.equals("财务人员")) {
			panel1.add(new FinanceUI1(), "0");
			panel1.add(new FinanceUI2(), "1");
			panel1.add(new FinanceUI3(), "2");
			panel1.add(new FinanceUI4(), "3");
		} else if (EmployeeMes.employeePosition.equals("总经理")) {
			panel1.add(new ManagerUI1(), "0");
			panel1.add(new ManagerUI0(), "1");
			panel1.add(new ManagerUI2(), "2");
			panel1.add(new ManagerUI3(), "3");
			panel1.add(new ManagerUI4(), "4");
		} else if (EmployeeMes.employeePosition.equals("管理员")) {
			panel1.add(new AdminUI1(4 * width / 5, 4 * height / 5), "0");
			panel1.add(new AdminUI2(4 * width / 5, 4 * height / 5), "1");
			panel1.add(new AdminUI3(4 * width / 5, 4 * height / 5), "2");
			panel1.add(new AdminUI4(4 * width / 5, 4 * height / 5), "3");
		}
		panel1.setOpaque(false);
	}

	public void getPanel3() {
		if (EmployeeMes.employeePosition.equals("快递员")) {
			panel3 = new CourierMenuUI(Card, width / 5, 4 * height / 5, panel1);
		} else if (EmployeeMes.employeePosition.equals("营业厅业务员")) {
			panel3 = new SellingAreaMenuUI(Card, width / 5, 4 * height / 5, panel1);
		} else if (EmployeeMes.employeePosition.equals("中转中心业务员")) {
			panel3 = new CentreMenuUI(Card, width / 5, 4 * height / 5, panel1);
		} else if (EmployeeMes.employeePosition.equals("仓库管理员")) {
			panel3 = new WarehouseMenuUI(Card, width / 5, 4 * height / 5, panel1);
		} else if (EmployeeMes.employeePosition.equals("财务人员")) {
			panel3 = new FinanceMenuUI(Card, width / 5, 4 * height / 5, panel1);
		} else if (EmployeeMes.employeePosition.equals("总经理")) {
			panel3 = new ManagerMenuUI(Card, width / 5, 4 * height / 5, panel1);
		} else if (EmployeeMes.employeePosition.equals("管理员")) {
			panel3 = new AdminMenuUI(Card, width / 5, 4 * height / 5, panel1);
		}
	}

}
