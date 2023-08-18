package hpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cgi {
@Test
	public void cgi()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://clients.njoyn.com/CGI/xweb/xweb.asp?NTKN=c&page=login&clid=21001");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Inp_Login_email")).sendKeys("saipattabhi18@gmail.com");
		driver.findElement(By.id("Inp_Login_password")).sendKeys("Sai@336699");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String element = driver.findElement(By.xpath("//li[@class='title']//a[contains(text(),'Language')]")).getText();
		
		System.out.println(element);
	}
	
	
	
}
