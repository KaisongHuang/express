package listener.mainlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import logic.loginbl.Login;
import presentation.loginui.LoginUI;
import vo.AdminVO;
import vo.EmployeeVO;

public class LoginListener implements ActionListener{
    LoginUI frame;
    Login l;
	public LoginListener(JFrame frame){
		this.frame=(LoginUI) frame;
		l=new Login();
	}
	public void actionPerformed(ActionEvent e) {
		JTextField text=frame.getText();
		JTextField text1=frame.getText1();
		EmployeeVO vo=l.login(new AdminVO(text.getText(),null,text1.getText(),null));
		
	}

}
