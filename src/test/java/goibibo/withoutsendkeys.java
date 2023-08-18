package goibibo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withoutsendkeys {
	
	@Test
	public void withoutsendkeys()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://omayo.blogspot.com/");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('ta1').value='sai'");
		
	}
	
	
	
	
	

}
