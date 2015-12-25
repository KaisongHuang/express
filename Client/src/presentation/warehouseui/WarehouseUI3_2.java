package presentation.warehouseui;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.warehouselistener.WarehouseListener3;

public class WarehouseUI3_2 extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	private JLabel label;
	static Point origin = new Point();
	WarehouseListener3 warehouseListener;

	public WarehouseUI3_2(WarehouseListener3 warehouseListener) {
		this.warehouseListener = warehouseListener;
		initialize();
	}

	/**
	 * initialize the frame.
	 */
	private void initialize() {
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 360, 240);
		setUndecorated(true);
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		button = new JButton("确认");
		button.setBounds(60, 130, 117, 29);
		button.addActionListener(warehouseListener);
		contentPane.add(button);

		button_1 = new JButton("取消");
		button_1.setBounds(189, 130, 117, 29);
		button_1.addActionListener(warehouseListener);
		contentPane.add(button_1);

		label = new JLabel("是否确认此次分区调整？");
		label.setBounds(108, 60, 143, 16);
		contentPane.add(label);
	}

	public JButton getButton() {
		return button;
	}

	public JButton getButton_1() {
		return button_1;
	}
}
