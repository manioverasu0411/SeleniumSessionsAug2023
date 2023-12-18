package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://www.google.com/");
		String actTitle = brUtil.getPageTitle();
		if(actTitle.equals("Google")) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		
		String actUrl = brUtil.getPageURL();
		if(actUrl.contains("google")) {
			System.out.println("url is correct.. Testcase is passed");
		}
		
		brUtil.closeBrowser();
		
		
		

	}

}
