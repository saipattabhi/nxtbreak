package goibibo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplepagesinwebtable {
	
	List<WebElement> fieldelements;

	
	List<String> names;
	
	String nextbutton ;
	@Test
	public void multipages() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 fieldelements = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));

		 names = new ArrayList<String>();

		for (WebElement allfields : fieldelements)

		{
			// allfields.getText();

			names.add(allfields.getText());

		}

	 nextbutton = driver.findElement(By.id("example_next")).getAttribute("class");

		while (!nextbutton.contains("disabled")) {

			driver.findElement(By.id("example_next")).click();
			fieldelements = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));

			for (WebElement allfields : fieldelements)

			{
				

				names.add(allfields.getText());

			}

		nextbutton	=driver.findElement(By.id("example_next")).getAttribute("class");

		}

		for (String name : names) {

		System.out.println(name);
		}
		int totalnames = names.size();

		System.out.println("Total names : " + totalnames);
		
		
	//String displaycount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
	
	
	//System.out.println("displayed count"+displaycount);
		
	//Assert.assertEquals(displaycount, String.valueOf(totalnames));
		
	
	driver.quit();
	}

}
