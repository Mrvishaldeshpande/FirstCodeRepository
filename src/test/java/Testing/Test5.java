package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/Eclipse Backup/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.jsp");
		driver.findElement(By.id("login-form-username")).sendKeys("Mr.vishal.deshpande");
		driver.findElement(By.id("login-form-password")).sendKeys("Anish@11");
		driver.findElement(By.id("login-form-submit")).click();
	}

}
