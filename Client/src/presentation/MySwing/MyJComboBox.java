package presentation.MySwing;
import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;


public class MyJComboBox extends JComboBox{
    public MyJComboBox(Vector v){
    	super(v);
    	this.setUI((ComboBoxUI) MyComboBoxUI.createUI(this));
	   
		this.setBounds(100,100,200,40);
		this.setRenderer(new MineRenderer());
    }
    private static  class MyComboBoxUI extends BasicComboBoxUI {

        public  static ComponentUI createUI(JComponent c) {

            return new MyComboBoxUI();

         }

        @Override

        protected JButton createArrowButton() {

            JButton button = new JButton();
            button.setBorderPainted(false);
            button.setIcon(new ImageIcon("src/0.jpg"));
            return button;

        }

     }
}

 class MineRenderer extends JComponent implements ListCellRenderer {
	public void paintComponent(Graphics g) {
		
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
	
	}

//设置大小
	public Dimension getPreferredSize() {
		Dimension d = super.getPreferredSize();
		d.height = 40;
		return d;
	}


	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		// TODO Auto-generated method stub
		return this;
	}
}


//public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
//	  RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
//             RenderingHints.VALUE_ANTIALIAS_ON);
//     Color oldColor = g.getColor();
//     Graphics2D g2 = (Graphics2D)g;
//     int i;
//     g2.setRenderingHints(rh);
//     g2.setColor(Color.BLUE);
//     for(i = 0; i < 1; i++)  {
//         if(true)
//            g2.drawRect(x+i, y, 1, height); // 主要是这里第三个参数，原本是：width-i-i-1，被我修改成1
//         else
//             g2.drawRoundRect(x, y, width, height, 15, 15);
//     }
//     g2.setColor(oldColor);  
//}