package webtableconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		//a[text()='Rakesh King']/parent::td/preceding-sibling::td/input[@type='checkbox']

		//table[@class='datacard']//a[text()='Rakesh King']/parent::td/following-sibling::td
		
		//driver.findElement(By.xpath("//a[text()='Rakesh King']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		selectUser("Rakesh King");
		 String rakeshCompany = getCompanyName("Rakesh King");
		 System.out.println(rakeshCompany);
		//selectUser("Ali khan");
		 List<String> rakeshDetails = getUserInfo("Rakesh King");
		 System.out.println(rakeshDetails);
		
		
	}
	
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

	}
	
	public static String getCompanyName(String userName) {
		
		return driver.findElement(By.xpath("//table[@class='datacard']//a[text()='Rakesh King']/parent::td/following-sibling::td/a[@context='company']")).getText();
		
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
