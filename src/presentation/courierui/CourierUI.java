package presentation.courierui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
public class CourierUI   implements ActionListener{
	JFrame frame;
	JPanel panel;
    public void init(){
    	  frame=new JFrame("courier");
          panel=new JPanel();
          panel.setSize(1000,700);
          panel.setBackground(Color.BLACK);
          JButton button1=new JButton("OrderInput");
          JButton button2=new JButton("AcceptInput");
          panel.add(button1);
          panel.add(button2);
          panel.setLayout(null);
          button1.setBounds(470,250,200,80);
          button2.setBounds(470,400,200,80);
          button1.addActionListener(this);
    }
	public void actionPerformed(ActionEvent e) {		  
	}
    public JPanel getPanel(){
    	return panel;
    }
}
