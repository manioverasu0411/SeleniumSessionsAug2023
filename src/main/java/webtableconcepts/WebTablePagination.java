package webtableconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumsessions.MoveToElementActionsConcepts;

public class WebTablePagination {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(5000);
		
		
		
		while(true) {
			
			// if element available 1st page itself
			
			if(driver.findElements(By.xpath("//td[text()='Denmark']")).size() > 0) {
				selectCountry("Denmark");
				break;	
			}else {
				
				// pagination logic				
				WebElement next = driver.findElement(By.linkText("Next"));
				
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagaination is over... Moved upto the end of the page");
					break;
				}
				
				next.click();
				Thread.sleep(1000);
				
			}
		}

	}
	
	
	
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}


}
