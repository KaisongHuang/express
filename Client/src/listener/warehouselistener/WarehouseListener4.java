package listener.warehouselistener;

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

import _enum.EmployeeMes;
import _enum.ResultMessage;
import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.MySwing.MyButton;
import presentation.warehouseui.WarehouseUI4;
import vo.InStorageVO;

public class WarehouseListener4 implements ActionListener {
	private WarehouseUI4 ui;
	WarehouseBlService warehouseBl = new Warehouse();
	static Point origin = new Point();

	public WarehouseListener4(WarehouseUI4 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// add
		if (e.getSource() == ui.getButton_1()) {
			Vector<Object> item = new Vector<Object>();
			String id = ui.getTextField().getText();
			String destination = ui.getTextField_1().getText();
			String year = (String) ui.getComboBox().getSelectedItem();
			String month = (String) ui.getComboBox_1().getSelectedItem();
			String date = (String) ui.getComboBox_2().getSelectedItem();
			String time = year + month + date;
			String qu = (String) ui.getComboBox_3().getSelectedItem();
			int pai = Integer.parseInt((String) ui.getComboBox_4().getSelectedItem());
			int jia = Integer.parseInt((String) ui.getComboBox_5().getSelectedItem());
			int wei = Integer.parseInt((String) ui.getComboBox_6().getSelectedItem());
			item.add(id);
			item.add(destination);
			item.add(time);
			item.add(qu);
			item.add(pai);
			item.add(jia);
			item.add(wei);
			ui.getModel().addRow(item);
		}
		// delete
		else if (e.getSource() == ui.getButton()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getModel().removeRow(selectedRow); // 删除行
			}
		}
		// clear
		else if (e.getSource() == ui.getButton_2()) {
			ui.getTextField().setText("");
			ui.getTextField_1().setText("");
			ui.getComboBox().setSelectedIndex(0);
			ui.getComboBox_1().setSelectedIndex(0);
			ui.getComboBox_2().setSelectedIndex(0);
			ui.getComboBox_3().setSelectedIndex(0);
			ui.getComboBox_4().setSelectedIndex(0);
			ui.getComboBox_5().setSelectedIndex(0);
			ui.getComboBox_6().setSelectedIndex(0);
		}
		// save&back
		else if (e.getSource() == ui.getButton_3()) {
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
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setBackground(new Color(246,246,246));
			jf.setContentPane(contentPane);
			contentPane.setLayout(null);

			final MyButton button = new MyButton("保存");
			button.setBounds(86, 75, 117, 29);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < ui.getTable().getRowCount(); i++) {
						InStorageVO vo = new InStorageVO();
						Vector<Object> rowData = new Vector<Object>();
						for (int j = 0; j < 7; j++) {
							rowData.add(ui.getTable().getValueAt(i, j));
						}
						String qu=(String) rowData.get(3);
						if(qu.equals("航运区")){
							qu="plane";
						}else if(qu.equals("铁运区")){
							qu="train";
						}else{
							qu="car";
						}
						vo.setId((String) rowData.get(0));
						vo.setDestination((String) rowData.get(1));
						vo.setIndate((String) rowData.get(2));
						vo.setPos_qu(qu);
						vo.setPos_pai((Integer) rowData.get(4));
						vo.setPos_jia((Integer) rowData.get(5));
						vo.setPos_wei((Integer) rowData.get(6));
						vo.setWarehouseID(EmployeeMes.belongToWho);
						vo.setIsCheck(0);
						warehouseBl.initWarehouse(vo);
//						if(!check(vo))
//							return ;
					}
					int n=ui.getModel().getRowCount();
					for(int i=0;i<n;i++){
						ui.getModel().removeRow(0);
					}
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
		}else if(e.getSource()==ui.getButton_4()){
			ResultMessage rm=null;
			System.out.println("库存清空");
			rm=warehouseBl.clearWarehouse();
			check(rm);
		}
	}

	private boolean check(InStorageVO vo){
		if(vo.checkDate()==0){
			JOptionPane.showMessageDialog(ui, "请检查入库日期是否正确！");
			return false;
		}
		if(vo.checkJia()==0){
			JOptionPane.showMessageDialog(ui, "请检查仓库架号是否正确！");
			return false;
		}
		if(vo.checkPai()==0){
			JOptionPane.showMessageDialog(ui, "请检查仓库排号是否正确！");
			return false;
		}
		if(vo.checkWei()==0){
			JOptionPane.showMessageDialog(ui, "请检查仓库位号是否正确！");
			return false;
		}
		return true;
	}
	private void check(ResultMessage rm){
		String dialog=null;
		if(rm==ResultMessage.FunctionError){
			dialog="网络连接出现了问题，请检查您的网络！";
		}else if(rm==ResultMessage.Fail)
			dialog="数据更新失败！";
		else if(rm==ResultMessage.Success){
			dialog="数据更新成功！";
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			JOptionPane.showMessageDialog(ui, dialog);
	}
}
