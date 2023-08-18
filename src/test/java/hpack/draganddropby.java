package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddropby {
	@Test
	public void draganddrop() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/p/page3.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement element = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
	
	Actions a=new Actions(driver);
	
	Thread.sleep(2000);

		a.dragAndDropBy(element, 100, 0).perform();
		
		
		Thread.sleep(2000);
		
		a.dragAndDropBy(element, -200, 0).perform();
		
		
		
		
		
	}
	
	

}
