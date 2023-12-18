package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultileDropDownHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// dropdown --- use select class
		// single selection
		// multi selection

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/attributes/select-multiple/");
		Thread.sleep(2000);
		
		//Select select = new Select(driver.findElement(By.xpath("//select")));
		
		By dropLocator = By.xpath("//select");
		By options_locator = By.xpath("//select//option");
		
		
//		if(select.isMultiple()) {
//			System.out.println("Yes, its multi selection dropdown");
////			select.selectByValue("1");
////			select.selectByValue("2");
////			select.selectByValue("4");
//			select.selectByVisibleText("American flamingo");
//			select.selectByVisibleText("Andean flamingo");
//			select.selectByVisibleText("James's flamingo");
//		}
//		
//		int selectedCount = select.getAllSelectedOptions().size();
//		System.out.println(selectedCount);
//		
//		Thread.sleep(3000);
//		select.deselectByVisibleText("American flamingo");
//		Thread.sleep(3000);
//		select.deselectByVisibleText("James's flamingo");
		
		selectDropDownMultipleValues(dropLocator, options_locator, "all");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean isDropDownMultiple(By locator) {
		Select select = new Select(getElement(locator));
		return select.isMultiple() ? true : false;
	}

	/**
	 * This method is used to select the values from the drop down. It can select;
	 * 1. single selection
	 * 2. Multiple selection
	 * 3. All Selection: please pass "all" as a value to select all the values
	 * @param locator
	 * @param values
	 */
	public static void selectDropDownMultipleValues(By locator, By optionLocator, String... values) {
		Select select = new Select(getElement(locator));

		if (isDropDownMultiple(locator)) {

			if (values[0].equalsIgnoreCase("all")) {
				List<WebElement> optionsList = driver.findElements(optionLocator);
				for (WebElement e : optionsList) {
					e.click();
				}
			} else {
				for (String value : values) {
					select.selectByVisibleText(value);
				}
			}

		}

	}

}
