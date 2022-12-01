 package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertP1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		String alertMesg=driver.switchTo().alert().getText();
		System.out.println(alertMesg);
		alert.accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Alert alert1=driver.switchTo().alert();
		String alertmesg1=driver.switchTo().alert().getText();
		System.out.println(alertmesg1);
		alert1.accept();
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Alert alert2=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Testing....");
		alert2.accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Alert alert3=driver.switchTo().alert();
		alert3.dismiss();
		
		

	}

}
