package Client.network.client;


public abstract class ClientService {
	public boolean init(String addr,int port){
		boolean succeed = ClientAdapter.init(addr,port);
		return succeed;
	}
	
	public void close(){
		ClientAdapter.close();
	}

	
}
