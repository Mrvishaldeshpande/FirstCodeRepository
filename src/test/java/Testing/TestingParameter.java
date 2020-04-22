package Testing;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Base;

public class TestingParameter extends Base {
	
	
	@Test
	@Parameters({"username","password"})
	public void test(String username ,String password) throws Exception 
	{
		
		Base.LaunchChrome();
		driver.get("https://opensource-demo.orangehrmlive.com");	
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.className("button")).click();
		
	}

}
