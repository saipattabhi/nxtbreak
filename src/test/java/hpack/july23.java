package hpack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class july23 {

	WebDriver driver;

	@Test
	public void dc() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.valuelabs.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@href=\"https://careers.valuelabs.com \"]")).click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> itr = window.iterator();

		String parent = itr.next();

		String child = itr.next();

		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//*[contains(@aria-label,\"Text input with dropdown button\")]")).sendKeys("selenium");
		
		
		driver.findElement(By.xpath("//*[@class=\"btn find-jobs-btn\"]")).click();
		
		

	}

}
