package JSConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		jsUtil.scrollPageDown();
		Thread.sleep(2000);
		
		jsUtil.scrollPageUp();
		Thread.sleep(4000);
		
		//jsUtil.scrollMiddlePageDown();
		
		
		WebElement callEle = driver.findElement(By.xpath("//h3[normalize-space()='Calls & Voice']"));
		//jsUtil.scrollIntoView(callEle);
		
		jsUtil.drawBorder(callEle);
		
		
		
	}

}
