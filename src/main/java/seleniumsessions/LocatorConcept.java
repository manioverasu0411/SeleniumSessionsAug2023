package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("mani@gmail.com");
//			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test");
//			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			// using By locatore approach
			
//			By eId = By.xpath("//input[@id='input-email']");
//			By pw = By.xpath("//input[@id='input-password']");
//			By subButton = By.xpath("//input[@type='submit']");
			
//			doSendkeys(eId, "mani@gmail.com");
//			doSendkeys(pw, "adas");
//			doClick(subButton);
			
//			By Reg = By.linkText("Register");
//			doClick(Reg);
			
			By forgotPw = By.partialLinkText("Forgotten");
			By txt_fw = By.tagName("h1");
			By logo = By.className("img-responsive");
			
			
			doClick(forgotPw);
			String act_title = elementGetText(txt_fw);
			System.out.println(act_title);
			doClick(logo);

	}
	
	public static String elementGetText(By locator) {
		return getElement(locator).getText();
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
