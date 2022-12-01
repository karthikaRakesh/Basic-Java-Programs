package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectObsq 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		Select obj=new Select(driver.findElement(By.name("duallistbox_demo1[]_helper1")));
		obj.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		obj.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		obj.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);		obj.selectByIndex(4);
		Select ob=new Select(driver.findElement(By.name("duallistbox_demo1[]_helper2")));
		ob.selectByIndex(3);
		
		
		
	}

}
