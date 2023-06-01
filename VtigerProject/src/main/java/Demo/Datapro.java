package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.GenricLib.vtiger.Iconstant;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.excelUtility;

public class Datapro {
	    @DataProvider(name = "SS")
	    public String[][] m1() throws Throwable
	    {
	    FileInputStream fis = new FileInputStream(Iconstant.excelPath);
		Workbook bok = WorkbookFactory.create(fis);
		Sheet sh = bok.getSheet("Sh");
		excelUtility eu = new excelUtility();
		DataFormatter df = new DataFormatter();
		int lastrow=eu.lastRow(Iconstant.excelPath,"Sh");
		int lastCell=eu.lastCell(Iconstant.excelPath,"Sh",1);
		System.out.println(lastCell);
		System.out.println(lastrow);
		String[][] x= new String[lastrow][lastCell];
		
		  for(int i=0;i<lastrow;i++) 
		  { 
			  for(int j=0;j<lastCell;j++) 
		  {
		     x[i][j]=df.formatCellValue(sh.getRow(i).getCell(j)); 
		    
		  }
		      System.out.println();
		  }
		  
		 
		  
		 
		return x;
		
	}
	@Test(dataProvider = "SS")
	public void m2(String s1,String s2,String s3,String s4,String s5,String s6,String s7)
	{
		
	}
	

}
