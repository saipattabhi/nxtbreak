package hpack;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
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

public class dyntablemultiplepages {

	@Test
	public void dynamic() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cgi.com/en");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"popup-buttons\"]//button[1]")).click();

		WebElement c = driver.findElement(By.xpath("//*[@href=\"/en/careers\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", c);

		driver.findElement(By.xpath("//*[contains(@aria-label,\"Learn more about Careers\")]")).click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> itr = window.iterator();

		String parent = itr.next();

		String child = itr.next();

		driver.switchTo().window(child);

		String req1 = driver.findElement(By.xpath("//*[text()=\"Current opportunities\"]")).getText();

		Assert.assertEquals(req1, "Current opportunities");

		List<WebElement> totalpage = driver.findElements(By.xpath("//div[@class='row']/a[contains(text(),\"NEXT\")]"));

		int count = 71;

		System.out.println(count);

		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));

		String first = "//table//tbody//tr[";

		String second = "]//td[1]";

		int row = rows.size();

		for (int currentpage = 1; currentpage <= count; currentpage++) {

			for (int i = 1; i <= row; i++) {

				String req = driver.findElement(By.xpath(first + i + second)).getText();
				
				System.out.println(req);

				if (req.equals("J0422-1380")) {

					Assert.assertEquals(req, "J0");

					break;
				}
				
				

			}

			if (currentpage <count) {

				WebElement next = totalpage.get(currentpage);

				js.executeScript("arguments[0].click();", next);

			}

		}

	}
}