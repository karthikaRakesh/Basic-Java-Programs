package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec9 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Alert alert2 = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Test mesg");
		alert2.accept();
		
		
	}

}
