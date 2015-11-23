package StartServer;

import network.Server.Server;

public class Start {
	Server s;
	
	
	public static void main(String[] args){
		new Start().start();
	}
	
	
	public void start(){
		s=new Server();
		s.start();
	}
}
