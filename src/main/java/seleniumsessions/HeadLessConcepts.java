package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadLessConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// no active browser window
		// no active UI
		// testing is happening behind the scene
		// faster than UI mode
		
		
		// when to use -> CI CD - cloud - AWS - Linux - Jenkins 
		
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--headless");
//		WebDriver driver = new EdgeDriver(options);
		
		
		driver.get("https://www.1mg.com/drugs/sucral-suspension-151662?wpsrc=Google+Organic+Search");
		System.out.println(driver.getTitle());
		
	}

}
