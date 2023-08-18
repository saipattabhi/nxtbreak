package hpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic {

	WebDriver driver;

	@Test
	public void dynamic() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> row = driver.findElements(By.xpath("//table/tbody//tr"));

		int count = row.size();

		String first = "//table/tbody//tr[";

		String f1 = "]//td[1]";

		String second = "]//td[2]";

		String s2 = "]//td[3]";

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 2; i < count; i++) {

			String required = driver.findElement(By.xpath(first + i + second)).getText();

			String r2 = driver.findElement(By.xpath(first + i + s2)).getText();

			if (required.equals("Afghanistan")) {

				js.executeScript("arguments[0].click();",
						driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td//input")));

				Assert.assertEquals(required, "Afghanistan");

			}

			if (r2.equals("Kabul")) {

				Assert.assertEquals(r2, "Kabul");

				break;

			}

		}

	}

}
