package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import logic.financebl.Finance;
import po.AccountPO;
import presentation.financeui.FinanceUI4;
import vo.AccountVO;

public class FinanceListener4 implements ActionListener {
	private FinanceUI4 ui;
	Finance finance = new Finance();

	public FinanceListener4(FinanceUI4 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getUi3().getButton_2()) {
			System.out.println("期初信息");

			ui.getCard().show(ui, "1");

			ArrayList<AccountPO> po = finance.checkInitInfo();
			Vector<Object> data = new Vector<Object>();

			for (int i = 0; i < po.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(po.get(i).getBankAccount());
				item.add(po.get(i).getBalance());
				data.add(item);
			}

			ui.getUi1().setData(data);
		} else if (e.getSource() == ui.getUi1().getButton()) {
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
		} else if (e.getSource() == ui.getUi2().getButton()) {
			String account=ui.getUi2().getTextField().getText();
			double balance=Double.parseDouble(ui.getUi2().getTextField_1().getText());
			Vector<Object> item = new Vector<Object>();
			item.add(account);
			item.add(balance);
			ui.getUi2().getModel().addRow(item);
		} else if (e.getSource() == ui.getUi2().getButton_1()) {
			ui.getUi2().getTextField().setText("");
			ui.getUi2().getTextField_1().setText("");
		} else if (e.getSource() == ui.getUi2().getButton_2()) {
			int selectedRow = ui.getUi2().getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getUi2().getModel().removeRow(selectedRow); // 删除行
			}
		} else if (e.getSource() == ui.getUi2().getButton_3()) {
			final JFrame jf = new JFrame();
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setBounds(300, 300, 450, 150);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			jf.setContentPane(contentPane);
			contentPane.setLayout(null);

			JButton button = new JButton("保存");
			button.setBounds(86, 75, 117, 29);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < ui.getUi2().getTable().getRowCount(); i++) {
						AccountVO vo = new AccountVO();
						Vector<Object> rowData = new Vector<Object>();
						for (int j = 0; j < 6; j++) {
							rowData.add(ui.getUi2().getTable().getValueAt(i, j));
						}
						vo.setBankAccount((String) rowData.get(0));
						vo.setBalance((Double) rowData.get(1));
						finance.initAccount(vo);
					}

				}
			});
			contentPane.add(button);

			JButton button_1 = new JButton("继续修改");
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
		} else if (e.getSource() == ui.getUi2().getButton_4()) {
			System.out.println("返回");
			ui.getCard().show(ui, "0");
		}
	}

}
