package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tab {
	
	@Test
	public void tab()
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("userid"));
		
		
		username.sendKeys("saipattabhiramayya");
		
		
		Actions a=new Actions(driver);
		
		a.sendKeys(Keys.TAB).perform();
		
	WebElement password = driver.findElement(By.name("pswrd"));
		
		password.sendKeys("ramayya");
		
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	}
	
	

}
