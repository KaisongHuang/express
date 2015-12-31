package RMI;

import dataservice.admindataservice.AdminDataBaseService;

public class NetReconnect{

	public void run() {
		// TODO Auto-generated method stub
		
	}
     
	public static  AdminDataBaseService getAdminService(){
		
	}
	
	class Time extends Thread{
		public void run(){
			time();
		}
		public void time(){
			long time1=System.currentTimeMillis();
			long time2=System.currentTimeMillis();
			while(true){
				time1=System.currentTimeMillis();
				while(time2-time1<2000){
				    	 try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    	 time2=System.currentTimeMillis();
				     }
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		  
			
		}
	}
}
