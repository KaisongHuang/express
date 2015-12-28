package presentation.MySwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.eltima.components.ui.DatePicker;

public class MyDatePicker extends DatePicker{

	

	public MyDatePicker(JComponent c) {
		super(c,new Date());
		// DatePicker类继承自JComponent所以在实例化后可添加到任何容器中（JPanel,JFrame,JDialog等）
		// 注意 DatePicker 是一个控件了
		// ----------------------------------------------
		// datepick = new DatePicker(this, new Date());//c为此组件所许要放置的父容器 d
		// 初始化指定日期
		// DatePicker datepick = new DatePicker(Component c);//无初始化日期
		this.setLocale(Locale.US);// 设置显示语言
		this.setPattern("yyyy/MM/dd");// 设置日期格式化字符串
		this.setEditorable(false);// 设置是否可编辑
		this.setBackground(Color.gray);// 设置背景色
		this.setForeground(Color.yellow);// 设置前景色
		this.setPreferredSize(new Dimension(100, 21));// 设置大小
		this.setTextAlign(DatePicker.CENTER);// 设置文本水平方向位置：DatePicker.CENTER
													// 水平居中，DatePicker.LEFT 水平靠左
													// DatePicker.RIGHT 水平靠右

		// 添加组件
	}

}
