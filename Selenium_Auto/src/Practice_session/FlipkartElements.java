package Practice_session;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartElements 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='CXW8mj']//img[@class='_396cs4 _3exPp9']")).click();
		driver.findElement(By.xpath("//div[@class='_30kJiF']//a")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		List<WebElement>Top_Deals=driver.findElements(By.xpath("//div[@class='_5_K_qG']"));
		System.out.println(Top_Deals.size());
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input")).sendKeys("Toys for kids");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		List<WebElement>Toys=driver.findElements(By.xpath("//div[@class='_13oc-S']"));
		System.out.println(Toys.size());
	}

}
