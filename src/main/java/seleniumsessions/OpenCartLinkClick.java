package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartLinkClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		 By linkList = By.xpath("//div[@class='list-group']/a");
		 
		 ElementUtil util = new ElementUtil(driver);
			/*
			 * int count = util.getElementsCount(linkList);
			 * System.out.println("The total no of links present in the login page: "+count)
			 * ;
			 */
		 
		 util.clickOnElement(linkList, "Forgotten Password");
		
		
}
}
