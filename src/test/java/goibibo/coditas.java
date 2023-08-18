package goibibo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class coditas {
	
	@Test
	public void coditas()
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.goibibo.com/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,\"root\")]//ul//li//a[text()='Forex']//preceding::li"));
	
	
	for(WebElement ele:elements)
		
	{
		String value = ele.getText();
		
		
		System.out.println(value);
		
		if(value.contains("Bus"))
		{
			
			break;
		}
		
		
	}
		
		
		
		
		
		
	}
	
	
	
	

}
