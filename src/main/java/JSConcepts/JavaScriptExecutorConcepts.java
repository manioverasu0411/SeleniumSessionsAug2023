package JSConcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class JavaScriptExecutorConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
//		 String title = jsUtil.getPageTitleByJs();
//		 System.out.println(title);	
//		 
//		 String URL = jsUtil.getURLByJs();
//		 System.out.println(URL);
		 
		// jsUtil.generateJSAlert("Hello Manikandan");
		
//		String pageText = js.executeScript("return document.documentElement.innerText").toString();
//		System.out.println(pageText);
		 
		  String text = jsUtil.getPageInnerText();
		  System.out.println(text);
		  
		 

	}

}
