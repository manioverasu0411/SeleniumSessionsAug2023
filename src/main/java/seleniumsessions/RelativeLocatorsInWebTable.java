package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorsInWebTable {

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
		
		WebElement ele = driver.findElement(By.linkText("Josh Buttler"));
		
		// Left side check box click
		
		driver.findElement(with(By.tagName("input")).toLeftOf(ele)).click();
		
		// To get Value of Above element
		
		WebElement above_ele =  driver.findElement(with(By.tagName("a")).above(ele));
		System.err.println(above_ele.getText());
		
		// Right side 
		
		List<WebElement> rigtSideEle = driver.findElements(with(By.xpath("(//form[@id='vContactsForm']/table/tbody//tr)[12]//td")).toRightOf(ele));
		
		for (WebElement e : rigtSideEle) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
	}

}
