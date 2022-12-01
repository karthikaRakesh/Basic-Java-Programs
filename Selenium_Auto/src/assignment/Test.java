package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://selenium.obsqurazone.com/index.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[id='alert-modal']")).click();
		driver.findElement(By.cssSelector("a[id='progress-bars']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("button[id='downloadButton']")).click();
		//driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		
		/*Simple input form
		-------------------------*/
		driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Mesage testing");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=\"card-body\"]//descendant::button")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='form-group']//following::input[2]")).sendKeys("100");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='button-two']//preceding::input[1]")).sendKeys("150");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button#button-two")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		/*Check Demo Section
		 -----------------------------*/
		driver.findElement(By.xpath("//li[@class='list-group-item'][2]")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='form-check-input' or@id='gridCheck']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#check-box-four")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#check-box-four")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#check-box-three")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#check-box-three")).click();
		driver.findElement(By.cssSelector("input#check-box-two")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#check-box-two")).click();
		driver.findElement(By.cssSelector("input#check-box-one")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#check-box-one")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		/*Radio Button Demo Section
		 -----------------------------*/
		
		driver.findElement(By.xpath("//li[@class='list-group-item'][3]")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//following::input[@id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("button#button-one")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='form-group']//descendant::input[@id='inlineRadio2']")).click();
		driver.findElement(By.cssSelector("button#button-one")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#inlineRadio11")).click();
		driver.findElement(By.cssSelector("input#inlineRadio22")).click();
		driver.findElement(By.xpath(" //button[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#inlineRadio11")).click();
		driver.findElement(By.cssSelector("input#inlineRadio23")).click();
		driver.findElement(By.xpath(" //button[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#inlineRadio11")).click();
		driver.findElement(By.cssSelector("input#inlineRadio24")).click();
		driver.findElement(By.xpath(" //button[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#inlineRadio21")).click();
		driver.findElement(By.cssSelector("input#inlineRadio22")).click();
		driver.findElement(By.xpath(" //button[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#inlineRadio21")).click();
		driver.findElement(By.cssSelector("input#inlineRadio23")).click();
		driver.findElement(By.xpath(" //button[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#inlineRadio21")).click();
		driver.findElement(By.cssSelector("input#inlineRadio24")).click();
		driver.findElement(By.xpath(" //button[@id='button-two']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		/*Form submit Demo Section
		 -----------------------------*/
		driver.findElement(By.xpath("//li[@class='list-group-item']//parent::ul"));
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='list-group list-group-flush']//child::li[5]")).click();
		driver.findElement(By.xpath("//div[@class='col-md-4 mb-3']//self::input[1]")).sendKeys("Karthika");
		driver.findElement(By.xpath("//div[@class='col-md-4 mb-3']//following-sibling::input[@id='validationCustom02']")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("Karthu Raku");
		driver.findElement(By.xpath("//input[@id='validationCustomUsername']//ancestor::div[@class='input-group']"));
		driver.findElement(By.xpath("//div[@class='col-md-6 mb-3']//self::input")).sendKeys("Trivandrum");
		driver.findElement(By.xpath("//*[text()='State']//following-sibling::input")).sendKeys("Kearala");
		driver.findElement(By.xpath("//input[@placeholder='Zip']")).sendKeys("695035");
		driver.findElement(By.xpath("//form[@class='needs-validation']//descendant::input[@id='invalidCheck']")).click();
		driver.findElement(By.xpath("//form[@class='needs-validation']//button")).click();	
		
		/*Ajax form submission
		 -----------------------------*/
		driver.findElement(By.xpath("//ul[@class='list-group list-group-flush']//li[6]//self::a")).click();		
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Subject')]")).sendKeys("Testing subject");
		driver.findElement(By.xpath("//label[text()='Description']//following::textarea")).sendKeys("testing description....................");
		driver.findElement(By.xpath("//input[text()='Submit' or @type='submit']")).click();
		/*--------------------------------------------------------------------------------------------------*/
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		/*--------------------------------------------------------------------------------------------------*/		
		/*  Table Section
		 -----------------------------*/
		driver.findElement(By.xpath("//a[@href='table-pagination.php' and @class='nav-link']")).click();
		driver.findElement(By.xpath("(//li[@class='list-group-item']//a)[2]")).click();
		driver.findElement(By.xpath("//div[@class='card']//following::li[3]//a")).click();
		driver.findElement(By.xpath("//div[@class='card']//descendant::a[4]")).click();
		driver.findElement(By.xpath("//div[@class='dt-buttons']//following::span[text()='Copy']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='dt-button buttons-csv buttons-html5']")).click();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[@class='dt-button buttons-excel buttons-html5']")).click();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[@class='dt-button buttons-pdf buttons-html5']")).click();
		//driver.findElement(By.xpath("//button[@class='dt-button buttons-print buttons-html5']")).click();
		
			
		
	}

}
