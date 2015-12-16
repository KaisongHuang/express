package logic.adminbl;

import java.rmi.RemoteException;

import _enum.Operation;
import _enum.ResultMessage;
import data.admindata.AdminData;
import logic.adminblservice.AdminBlService;
import po.AdminPO;
import vo.AdminVO;

public class Admin implements AdminBlService {

	AdminData ad = new AdminData();

	public AdminVO find(String id) {
		// TODO Auto-generated method stub
		AdminPO ap;

		try{
			ap = ad.find(id);
			return new AdminVO(""+id,ap.getName(),ap.getPassword(),ap.getRole());
		}catch(RemoteException e){

			

		}

		return null;
	}

	public ResultMessage manageCount(AdminVO vo, Operation op) {
		// TODO Auto-generated method stub

		ResultMessage rm=null;
		AdminPO po;

		if(op==Operation.insert){
			po = new AdminPO(vo.getId(), vo.getName(), vo.getPassword(), vo.getRole());
			try {
				rm=ad.insert(po);
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
				rm=ResultMessage.FunctionError;
			}
		}else if(op==Operation.delete){
			po = new AdminPO(vo.getId(), vo.getName(), vo.getPassword(), vo.getRole());
			try {
				rm=ad.delete(po);
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
				rm=ResultMessage.FunctionError;
			}
		}else if(op==Operation.update){
			po = new AdminPO(vo.getId(), vo.getName(), vo.getPassword(), vo.getRole());
			try {
				rm=ad.update(po);
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
				rm=ResultMessage.FunctionError;
			}
		}

		return rm;
	}

}
