package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClkActions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		WebElement dble=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(dble).perform();
		System.out.println("Double click operation performed");
		//driver.quit();
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
		
		WebElement dble1=driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(dble1).perform();
		System.out.println("Right click operation performed");
		

	}

}
