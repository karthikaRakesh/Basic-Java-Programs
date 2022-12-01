package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("(//li[@id='fourth']//a[1])[1]"));
		WebElement dest=driver.findElement(By.xpath("//ol[@id='amt7']"));
		action.dragAndDrop(source, dest).build().perform();
	}

}
