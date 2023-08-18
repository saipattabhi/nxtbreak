package hpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datatable {
	
	@Test
	public void datatable()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	List<WebElement> elements = driver.findElements(By.xpath("//table[@id='countries']//tr//td[text()='Afghani']//preceding-sibling::td//strong[text()='Afghanistan']"));
		
		for(WebElement words:elements)
		{
			
		String demo = words.getText();
		
		System.out.println(demo);
			
		}
		
		
	}
	
	
	

}
