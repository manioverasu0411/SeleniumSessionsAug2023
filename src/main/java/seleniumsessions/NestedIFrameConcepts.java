package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameConcepts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(3000);
		
		// Moving to 1st iframe
		driver.switchTo().frame("pact1");
		
		driver.findElement(By.id("inp_val")).sendKeys("First Crush");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Second Crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Third Crush");
		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("jex")).sendKeys("Second Crush");
//		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("First Crush");	
		
		
		driver.switchTo().defaultContent();
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);

	}

}
