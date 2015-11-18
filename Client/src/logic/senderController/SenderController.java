package logic.senderController;

import vo.HistoryVO;
import logic.senderControllerService.SenderControllerService;
import logic.senderbl.Sender;

public class SenderController implements SenderControllerService{
    Sender sender=new Sender();
	public HistoryVO search(int id) {
		
		return sender.search(id);
	}

}
