package Automation_Framework;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class LoginTestCase extends PageMethodes {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		
		//PageMethodes methodes= new PageMethodes();
		//methodes.OpenBrowser();

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://workflow.ghx.com/login.jsp";
		driver.get("https://stage.jobtravia.com/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='register-id']/span")).click();
		
		
		Thread.sleep(10000);
		Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id='LocationId']/div/div[2]/div")));
		Thread.sleep(5000);
		drpCountry.selectByVisibleText("Daman & Diu");
		Thread.sleep(50000);
		Assert.assertEquals("http://www.google.com", "abc");
        //drpCountry.selectByIndex(10);
		//drpCountry.selectByVisibleText(arg0);
		// Launch the Website
		

		// Print a Log In message to the screen
		
		/* System.out.println("Successfully opened the website");
		Thread.sleep(5000);

		System.out.println(driver.getClass());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle()); 

		driver.findElement(By.xpath("//*@id=='Username'")).clear(); 
		driver.findElement(By.xpath("//*@id=='Username'")).sendKeys("123");
		driver.findElement(By.xpath("//*@id=='Username'")).click();
		driver.findElement(By.xpath("//*@id=='Username'")).getAttribute("class");
		driver.findElement(By.xpath("//*@id=='Username'")).getTagName();
		driver.findElement(By.xpath("//*@id=='Username'")).getSize();
		driver.findElement(By.xpath("//*@id=='Username'")).getLocation();
		driver.findElement(By.xpath("//*@id=='Username'")).isSelected();
		driver.findElement(By.xpath("//*@id=='Username'")).submit();
		driver.findElement(By.xpath("//*@id=='Username'")).isDisplayed();

		new Select(driver.findElement(By.xpath("//*@id=='Username'"))).selectByVisibleText("Sidney");
		new Select(driver.findElement(By.xpath("//*@id=='Username'"))).selectByIndex(1);
		new Select(driver.findElement(By.xpath("//*@id=='Username'"))).deselectByValue("abc");
		new Select(driver.findElement(By.xpath("//*@id=='Username'"))).deselectAll();
		new Select(driver.findElement(By.xpath("//*@id=='Username'"))).getOptions();
		new Select(driver.findElement(By.xpath("//*@id=='Username'"))).isMultiple();

		WebElement element = driver.findElement(By.xpath("//*@id=='Username'"));

		driver.navigate().refresh();
		driver.findElement(By.id("gbqfq")).sendKeys(Keys.F5);
		driver.get("https://www.google.com.bd/");
		driver.get(driver.getCurrentUrl());
		driver.findElement(By.id("gbqfq")).sendKeys("\uE035");
		// driver.executeScript("location.reload()");

		driver.navigate().forward();
		driver.navigate().back();

		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Text");

		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);// index name id

		Actions act = new Actions(driver);
		act.dragAndDrop(element, element).build().perform();

		String winHandleBefore;
		winHandleBefore = driver.getWindowHandle();
		driver.switchTo().window(winHandleBefore);

		// Wait for 5 Sec Thread.sleep(5000); driver.wait(5);
		//


		// Assert.assertNotEquals(actual,expected,Message);
		// Assert.assertTrue(condition);
		// Assert.assertFalse(condition);
		// Assert.assertNull(object);
		// Assert.assertNotNull(object);
		// Assert.assertTrue(1==2);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();

		driver.manage().window().maximize();

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Screenshot"));

	    //	Assert.assertEquals("http://www.google.com", URL);

		driver.quit(); // close current instance of browser
		driver.close(); // close current instance of browser

		//Wait wait = new FluentWait(driver).withTimeout(30, SECONDS).pollingEvery(5, SECONDS)
		//.ignoring(NoSuchElementException.class);
		

		//file upload control
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("C:\\newhtml.html");	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); */
		
		
	}

}
