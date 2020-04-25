package utility1;

import org.testng.asserts.SoftAssert;

import Base1.Base1;

public class Validation1 extends Base1 {

	
	
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
