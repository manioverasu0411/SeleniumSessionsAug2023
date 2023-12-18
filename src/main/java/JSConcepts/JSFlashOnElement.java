package JSConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSFlashOnElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement loginId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));

		
		JavaScriptUtil js = new JavaScriptUtil(driver);
		
		js.flash(loginId);
		loginId.sendKeys("mani@gmail.com");
		
		js.flash(password);
		password.sendKeys("test@123");
	}

}
