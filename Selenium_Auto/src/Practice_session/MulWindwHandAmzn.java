package Practice_session;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulWindwHandAmzn 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 12");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='New Apple iPhone 12 (128GB) - Green']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//window handling
		String MainWindow=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String ChildWindow=i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
			}
		}
		//scrolling 
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//back to window
		driver.switchTo().window(MainWindow);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//Refresh the main page
		driver.navigate().refresh();
	}

}
