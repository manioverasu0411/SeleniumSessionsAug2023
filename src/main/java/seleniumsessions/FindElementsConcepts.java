package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FindElementsConcepts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> textFiled_list = driver.findElements(By.className("form-control"));
		
		System.out.println(textFiled_list.size());
		
		for (WebElement webElement : textFiled_list) {
			System.out.println(webElement.getAttribute("placeholder"));
		}
		
		
		
		
		

	}

}
