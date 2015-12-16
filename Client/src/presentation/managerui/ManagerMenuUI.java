/**
 * ManagerMenuUI是manager用户的主界面
 */

package presentation.managerui;
import java.awt.CardLayout;
import javax.swing.JPanel;
import listener.managerlistener.ManagerMenuListener;
import presentation.button.MyButton;


public class ManagerMenuUI extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private MyButton button1;
	private MyButton button2;
	private MyButton button3;
	private MyButton button4;
	private MyButton button5;
	private int width;
	private int height;
	private int label_height;
	ManagerMenuListener managermenulistener;

	/**
	 * Create the application.
	 * @param height
	 * @param width
	 * @param panel1
	 */
	public ManagerMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		managermenulistener = new ManagerMenuListener(this,card,panel1);
		this.card = card;
		this.width=width;
		this.height=height;
		this.label_height=height/10;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setSize(width,height);
		this.setLayout(null);

		button1 = new MyButton("机构管理","/导航/manager/机构管理.png");//"机构管理"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.setClicked(true);
		button1.addActionListener(managermenulistener);
		button1.addMouseListener(managermenulistener);
		this.add(button1);

		button2 = new MyButton("人员管理","/导航/manager/人员管理.png");//"人员管理"

		button2.setBounds(0, label_height * 3, width, label_height);
		button2.addActionListener(managermenulistener);
		button2.addMouseListener(managermenulistener);
		this.add(button2);

		button3 = new MyButton("审批单据","/导航/manager/审批单据.png");//"审批单据"
		button3.setBounds(0, label_height * 4, width, label_height);
		button3.addActionListener(managermenulistener);
		button3.addMouseListener(managermenulistener);
		this.add(button3);

		button4 = new MyButton("查看报表","/导航/manager/查看报表.png");//"查看统计分析"
		button4.setBounds(0, label_height * 5, width, label_height);
		button4.addActionListener(managermenulistener);
		button4.addMouseListener(managermenulistener);
		this.add(button4);


		button5 = new MyButton("制定策略","/导航/manager/制定策略.png");//"制定"
		button5.setBounds(0, label_height * 6, width, label_height);
		button5.addActionListener(managermenulistener);
		button5.addMouseListener(managermenulistener);
		this.add(button5);

	}
	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
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
