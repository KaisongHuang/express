package listener.courierlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import presentation.courierui.CourierUI1;
/**
 * 运费以及时间展示界面监听
 * @author john
 *
 */
public class CourierListener1 implements ActionListener {

	private CourierUI1 ui;
	CourierBlService courier = new Courier();

	public CourierListener1(CourierUI1 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton()) {
			ui.setVisible(false);
		}
	}

}
