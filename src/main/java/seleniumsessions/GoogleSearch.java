package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		By searchField = By.name("q");
		By suggestions = By.xpath("//div[@class='wM6W7d']//span");

		googleSearch(searchField, suggestions, "Nifty", "nifty today");

	}

	public static void googleSearch(By searchField, By suggestions, String searchKey, String suggName)
			throws InterruptedException {

		// driver.findElement(By.name("q")).sendKeys("Automation Testing");

		driver.findElement(searchField).sendKeys(searchKey);
		Thread.sleep(2000);
		List<WebElement> sugg_list = driver.findElements(suggestions);
		int count = sugg_list.size();
		System.out.println(count);

		for (WebElement e : sugg_list) {
			String text = e.getText();

			if (text.contains(suggName)) {
				e.click();
				break;
			}

		}

	}

}
