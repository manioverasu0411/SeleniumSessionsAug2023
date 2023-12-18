package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author manikandan
 * BrowserUtil is having multiple generic methods to handle various browser action
 * 
 */
public class BrowserUtil {

	private WebDriver driver;
	
	/**
	 * This method is used to launch the browse on the basis of given browser name
	 * @param browserName
	 * @return this returns the driver instance 
	 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser name is: " + browserName);
		switch (browserName.toLowerCase().trim()) {
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
			throw new AutomationException("INVALID BROWSER "+browserName);
		}
		return driver;

	}
	
	
	/**
	 * This method is used to launch the url.
	 * @param url
	 */
	public void launchURL(String url) {
		driver.manage().window().maximize();
		if (url == null) {
			System.out.println("URL is NULL");
			throw new AutomationException("INVALID URL");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new AutomationException("http is missing");
		}

	}
	
	public void launchURL(URL url) {
		driver.manage().window().maximize();
		if (url == null) {
			System.out.println("URL is NULL");
			throw new AutomationException("INVALID URL");
		}
		
		driver.navigate().to(url);
		
		
//		if (url.indexOf("http") == 0) {
//			driver.get(url);
//		} else {
//			throw new AutomationException("http is missing");
//		}

	}
	
	
	
	/**
	 * This method used to get the page title
	 * @return this returns the page tile
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("The page title is: "+title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("The page current url is: "+url);

		return url;
	}
	
	public boolean getPageSource(String value ) {
		String pageSource = driver.getPageSource();
		if(pageSource.contains(value)) {
			return true;
		}
		return false;
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
