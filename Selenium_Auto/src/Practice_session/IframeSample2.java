package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSample2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
//		driver.switchTo().frame("f149894203b5ce8");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@class='_a2zm']")).click();
//		driver.switchTo().defaultContent();

	}

}
