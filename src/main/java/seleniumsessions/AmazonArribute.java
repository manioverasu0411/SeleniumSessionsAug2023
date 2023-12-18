package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonArribute {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();//123
		driver.get("https://www.amazon.com/");
		
		By image = By.xpath("//img[@alt='Toys Under $30']");
		String src_att = doGetElementAttribute(image, "src");
		System.out.println(src_att);
		
		String class_att = doGetElementAttribute(image, "class");
		System.out.println(class_att);

	}
	
	public static String doGetElementAttribute(By locator, String attr_value) {
		return getElement(locator).getAttribute(attr_value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}


}
