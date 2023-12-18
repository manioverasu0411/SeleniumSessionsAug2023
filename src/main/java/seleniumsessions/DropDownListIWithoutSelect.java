package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownListIWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// dropdown --- use select class
		// single selection
		// multi selection

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		Thread.sleep(2000);

		By country = By.cssSelector("select#Form_getForm_Country > option");
		 
		selectDropDownValue(country, "Bahamas");
		
		
		
		 
		 

	}
	
	public static void selectDropDownValue(By locator, String value) {
	List<WebElement> optionList = driver.findElements(locator);	
	for (WebElement e : optionList) {	
		String text = e.getText();
		if(text.equals(value)) {
			e.click();
			break;
		}
		
	}
	
	}

}
