package seleniumsessions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class WindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		Dimension dim = new Dimension(430, 932);
		
		driver.manage().window().setSize(dim);
		
		// driver.manage().window().setSize(new Dimension(1080, 2080));
		
		driver.get("https://www.1mg.com/drugs/sucral-suspension-151662?wpsrc=Google+Organic+Search");
		System.out.println(driver.getTitle());

	}

}
