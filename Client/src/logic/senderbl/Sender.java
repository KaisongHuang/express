package logic.senderbl;

import java.rmi.RemoteException;

import serverPO.HistoryPO;
import data.senderdata.SenderData;
import vo.HistoryVO;
import logic.senderblservice.SenderBlService;

public class Sender implements SenderBlService {

	public HistoryVO search(int id) {
		SenderData sd = new SenderData();
		HistoryPO hispo;
		try {
			hispo = sd.find(id);
			return new HistoryVO(hispo.getState(), hispo.getList());
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return null;
	}

}
