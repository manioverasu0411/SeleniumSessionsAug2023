package JSConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryMutipleOptionsInDropDown {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//List<WebElement> choicesList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		
		List<WebElement> choicesList = driver.findElements(By.xpath("//ul/li[@class='ComboTreeItemChlid']/span/input"));
		for (WebElement e : choicesList) {
			
			String text = e.getText();
			System.out.println(text);
//			if(text.length()>0) {
//				System.out.println(text);
//			}
			
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
			
//			try {
//				e.click();
//			}catch ( ElementNotInteractableException se) {
//				System.out.println("drop down choices over ...");
//				break;
//			}
			
			
		}
}
	
	
	
}