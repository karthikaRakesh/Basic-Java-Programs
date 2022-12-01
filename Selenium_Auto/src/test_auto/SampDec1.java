package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampDec1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_2_')]")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("Karthika");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-' or @name='lastname'])[2]")).sendKeys("Rakesh");
		driver.findElement(By.xpath("(//input[starts-with(@name,'reg_ema')])[1]")).sendKeys("7025886431");
		driver.findElement(By.id("password_step_input")).sendKeys("Karthika");
		driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
		
		
	}

}
