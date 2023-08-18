package hpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {
	
	@Test
	public void keyboard()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='compendiumdev']"));
		
		
		Actions a=new Actions(driver);
		
		a.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
		
		
	}             
	
	
	

}
