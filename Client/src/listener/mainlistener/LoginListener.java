package listener.mainlistener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.EmployeeMes;
import logic.logicfactory.LogicFactory;
import logic.loginbl.Login;
import logic.loginblService.LoginBlService;
import presentation.loginui.LoginUI;
import presentation.mainui.MainFrame;
import presentation.senderui.SearchUI;
import vo.AdminVO;
import vo.EmployeeVO;

public class LoginListener implements ActionListener, MouseListener {
	private LoginUI ui;
	private LoginBlService l;

	public LoginListener(JFrame frame) {
		this.ui = (LoginUI) frame;
		l = LogicFactory.getLoginService();
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getLogin()) {
			JTextField text = ui.getText();
			JTextField text1 = ui.getText1();

			EmployeeVO vo = l.login(new AdminVO(text.getText(), null, text1.getText(), null));
			if (vo == null) {
				JOptionPane.showMessageDialog(ui, "用户名或密码不正确！");
				return;
			}
			EmployeeMes.employeeID = vo.getEmployeeID();
			EmployeeMes.belongToWho = vo.getBelongToWho();
			EmployeeMes.employeeAging = vo.getEmployeeAging();
			EmployeeMes.employeeName = vo.getEmployeeName();
			EmployeeMes.employeePosition = vo.getEmployeePosition();
			EmployeeMes.timeOfWorking = vo.getTimeOfWorking();
			System.out.println(EmployeeMes.employeePosition);
			MainFrame frame1 = new MainFrame();
			frame1.init();
			ui.setVisible(false);
		} else if (e.getSource() == ui.getLogout()) {
			System.exit(0);
		} else if (e.getSource() == ui.getSearch()) {
			SearchUI search=new SearchUI();
			search.setBounds(100,100,900,600);
		
		}
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

}
