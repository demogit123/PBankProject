package primusbank.library;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.UIUtils;
import constants.Constants;

public class PrimusBankHomePage extends Constants
{

	
	public boolean adminLogin(String uid,String pwd)
	{
		String expurl,acturl;
		expurl="adminflow";
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acturl=driver.getCurrentUrl();
		if(acturl.toLowerCase().contains(expurl.toLowerCase()))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public boolean bankerLogin(String branchname,String uid,String pwd)
	{
		WebElement blistelement;
		blistelement=driver.findElement(By.id("drlist"));
		UIUtils.selectItem(driver, blistelement, branchname);
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		
		if(driver.findElement(By.xpath("//*[@src='images/Pay_but.jpg']")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
}
