package com.mercury.test;

import java.awt.AWTException;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		MethodRepository a1= new MethodRepository();
		a1.browserapplicationlaunch();
		  a1.verifyvalidLogin();
		//a1.verifyvalidLoginRobotClass();
		  a1.citySelection();
			a1.takescreenshot();	

}
	
}
