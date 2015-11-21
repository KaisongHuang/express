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

	public AdminVO find(int id) {
		// TODO Auto-generated method stub
		AdminPO ap;
		
		try{			
			ap = ad.find(id);
			return new AdminVO(id,ap.getName(),ap.getPassword(),ap.getRole());			
		}catch(RemoteException e){
			
			e.printStackTrace();
			
		}
		
		return null;
	}

	public ResultMessage manageCount(AdminVO vo, Operation op) {
		// TODO Auto-generated method stub
		
		ResultMessage rm;
		AdminPO po;
		
		if(op==Operation.insert){
			po = new AdminPO(vo.getId(), vo.getName(), vo.getPassword(), vo.getRole());
			try {
				rm=ad.insert(po);
				return rm;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}
		}else if(op==Operation.delete){
			
		}else if(op==Operation.update){
			
		}
		
		return null;
	}

}
