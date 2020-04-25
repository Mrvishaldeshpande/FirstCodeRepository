package utility1;

import org.openqa.selenium.Alert;

import Base1.Base1;

public class Popup1 extends Base1 {

	
	public static void Accept() 
	{
		//clicking popup
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void dismiss() 
	{
		//clicking dissmiss
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
	}
	public static void gettext() 
	{
		//clicking gettext
		Alert a = driver.switchTo().alert();
		a.getText();
	}
	
	
}
