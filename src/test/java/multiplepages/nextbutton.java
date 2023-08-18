package multiplepages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nextbutton {

	@Test
	public void nxt() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

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

		Thread.sleep(4000);

		Assert.assertEquals(req1, "Current opportunities");

		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));

		String first = "//table//tbody//tr[";

		String second = "]//td[1]";

		int row = rows.size();

		boolean elementfound = false;

		String req = null;

		

		while (!elementfound) {

			for (int i = 1; i <= row; i++) {

				req = driver.findElement(By.xpath(first + i + second)).getText();

				if (req.equals("J0423-1227"))

				{

					elementfound = true;

					Assert.assertEquals(req, "J04-1227");

					break;

				}

			}

			if (elementfound) {

				break;
			}

			if (!elementfound) {
				
				WebElement next = driver.findElement(By.xpath("//*[@class=\"row\"]//a[text()=\"NEXT\"]"));

				next.click();
			}

		}

	}

}
