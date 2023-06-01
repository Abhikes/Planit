package com.DataUtility.vtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.GenricLib.vtiger.Iconstant;
import org.testng.annotations.Test;

/**
 * Fetch the data from PropertyFile
 * 
 * 
 */
public class PropertyUtility {
	
	/**
	 * This method will fetch the from property file and return to calling method
	 * 
	 * @param key ->Provide the data we want to fetch from file
	 * @param path->Path of th file
	 * @throws Throwable
	 */
	public String propertyFetchData(String key,String path) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		
		Properties pobj = new  Properties();
		
		pobj.load(fis);
		
		String data= pobj.getProperty(key);
		
		
		return data;
		
		
	}
	
	
	

}
