package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Test extends JFrame {
	CardLayout card;
	JPanel cardPanel;
	public static void main(String[] args){
//		try {
//
//			UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		new Test().init();
	}
	public void init(){
		this.setLayout(null);
		this.setSize(900, 700);
		
		JPanel panel=new ManagerUI1();
		
		
		
		panel.setBounds(136, 58, 746,800);
		this.add(panel);
		
//		cardPanel = new JPanel();
//		cardPanel.setBounds(0,200,800,600);
//		card = new CardLayout(0,0);
//		cardPanel.setLayout(card);
//		cardPanel.add(new CentreUI(this), "1");
//		cardPanel.add(new CentreUI1(this), "2");
//		this.add(cardPanel);
	
		this.setVisible(true);
	}
	public CardLayout getCard() {
		return card;
	}
	public void setCard(CardLayout card) {
		this.card = card;
	}
	public JFrame getFrame() {
		return this;
	}
	public JPanel getCardPanel() {
		return cardPanel;
	}
	public void setCardPanel(JPanel cardPanel) {
		this.cardPanel = cardPanel;
	}
	

}
