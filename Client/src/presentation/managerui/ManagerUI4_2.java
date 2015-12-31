/**
 * ManagerUI41是manager用户修改价格策略的界面
 */

package presentation.managerui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import listener.managerlistener.ManagerListener4_2;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;
import vo.DistanceAndFeeVO;

public class ManagerUI4_2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField myTextField;
	private MyTextField myTextField_1;
	private MyTextField myTextField_2;
	private MyTextField myTextField_3;
	private MyButton myButton;
	private MyButton myButton_1;
	private MyButton myButton_2;

	private MyTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private ManagerBlService manager = new Manager();
	private MyDialog dialog;
	private ManagerListener4_2 managerlistener;
	private JLabel label;

	/**
	 * Create the application.
	 *
	 * @param card
	 */
	public ManagerUI4_2() {
		managerlistener = new ManagerListener4_2(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(0, 44, 790, 433);

		this.setLayout(null);
		dialog = new MyDialog();
		this.add(dialog);

		ArrayList<DistanceAndFeeVO> arr=new ArrayList<DistanceAndFeeVO>();
		arr=manager.findCity();
		System.out.println(arr.size());
		data = new Vector<Object>();
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.size());
			Vector<Object> rowData=new Vector<Object>();
			rowData.add(arr.get(i).getCity1());
			rowData.add(arr.get(i).getCity2());
			rowData.add(arr.get(i).getDistance());
			rowData.add(arr.get(i).getFee());
			data.add(rowData);
		}

		String names[] = { "城市A", "城市B", "距离(KM)","价格(每千公里)" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(managerlistener);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(21, 90, 444, 272);
		this.add(JSP);

		JLabel lbla = new JLabel("城市A：");
		lbla.setBounds(477, 101, 61, 16);
		add(lbla);

		JLabel lblb = new JLabel("城市B：");
		lblb.setBounds(477, 135, 61, 16);
		add(lblb);

		JLabel lblkm = new JLabel("距离(KM)：");
		lblkm.setBounds(477, 169, 73, 16);
		add(lblkm);

		myTextField = new MyTextField();
		myTextField.setColumns(10);
		myTextField.setBounds(550, 94, 122, 30);
		add(myTextField);

		myTextField_1 = new MyTextField();
		myTextField_1.setColumns(10);
		myTextField_1.setBounds(550, 128, 122, 30);
		add(myTextField_1);

		myTextField_2 = new MyTextField();
		myTextField_2.setColumns(10);
		myTextField_2.setBounds(550, 162, 122, 30);
		add(myTextField_2);

		myButton = new MyButton("添加");
		myButton.setBounds(477, 260, 195, 30);
		myButton.addActionListener(managerlistener);
		add(myButton);

		myButton_1 = new MyButton("修改");
		myButton_1.setBounds(477, 297, 195, 30);
		myButton_1.addActionListener(managerlistener);
		add(myButton_1);

		myButton_2 = new MyButton("删除");
		myButton_2.setBounds(477, 332, 195, 30);
		myButton_2.addActionListener(managerlistener);
		add(myButton_2);

		label = new JLabel("价格：");
		label.setBounds(477, 204, 86, 16);
		add(label);

		myTextField_3 = new MyTextField();
		myTextField_3.setColumns(10);
		myTextField_3.setBounds(550, 197, 122, 30);
		add(myTextField_3);

	}


	public MyTextField getMyTextField_3() {
		return myTextField_3;
	}

	public MyTextField getMyTextField() {
		return myTextField;
	}

	public MyTextField getMyTextField_1() {
		return myTextField_1;
	}

	public MyTextField getMyTextField_2() {
		return myTextField_2;
	}

	public MyTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public MyButton getMyButton() {
		return myButton;
	}

	public MyButton getMyButton_1() {
		return myButton_1;
	}

	public MyButton getMyButton_2() {
		return myButton_2;
	}

	public void setText(String s) {
		dialog.setText(s);
	}
}
