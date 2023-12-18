package waitConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.AutomationException;
import seleniumsessions.ElementUtil;

public class CustomWait {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		ElementUtil util = new ElementUtil(driver);
		if(util.isPageLoaded(10)) {
			System.out.println("Page is loaded");
		}
		
		By forgotPassword = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
		
		retryingElement(forgotPassword, 10,2000).click();
		
	}
	
	
	
	public static WebElement getElement(By locator) {	
		return driver.findElement(locator);
		
	}
	
	
	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("Element is found..." + locator + "in attempt " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("Element is not found..." + locator + "in attempt " + attempts);
				try {
					Thread.sleep(500); // polling time
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			attempts++;
		}

		if (element == null) {
			System.out.println("element is not found.....tried for " + timeOut + " times With interval of " + 500
					+ " milliSeconds");
			throw new AutomationException("No Such Element found");
		}

		return element;
	}

	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("Element is found..." + locator + "in attempt " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("Element is not found..." + locator + "in attempt " + attempts);
				try {
					Thread.sleep(intervalTime); // polling time
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			attempts++;
		}

		if (element == null) {
			System.out.println("element is not found.....tried for " + timeOut + " times With interval of " + intervalTime
					+ " milliSeconds");
			throw new AutomationException("No Such Element found");
		}

		return element;
	}
	
}
