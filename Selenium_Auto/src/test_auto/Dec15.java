package test_auto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec15 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//multiple window Handling
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='sl-sobe-carousel-sub-card-image']//img[1]")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='OnePlus 9R 5G (Carbon Black, 8GB RAM, 128GB Storage)']")).click();
//		((JavascriptExecutor) driver).executeScript("window.open()");
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
		        {		
		            String ChildWindow=i1.next();		 		
		            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		            {    		    
		                 driver.switchTo().window(ChildWindow);
		            }
		          }
		//driver.switchTo().window(tabs.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.switchTo().window(tabs.get(0));
		driver.switchTo().window(MainWindow);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().refresh();

		



		

	}

}
