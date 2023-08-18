package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {
	
	@Test
	public void rightclick()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	WebElement jai = driver.findElement(By.xpath("//input[@class='gsc-input']"));
	
	jai.sendKeys("saipattabhiramayya");
	
	
	Actions a=new Actions(driver);
		a.doubleClick(jai).perform();
		
	}
	
	
	

}
