package test_auto;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Sample
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("i phone 13");
		driver.findElement(By.cssSelector("span[id='nav-search-submit-text']")).click();
		driver.findElement(By.xpath("//input[@name='low-price']")).sendKeys("30000");
		driver.findElement(By.cssSelector("input#high-price")).sendKeys("70000");
		driver.findElement(By.cssSelector("input.a-button-input")).click();
		
		
	}

}
