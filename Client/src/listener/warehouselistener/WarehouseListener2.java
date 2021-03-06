package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

import logic.logicfactory.LogicFactory;
import logic.warehousebl.Warehouse;
import presentation.warehouseui.WarehouseUI2;
import vo.InStorageVO;

public class WarehouseListener2 implements ActionListener {
	private WarehouseUI2 ui;
	Warehouse warehouse  ;

	public WarehouseListener2(WarehouseUI2 ui) {
		super();
		this.ui = ui;
		warehouse=LogicFactory.getWarehouseService();
	}

	public void actionPerformed(ActionEvent e) {
		// enquireButton
		if (e.getSource() == ui.getButton_1()) {

            System.out.println("begin to search!");
			int n=ui.getModel().getRowCount();
			for(int i=0;i<n;i++){

				ui.getModel().removeRow(0);
			}
			// 快递编号，入库日期，目的地，区号，排号，架号，位号
			// 库存查看(设定一个时间段，查看此时间段内的出／入库数量，存储位置，库存数量要有合计)
			String begin=ui.getBeginDate();
			if(!check(begin))
				return ;
			String end= ui.getEndDate();
			if(!check(end))
				return ;
			ArrayList<Object> arr = warehouse.checkWarehouse(begin,end);
			ArrayList<InStorageVO> vo = new ArrayList<InStorageVO>();
			String inNum = "" + warehouse.getInNum();
			String outNum = "" + warehouse.getOutNum();
			String total = "" + warehouse.getTotal();

			ui.getTextArea().setText(inNum);
			ui.getTextArea_1().setText(outNum);
			ui.getTextArea_2().setText(total);
			for (int i = 0; i < warehouse.getInNum(); i++) {
				vo.add((InStorageVO) arr.get(i));
			}
			for (int i = 0; i < warehouse.getInNum(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(vo.get(i).getId());
				item.add(vo.get(i).getIndate());
				item.add(vo.get(i).getDestination());
				item.add(vo.get(i).getPos_qu());
				item.add(vo.get(i).getPos_pai());
				item.add(vo.get(i).getPos_jia());
				item.add(vo.get(i).getPos_wei());
				ui.getModel().addRow(item);

			}
		}
		// clearButton
		else if (e.getSource() == ui.getButton_2()) {
			System.out.println("clear");
			int n=ui.getModel().getRowCount();
			for(int i=0;i<n;i++){
				ui.getModel().removeRow(0);
			}
			ui.getComboBox().setSelectedIndex(0);
			ui.getComboBox_1().setSelectedIndex(0);
			ui.getComboBox_2().setSelectedIndex(0);
			ui.getComboBox_3().setSelectedIndex(0);
			ui.getComboBox_4().setSelectedIndex(0);
			ui.getComboBox_5().setSelectedIndex(0);
		}
	}

	private boolean check(String date){
		 if(date.length()!=8){
			 ui.setErrorText("请检查日期格式是否正确！");
    		 return false;
		 }
         try{
        		 Integer.parseInt(date);
        	 }catch(NumberFormatException e){
        		 ui.setErrorText("请检查日期格式是否正确！");
        		 return false;
         }
         return true;
	}

}
