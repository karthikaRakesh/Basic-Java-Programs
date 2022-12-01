package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTime1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement dob=driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		dob.sendKeys("11061991");
		dob.sendKeys(Keys.TAB);
		dob.sendKeys("0245PM");

	}

}
 
