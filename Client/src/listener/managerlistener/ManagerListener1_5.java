package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

import logic.logicfactory.LogicFactory;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI1_5;

public class ManagerListener1_5 implements MouseListener, ActionListener {

	private ManagerUI1_5 ui;
	ManagerBlService manager ;

	public ManagerListener1_5(ManagerUI1_5 ui) {
		super();
		this.ui = ui;
		manager=LogicFactory.getManagerService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_15()) {
             ArrayList<String> list=manager.Dialy();
             for(int i=0;i<list.size();i++)
            	 ui.setText(list.get(i));
		}

	}

	

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

}
