package presentation.courierui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
public class CourierUI   implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button3;
	JButton button2;
	JButton button1;
	 int width;
	 int height;
    public void init(){

    	  frame=new JFrame("courier");

    	  frame=new JFrame();
    	  frame.setSize(1000,700);
    	  
    	  Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
          width=screensize.width;
      	  height=screensize.height;
      	
      	  frame.setLocation(width/2-500,height/2-350);

          panel=new JPanel();
          panel.setOpaque(true);
          panel.setSize(1000,700);
      
          button1=new JButton("OrderInput");
          button2=new JButton("AcceptInput");
          button3=new JButton("BACK");
          panel.add(button1);
          panel.add(button2);
          panel.add(button3);
          panel.setLayout(null);
          button1.setBounds(400,200,200,80);
          button2.setBounds(400,350,200,80);
          button3.setBounds(880,600,80,40);
          frame.add(panel);
          frame.setVisible(true);
          button1.addActionListener(this);
      	  button3.addActionListener(this);
    }		  

	public void actionPerformed(ActionEvent e) {
	      if(e.getSource()==button3){
	    	  frame.dispose();
	      }
	      if(e.getSource()==button1){
	    	  new OrderInput().init();
	      }
	}
    public JPanel getPanel(){
    	return panel;
    }
}
