package presentation.warehouseui;

import javax.swing.JFrame;

public class Test {
	public static void main(String args[]){
		JFrame jf =  new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WarehouseUI5 ui =  new WarehouseUI5();
		jf.add(ui);
		jf.setBounds(150, 150, 800, 500);
		jf.setVisible(true);
	}
}
