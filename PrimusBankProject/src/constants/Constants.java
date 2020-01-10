package constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Constants 
{

	public static WebDriver driver;
	public static String url="http://primusbank.qedgetech.com";
	
	@BeforeTest
	public static void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);	
	}
	
	
	@AfterTest
	public static void closeApp()
	{
		driver.close();
	}
	
}
