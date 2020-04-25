package utility;

import org.testng.asserts.SoftAssert;

import Base.Base;

public class Validation extends Base {

	
	
	public static void matchtitile(String title) 
	{
		
	String Websitetitle=driver.getTitle();
	System.out.println(Websitetitle);
	String Actualtitle =title;	
	SoftAssert a = new SoftAssert();
	a.assertEquals(Websitetitle, Actualtitle,"Title is not matching");
	a.assertAll();
	}
	
	
	
}
