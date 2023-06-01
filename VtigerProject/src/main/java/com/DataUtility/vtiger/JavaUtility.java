package com.DataUtility.vtiger;

import java.util.Date;
import java.util.Random;
import java.util.Set;

import org.testng.annotations.Test;

/**
 * 
 * @author Abhi
 * This class consist of multiple java reusable methods
 *
 */
public class JavaUtility {
	
	/**
	 * This method is used to genrate Random Numbers
	 * 
	 */
	public int  randomNumber()
	{
		Random r = new Random();
	    int x=r.nextInt(10000);
	    return x;
	}
	/**
	 * This method is used to genrate currentDate
	 * 
	 */
	public String  curDate()
	{
	  Date da = new Date();
	  
	   String date = da.toString();
	    return date;
	
	}
	/**
	 * This method is used to genrate currentDate in format of date month Year
	 * 
	 */
	public String  formatedcurDate()
	{
	  Date da = new Date();
	  
	    String[] splitformat=  da.toString().split(" ");
	     
	   String formatDate =splitformat[2] + "-" +splitformat[1] + "-" + splitformat[5];
	   // String formatDate ="sssssss";
	    return formatDate;
	
	}
	
	public  String  formatedcurDateAndTime()
	{
	  Date da = new Date();
	  
	   String[] dateTime=da.toString().split(" ");
	   String dateTime1=dateTime[1]+"-"+dateTime[2]+"-"+dateTime[5];
	   return dateTime1;
	    
	}
	
	
	
	
	
	
	
	
	
	

}
