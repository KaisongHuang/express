package presentation.MySwing;
import java.util.Vector;

import javax.swing.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Test().start();
	}
	public void start(){
		JFrame frame=new JFrame();
		frame.setLayout(null);
		frame.setBounds(100,100,500,500);
		//NaviButton button=new NaviButton("ss","image/按钮/红色按钮.png");
		//frame.add(button);
		//button.setLocation(100, 100);
		Vector v=new Vector(0);
		v.add("南京");
		MyJComboBox combo=new MyJComboBox(v);
		frame.add(combo);
		frame.setVisible(true);
	}

}
