package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actions {
	
	@Test
	public void actions()
	{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://omayo.blogspot.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebElement blog = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
	// without using sendkeys
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("document.getElementById().value=''");
	
	
	
	
	
	
	
	
	
	
	Actions action=new Actions(driver);
		
		action.moveToElement(blog).perform();
		
		
	WebElement selenium = driver.findElement(By.xpath("//span[normalize-space()='Selenium143']"));
	
	
	action.moveToElement(selenium).click(selenium).build().perform();
		
		
		
		
		
	}
	
	
	
	

}
