package presentation.mainui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.courierui.CourierUI;


public class MainFrame implements ActionListener{
	    JFrame frame;
	    JPanel panel;
	   // CourierUI c=new CourierUI();
      	int width;
      	int height;
      	
    public void init(){

    	frame=new JFrame("Express System");
    	//c.init();
    	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
    	width=screensize.width;
    	height=screensize.height;
    	
    	panel=new JPanel();
    	frame.setLocation(width/2-500,height/2-350);
    	
    	frame.setSize(1000,700);
    	panel.setSize(1000,700);
    	frame.add(panel);
    	JButton button1=new JButton("Sender");
    	JButton button2=new JButton("Courier");
    	JButton button3=new JButton("Sellingarea");
    	JButton button4=new JButton("Centre");
    	JButton button5=new JButton("WareHouse");
    	JButton button6=new JButton("Finance");
    	JButton button7=new JButton("Manager");
    	JButton button8=new JButton("Admin");
    	panel.setLayout(null);
    	panel.add(button1);
    	button1.setBounds(200,80,200,80);
    	button2.setBounds(200,170,200,80);
    	button3.setBounds(200,260,200,80);
    	button4.setBounds(200,350,200,80);
    	button5.setBounds(500,80,200,80);
    	button6.setBounds(500,170,200,80);
    	button7.setBounds(500,260,200,80);
    	button8.setBounds(500,350,200,80);
    	
    	panel.add(button2);
    	panel.add(button3);
    	panel.add(button4);
    	panel.add(button5);
    	panel.add(button6);
    	panel.add(button7);
    	panel.add(button8);
        frame.setVisible(true);

    	button2.addActionListener(this);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void actionPerformed(ActionEvent e){
    	//frame.remove(panel);
    	CourierUI c=new CourierUI();
    	c.init();
    	//frame.add(c.getPanel());
    }
}
