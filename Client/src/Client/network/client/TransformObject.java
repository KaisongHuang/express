package Client.network.client;

import _enum.Opera;

public class TransformObject {
       Opera op;
       Object ob;
       public TransformObject(Opera op,Object ob){
    	   this.op=op;
    	   this.ob=ob;
       }
	public Opera getOp() {
		return op;
	}
	public void setOp(Opera op) {
		this.op = op;
	}
	public Object getOb() {
		return ob;
	}
	public void setOb(Object ob) {
		this.ob = ob;
	}
       
}
