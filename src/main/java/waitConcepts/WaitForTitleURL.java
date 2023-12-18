package waitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;
	public static void main(String[] args) {
			// TODO Auto-generated method stub

			driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By AboutUs= By.linkText("About Us");
			
			driver.findElement(AboutUs).click();
			
			String title = waitForTitleContains("about", 5);
			System.out.println(title);
			
		
	}
	
	
	public static String waitForTitleContains(String titleFraction, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(titleFraction + " Title is not present.....");
			e.printStackTrace();
		}
		return null;

	}
	
	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(title + " Title is not present.....");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForURLContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(urlFraction + " Title is not present.....");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitURLTOBe(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlToBe(url))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(url + " Title is not present.....");
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	

}
