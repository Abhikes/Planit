package Demo;

import java.io.File;

import org.GenricLib.vtiger.Iconstant;
import org.testng.annotations.Test;

public class GetAbsoulutePathclass {
	
	@Test
	public void m1()
	{
		File path = new File(Iconstant.screenShotPath);
		System.out.println();
		System.out.println(path.getAbsolutePath());
		
	}

}
