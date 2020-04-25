package Testing;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base1.Base1;
import Base1.UserLogin1;

public class TestCase3 extends Base1 {
	
@BeforeMethod
	
public void Login() throws Exception{
	
	Base1.LaunchChrome();
	UserLogin1.Login();
	
}

@Test
public void Homepagetest() 

{
	
utility1.Validation1.matchtitile("OrangeHRM");	
	

}	

@AfterMethod

public void quite()
{Base1.closingtesting();

}

}
