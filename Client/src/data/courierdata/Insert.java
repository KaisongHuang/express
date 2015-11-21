package data.courierdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import po.SenderPO;
import _enum.ResultMessage;


public class Insert {
	
	public ResultMessage write(SenderPO senderPO) throws FileNotFoundException, IOException{
		
		@SuppressWarnings("resource")
		ObjectOutputStream objOut=new ObjectOutputStream(new FileOutputStream("src/temp.dat"));
		objOut.writeObject(senderPO);
		
		return ResultMessage.Success;
		
	}

}
