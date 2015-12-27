package listener.financelistener;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import _enum.Operation;
import _enum.ResultMessage;
import logic.financebl.Finance;
import presentation.MySwing.MyButton;
import presentation.financeui.FinanceUI4;
import vo.AccountVO;

public class FinanceListener4 implements ActionListener, MouseListener {
	private FinanceUI4 ui;
	Finance finance = new Finance();
	ResultMessage rm = null;
	static Point origin = new Point();

	public FinanceListener4(FinanceUI4 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getUi3().getButton_2()) {
			System.out.println("期初信息");

			ui.getCard().show(ui, "1");

			ArrayList<AccountVO> vo = finance.checkInitInfo();
			Vector<Object> data = new Vector<Object>();

			for (int i = 0; i < vo.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(vo.get(i).getBankAccount());
				item.add(vo.get(i).getBalance());
				ui.getUi1().getModel().addRow(item);
				data.add(item);
			}

			ui.getUi1().setData(data);
		} else if (e.getSource() == ui.getUi1().getRet()) {
			System.out.println("返回");

			ui.getCard().show(ui, "0");

			// clear table
			int n = ui.getUi1().getModel().getRowCount();
			for (int i = 0; i < n; i++) {
				ui.getUi1().getModel().removeRow(0);
			}

		} else if (e.getSource() == ui.getUi3().getButton_1()) {
			System.out.println("期初建账");
			ui.getCard().show(ui, "2");
		} else if (e.getSource() == ui.getUi2().getAdd()) {
			String account = ui.getUi2().getTextField().getText();
			double balance = Double.parseDouble(ui.getUi2().getTextField_1().getText());
			Vector<Object> item = new Vector<Object>();
			item.add(account);
			item.add(balance);
			ui.getUi2().getModel().addRow(item);
		} else if (e.getSource() == ui.getUi2().getClear()) {
			ui.getUi2().getTextField().setText("");
			ui.getUi2().getTextField_1().setText("");
		} else if (e.getSource() == ui.getUi2().getDelete()) {
			int selectedRow = ui.getUi2().getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getUi2().getModel().removeRow(selectedRow); // 删除行
			}
		} else if (e.getSource() == ui.getUi2().getSave()) {
			final JFrame jf = new JFrame();

			jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			jf.setBounds(300, 300, 450, 150);
			jf.setUndecorated(true);
			jf.setVisible(true);

			jf.addMouseListener(new MouseAdapter() {
				// 按下（mousePressed 不是点击，而是鼠标被按下没有抬起）
				public void mousePressed(MouseEvent e) {
					// 当鼠标按下的时候获得窗口当前的位置
					origin.x = e.getX();
					origin.y = e.getY();
				}
			});
			jf.addMouseMotionListener(new MouseMotionAdapter() {
				// 拖动（mouseDragged 指的不是鼠标在窗口中移动，而是用鼠标拖动）
				public void mouseDragged(MouseEvent e) {
					// 当鼠标拖动时获取窗口当前位置
					Point p = jf.getLocation();
					// 设置窗口的位置
					// 窗口当前的位置 + 鼠标当前在窗口的位置 - 鼠标按下的时候在窗口的位置
					jf.setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
				}
			});

			JPanel contentPane = new JPanel();
			contentPane.setBackground(Color.WHITE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			jf.setContentPane(contentPane);
			contentPane.setLayout(null);

			final MyButton button = new MyButton("保存");
			button.setBounds(86, 75, 117, 29);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < ui.getUi2().getTable().getRowCount(); i++) {
//						AccountVO vo = new AccountVO();
						Vector<Object> rowData = new Vector<Object>();
						for (int j = 0; j < 2; j++) {
							rowData.add(ui.getUi2().getTable().getValueAt(i, j));
						}
						rm = finance.initAccount(new AccountVO((String)rowData.get(0),(Double)rowData.get(1)));
//						check(rm);
					}

					ui.getUi2().getTextField().setText("");
					ui.getUi2().getTextField_1().setText("");

					while(ui.getUi2().getModel().getRowCount()>0)
						ui.getUi2().getModel().removeRow(0);


					jf.dispose();
				}
			});

			contentPane.add(button);

			final MyButton button_1 = new MyButton("继续修改");
			button_1.setBounds(245, 75, 117, 29);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jf.dispose();
				}
			});

			contentPane.add(button_1);

			JLabel label = new JLabel("是否保存新建的库存信息？");
			label.setBounds(149, 47, 244, 16);
			contentPane.add(label);
		} else if (e.getSource() == ui.getUi2().getRet()) {
			System.out.println("返回");
			int n=ui.getUi2().getTable().getRowCount();
			for (int i = 0; i < n; i++) {
				ui.getUi2().getModel().removeRow(0);
			}
			ui.getCard().show(ui, "0");
		} else if (e.getSource() == ui.getUi2().getClearAll()) {
			final JFrame jf = new JFrame();

			jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			jf.setBounds(300, 300, 450, 150);
			jf.setUndecorated(true);
			jf.setVisible(true);
			jf.addMouseListener(new MouseAdapter() {
				// 按下（mousePressed 不是点击，而是鼠标被按下没有抬起）
				public void mousePressed(MouseEvent e) {
					// 当鼠标按下的时候获得窗口当前的位置
					origin.x = e.getX();
					origin.y = e.getY();
				}
			});
			jf.addMouseMotionListener(new MouseMotionAdapter() {
				// 拖动（mouseDragged 指的不是鼠标在窗口中移动，而是用鼠标拖动）
				public void mouseDragged(MouseEvent e) {
					// 当鼠标拖动时获取窗口当前位置
					Point p = jf.getLocation();
					// 设置窗口的位置
					// 窗口当前的位置 + 鼠标当前在窗口的位置 - 鼠标按下的时候在窗口的位置
					jf.setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
				}
			});

			JPanel contentPane = new JPanel();
			contentPane.setBackground(Color.WHITE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			jf.setContentPane(contentPane);
			contentPane.setLayout(null);

			final MyButton button = new MyButton("确认");
			button.setBounds(86, 75, 117, 29);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rm = finance.clearAccount();
					System.out.println("clear");
					check(rm);
					jf.dispose();
				}
			});
			contentPane.add(button);

			final MyButton button_1 = new MyButton("取消");
			button_1.setBounds(245, 75, 117, 29);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jf.dispose();
				}
			});
			contentPane.add(button_1);

			JLabel label = new JLabel("是否确认清空库存信息？");
			label.setBounds(149, 47, 244, 16);
			contentPane.add(label);

		} else if (e.getSource() == ui.getUi3().getButton_4()) {
			// add new bankaccount
			String account = ui.getUi3().getTextField_1().getText();
			double money = Double.parseDouble(ui.getUi3().getTextField_2().getText());
			AccountVO vo = new AccountVO(account, money);
			if (!check(vo))
				return;
			rm = finance.manageAccount(vo, Operation.insert);
			check(rm);
		} else if (e.getSource() == ui.getUi3().getButton_6()) {
			// delete selected account
			final JFrame jf = new JFrame();

			jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			jf.setBounds(300, 300, 450, 150);
			jf.setUndecorated(true);
			jf.setVisible(true);

			jf.addMouseListener(new MouseAdapter() {
				// 按下（mousePressed 不是点击，而是鼠标被按下没有抬起）
				public void mousePressed(MouseEvent e) {
					// 当鼠标按下的时候获得窗口当前的位置
					origin.x = e.getX();
					origin.y = e.getY();
				}
			});
			jf.addMouseMotionListener(new MouseMotionAdapter() {
				// 拖动（mouseDragged 指的不是鼠标在窗口中移动，而是用鼠标拖动）
				public void mouseDragged(MouseEvent e) {
					// 当鼠标拖动时获取窗口当前位置
					Point p = jf.getLocation();
					// 设置窗口的位置
					// 窗口当前的位置 + 鼠标当前在窗口的位置 - 鼠标按下的时候在窗口的位置
					jf.setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
				}
			});

			JPanel contentPane = new JPanel();
			contentPane.setBackground(Color.WHITE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			jf.setContentPane(contentPane);
			contentPane.setLayout(null);

			final MyButton button = new MyButton("确认");
			button.setBounds(86, 75, 117, 29);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int selectedRow = ui.getUi3().getTable().getSelectedRow();// 获得选中行的索引
					String account = (String) ui.getUi3().getTable().getValueAt(selectedRow, 0);
					double money = (Double) ui.getUi3().getTable().getValueAt(selectedRow, 1);
					rm = finance.manageAccount(new AccountVO(account, money), Operation.delete);

					if (selectedRow != -1) // 存在选中行
						ui.getUi3().getModel().removeRow(selectedRow); // 删除行
					ui.getUi3().getTextField_1().setText("");
					ui.getUi3().getTextField_2().setText("");
					jf.dispose();
					check(rm);
				}
			});
			contentPane.add(button);

			final MyButton button_1 = new MyButton("取消");
			button_1.setBounds(245, 75, 117, 29);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jf.dispose();
				}
			});
			contentPane.add(button_1);

			JLabel label = new JLabel("是否确认删除此条账户信息？");
			label.setBounds(149, 47, 244, 16);
			contentPane.add(label);


		} else if (e.getSource() == ui.getUi3().getButton_5()) {
			// edit selected account

			String account = ui.getUi3().getTextField_1().getText();
			double money = Double.parseDouble(ui.getUi3().getTextField_2().getText());
			int selectedRow = ui.getUi3().getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 是否存在选中行
			{
				// 修改指定的值：
				ui.getUi3().getModel().setValueAt(account, selectedRow, 0);
				ui.getUi3().getModel().setValueAt(money, selectedRow, 1);
				// table.setValueAt(arg0, arg1, arg2)
			}
			rm = finance.manageAccount(new AccountVO(account, money), Operation.update);
			check(rm);
		} else if (e.getSource() == ui.getUi3().getButton_3()) {
			// find account by key string
			int rowCount=ui.getUi3().getModel().getRowCount();
			for(int i=0;i<rowCount;i++){
				ui.getUi3().getModel().removeRow(0);
			}

			System.out.println("clear");

			String key = ui.getUi3().getTextField().getText();
			ArrayList<AccountVO> vo =new ArrayList<AccountVO>();
			vo= finance.findAccount(key);
			if (!check(vo))
				return;
			System.out.println(vo.size());
			for (int i = 0; i < vo.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(vo.get(i).getBankAccount());
				item.add(vo.get(i).getBalance());
				ui.getUi3().getModel().addRow(item);
			}

		}

	}

	private boolean check(AccountVO vo) {
		if (vo.checkIsNull() == 0) {
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		if (vo.checkAccount() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查账户格式是否正确！");
			return false;
		}
		if (vo.checkBalance() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查账户余额是否为正！");
			return false;
		}
		return true;
	}

	private boolean check(ArrayList<AccountVO> vo) {
		if (vo == null) {
			JOptionPane.showMessageDialog(ui, "查询的信息系统中不存在！");
			return false;
		}
		return true;
	}

	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getUi3().getTable()){
		int selectedRow = ui.getUi3().getTable().getSelectedRow(); // 获得选中行索引
		String account = (String) ui.getUi3().getModel().getValueAt(selectedRow, 0);
		double money = (Double) ui.getUi3().getModel().getValueAt(selectedRow, 1);
		ui.getUi3().getTextField_1().setText(account); // 给文本框赋值
		ui.getUi3().getTextField_2().setText(String.valueOf(money));
		}

	}

	private void check(ResultMessage rm) {
		String dialog = null;
		if (rm == ResultMessage.FunctionError) {
			dialog = "网络连接出现了问题，请检查您的网络！";
		} else if (rm == ResultMessage.Fail)
			dialog = "数据更新失败！";
		else if (rm == ResultMessage.Success) {
			dialog = "数据更新成功！";
		} else if (rm == ResultMessage.UpdateFail) {
			dialog = "请不要重复创建单据";
		}
		if (dialog != null)
			JOptionPane.showMessageDialog(ui, dialog);
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
