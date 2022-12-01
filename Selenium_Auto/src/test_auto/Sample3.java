package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Karthika Rakesh");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9912345656");
		driver.findElement(By.id("ap_email")).sendKeys("karthikamohannair@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("karthika@12321");
	    driver.findElement(By.id("auth-continue")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	
	}

}

