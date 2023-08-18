package stepdefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	WebDriver driver;

	@Before("@register")
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("^I navigate to the application$")
	public void I_navigate_to_the_application() {
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("^I enter following details$")
	public void I_enter_following_details(DataTable datatable) {
		Map<String, String> map = datatable.asMap(String.class, String.class);

		driver.findElement(By.id("input-firstname")).sendKeys(map.get("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(map.get("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(map.get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(map.get("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(map.get("password"));
	}

	@And("^I select on privacy policy$")
	public void I_select_on_privacy_policy() {
		driver.findElement(By.name("agree")).click();
	}

	@And("^I click on continue button$")
	public void I_click_on_continue_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("^I sucessfully register into the application$")
	public void I_sucessfully_register_into_the_application() {
		
	String url = driver.getCurrentUrl();
	
	if(url.equals("http://tutorialsninja.com/demo/index.php?route=account/success"))
	{
		System.out.println("User has sucessfully registered");
		
	}
	else {
		System.out.println("user has not registered");
		Assert.fail("user failed");
	}
	}

}