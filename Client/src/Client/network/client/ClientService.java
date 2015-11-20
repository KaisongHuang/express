package Client.network.client;


public abstract class ClientService {
	public boolean init(String addr,int port,ClientInHandler handler){
		boolean succeed = ClientAdapter.init(addr,port, handler);
		return succeed;
	}
	
	public void close(){
		ClientAdapter.close();
	}

	
}
