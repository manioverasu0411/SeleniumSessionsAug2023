package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImagesAmazon {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();//123
		driver.get("https://www.amazon.com/");
		
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		System.out.println("Total num of images: "+imageList.size());
		
		for (WebElement img : imageList) {
			String altValue = img.getAttribute("alt");
			String srcValue = img.getAttribute("src");
			
			System.out.println(altValue+"==========> "+srcValue);
		}
		
	

	}

}
