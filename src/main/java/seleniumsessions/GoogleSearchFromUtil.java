package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchFromUtil {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		By searchField = By.name("q");
		By suggestions = By.xpath("//div[@class='wM6W7d']//span");
		
		ElementUtil util = new ElementUtil(driver);
		util.Search(searchField, suggestions, "Madurai", "weather");

	}

}
