package presentation.senderui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.senderlistener.SenderListener0;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import listener.senderlistener.SenderListener0;


public class SearchUI extends JPanel {

	private JTextField textField;
	JFrame frame;
	JLabel lblNewLabel; 
	JButton btnNewButton;
	public SearchUI(JFrame frame) {
		this.frame=frame;
		this.setLayout(null);
		lblNewLabel = new JLabel("快递编号:");

		lblNewLabel.setBounds(152, 206, 87, 18);
		this.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(295, 203, 273, 24);
		this.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(new SenderListener0(this));
			
	
		btnNewButton.setBounds(650, 200, 113, 27);
		this.add(btnNewButton);		
	}
	
	public String gettextFieldContent(){
		return textField.getText();
	}
}
