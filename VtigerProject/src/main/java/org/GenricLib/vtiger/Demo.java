package org.GenricLib.vtiger;

import org.testng.annotations.Test;

import com.DataUtility.vtiger.JavaUtility;

public class Demo {
	
	@Test
	public void m1()
	{
		JavaUtility ju = new JavaUtility();
		String path=Iconstant.screenShotPath+ju.formatedcurDateAndTime()+".png";
		System.out.println(path);
	}
	

}
