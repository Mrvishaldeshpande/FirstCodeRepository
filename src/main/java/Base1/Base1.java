package Base1;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static String URL="https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all";
		
	

		public static void LaunchChrome() throws Exception 
		{
					//chrome path setup
					System.setProperty("webdriver.chrome.driver", "E:/Eclipse Backup/Chromedriver/chromedriver.exe");
					
					//initiate chromedriver
					driver = new ChromeDriver();
					
					//implicit wait
					driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					driver.manage().deleteAllCookies();
					driver.manage().window().maximize();
					
		}

		
		
		



		public static void closingtesting() {
			driver.manage().deleteAllCookies();
		    driver.close();//closing chrome window
		    driver.quit();//closing evrything
		}
}
