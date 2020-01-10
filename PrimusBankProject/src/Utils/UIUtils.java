package Utils;

import java.util.List;

import javax.xml.ws.WebEndpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UIUtils 
{

	public static void selectItem(WebDriver driver,WebElement element,String item)
	{
		Select list=new Select(element);
		list.selectByVisibleText(item);		
	}
	
	
	public static int getItemCount(WebDriver driver,WebElement element)
	{
		Select list=new Select(element);
		List<WebElement> allitems=list.getOptions();
		return allitems.size();
	}
	
	
	
	
	
}
