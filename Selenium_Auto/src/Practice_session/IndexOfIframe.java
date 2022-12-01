package Practice_session;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexOfIframe 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		int size=driver.findElements(By.tagName("iframe")).size();
		for(int i=0;i<=size;i++)
		{
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}

	}

}
