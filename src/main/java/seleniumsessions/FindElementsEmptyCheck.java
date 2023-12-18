package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEmptyCheck {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By logo= By.cssSelector(".img-responsive");
		
		if(checkElementsPresent(logo)) {
			System.out.println("Logo pressent");
		}else {
			System.out.println("Logo not present ---> fail");
		}

	}
	
	
	
	public static boolean checkElementsPresent(By locator) {
		
		return driver.findElements(locator).size() ==0 ? true : false;
		
	}

}
