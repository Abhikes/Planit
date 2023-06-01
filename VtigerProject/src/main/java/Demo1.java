import org.GenricLib.vtiger.Iconstant;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.devtools.v110.v110CdpInfo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.excelUtility;

public class Demo1{
	
	@Test
	public void m1() throws Throwable
	{
		DataFormatter df = new DataFormatter();
		excelUtility eu = new excelUtility();
		int row=eu.lastRow(Iconstant.excelPath,"DataProvider");
		System.out.println(row);
		Object[][] x=new  Object[row][7];
		Sheet sh =eu.fetchSheetName(Iconstant.excelPath,"DataProvider");
		for(int i=0;i<=row;i++)
		{
			Row ro =  sh.getRow(i);
			int x11=ro.getLastCellNum();
			System.out.println(x11);
			for(int j=0;j<=ro.getLastCellNum();j++)
			{
				x[i][j]=df.formatCellValue(ro.getCell(j));
			}
		}
		for(int i=0;i<=row;i++)
		{
		
			for(int j=0;j<=6;j++)
			{
				
				
			  System.out.print(x[i][j] +" ");	
			}
			System.out.println();
		}
	
		
	}

	
	
	

}
