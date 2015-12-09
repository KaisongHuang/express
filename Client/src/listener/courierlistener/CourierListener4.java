package listener.courierlistener;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import logic.senderbl.Sender;
import logic.senderblservice.SenderBlService;
import presentation.courierui.CourierUI4;
import vo.HistoryVO;

public class CourierListener4 implements MouseListener, ActionListener {

	private CourierUI4 ui;
	private String sellingAreaID;
	private String centreID;
	private String warehouseID;
	private JTextArea text;
	CourierBlService courier = new Courier();
	SenderBlService sender = new Sender();

	public CourierListener4(CourierUI4 ui) {
		super();
		this.ui = ui;
		text = ui.getTextArea_1();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getButton()) {
			String id = ui.getTextField().getText();
			HistoryVO vo = sender.search(id);
			set(vo);
		}
	}

	private void set(HistoryVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_4().setText(vo.getState());
		ui.getLblNewLabel_5().setText(ui.getTextField().getText());

		ArrayList<String> list1 = vo.getList1();
		ArrayList<Integer> list2 = vo.getList2();

		sellingAreaID = list1.get(0);
		centreID = list1.get(1);
		// warehouseID = list1.get(2);

		int selling = list2.get(0);
		int centre = list2.get(1);
		// int warehouse = list2.get(2);
		int courier = list2.get(3);

		text.setText("已揽件");

		// 判断是否达到发货地的营业厅
		if (!sellingAreaID.equals(null))
			text.append("\n" + "快件在营业厅:" + sellingAreaID.substring(0, 6) + "准备装车……");
		// 判断是否达到发货地中转中心
		if (!centreID.equals(null))
			text.append("\n" + "快件已到达中转中心:" + centreID.substring(0, 6));
		// 判断是否发往收货地中转中心
		if (centre == 2)
			text.append("\n" + "快递已离开中转中心" + centreID.substring(0, 6) + "发往下一中转中心");
		// 判断是否到达收货地中转中心
		if (centre == 3)
			text.append("\n" + "快件已到达中转中心:" + centreID.substring(6, 12));
		// 判断是否发往收货地营业厅
		if (centre == 4)
			text.append("\n" + "快件已离开中转中心:" + centreID.substring(6, 12) + "正发往营业厅");
		// 判断是否达到收货地营业厅
		if (sellingAreaID.length() == 12)
			text.append("\n" + "快件已到达营业厅:" + sellingAreaID.substring(6, 12) + "准备派送");
		// 判断是否派件
		if (selling == 3)
			text.append("\n" + "快递员正在为您派件，请保持电话畅通。");

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
