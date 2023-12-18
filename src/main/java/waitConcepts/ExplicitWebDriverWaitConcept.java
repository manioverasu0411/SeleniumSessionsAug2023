package waitConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWebDriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By pw = By.id("input-password");
		By loginButton = By.xpath("//input[@value='Login']");
		By AboutUs= By.linkText("About Us");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement emailEle = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		emailEle.sendKeys("test@gmail.com");
		
		waitForPresenceOfElement(email, 2);
		driver.findElement(pw).sendKeys("@!Test123");
		driver.findElement(loginButton).click();	
		waitForPresenceOfElement(AboutUs, 5).click();
		
	}
	
	public static WebElement waitForPresenceOfElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForVisibilityOfElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible.
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForVisibilityOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * An expectation for checking that there is at lease one element present on the a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static List<WebElement> waitForPresenceOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	
	 
	
	public static void doClickWithWait(By locator, int timeout) {
		waitForVisibilityOfElement(locator, timeout).click();
	}
	
	public static void doSendKeysWithWait(By locator, int timeout, String value) {
		waitForVisibilityOfElement(locator, timeout).sendKeys(value);
	}
	
	
	

}
