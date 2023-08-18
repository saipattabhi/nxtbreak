package hpack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {
	
	
	@Test
	public void brokenlinks()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cognizant.com/in/en");
		
		driver.manage().window().maximize();
		
	List<WebElement> element = driver.findElements(By.tagName("a"));
	
	for(WebElement links: element)
	{
		
	String url = links.getAttribute("href");
	
	System.out.println(url);
	
	
	if(url==null||url.isEmpty())
	{
		System.out.println("URL is empty");
		continue;
	
		
		
	}
	
    try {
		HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
		huc.connect();
		
		if(huc.getResponseCode()>=400)
		{
			System.out.println(url+"is a broken");
			
		}
		else {
			
			System.out.println(url+"is a valid");
		}
		
		
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
		
	}
	
	

		
	}
	
	
	

}
