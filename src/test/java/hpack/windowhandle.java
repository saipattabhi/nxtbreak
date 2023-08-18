package hpack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {
	
	@Test
	public void windowhandle()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		driver.findElement(By.linkText("Blogger")).click();
		
		
		
		
		Set<String> window = driver.getWindowHandles();
		
		   Iterator<String> itr = window.iterator();
		   
		   
		   
		   while(itr.hasNext())
		   {
			   
			String randomwindow = itr.next();
			
			
			driver.switchTo().window(randomwindow);
			
			if(driver.getTitle().contains("Blogger.com - Create a unique and beautiful blog. It’s easy and free."))
			{
				driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
				
				driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("saipattabhiramayya");
				driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
				
			}
			   
			   			   
		   }
		
		
		
		
		
		
	}
	
	
	
	

}
