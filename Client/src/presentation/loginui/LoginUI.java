package presentation.loginui;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import listener.mainlistener.LoginListener;
import presentation.MySwing.MyButton;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

public class LoginUI extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField1;
	private MyButton Login;
	private MyButton Search;
	private LoginListener listener;
	private JButton logout;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JLabel label;
	private int height = 600;
	private int width = 900;
	static Point origin = new Point();

	/**
	 * Create the frame.
	 */
	public LoginUI() {
		try {
		       final int SystemFontSize = 13;
		       final int DataFontSize = 13;
		       final Font SystemFont = new Font("stkaiti", Font.PLAIN,
		                                        SystemFontSize);
		       final Font DataFont = new Font("stkaiti", Font.PLAIN,
		                                      DataFontSize);
		       //   可以通过修改下面的代码,变换窗口的风格
		       //   其它的外观风格类,可以通过引入外部JAR包来实现
		       //   其它类型的LOOK&FEEL包
		       //    LookAndFeel alloyLnF = new com.incors.plaf.alloy.AlloyLookAndFeel();
		       //   UIManager.getSystemLookAndFeelClassName();
		         JFrame.setDefaultLookAndFeelDecorated(true);
		         JDialog.setDefaultLookAndFeelDecorated(true);
		         javax.swing.plaf.FontUIResource fontResource = new javax.swing.plaf.
		             FontUIResource(SystemFont);
		         javax.swing.plaf.FontUIResource datafontResource = new javax.swing.plaf.
		             FontUIResource(DataFont);
		         //UI管理器之字体管理
		         UIManager.put("Button.font", fontResource);
		         UIManager.put("ToggleButton.font", fontResource);
		         UIManager.put("RadioButton.font", fontResource);
		         UIManager.put("CheckBox.font", fontResource);
		         UIManager.put("ColorChooser.font", fontResource);
		         UIManager.put("ToggleButton.font", fontResource);
		         UIManager.put("ComboBox.font", fontResource);
		         UIManager.put("ComboBoxItem.font", fontResource);
		         UIManager.put("InternalFrame.titleFont", fontResource);
		         UIManager.put("Label.font", fontResource);
		         UIManager.put("List.font", datafontResource);
		         UIManager.put("MenuBar.font", fontResource);
		         UIManager.put("Menu.font", fontResource);
		         UIManager.put("MenuItem.font", fontResource);
		         UIManager.put("RadioButtonMenuItem.font", fontResource);
		         UIManager.put("CheckBoxMenuItem.font", fontResource);
		         UIManager.put("PopupMenu.font", fontResource);
		         UIManager.put("OptionPane.font", fontResource);
		         UIManager.put("Panel.font", fontResource);
		         UIManager.put("ProgressBar.font", fontResource);
		         UIManager.put("ScrollPane.font", fontResource);
		         UIManager.put("Viewport", fontResource);
		         UIManager.put("TabbedPane.font", fontResource);
		         UIManager.put("TableHeader.font", fontResource);
		         UIManager.put("TextField.font", datafontResource);
		         UIManager.put("PasswordFiled.font", datafontResource);
		         UIManager.put("TextArea.font", datafontResource);
		         UIManager.put("TextPane.font", datafontResource);
		         UIManager.put("EditorPane.font", fontResource);
		         UIManager.put("TitledBorder.font", fontResource);
		         UIManager.put("ToolBar.font", fontResource);
		         UIManager.put("ToolTip.font", fontResource);
		         UIManager.put("Tree.font", datafontResource);
		         UIManager.put("TabbedPane.font", datafontResource);
		         UIManager.put("ComboBox.font", datafontResource);
		         UIManager.put("ProgressBar.repaintInterval", new Integer(150));
		         UIManager.put("ProgressBar.cycleTime", new Integer(1050));
		       }
		       catch (Exception ex) {
		         System.out.println("UIManager 异常 \r\n" + ex.toString());
		       }

		setBackground(Color.white);
		this.setUndecorated(true);
		this.addMouseListener(new MouseAdapter() {
			// 按下（mousePressed 不是点击，而是鼠标被按下没有抬起）
			public void mousePressed(MouseEvent e) {
				// 当鼠标按下的时候获得窗口当前的位置
				origin.x = e.getX();
				origin.y = e.getY();
			}
		});
		this.addMouseMotionListener(new MouseMotionAdapter() {
			// 拖动（mouseDragged 指的不是鼠标在窗口中移动，而是用鼠标拖动）
			public void mouseDragged(MouseEvent e) {
				// 当鼠标拖动时获取窗口当前位置
				Point p = getLocation();
				// 设置窗口的位置
				// 窗口当前的位置 + 鼠标当前在窗口的位置 - 鼠标按下的时候在窗口的位置
				setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
			}
		});

		label = new JLabel();

		listener = new LoginListener(this);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(158, 211, 240));
		lblUserName = new JLabel("用户名:");
//		lblUserName.setFont(new Font("kaiti", Font.PLAIN, 12));

		lblUserName.setBounds(311, 232, 50, 16);
		contentPane.add(lblUserName);

		lblPassword = new JLabel("密码:");
		lblPassword.setBounds(311, 300, 50, 16);
		contentPane.add(lblPassword);

		textField = new JTextField();
		textField.setBounds(380, 227, 196, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		textField1 = new JPasswordField();
		textField1.setBounds(380, 295, 196, 28);
		contentPane.add(textField1);
		textField1.setColumns(10);

		logout = new JButton();
		logout.setBounds(880, 0, 20, 20);
		contentPane.add(logout);
		logout.addActionListener(listener);

		Login = new MyButton("登录");
		Login.setBounds(476, 362, 100, 28);
		Login.addActionListener(listener);
		Login.addMouseListener(listener);
		contentPane.add(Login);
		
		
		setImage();
		this.setVisible(true);

		Search = new MyButton("查询");
		Search.setBounds(311, 362, 100, 28);
		Search.addActionListener(listener);
		Search.addMouseListener(listener);
		contentPane.add(Search);
		
	}

	private void setImage() {

		label.setBounds(0, 0, width, height / 5);

		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/背景/装饰图.png"));
		icon2.setImage(icon2.getImage().getScaledInstance(width, height / 5, Image.SCALE_SMOOTH));
		label.setIcon(icon2);

		Login.setBackground(new Color(207, 248, 240));

		logout.setBorderPainted(false);
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/按钮/红色按钮.png"));
		icon4.setImage(icon4.getImage().getScaledInstance(logout.getWidth(), logout.getHeight(), Image.SCALE_SMOOTH));
		logout.setIcon(icon4);
		logout.setContentAreaFilled(false);
		contentPane.add(label);


	}

	public JTextField getText() {
		return textField;
	}

	public JTextField getText1() {
		return textField1;
	}

	public JButton getLogout() {
		return logout;

	}

	public MyButton getLogin() {
		return Login;
	}

	public MyButton getSearch() {
		return Search;
	}


}
