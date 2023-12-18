package svgandshadowconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElements {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g' and @class='region']
		
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		List<WebElement> stateList	= driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g' and @class='region']"));
	
		Actions act = new Actions(driver);
		
		for (WebElement e : stateList) {
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String idVal = e.getAttribute("id");
			System.out.println(idVal);
			
			if(idVal.equals("california")) {
				e.click();
				break;
			}
		}
	
	
	
	}

}
