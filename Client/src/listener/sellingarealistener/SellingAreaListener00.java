package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI;
import vo.CarPackVO;
/**
 * 汽车装运管理界面监听
 * @author john
 *
 */
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
			if(!check(vo))
				return ;
			rm = sellingarea.manageCarPack(vo);
			check(rm);
		}

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
	private boolean check(CarPackVO vo){
		if(vo.checkIsNull()==0){
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		if(vo.checkDate()==0){
			JOptionPane.showMessageDialog(ui, "请检查日期格式是否正确！");
			return false;
		}
		if(vo.checkFee()==0){
			JOptionPane.showMessageDialog(ui, "请检查费用是否合理！");
			return false;
		}
		if(vo.checkList()==0){
			JOptionPane.showMessageDialog(ui, "请检查快递编号格式是否正确！");
			return false;
		}
		if(vo.checkNumber()==0){
			JOptionPane.showMessageDialog(ui, "请检查汽运编号格式是否正确！");
			return false;
		}

		if(vo.checkSupercargo()==0){
			JOptionPane.showMessageDialog(ui, "请检查押运员编号格式是否正确！");
			return false;
		}
		if(vo.checkSupervisor()==0){
			JOptionPane.showMessageDialog(ui, "请检查监装员编号格式是否正确！");
			return false;
		}

		return true;
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
		ArrayList<String> list = new ArrayList<String>();
//		String templist = ui.getTextArea().getText();
//		String a[] = templist.split("[\\t \\n]+");
//		for(int i=0;i<a.length;i++){
//			list.add(a[i]);
////			System.out.println(a[i]);
//		}
//		System.out.println(list);
		list.add("1000000001");
		CarPackVO vo = new CarPackVO(date,number,start,destination,supervisor,
				supercargo,list,Double.parseDouble(fee),0);

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
