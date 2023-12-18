package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Total_links {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("Total link is: "+links.size());
		 
			/*
			 * for(int i = 0 ; i<links.size(); i++) { String txt = links.get(i).getText();
			 * if(txt.length()!=0) { System.out.println(txt); } }
			 */
		 
		 for (WebElement link : links) {
			 String txt = link.getText();
			 if(!txt.isBlank()) {
				 String href_value = link.getAttribute("href");
				 System.out.println(txt+"--------->"+ href_value);
			 }
		}
		 


	}

}
