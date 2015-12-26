package logic.financebl;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;



public class Test {
    JFrame frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Test().start();
	}
	
	public void start(){
		//frame=new JFrame();
		//JFileChooser file=new JFileChooser();
		//frame.add(file);
		//frame.setBounds(100,100,500,500);
	    //file.setVisible(true);
	   // frame.setVisible(true);
//	    int i =file.showOpenDialog(null);
//        if(i== file.APPROVE_OPTION){ //打开文件
//            String path = file.getSelectedFile().getAbsolutePath();
//            String name = file.getSelectedFile().getName();
//            System.out.println("当前文件路径："+path+";\n当前文件名："+name);
//        }else{
//            System.out.println("没有选中文件");
//        }
	    
		JFileChooser jf = new JFileChooser();  
		jf.setFileSelectionMode(JFileChooser.SAVE_DIALOG | JFileChooser.DIRECTORIES_ONLY);  
		jf.showDialog(null,null);  
		//jf.setSelectedFile(new File(".xls"));
		File fi = jf.getSelectedFile();  
		String f = fi.getAbsolutePath();  
		System.out.println("save: "+f);  
//		try{  
//		    FileWriter out = new FileWriter(f);  
//		    out.write("successful!!!");  
//		    out.close();  
//		}  
		//catch(Exception e){} 
	}

}
