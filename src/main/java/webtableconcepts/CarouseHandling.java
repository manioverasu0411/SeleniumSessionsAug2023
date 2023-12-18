package webtableconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouseHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");		
		Thread.sleep(5000);
		
		String xpath = "//h2[text()='Today’s Deals']/../following-sibling::div/div/ul/li";
		
		String nextXpath = "//h2[text()='Today’s Deals']/../following-sibling::div/a[@aria-label='Carousel next slide']";
		
		List<WebElement> productList = driver.findElements(By.xpath(xpath));
		
		while(!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("disabled")) {
			
			for (WebElement e : productList) {
				e.getText();
			}
		}
			
		
	}

}
