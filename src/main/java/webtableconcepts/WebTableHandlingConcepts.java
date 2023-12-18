package webtableconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingConcepts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		////a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//selectUser("Kevin.Mathews");
	
		selectUser("Joe.Root");
		 List<String> joeDetails = getUserInfo("Joe.Root");
		 System.out.println(joeDetails);
		
		



	}
	
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

	}
	
	public static List<String> getUserInfo(String userName) {
		 List<WebElement> columnElements = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		 List<String> colValuesList = new ArrayList<String>();
		 for (WebElement e : columnElements) {
			 String text = e.getText();
			 colValuesList.add(text);
		}
		 
		 return colValuesList;
	}

}
