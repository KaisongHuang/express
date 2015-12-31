package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import _enum.Operation;
import _enum.ResultMessage;
import logic.logicfactory.LogicFactory;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI4_3;
import vo.CarVO;
import vo.DriverVO;

public class SellingAreaListener4_3 implements MouseListener, ActionListener {

	private SellingAreaUI4_3 ui;
	SellingareaBlService sellingarea  ;
	public SellingAreaListener4_3 (SellingAreaUI4_3 ui){
		super();
		this.ui=ui;sellingarea=LogicFactory.getSellingAreaService();
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_17()){
			ui.getTextField().setText("");
			delete(ui.getLblNewLabel_11());
			delete(ui.getLblNewLabel_13());
			delete(ui.getLblNewLabel_15());
			delete(ui.getLblNewLabel_17());
			delete(ui.getLblNewLabel_3());
			delete(ui.getLblNewLabel_7());
			delete(ui.getLblNewLabel_8());
			delete(ui.getLblNewLabel_9());
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			ResultMessage rm;
			String id = ui.getTextField().getText();
			if(!check(id))
				return ;
			rm = sellingarea.manageDriverinfo(sellingarea.findDriver(id), Operation.delete);
			check(rm);
				
			
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			String id = ui.getTextField().getText();
			if(!check(id))
				return ;
			DriverVO vo = sellingarea.findDriver(id);
			if(!check(vo))
				return ;
			set(vo);
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
			ui.setText(dialog);
	}
	private boolean check(DriverVO vo){
		if(vo==null){
			ui.setText("车辆编号不存在！");
   		    return false;	
		}
		return true;
	}
	private boolean check(String id){
   	 if(id.length()!=10){
   		ui.setText("请确认车辆编号格式是否正确！");
   		 return false;
   	 }
   	 try{
   		 Integer.parseInt(id);
   	 }catch(NumberFormatException e){
   		 JOptionPane.showMessageDialog(ui, "请确认车辆编号格式是否正确！");
   		 return false;
   	 }
   	 return true;
   }
	
	private void set(DriverVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_11().setText(vo.getName());
		ui.getLblNewLabel_13().setText(""+vo.getID());
		ui.getLblNewLabel_15().setText(vo.getPhone());
		ui.getLblNewLabel_17().setText(vo.getLicenceTime());
		ui.getLblNewLabel_3().setText(""+vo.getNumber());
		ui.getLblNewLabel_7().setText(vo.getBirthday());
		ui.getLblNewLabel_8().setText(vo.getSex());
		ui.getLblNewLabel_9().setText(vo.getCarCompany());
	}

	private void delete(JLabel label) {
		// TODO Auto-generated method stub
		label.setText("");
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
