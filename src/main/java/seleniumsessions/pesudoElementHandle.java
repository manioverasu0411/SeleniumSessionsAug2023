package seleniumsessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import JSConcepts.JavaScriptUtil;

public class pesudoElementHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavaScriptUtil util = new JavaScriptUtil(driver);
		
		// window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content');
		
		//String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content');";
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String mand_text = js.executeScript(script).toString();
//		if(mand_text.contains("*")) {
//			System.out.println("Fist Name is mandatory");
//		}
		
		
		
		
		 String m_check = util.verifyMandatoryField("input-email", "before");
		 if(m_check.contains("*")) {
			 System.out.println("Email is mandatory");
		 }
		
	}
	
	

}
