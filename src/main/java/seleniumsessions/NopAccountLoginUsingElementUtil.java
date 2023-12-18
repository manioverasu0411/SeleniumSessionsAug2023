package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopAccountLoginUsingElementUtil {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		

	
	 By myAccountList =By.xpath("//div[@class='header-links']//ul/li"); 
	 ElementUtil util= new ElementUtil(driver);
		 
		 util.clickOnElement(myAccountList, "Wish");
		  System.out.println(driver.getTitle());
		 
		
//		 List<WebElement> account_links = driver.findElements(By.xpath("//div[@class='header-links']//ul/li"));
//		 int count = account_links.size();
//		 System.out.println(count);
//		 
//		 for (WebElement e : account_links) {
//			 String text = e.getText();
//			 System.out.println(text);
//			 if(text.contains("Register")) {
//				 Thread.sleep(2000);
//				 	e.click();
//				 	break;
//			 }
//			
//		}
		
		
		

}
}
