package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chord {
	@Test
	public void chord() throws InterruptedException
	{
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ta1")).sendKeys("saipattabhiramayya");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL,"z"));
		
	}
	
	
	
	
	
	

}
