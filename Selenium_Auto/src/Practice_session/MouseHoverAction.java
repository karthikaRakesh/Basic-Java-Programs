package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		WebElement live=driver.findElement(By.xpath("//a[text()='Main Item 1']"));
		action.moveToElement(live).build().perform();
		
		WebElement live1=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(live1).build().perform();
		
		WebElement live2=driver.findElement(By.xpath("//a[text()='Main Item 3']"));
		action.moveToElement(live2).build().perform();
		
		driver.get("https://demoqa.com/tool-tips");
		//Actions action=new Actions(driver);
		
		WebElement demo=driver.findElement(By.id("toolTipButton"));
		action.moveToElement(demo).build().perform();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement demo1=driver.findElement(By.id("toolTipTextField"));
		action.moveToElement(demo1).build().perform();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement demo2=driver.findElement(By.xpath("//a[text()='Contrary']"));
		action.moveToElement(demo2).build().perform();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

}
