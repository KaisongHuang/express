package senderTest;

import vo.SenderVO;
import _enum.ResultMessage;
import logic.senderblservice.SenderBlService;

public class SenderBlService_Stub implements SenderBlService {

	public ResultMessage search(long id) {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public SenderVO search(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
