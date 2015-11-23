package Client.network.client;

import java.io.IOException;
import java.net.UnknownHostException;


public class ClientAdapter {
	protected static ClientThread socket;

	
	public static boolean init(String addr,int port){
		try {
			socket = new ClientThread(addr,port);
			
			return true;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	//to write
	public static void write(Object o){
		socket.write(o);
	}
	
	//from read
	public static Object readData(){
	    return socket.read();
	}
	
	public static void close(){
		socket.close();
	}

}
