package Testing;

import org.testng.annotations.Test;


import Base.Base;
import Base.ReadProperties;
import utility.Popup;
import utility.Validation;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Test2 extends Base{
	

	
	
	


	

	@BeforeMethod
	  public void Launchchrome() throws Exception {
		
		Base.LaunchChrome();
		ReadProperties.geturl();
	  }	
	
	  @Test
	  public void testing() throws Exception {
		 
		  	Validation.matchtitile("SQL Tryit Editor v1.6");
		 
		  	//click on restore database
			driver.findElement(By.xpath("//button[@id='restoreDBBtn']")).click();
			System.out.println("Click on restore button");
		
			Popup.Accept();
			
			//clicking on customers
			driver.findElement(By.xpath("//td[contains(text(),'Customers')]")).click();
		  
			
		  
		  	  }
  

	  @AfterMethod
	  public void ClosedBrosuwer() {
		
		Base.closingtesting();
		 
	  }

	  
	  
	  
	  
}
