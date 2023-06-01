package com.DataUtility.vtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * 
 * @author Abhi
 * This class will perform the opertion of excels
 *
 */
public class excelUtility {
	
	/**
	 * This methods will fetch the single data from Excel
	 * 
	 * @param path :It is used to provide the path of excel
	 * @param sheet :SheetName of Excel
	 * @param row :row of excel
	 * @param cell :Cell of excel
	 * @return String format return
	 * @throws Throwable
	 */
	public String singleDataFetch(String path,String sheet,int row,int cell) throws Throwable
	{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(fis);
		
		String data= df.formatCellValue(book.getSheet(sheet).getRow(row).getCell(cell));
		
		return data;
	}
	/**
	 * This method will fetch the last row of the sheet
	 * @param path
	 * @param sheet
	 * @return
	 * @throws Throwable
	 */
	public int lastRow(String path,String sheet) throws Throwable
	{
        FileInputStream fis = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(fis);
		
		int num= book.getSheet(sheet).getLastRowNum();
		
		return num;
	}
	
	public int lastCell(String path,String sheet,int row) throws Throwable
	{
        FileInputStream fis = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(fis);
		
	   int lastCell=	book.getSheet(sheet).getRow(row).getLastCellNum();
		
		return lastCell;
		
		
	}

	/*
	 * Return SheentName
	 */
	public Sheet fetchSheetName(String path,String sheet) throws Throwable
	{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(fis);
		 Sheet sh = book.getSheet(sheet);
		return sh;
	
	}
	
}











