package presentation.mainui;

import javax.swing.*;


public class MainFrame {
    JFrame frame;
    JPanel panel;
    
	public static void main(String[] args){
		new MainFrame().init();
	}
	public void init() {
		frame=new JFrame();
		frame.setBounds(100,100,900,600);
		frame.setVisible(true);
		
	}

}
