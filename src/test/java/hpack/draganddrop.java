package hpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	@Test
	public void draganddrop()
	{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
	driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	

	

	
	
	 WebElement oslo = driver.findElement(By.id("box1"));
	      
	 WebElement norway = driver.findElement(By.id("box101"));
	 
	 Actions a=new Actions(driver);
	 
	 a.dragAndDrop(oslo, norway).perform();
		
		
		
	}
	
	
	
	

}
