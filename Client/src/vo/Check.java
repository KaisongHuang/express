package vo;

public class Check {
     public int  checkDate(String date){
    	 if(date.length()!=8)
    		 return 0;
    	 try{
    		 Integer.parseInt(date);
    	 }catch(NumberFormatException e){
    		 return 0;
    	 }
    	 return 1;
     }
     public int checkID(String id,int i){
    	 if(id.length()!=i)
    		 return 0;
    	 try{
    		 Integer.parseInt(id);
    	 }catch(NumberFormatException e){
    		 return 0;
    	 }
    	 return 1;
     }
    
    
}
