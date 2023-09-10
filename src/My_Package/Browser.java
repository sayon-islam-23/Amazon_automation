package My_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	public WebDriver setGoogleBrowser() {
		
		// initializing the chrome driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver setEdgeBrowser() {
		
		// initializing the edge driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
}
