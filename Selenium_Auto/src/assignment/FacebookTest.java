package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='passContainer']//preceding::input[@id='email']")).sendKeys("karthikarakeshnair@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Karthika");
		//driver.findElement(By.xpath("//form[@class='_9vtf']//descendant::button")).click();
		driver.findElement(By.xpath("//form[@data-testid='royal_login_form']//descendant::a[2]")).click();
		driver.navigate().back();//back to same page
		
	}

}
