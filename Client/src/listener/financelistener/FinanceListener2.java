package listener.financelistener;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import _enum.ResultMessage;
import logic.financebl.Finance;
import logic.financeblservice.FinanceBlService;
import presentation.MySwing.MyButton;
import presentation.financeui.FinanceUI2;
import vo.PayVO;

public class FinanceListener2 implements ActionListener, MouseListener {
	private FinanceUI2 ui;
	FinanceBlService financeBl = new Finance();
	static Point origin = new Point();

	public FinanceListener2(FinanceUI2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// add
		if (e.getSource() == ui.getAdd()) {
			String year = (String) ui.getComboBox_1().getSelectedItem();
			String month = (String) ui.getComboBox_2().getSelectedItem();
			String day = (String) ui.getComboBox_3().getSelectedItem();

			String date = year + month + day;
			double money = Double.parseDouble(ui.getTextField_1().getText());
			String payer = ui.getTextField_2().getText();
			String payAccount = ui.getTextField_3().getText();
			String entry = (String) ui.getComboBox().getSelectedItem();
			String comments = ui.getTextField_4().getText();

			Vector<Object> item = new Vector<Object>();
			item.add(date);
			item.add(money);
			item.add(payer);
			item.add(payAccount);
			item.add(entry);
			item.add(comments);

			ui.getModel().addRow(item);
		}
		// clear
		else if (e.getSource() == ui.getClear()) {
			clearText();
		} else if (e.getSource() == ui.getUpdate()) {
			// edit selected row
			// String date = ui.getTextField().getText();
			// double money = Double.parseDouble(ui.getTextField_1().getText());
			// String courier = ui.getTextField_2().getText();
			// int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			// if (selectedRow != -1) // 是否存在选中行
			// {
			// // 修改指定的值：
			// ui.getModel().setValueAt(date, selectedRow, 0);
			// ui.getModel().setValueAt(money, selectedRow, 1);
			// ui.getModel().setValueAt(courier, selectedRow, 2);
			// // table.setValueAt(arg0, arg1, arg2)
			// }
		}
		// delete
		else if (e.getSource() == ui.getDelete()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getModel().removeRow(selectedRow); // 删除行
			}
		}
		// done
		else if (e.getSource() == ui.getFinish()) {
			final JFrame jf = new JFrame();

			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			jf.setBounds(300, 300, 450, 150);
			jf.setUndecorated(true);
			
			
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
					ResultMessage rm = null;
					for (int i = 0; i < ui.getTable().getRowCount(); i++) {
						PayVO vo = new PayVO();
						Vector<Object> rowData = new Vector<Object>();
						for (int j = 0; j < 6; j++) {
							rowData.add(ui.getTable().getValueAt(i, j));
						}
						vo.setDate((String) rowData.get(0));
						vo.setPayAccount((String) rowData.get(1));
						vo.setPayer((String) rowData.get(2));
						vo.setCost((Double) rowData.get(3));
						vo.setEntry((String) rowData.get(4));
						vo.setComments((String) rowData.get(5));
						vo.setIsCheck(0);
						if (!check(vo))
							continue;
						rm = financeBl.createCost(vo);
						check(rm);
					}

					allClear();
					jf.dispose();
				}
			});

			button.addMouseListener(new MouseListener() {
				public void mousePressed(MouseEvent e) {
					button.setEntered(false);
					button.setPressed(true);
					button.repaint();
				}

				public void mouseReleased(MouseEvent e) {
					button.setEntered(true);
					button.setPressed(false);
					button.repaint();
				}

				public void mouseEntered(MouseEvent e) {
					button.setEntered(true);
					button.setPressed(false);
					button.repaint();
				}

				public void mouseExited(MouseEvent e) {
					button.setEntered(false);
					button.repaint();
				}

				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

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
			button_1.addMouseListener(new MouseListener() {
				public void mousePressed(MouseEvent e) {
					button_1.setEntered(false);
					button_1.setPressed(true);
					button_1.repaint();
				}

				public void mouseReleased(MouseEvent e) {
					button_1.setEntered(true);
					button_1.setPressed(false);
					button_1.repaint();
				}

				public void mouseEntered(MouseEvent e) {
					button_1.setEntered(true);
					button_1.setPressed(false);
					button_1.repaint();
				}

				public void mouseExited(MouseEvent e) {
					button_1.setEntered(false);
					button_1.repaint();
				}

				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}
			});
			contentPane.add(button_1);

			JLabel label = new JLabel("是否保存新建的库存信息？");
			label.setBounds(149, 47, 244, 16);
			contentPane.add(label);
		}
	}

	private boolean check(PayVO vo) {
		if (vo.checkIsNull() == 0) {
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		if (vo.checkAccount() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查账户格式是否正确！");
			return false;
		}
		if (vo.checkCost() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查金额是否正确！");
			return false;
		}
		if (vo.checkDate() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查日期格式是否正确！");
			return false;
		}
		if (vo.checkPayer() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查付款人编号是否正确！");
			return false;
		}
		return true;
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

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getCheck()) {
			MyButton button = ui.getCheck();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		} else if (e.getSource() == ui.getAdd()) {
			MyButton button = ui.getAdd();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		} else if (e.getSource() == ui.getClear()) {
			MyButton button = ui.getClear();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		} else if (e.getSource() == ui.getDelete()) {
			MyButton button = ui.getDelete();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		} else if (e.getSource() == ui.getFinish()) {
			MyButton button = ui.getFinish();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		} else if (e.getSource() == ui.getUpdate()) {
			MyButton button = ui.getUpdate();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getCheck()) {
			MyButton button = ui.getCheck();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getAdd()) {
			MyButton button = ui.getAdd();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getClear()) {
			MyButton button = ui.getClear();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getDelete()) {
			MyButton button = ui.getDelete();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getFinish()) {
			MyButton button = ui.getFinish();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getUpdate()) {
			MyButton button = ui.getUpdate();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getCheck()) {
			MyButton button = ui.getCheck();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getAdd()) {
			MyButton button = ui.getAdd();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getClear()) {
			MyButton button = ui.getClear();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getDelete()) {
			MyButton button = ui.getDelete();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getFinish()) {
			MyButton button = ui.getFinish();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getUpdate()) {
			MyButton button = ui.getUpdate();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getCheck()) {
			MyButton button = ui.getCheck();
			button.setEntered(false);
			button.repaint();
		} else if (e.getSource() == ui.getAdd()) {
			MyButton button = ui.getAdd();
			button.setEntered(false);
			button.repaint();
		} else if (e.getSource() == ui.getClear()) {
			MyButton button = ui.getClear();
			button.setEntered(false);
			button.repaint();
		} else if (e.getSource() == ui.getDelete()) {
			MyButton button = ui.getDelete();
			button.setEntered(false);
			button.repaint();
		} else if (e.getSource() == ui.getFinish()) {
			MyButton button = ui.getFinish();
			button.setEntered(false);
			button.repaint();
		} else if (e.getSource() == ui.getUpdate()) {
			MyButton button = ui.getUpdate();
			button.setEntered(false);
			button.repaint();
		}
	}

	private void clearText() {
		ui.getComboBox().setSelectedIndex(0);
		ui.getComboBox_1().setSelectedIndex(0);
		ui.getComboBox_2().setSelectedIndex(0);
		ui.getComboBox_3().setSelectedIndex(0);
		ui.getTextField_1().setText("");
		ui.getTextField_2().setText("");
		ui.getTextField_3().setText("");
		ui.getTextField_4().setText("");
	}

	private void allClear() {
		clearText();
		// clear table
		for (int i = 0; i < ui.getTable().getRowCount(); i++) {
			ui.getModel().removeRow(0);
		}
	}
}
