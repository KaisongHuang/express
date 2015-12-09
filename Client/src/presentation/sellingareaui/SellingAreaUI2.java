/**
 * SellingAreaUI2是SellingArea用户的收款界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import listener.sellingarealistener.SellingAreaListener20;


public class SellingAreaUI2 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JButton btnNewButton_10;
	@SuppressWarnings("unused")
	private int width;
	@SuppressWarnings("unused")
	private int height;
	SellingAreaListener20 sellingarealistener;

	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public SellingAreaUI2(int i, int j) {
		sellingarealistener = new SellingAreaListener20(this);
		width=i;
		height=j;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 114, 711, 439);

		this.setLayout(null);

//		JPanel panel = new JPanel();
//		panel.setBounds(0, 0, 137, 109);
//		this.add(panel);
//
//		JLabel lblPic = new JLabel("pic");
//		panel.add(lblPic);
//
//		JPanel panel_1 = new JPanel();
//		panel_1.setBounds(136, 0, 746, 58);
//		this.add(panel_1);
//		panel_1.setLayout(null);
//
//		JLabel lblNewLabel = new JLabel("\u67D0\u67D0\u90E8\u95E8 XXX \u6B22\u8FCE\u4F7F\u7528XXXXX\u7CFB\u7EDF");
//		lblNewLabel.setBounds(14, 13, 309, 32);
//		panel_1.add(lblNewLabel);
//
//		JPanel panel_2 = new JPanel();
//		panel_2.setBounds(0, 60, 137, 493);
//		this.add(panel_2);
//		panel_2.setLayout(null);
//
//		JButton btnNewButton_1 = new JButton("\u8425\u4E1A\u5385");
//		btnNewButton_1.setBackground(new Color(255, 248, 220));
//		btnNewButton_1.setBounds(0, 105, 137, 55);
//		panel_2.add(btnNewButton_1);
//
//		JButton btnNewButton_2 = new JButton("\u4E2D\u8F6C\u4E2D\u5FC3");
//		btnNewButton_2.setBounds(0, 160, 137, 55);
//		panel_2.add(btnNewButton_2);
//
//		JButton btnNewButton_3 = new JButton("\u4ED3\u5E93\u7BA1\u7406");
//		btnNewButton_3.setBounds(0, 215, 137, 55);
//		panel_2.add(btnNewButton_3);
//
//		JButton btnNewButton_4 = new JButton("\u8D22\u52A1");
//		btnNewButton_4.setBounds(0, 270, 137, 55);
//		panel_2.add(btnNewButton_4);
//
//		JButton btnNewButton_5 = new JButton("\u603B\u7ECF\u7406");
//		btnNewButton_5.setBounds(0, 325, 137, 55);
//		panel_2.add(btnNewButton_5);
//
//		JButton btnNewButton_6 = new JButton("\u7BA1\u7406\u5458");
//		btnNewButton_6.setBounds(0, 380, 137, 55);
//		panel_2.add(btnNewButton_6);
//
//		JButton btnNewButton = new JButton("\u5FEB\u9012\u5458");
//		btnNewButton.setBounds(0, 50, 137, 55);
//		panel_2.add(btnNewButton);
//
//		JPanel panel_3 = new JPanel();
//		panel_3.setBounds(136, 58, 746, 58);
//		this.add(panel_3);
//		panel_3.setLayout(null);
//
//		JButton btnNewButton_8 = new JButton("\u63A5\u6536\u4E0E\u6D3E\u4EF6");
//		btnNewButton_8.setBounds(137, 0, 137, 55);
//		panel_3.add(btnNewButton_8);
//
//		JButton btnNewButton_9 = new JButton("\u6536\u6B3E\u5355");
//		btnNewButton_9.setBackground(new Color(255, 248, 220));
//		btnNewButton_9.setBounds(271, 0, 137, 55);
//		panel_3.add(btnNewButton_9);
//
//		JButton btnNewButton_7 = new JButton("\u8F66\u8F86\u88C5\u8F66\u7BA1\u7406");
//		btnNewButton_7.setBounds(0, 0, 137, 55);
//		panel_3.add(btnNewButton_7);
//
//		JButton btnNewButton_12 = new JButton("\u8F66\u8F86\u4FE1\u606F\u7BA1\u7406");
//		btnNewButton_12.setBounds(405, 0, 137, 55);
//		panel_3.add(btnNewButton_12);
//
//		JButton button = new JButton("\u53F8\u673A\u4FE1\u606F\u7BA1\u7406");
//		button.setBounds(540, 0, 137, 55);
//		panel_3.add(button);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(69, 35, 746, 439);
		this.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("收款单");
		lblNewLabel_1.setBounds(48, 21, 100, 18);
		panel_4.add(lblNewLabel_1);

		table = new JTable(new Object[][]{{null, null},{null, null},{null, null},{null, null},{null,null}},new String[] {"666", "���"});
		table.setToolTipText("");

//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null},
//				{null, null},
//				{null, null},
//				{null, null},
//			},
//			new String[] {
//				"���Ա���", "���"
//			}
//		));
		table.setBounds(48, 72, 408, 164);
		panel_4.add(table);

		btnNewButton_10 = new JButton("\u786E\u8BA4");
		btnNewButton_10.setBounds(360, 250, 90, 30);
		panel_4.add(btnNewButton_10);
		btnNewButton_10.addActionListener(sellingarealistener);

		JLabel lblNewLabel_2 = new JLabel("\u5FEB\u9012\u5458\u7F16\u53F7");
		lblNewLabel_2.setBounds(48, 51, 209, 18);
		panel_4.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u91D1\u989D");
		lblNewLabel_3.setBounds(269, 51, 187, 18);
		panel_4.add(lblNewLabel_3);
	}


	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(JButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}


}
