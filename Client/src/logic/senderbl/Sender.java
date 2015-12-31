package logic.senderbl;

import java.rmi.RemoteException;

import po.HistoryPO;
import data.datafactory.DataFactory;
import data.senderdata.SenderData;
import vo.HistoryVO;
import logic.senderblservice.SenderBlService;

public class Sender implements SenderBlService {

	public HistoryVO search(String id) {
		SenderData sd = DataFactory.getSenderDataService();
		HistoryPO hispo;
		try {
			hispo = sd.find(id);
			if(hispo!=null)
			    return new HistoryVO(hispo.getID(),hispo.getState(), hispo.getList1(),hispo.getList2());
			else
				return null;
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return null;
	}

}
