package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementConcepts {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// 1st type of web element creation
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("mani@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("Test@123");
		 */
		
		//2nd approach
		
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pw = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("vini@gmail.com");
//		pw.sendKeys("Test@1234");
		
		// 3rd approach
		
//		By eid = By.id("input-email");
//		By pw = By.id("input-password");
//		
//		WebElement email = driver.findElement(eid);
//		WebElement pid = driver.findElement(pw);
//		email.sendKeys("veera@gmail.com");
//		pid.sendKeys("asdfasfd");
		
		// 4th approach
		
//		By eid = By.id("input-email");
//		By pw = By.id("input-password");
//		
//		getElement(eid).sendKeys("venba@gmail.com");
//		getElement(pw).sendKeys("sfdsfds");
		
		//5th approach 
		
//		By eid = By.id("input-email");
//		By pw = By.id("input-password");
//		
//		doSendkeys(eid, "Test@gmail.com");
//		doSendkeys(pw, "sadfsafs");	
		
		
		By eid = By.id("input-email");
		By pw = By.id("input-password");
		
		ElementUtil util = new ElementUtil(driver);
		//util.doSendkeys(eid, "viji@gmail.com");
	//	util.doSendkeys(pw, "sdfsfsdf");
		
		
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
