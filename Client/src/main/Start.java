package main;

import presentation.loginui.LoginUI;

public class Start {
    LoginUI frame1;
    //MainFrame frame2;
	public static void main(String[] args) {
         new Start().init();
         
	}

	public void init(){
		frame1=new LoginUI();
	}
}
