package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI2;
import vo.ReceiptVO;

public class SellingAreaListener20 implements MouseListener, ActionListener {

	private SellingAreaUI2 ui;
	SellingareaBlService sellingarea = new SellingArea();
	
	public SellingAreaListener20 (SellingAreaUI2 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_10()){
			String n = ui.getTable().getToolTipText();
			System.out.println(n);
			ResultMessage rm;
			ReceiptVO vo = this.read();
			rm = sellingarea.createDebitnote(vo);
		}
		
	}

	private ReceiptVO read() {
		// TODO Auto-generated method stub
		return null;
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
