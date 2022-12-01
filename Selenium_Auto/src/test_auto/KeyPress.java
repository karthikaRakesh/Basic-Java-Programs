package test_auto;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class KeyPress 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      String url = "https://www.tutorialspoint.com/index.htm";
		      driver.get(url);
		      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		      // identify element
		      WebElement l = driver.findElement(By.id("search-strings"));
		      // enter text then ctrl+a with Keys.chord()
		      l.sendKeys("Selenium");
		      String s = Keys.chord(Keys.CONTROL, "a");
		      l.sendKeys(s);
		      //driver.quit();
	 }
		

}
