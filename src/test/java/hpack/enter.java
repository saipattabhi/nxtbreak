package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enter {
	
	@Test
	public void enter()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("input-email")).sendKeys("saipattabhi18@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("sai@2255");
		
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		
		
		
	}
	
	
	
	
	

}
