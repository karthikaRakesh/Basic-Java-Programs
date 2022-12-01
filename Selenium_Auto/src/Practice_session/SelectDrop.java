package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrop 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Karthika");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("19991919999");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("karthikarakeshnairr@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Nandanam");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Trivandrum");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Kerala");		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("678078");
		Select objname=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		objname.selectByIndex(2);
	}

}
