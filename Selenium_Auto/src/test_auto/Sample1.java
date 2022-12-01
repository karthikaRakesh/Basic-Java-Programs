package test_auto;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\selenium_classes\\geckodriver.exe");
			//WebDriver driver1 = new FirefoxDriver();


		}

}

