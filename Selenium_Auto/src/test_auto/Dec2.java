package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@id='pass']//following::button")).click();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@class='_6ltg'][2]//preceding::a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//form[@id='u_0_a_1h']//descendant::a[@id='u_0_2_5u']")).click();
	}

}
