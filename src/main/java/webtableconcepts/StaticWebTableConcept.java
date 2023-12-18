package webtableconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		//WebTable Traversing:
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int row = 2; row<=rowCount; row++) {
			String actXpath = beforeXpath+ row +afterXpath;
			//System.out.println(actXpath);
			 String compName = driver.findElement(By.xpath(actXpath)).getText();
			 System.out.println(compName);
		}
				

	}

}
