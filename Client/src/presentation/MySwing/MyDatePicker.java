package presentation.MySwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.eltima.components.ui.DatePicker;



public class MyDatePicker {
	  JButton  pickButton;
	    JLabel   timeJLabel;
	    DatePicker datepick;//日历控件声明
		public TestDatePicker() {
			pickButton = new JButton("得到时间");
			timeJLabel= new JLabel();
			 //DatePicker类继承自JComponent所以在实例化后可添加到任何容器中（JPanel,JFrame,JDialog等）
	         //注意 DatePicker 是一个控件了 
			//----------------------------------------------
			 datepick = new DatePicker(this, new Date());//c为此组件所许要放置的父容器  d 初始化指定日期
			//  DatePicker datepick = new DatePicker(Component c);//无初始化日期
			datepick.setLocale(Locale.US);//设置显示语言
			datepick.setPattern("yyyy/MM/dd");//设置日期格式化字符串
			datepick.setEditorable(false);//设置是否可编辑
			datepick.setBackground(Color.gray);//设置背景色
			datepick.setForeground(Color.yellow);//设置前景色
			datepick.setPreferredSize(new Dimension(100, 21));//设置大小
			datepick.setTextAlign(DatePicker.CENTER);//设置文本水平方向位置：DatePicker.CENTER 水平居中，DatePicker.LEFT 水平靠左   DatePicker.RIGHT 水平靠右
			
			//---------------------------------------------------
			
	        //设置属性
			datepick.setLocation(30, 49);
			pickButton.setSize(90, 20);
			
			pickButton.setLocation(200,49);
			
			pickButton.addActionListener(this);
			
			timeJLabel.setBounds(40, 100, 100, 30);
			timeJLabel.setText("时间显示区");
			
			//添加组件
			this.add(pickButton);
			
			this.add(datepick);
			
			this.add(timeJLabel);

			this.setSize(400, 200);
			this.setLocation(400, 300);
			this.setLayout(null);  //设置布局为空
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}

		public static void main(String[] args) {
			new TestDatePicker();
		}

		
		//测试获取日历内容
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==pickButton){
			    String times=datepick.getText();
			    timeJLabel.setText(times);
			}
		}

}
