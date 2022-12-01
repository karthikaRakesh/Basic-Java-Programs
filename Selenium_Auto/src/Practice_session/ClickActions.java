package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Actions action=new Actions(driver);

		WebElement sign=driver.findElement(By.id("signupModalButton"));
		action.moveToElement(sign).click().perform();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}

}
