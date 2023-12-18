package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcepts {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email_id = By.id("input-email");
		By attribute_link = By.linkText("Register");
		By pw_id = By.id("input-password");
		
		String placeholder_value = driver.findElement(email_id).getAttribute("placeholder");
		System.out.println(placeholder_value);
		
		String href_value = driver.findElement(attribute_link).getAttribute("href");
		System.out.println(href_value);
		
		 String email_attribut = doGetElementAttribute(pw_id, "placeholder");
		 System.out.println(email_attribut);
		 
		 String email_attribut1 = doGetElementAttribute(pw_id, "name");
		 System.out.println(email_attribut1);
		 
		 String email_attribut2 = doGetElementAttribute(pw_id, "class");
		 System.out.println(email_attribut2);
		 
		
		
	}
	
	public static String doGetElementAttribute(By locator, String attr_value) {
		return getElement(locator).getAttribute(attr_value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
