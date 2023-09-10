package My_Package;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class openAmazon {
	public void openAmazonWeb(WebDriver driver) throws Exception {
		
		// creating a file reader object
		FileReader fr = new FileReader("C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Resources\\config.properties");
		
		// creating a Properties instance for reading data from a properties file
		Properties p = new Properties();
		
		// load the object
		p.load(fr);
		
		// in property file data is stored as key value pair. "url" acts as a key here.
		String url = p.getProperty("url");
		
		// www.amazon.com will open
		driver.get(url);
	}

}