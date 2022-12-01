package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Dec10 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/drag-drop.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement dest=driver.findElement(By.xpath("//div[@dropzone='move']"));
		action.dragAndDrop(source, dest).build().perform();
	
		/*driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='column-b']//header"));
		action.dragAndDrop(source, dest).build().perform();*/
		
		
		
		//Creating object of Actions class to build composite actions
		//Actions builder = new Actions(driver);

		//Building a drag and drop action
//		Action dragAndDrop = builder.clickAndHold(source)
//		.moveToElement(dest)
//		.release(dest)
//		.build();

		//Performing the drag and drop action
		//dragAndDrop.perform();

	}
	
	

}
