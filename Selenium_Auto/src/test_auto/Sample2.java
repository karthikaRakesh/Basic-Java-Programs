package test_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("evalaxy");
		driver.findElement(By.id("nav-search-submit-text")).click();

	}

}
