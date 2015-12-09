package Client.network.client;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;



public class ClientThread {
	private Socket server;
	private ObjectInputStream reader;
	private ObjectOutputStream out;

	public ClientThread(String addr,int port) throws UnknownHostException, IOException{
		super();
		
		server = new Socket(addr,port);
		out = new ObjectOutputStream(server.getOutputStream());	
		
		reader = new ObjectInputStream(new BufferedInputStream(server.getInputStream()));
	}
	

	public void close(){
		
		try {
			reader.close();
			out.close();
			server.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Object write(Object o) {
		try {
			
			out.writeObject(o);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	public Object read(){
		try {
			return reader.readObject();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}
}
