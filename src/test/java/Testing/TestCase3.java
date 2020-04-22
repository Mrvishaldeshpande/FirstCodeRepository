package Testing;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.Base;
import Base.UserLogin;

public class TestCase3 extends Base {
	
@BeforeMethod
	
public void Login() throws Exception{
	
	Base.LaunchChrome();
	UserLogin.Login();
	
}

@Test
public void Homepagetest() 

{
	
utility.Validation.matchtitile("OrangeHRM");	
	

}	

@AfterMethod

public void quite()
{Base.closingtesting();

}

}
