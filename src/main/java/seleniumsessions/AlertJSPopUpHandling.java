package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// dropdown --- use select class
		// single selection
		// multi selection

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		
		// jsalert pop
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Thread.sleep(2000);
		
		
		// Confirmation popup
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
			
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Test check");
		alert.accept();
		


		
		

		
		
		

	}
	
	
	
	
	
	//button[@onclick='jsAlert()']

}
