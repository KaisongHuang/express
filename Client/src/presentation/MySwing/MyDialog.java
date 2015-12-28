package presentation.MySwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyDialog extends JPanel implements Runnable{

	String content;
	public MyDialog(){
		super();
	    content="";
		this.setBounds(0,400,900,100);
	    this.setVisible(false);
	}
	public void setText(String s){
		content=s;
		
		repaint();
		 this.setVisible(true);
		if(time())
			this.setVisible(false);
	}
	public void paintComponent(Graphics g){
		
		g.setColor(new Color(200,100,100));
		g.fillRect(0, 0, 900, 100);
		g.setFont(new Font(Font.SERIF,10,25));
		g.setColor(Color.BLACK);
		g.drawString(content, 300, 30);
	
		
    }
	
	public boolean time() {
		long time1=System.currentTimeMillis();
		long time2=System.currentTimeMillis();
		while(time2-time1<=2000){
			System.out.println(time2-time1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		time2=System.currentTimeMillis();
		}
		return true;
		
	}
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
