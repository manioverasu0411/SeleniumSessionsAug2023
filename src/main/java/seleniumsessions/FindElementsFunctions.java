package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunctions {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();// 123
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();

		By links = By.tagName("a");
		By images = By.tagName("img");

		int linkCount = getElementsCount(links);
		System.out.println("The total no of links: " + linkCount);

		int imgCount = getElementsCount(images);
		System.out.println("The total no of imgs: " + imgCount);
		
		/*
		 * List<String> actualLinksTxtList = getElementsText(links);
		 * System.out.println(actualLinksTxtList);
		 * 
		 * if(actualLinksTxtList.contains("Shopping Cart")) { System.out.
		 * println("Test Passed .... Shopping cart is available in that list "); }
		 */
		
		List<String> hrefList = getElementsAttribute(links, "href");
		System.out.println(hrefList);
		
		for (String href : hrefList) {
			System.out.println(href);
			
		}
		
		

	}

	public static List<String> getElementsText(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
				if(text.length()!=0) {
					eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	
	public static List<String> getElementsAttribute(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
				if(attrValue.length()!=0) {
					eleAttrList.add(attrValue);
			}
		}
		return eleAttrList;
	}
	

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
