package presentation.warehouseui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.warehouselistener.WarehouseListener3;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class WarehouseUI3_1 extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MyTextField textArea;
	private MyTextField textArea_1;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private MyButton button;
	private MyButton button_1;
	private String Default;
	static Point origin = new Point();
	WarehouseListener3 warehouseListener;
	//private int

	public WarehouseUI3_1(WarehouseListener3 warehouseListener,String Default) {
		this.warehouseListener = warehouseListener;
		this.Default=Default;
		initialize();
	}

	/**
	 * initialize the frame.
	 */
	private void initialize() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 360, 240);
		setUndecorated(true);
		setVisible(true);

		addMouseListener(new MouseAdapter() {
			// 按下（mousePressed 不是点击，而是鼠标被按下没有抬起）
			public void mousePressed(MouseEvent e) {
				// 当鼠标按下的时候获得窗口当前的位置
				origin.x = e.getX();
				origin.y = e.getY();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			// 拖动（mouseDragged 指的不是鼠标在窗口中移动，而是用鼠标拖动）
			public void mouseDragged(MouseEvent e) {
				// 当鼠标拖动时获取窗口当前位置
				Point p = getLocation();
				// 设置窗口的位置
				// 窗口当前的位置 + 鼠标当前在窗口的位置 - 鼠标按下的时候在窗口的位置
				setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
			}
		});

		contentPane = new JPanel();
		contentPane.setBackground(new Color(240,248,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		label_3 = new JLabel("当前比例：");
		label_3.setBounds(90, 50, 71, 16);
		contentPane.add(label_3);

		textArea = new MyTextField();
		textArea.setBounds(160, 50, 65, 16);
		textArea.setText(Default);
		textArea.setEditable(false);
		contentPane.add(textArea);

		label_4 = new JLabel("重置比例：");
		label_4.setBounds(90, 78, 71, 16);
		contentPane.add(label_4);

		textArea_1 = new MyTextField();
		textArea_1.setBounds(160, 78, 65, 16);
		contentPane.add(textArea_1);

		label_1 = new JLabel("%");
		label_1.setBounds(230, 50, 16, 16);
		contentPane.add(label_1);

		label_2 = new JLabel("%");
		label_2.setBounds(230, 78, 16, 16);
		contentPane.add(label_2);

		button = new MyButton("确认");
		button.setBounds(60, 130, 117, 29);
		button.addActionListener(warehouseListener);
		contentPane.add(button);

		button_1 = new MyButton("取消");
		button_1.setBounds(189, 130, 117, 29);
		button_1.addActionListener(warehouseListener);
		contentPane.add(button_1);
	}

	public MyTextField getTextField() {
		return textArea;
	}

	public MyTextField getTextField_1() {
		return textArea_1;
	}

	public MyButton getButton() {
		return button;
	}

	public MyButton getButton_1() {
		return button_1;
	}
	//private void setImage() {
		//label1 = new JLabel();
		//label1.setBounds(0, 0, width,height);
		//ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/蓝色背景.png"));
		//icon1.setImage(icon1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

		//label1.setIcon(icon1);
		//this.add(label1);
	//}
}
