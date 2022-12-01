package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertP2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\driver\\romedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		String alertMesg=driver.switchTo().alert().getText();
		System.out.println(alertMesg);
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Alert alert1=driver.switchTo().alert();
		String alertMesg1=driver.switchTo().alert().getText();
		System.out.println(alertMesg1);
		alert1.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Alert alert2=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Testing........");
		alert2.accept();
	}

}
