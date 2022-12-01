package Practice_session;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToElement 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		

	}

}
