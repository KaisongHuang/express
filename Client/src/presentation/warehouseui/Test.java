package presentation.warehouseui;

import javax.swing.JFrame;

public class Test {
	public static void main(String args[]){
		JFrame jf =  new JFrame();
		WarehouseUI5 ui =  new WarehouseUI5();
		jf.add(ui);
		jf.setBounds(300, 300, 1000, 500);
		jf.setVisible(true);
	}
}
