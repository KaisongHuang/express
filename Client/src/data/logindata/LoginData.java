package data.logindata;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import data.logindataservice.LoginDataService;
import po.EmployeePO;
import vo.AdminVO;

public class LoginData implements LoginDataService{
	TransformObject send;
    TransformObject acp;
	public EmployeePO login(AdminVO vo) {
		send=new TransformObject(Opera.Login,vo);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (EmployeePO) acp.getOb();
	}
     
}
