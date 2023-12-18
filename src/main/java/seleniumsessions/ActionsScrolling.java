package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();//123
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_UP).perform();
		
		// move top of the page or bottom of the page
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
		
		By HelpEle = By.linkText("Help");
		
		scrollToElement(HelpEle);
		
		// CTRL+F5
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		
		
		// To move particular element
//		act.scrollToElement(driver.findElement(By.linkText("Help"))).pause(500)
//						.click(driver.findElement(By.linkText("Help"))).build().perform();

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}


	
	public static void scrollToElement(By locator) {
		Actions act = new Actions(driver);
		act.scrollToElement(getElement(locator)).pause(500)
		.click(getElement(locator)).build().perform();
		
	}
	
	
	
	

}
