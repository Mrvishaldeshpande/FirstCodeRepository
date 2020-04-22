package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1 {
	
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("I am Before Suits");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("I am Before Test");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("I am Before class");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("I am Before Method");
	  }
	  
	  @Test 
	  public void test1() {
	  System.out.println("I am Test1");
	  }
	  
 
	  @Test(priority =3)
	  public void test2() {
	  System.out.println("I am Test2");
	  }
	  
	  @Test(priority =1)
	  public void test3() {
	  System.out.println("I am Test3");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("I am After Method");
	  }



	  @AfterClass
	  public void afterClass() {
		  System.out.println("I am After Class");
	  }

 

	  @AfterTest
	  public void afterTest() {
		  
		  System.out.println("I am After Test");
	  }



	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("I am after Suits");
	  }

}
