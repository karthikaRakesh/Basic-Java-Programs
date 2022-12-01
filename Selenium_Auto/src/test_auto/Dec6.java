package test_auto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec6 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Kids']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Toys for kids");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		List<WebElement>Product_info=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		System.out.println(Product_info.size());
	}

}