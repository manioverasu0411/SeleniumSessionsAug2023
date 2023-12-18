package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		clickOnElement(langLinks, "தமிழ்");

	}
	
	

	public static void clickOnElement(By locator,String eleText) {
		 List<WebElement> lanLinks = driver.findElements(locator);
		 int count = lanLinks.size();
		 System.out.println("Total no of language: "+count);
		 for (WebElement e : lanLinks) {
			 String text = e.getText();
			 //System.out.println(text);
			 if(text.contains(eleText)) {
				 e.click();
				 break;
			 }
		 }
		
	}

}
