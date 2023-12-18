package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		

		String actTitle = driver.getTitle();
		System.out.println("title is "+actTitle);
		
		String appURL = driver.getCurrentUrl();	
		
		if(appURL.contains("google")) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
		
		// driver.quit();
		driver.close();
		
		
		

	}

}
