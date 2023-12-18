package JSConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.switchTo().frame(0);
		Thread.sleep(100);
		driver.findElement(By.id("speed-button")).click();
		
		List<WebElement> optionList = driver.findElements(By.cssSelector("ul#speed-menu div"));
		
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Faster")) {
				e.click();
				break;
			}
		}

	}

}
