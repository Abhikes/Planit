package dummy;

import org.testng.annotations.Test;

public class DummyClassTest {
	
	
	@Test
	public void m1()
	{
		String urldata=System.getProperty("url");
		String undata=System.getProperty("un");
		String pwData=System.getProperty("pw");
		
		System.out.println(urldata);
		System.out.println(undata);
		System.out.println(pwData);
		
		
	
	}

}
