package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dec8 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='gridCheck']")).click();
		if(driver.findElement(By.xpath("//input[@id='gridCheck']")).isSelected())
		{
			System.out.println("Checked the textbox");
		}
		else
		{
			System.out.println("Check box is disabled");
		}
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Select objname=new Select(driver.findElement(By.id("single-input-field")));
		objname.selectByValue("Red");
		objname.selectByVisibleText("Yellow");
		//objname.deselectByIndex(2);
		
	}

}
