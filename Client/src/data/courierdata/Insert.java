package data.courierdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import _enum.ResultMessage;
import po.SenderPO;

public class Insert {
	
	public ResultMessage write(SenderPO po) throws FileNotFoundException, IOException{
		
		@SuppressWarnings("resource")
		ObjectOutputStream objOut=new ObjectOutputStream(new FileOutputStream("src/temp.dat"));
		objOut.writeObject(po);
		
		return ResultMessage.Success;
		
	}

}
