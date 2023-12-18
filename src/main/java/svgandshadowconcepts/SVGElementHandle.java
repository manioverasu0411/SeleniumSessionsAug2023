package svgandshadowconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).sendKeys("Headphones");
		driver.findElement(By.xpath("//button//*[local-name()='svg' and @fill='none']")).click();

	}

}
