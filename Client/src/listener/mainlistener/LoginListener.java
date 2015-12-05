package listener.mainlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import _enum.EmployeeMes;
import logic.loginbl.Login;
import logic.loginblService.LoginBlService;
import presentation.loginui.LoginUI;
import presentation.mainui.MainFrame;
import vo.AdminVO;
import vo.EmployeeVO;

public class LoginListener implements ActionListener{
    LoginUI frame;
    LoginBlService l;
	public LoginListener(JFrame frame){
		this.frame=(LoginUI) frame;
		l=new Login();
	}
	public void actionPerformed(ActionEvent e) {
		JTextField text=frame.getText();
		JTextField text1=frame.getText1();

		EmployeeVO vo=l.login(new AdminVO(text.getText(),null,text1.getText(),null));
		EmployeeMes.employeeID=vo.getEmployeeID();
		EmployeeMes.belongToWho=vo.getBelongToWho();
		EmployeeMes.employeeAging=vo.getEmployeeAging();
		EmployeeMes.employeeName=vo.getEmployeeName();
		EmployeeMes.employeePosition=vo.getEmployeePosition();
		EmployeeMes.timeOfWorking=vo.getTimeOfWorking();
MainFrame frame1=new MainFrame();
frame1.init();
	}

}
