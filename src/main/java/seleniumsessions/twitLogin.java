package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitLogin {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("chingomani");
		driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("0411@Mani");
		driver.findElement(By.xpath("//div[@data-testid='LoginForm_Login_Button']")).click();
		
	}

}
