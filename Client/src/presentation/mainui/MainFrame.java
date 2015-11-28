package presentation.mainui;


import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import _enum.EmployeeMes;

public class MainFrame implements ActionListener{
    
	 JFrame frame;
	    JPanel panel1;
	    JPanel panel2;
	   
	    
	    JLabel label1;
	    JLabel label2;
	    int height=600;
	    int weight=900;
	    JButton button1;
	    JButton button2;
	    JButton button3;
	    
	    private CardLayout Card;
	    
		public static void main(String[] args) {
			new MainFrame().init();

		}
		public void init(){
		
			frame=new JFrame();
			frame.setLayout(null);
			frame.setUndecorated(true);
			frame.setSize(weight,height);
			frame.setLocation(0,0);
			
			panel1=new JPanel();
			panel2=new JPanel();
			Card=new CardLayout();
			setCard();
			panel1.setLayout(Card);
			panel2.setLayout(null);
			label1=new JLabel();
			label2=new JLabel();
			
			label1.setBounds(0,0,4*weight/5,4*height/5);
			label2.setBounds(0,0,weight,height/5);
			
			ImageIcon icon1=new ImageIcon("D:\\Java\\express\\软工\\蓝色背景.png");
			icon1.setImage( icon1.getImage().getScaledInstance(weight, 4*height/5, Image.SCALE_DEFAULT));
			ImageIcon  icon2=new ImageIcon("D:\\Java\\express\\软工\\装饰图.png");
			icon2.setImage( icon2.getImage().getScaledInstance(weight, height/5, Image.SCALE_DEFAULT));
			
		    label1.setIcon(icon1);
		    label2.setIcon(icon2);
		    
		    button1=new JButton();
		    button1.setBorderPainted(false);
		 
		    ImageIcon bi1=new ImageIcon("D:\\Java\\express\\软工\\黄色按钮.png");
		    bi1.setImage( bi1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		    button1.setIcon(bi1);
		    button1.setContentAreaFilled(false);
		    button2=new JButton();
		    button2.setBorderPainted(false);
		    ImageIcon bi2=new ImageIcon("D:\\Java\\express\\软工\\绿色按钮.png");
		    bi2.setImage( bi2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		    button2.setIcon(bi2);
		    button2.setContentAreaFilled(false);
		    button3=new JButton();
		    button3.setBorderPainted(false);
		    ImageIcon bi3=new ImageIcon("D:\\Java\\express\\软工\\红色按钮.png");
		    bi3.setImage( bi3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		    button3.setIcon(bi3);
		    button3.setContentAreaFilled(false);
		    button3.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e){
					//button3.setIcon(bi2);
					
				}
				public void mouseExited(MouseEvent e){
					//button3.setIcon(bi3);
					 
				}
			});
		   
		    button1.setBounds(weight-60,0,20,20);
		    button2.setBounds(weight-40,0,20,20);
		    button3.setBounds(weight-20,0,20,20);
		    
		    panel1.setBounds(weight/5,height/5,4*weight/5,4*height/5);
		    panel2.setBounds(0,0,weight,height/5);
		    panel1.add(label1);
		   
		    
		    button3.addActionListener(this);
		    panel2.add(button1);
		    panel2.add(button2);
		    panel2.add(button3);
		    panel2.add(label2);
		    
		    frame.add(panel1);
		    frame.add(panel2);
		    
			frame.setVisible(true);
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button3)
			    System.exit(0);
		}

		public CardLayout getCard(){
			return Card;
		}
		private void setCard(){
			if(EmployeeMes.employeePosition.equals("快递员")){
				
			}else if(EmployeeMes.employeePosition.equals("营业厅业务员")){
				
			}else if(EmployeeMes.employeePosition.equals("中转中心业务员")){
				
			}else if(EmployeeMes.employeePosition.equals("仓库管理员")){
				  
			}else if(EmployeeMes.employeePosition.equals("财务人员")){
				
			}else if(EmployeeMes.employeePosition.equals("总经理")){
				
			}else if(EmployeeMes.employeePosition.equals("管理员")){
				
			}
		}

      
}
