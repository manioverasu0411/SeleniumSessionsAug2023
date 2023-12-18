package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		  Set<String> windID = driver.getWindowHandles();
		  
		  // iterator used to fetch the details from non order base collections like set
		  
		 Iterator<String> it = windID.iterator();
		 
		  String parentWinId = it.next();
		  System.out.println("Parent window ID is: "+parentWinId);
		  
		  String childWinId = it.next();
		  System.out.println("Child window ID is: "+childWinId);
		  
		  // switching work - child window
		  driver.switchTo().window(childWinId);
		  System.out.println("Child window URl: "+driver.getCurrentUrl());
		  driver.close();
		  
		  // back to parent window
		  
		  driver.switchTo().window(parentWinId);
		  System.out.println("Parent window URl: "+driver.getCurrentUrl());
		  driver.quit();
		  



	}

}
