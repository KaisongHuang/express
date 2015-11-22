package presentation.centreui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {
	JFrame frame;
	public static void main(String[] args){
		new Test().init();
	}
	public void init(){
		frame=new JFrame();
		frame.setLayout(null);
		frame.setSize(800, 1000);
		
		JPanel panel=new CentreMenuUI(frame);
		
		
		panel.setBounds(136, 58, 746, 58);
		frame.add(panel);
		
		frame.update(null);
		frame.setVisible(true);
	}

}
