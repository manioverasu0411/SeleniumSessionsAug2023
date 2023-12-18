package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;




public class RelativeLocatorsConcepts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aqi.in/in/dashboard/canada");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.linkText("Banff, Canada"));
		
		// right of Ele
		
		WebElement RightSide = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(element));
		System.out.println(RightSide.getText());
		
		// left of Ele
		WebElement leftSide = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(element));
		System.out.println(leftSide.getText());
		
		// above of Elemetn
		
		WebElement above_Element = driver.findElement(RelativeLocator.with(By.tagName("p")).above(element));
		System.out.println(above_Element.getText());
		
		// To list out all the elements
		
		List<WebElement> belowElement  = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(element));
		
		System.out.println(belowElement.size());
		
		for (WebElement e : belowElement) {
			String text = e.getText();
			System.out.println(text);
			
		}
		
		

	}

}
