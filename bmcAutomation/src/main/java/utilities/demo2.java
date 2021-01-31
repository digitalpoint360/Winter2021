package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo2 {
	
	public static WebDriver driver;
	
	
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\DevOPsWinter\\bmcAutomation\\bmcAutomation\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		System.out.println(" OPening chrome broser");
	}
	
	
	@Test
	
	public static void homepagevalidation()
	
	{
		
		driver.get("www.cnn.com");
		System.out.println("this is my first test");

	}
	@AfterMethod
	
	public static void closeBrowser()
	
	{
		System.out.println("Closing the brwoser");
		
		driver.quit();
	}
}
