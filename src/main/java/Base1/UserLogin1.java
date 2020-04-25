package Base1;

import org.openqa.selenium.By;

public class UserLogin1 extends Base1
{

public static void Login()
{
	driver.get("https://opensource-demo.orangehrmlive.com");	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.className("button")).click();	

}
	
}
