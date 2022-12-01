package Practice_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ElementalPractice 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//A/B Testing
		//----------------
		driver.findElement(By.xpath("//*[text()='A/B Testing']")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//Add/Remove Elements
		//--------------------
		driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
		driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
		driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='elements']//button")).click();
		driver.findElement(By.xpath("//div[@id='elements']//button")).click();
		driver.findElement(By.xpath("//div[@id='elements']//button")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//Basic Authentication
		//------------------------
		String u = "admin";
		String p = "admin";
	    String url = "https://" + u + ":" + p + "@" +"the-internet.herokuapp.com/basic_auth"; // adding username, password with URL
	    driver.get(url);
	    String text = driver.findElement(By.cssSelector("p")).getText();// identify and get text after authentication of popup
	    System.out.println("Text is: " + text);
	    driver.navigate().back();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    
	    //Challenging DOM
	    //-----------------------
	    driver.findElement(By.xpath("//*[text()='Challenging DOM']")).click();
	    driver.findElement(By.xpath("//div[@class='large-2 columns']//a[1]")).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='large-2 columns']//a[2]")).click();
	    driver.findElement(By.xpath("//div[@class='large-2 columns']//a[3]")).click();
	    driver.findElement(By.xpath("//a[text()='delete'][1]")).click();
	    driver.findElement(By.xpath("//a[text()='edit'][1]")).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
	    driver.navigate().to("http://the-internet.herokuapp.com/"); 
	    
	    //checkboxes
	    //---------------
	    driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();  
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    WebElement checkBox1 = driver.findElement(By.xpath("//form//input[1]"));
	    checkBox1.click();
	    if(checkBox1.isSelected())
	    {
	    	System.out.println("1st check box is selected");
	    }
	    else
	    {
	    	System.out.println("1st check box is not selected");
	    }
	    WebElement checkBox2=driver.findElement(By.xpath("//form//input[2]"));
	    checkBox2.click();
	    if(checkBox2.isSelected())
	    {
	    	System.out.println("2nd check box is selected");
	    }
	    else
	    {
	    	System.out.println("2nd check box is not selected");
	    }  
	    driver.navigate().to("http://the-internet.herokuapp.com/");
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    
	    //Context Menu
	    //---------------
	    driver.findElement(By.xpath("//*[text()='Context Menu']")).click();
	    Actions action=new Actions(driver);
	    WebElement rightclk=driver.findElement(By.xpath("//div[@id='hot-spot']"));
	    action.contextClick(rightclk).perform();
	    System.out.println("Context menu right click action performed");
	    Alert alert=driver.switchTo().alert();
	    alert.accept();
	    driver.get("http://the-internet.herokuapp.com/");
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    
	    //Disappearing Elements
	    //-------------------------
	    driver.findElement(By.xpath("//a[text()='Disappearing Elements']")).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[text()='Home']")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//a[text()='About']")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//a[text()='Portfolio']")).click();
	    driver.navigate().back();
	    driver.navigate().back();
	    
	    
	}

}
