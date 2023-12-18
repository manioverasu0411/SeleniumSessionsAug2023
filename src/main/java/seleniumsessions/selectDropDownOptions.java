package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// dropdown --- use select class
		// single selection
		// multi selection

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		Thread.sleep(2000);

		By country = By.id("Form_getForm_Country");
		//WebElement country_ele = driver.findElement(country);
		
		selectDropDownOption(country, "Luxembourg");
		getDropDownOptions(country);
		
		if(getDropDownOptions(country).contains("India")) {
			System.out.println("India is Available -- Testcase pass");
		}
		
		List<String> exp_list = Arrays.asList("India","Austria","Libyaaaa");
		
		if(getDropDownOptions(country).containsAll(exp_list)) {
			System.out.println("Expected list available ");
		}else {
			System.out.println("Expected list not matching with options , Pleas check your list once again");
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));	
		List<WebElement> countryList = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : countryList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		
		return optionsTextList;

	}

	public static void selectDropDownOption(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryList = select.getOptions();
		System.out.println(countryList.size());
		for (WebElement e : countryList) {
			String text = e.getText();
			if (text.equals(dropDownValue)) {
				e.click();
				break;
			}

		}

	}

}
