package utility;

import org.openqa.selenium.Alert;

import Base.Base;

public class Popup extends Base {

	
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
