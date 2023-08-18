package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lightbox {
	@Test
	public void lightbox() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.in/p/lightbox.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.id("lightbox1")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='close cursor']")).click();
		
		
		
		
	}
	
	
	
	
	
	

}
