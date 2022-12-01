package test_auto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec20DatePik 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Trivandrum");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//ul[@class='autoFill homeSearch']//li)[1]")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//ul[@class='autoFill homeSearch']//li)[1]")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//list of dates stored in variable
		List<WebElement> dates=driver.findElements(By.cssSelector("td[class='wd day']"));//list of dates stored in variable
		//find count of list
		int count=driver.findElements(By.cssSelector("td[class='wd day']")).size();
		for(int i=0;i<count;i++)
		{
			//store dates in text
			String text=driver.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
			if(text.equalsIgnoreCase("29"))
			{
				driver.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
				break;
			}
		}
		
		//current date selection
		//------------------------------------
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("td[class='current day']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//particular date slection
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//td[text()='23']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}

}
