package webtableconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import JSConcepts.JavaScriptUtil;

public class WebTable_MultipleData_Selections {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");		
		Thread.sleep(5000);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		jsUtil.scrollMiddlePageDown();
		
		while (true) {
			// if ele is on the 1st page itself
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectMultipleCountry("India");
			}

			// pagination logic: click on next:
			WebElement next = driver.findElement(By.id("tablepress-1_next"));
			
			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("Pagination is over..country is not found....");
				break;
			}
			
			Thread.sleep(1000);
			next.click();
			Thread.sleep(1000);

		}
		}

	
	
	
	
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	
	public static void selectMultipleCountry(String countryName) {
		List<WebElement> eles = driver.findElements(
				By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : eles) {
			e.click();
		}
	}
	
	
}


