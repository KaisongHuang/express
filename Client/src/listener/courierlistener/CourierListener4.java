package listener.courierlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import logic.senderbl.Sender;
import logic.senderblservice.SenderBlService;
import presentation.courierui.CourierUI4;
import vo.HistoryVO;

public class CourierListener4 implements MouseListener, ActionListener {

	private CourierUI4 ui;
	CourierBlService courier = new Courier();
	SenderBlService sender = new Sender();

	public CourierListener4(CourierUI4 ui) {
		super();
		this.ui = ui;
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
		// ArrayList<String> list = vo.getList();
		// String s = list.toString();
		ui.getTextArea_1().setText(vo.getList().toString());
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
