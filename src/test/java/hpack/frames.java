package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	@Test
public void  frame()
{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	     WebElement de = driver.findElement(By.id("singleframe"));
	 driver.switchTo().frame(de);
	
	
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saipattabhiramayya");
	 
	 
	 
	 

	
	
	
	
}
	
	
	
	

}
