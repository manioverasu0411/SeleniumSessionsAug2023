package webtableconcepts;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebTableGettingAllValues {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		//th[text()='Company']/parent::tr/following-sibling::tr/td
		
		//List<Map<String, String>>dataList = new LinkedList();
		List<Map<String,String>> dataList = new LinkedList<>();
		
		List<WebElement>headerList = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr//th"));
		List<WebElement>rowList = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr"));
		
		for (WebElement row : rowList) {
			Map<String,String>dataMap = new LinkedHashMap<>();
			
			for(int h = 0;  h < headerList.size();  h++) {
				dataMap.put(headerList.get(h).getText(), row.findElements(By.xpath(".//td")).get(h).getText());
			}
			
			dataList.add(dataMap);
				
		}
		
		//System.out.println(dataList);
		
		for (Map<String,String> data : dataList) {
			System.out.println(data);
			if(data.get("Company").equals("Island Trading")) {
				System.out.println(data.get("Country"));
			}
			
		}
		
		

	}

}
