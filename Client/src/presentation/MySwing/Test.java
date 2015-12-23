package presentation.MySwing;
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
		NaviButton button=new NaviButton("ss","image/按钮/红色按钮.png");
		frame.add(button);
		button.setLocation(100, 100);
		frame.setVisible(true);
	}

}
