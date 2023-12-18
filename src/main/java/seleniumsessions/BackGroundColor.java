package seleniumsessions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackGroundColor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
		
		String bgColor = element.getCssValue("backgroundColor");
		// System.out.println(bgColor);
		
		System.out.println(element.getRect().getHeight());
		System.out.println(element.getRect().getWidth());
		System.out.println(element.getRect().getDimension());
		System.out.println(element.getRect().getX());
		System.out.println(element.getRect().getY());


	}

}
