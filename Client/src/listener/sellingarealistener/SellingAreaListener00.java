package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI;
import vo.CarPackVO;

public class SellingAreaListener00 implements MouseListener, ActionListener {

	private SellingAreaUI ui;
	SellingareaBlService sellingarea = new SellingArea();
	
	public SellingAreaListener00 (SellingAreaUI ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ui.getBtnNewButton_11()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_6());
			delete1(ui.getTextArea());
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			ResultMessage rm;
			CarPackVO vo = this.read();
			rm = sellingarea.manageCarPack(vo);
		}
		
	}

	private CarPackVO read() {
		// TODO Auto-generated method stub
		String date = ui.getTextField().getText();
		String number = ui.getTextField_1().getText();
		String start = ui.getTextField_2().getText();
		String destination = ui.getTextField_3().getText();
		String supervisor = ui.getTextField_4().getText();
		String supercargo = ui.getTextField_5().getText();
		String fee = ui.getTextField_6().getText();
//		int count = ui.getTextArea().getLineCount();
//		System.out.println(count);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String templist = ui.getTextArea().getText();
		String a[] = templist.split("[\\t \\n]+");
		for(int i=0;i<a.length;i++){
			list.add(Integer.parseInt(a[i]));
//			System.out.println(a[i]);
		}
//		System.out.println(list);
		
		CarPackVO vo = new CarPackVO(date,Integer.parseInt(number),start,destination,Integer.parseInt(supervisor),
				Integer.parseInt(supercargo),list,Integer.parseInt(fee),0);
		
		return vo;
	}

	private void delete1(JTextArea textArea) {
		// TODO Auto-generated method stub
		textArea.setText("");
	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
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
