package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pratice {

	WebDriver driver;
	
	String actualresult ;
	@Before("@smoke")

	public void openbrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@After("@smoke")
	public void closebrowser() {
		driver.quit();
	}

	@Given("^I navigate to the application URL$")
	public void I_navigate_to_the_application_URL() {
		driver.get("https://clients.njoyn.com/CGI/xweb/xweb.asp?NTKN=c&page=login&clid=21001");
	}

	@When("^I enter username as ([^\"]*) and password as ([^\"]*) into the fields$")
	public void I_enter_username_as_and_password_as_into_the_fields(String username, String password) {
		driver.findElement(By.id("Inp_Login_email")).sendKeys(username);
		driver.findElement(By.id("Inp_Login_password")).sendKeys(password);
	}

	@And("^I clicks on the login button$")
	public void I_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^User should sucessfully see the ([^\"]*) after login$")
	public void User_should_sucessfully_see_the_after_login(String exceptedstatus) {

		
		String actualstatus = null   ;
		
	
		try {
			WebElement element = driver.findElement(By.xpath("//ul[@class='menu menu-level-0']//a[text()='Search careers']"));
			
			if(element.isDisplayed())
			
			{
				actualstatus="success";
			}
			
		} catch (Exception e) {
		
			actualstatus="failure";
		}
		
		
	
		
	   
	   Assert.assertEquals(actualstatus,exceptedstatus);
		
	}


}
