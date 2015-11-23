package network.Server;


import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Client.network.client.TransformObject;



public class ServerClient implements Runnable{
	private Socket s;
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	private boolean bConnected = false;
	private HostInHandle in;
	public ServerClient(Socket s) {
		this.s = s;
		in=new HostInHandle();
		try {
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			bConnected = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public  void write(TransformObject t) {
		try {
			oos.writeObject(t);
		} catch (IOException e) {
			
		}
	}
	
	public void run() {
		try {
			while(bConnected) {
				try {
					TransformObject t = (TransformObject) ois.readObject();
					t=in.input(t);
					write(t);
				} catch (ClassNotFoundException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		} catch (EOFException e) {
			System.out.println("Client closed!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
				if(oos != null) oos.close();
				if(s != null)  {
					s.close();
					//s = null;
				}
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
		}
	}
	
}
