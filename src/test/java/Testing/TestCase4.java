package Testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Base;

public class TestCase4 extends Base
{



@BeforeMethod

public void test1() throws Exception
{
Base.LaunchChrome( );


}

@Test

public void imageValidation()
{
boolean b = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[1]/tbody/tr[2]/td/a/img")).isDisplayed();
SoftAssert A=new SoftAssert();

A.assertEquals(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[1]/tbody/tr[2]/td/a/img")).isDisplayed(),b);
}


@AfterMethod

public void quit() 
{
	Base.closingtesting();

}	
}
