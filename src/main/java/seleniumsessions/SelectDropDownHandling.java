package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// dropdown --- use select class
		// single selection
		// multi selection

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		Thread.sleep(3000);
		
		By country = By.id("Form_getForm_Country");
//		WebElement country_ele = driver.findElement(country);
//		Select select = new Select(country_ele);
//		select.selectByIndex(5);
//		Thread.sleep(1000);
//		select.selectByVisibleText("Japan");
//		Thread.sleep(1000);
//		select.selectByValue("Kuwait");
		
		doSelectDropDownByIndex(country, 10);
		Thread.sleep(1000);
		doSelectDropDownByValue(country, "India");
		Thread.sleep(1000);
		doSelectDropDownByVisibleText(country, "Iran");
			
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
