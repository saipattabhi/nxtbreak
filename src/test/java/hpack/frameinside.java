package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameinside {
	
	
	@Test
	
	public void frameinside()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='analystic'][normalize-space()='Iframe with in an Iframe']")).click();
		
		

	WebElement number = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	
	driver.switchTo().frame(number);
		WebElement zero = driver.findElement(By.xpath("//div[@class='row']//following-sibling::iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(zero);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saipattabhiramayya");
		
		
		
	}
	
	
	
	

}
