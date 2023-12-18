package waitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitWithIntervalTime {
	
	static WebDriver driver;
	public static void main(String[] args) {
			// TODO Auto-generated method stub

			driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By email = By.id("input-email1");
			By pw = By.id("input-password");
			By loginButton = By.xpath("//input[@value='Login']");
			By AboutUs= By.linkText("About Us");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
			wait1.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("test@gmail.com");

			
			
		}
}
