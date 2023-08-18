package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class temp {
	

	@Test
	
	public  void temp()
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.cognizant.com/in/en");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("Industries")).click();
	
	driver.findElement(By.xpath("//a[@class='flex-container align-middle'][normalize-space()='Automotive']")).click();
	driver.findElement(By.xpath("//a[@href='https://newsignature.com/case-studies/citroen/']")).click();
	
	
		
		
		
	}
	
	

}
