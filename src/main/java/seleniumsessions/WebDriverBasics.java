package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	
	static WebDriver driver;

	public static void main(String[] args) {

		// 1. select the browser :chrome
		// 2. Enter the url
		// 3. check the url title
		// 4. verify the title correct or not
		// 5. close the browser
		
		String browser = "edge";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "ff":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please pass the valid browser");
			break;
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		System.out.println("title is "+actTitle);
		
		if(actTitle.equals("Google")) {
			System.out.println("Testcase Passed......");
			
		}else {
			System.out.println("Testcase failed .....");
		}
		
		driver.quit();
		
	}

}
