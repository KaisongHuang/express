package presentation.financeui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;

public class FinanceUI2_1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public FinanceUI2_1() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel label = new JLabel("总收入：");
		label.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label.setBounds(30, 22, 114, 50);
		add(label);
		
		JLabel label_1 = new JLabel("总支出:");
		label_1.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label_1.setBounds(400, 22, 114, 50);
		add(label_1);
		
		JLabel income = new JLabel("New label");
		income.setBounds(111, 32, 61, 16);
		add(income);
		
		JLabel outcome = new JLabel("New label");
		outcome.setBounds(471, 32, 61, 16);
		add(outcome);

	}
}
