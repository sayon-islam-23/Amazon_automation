package My_Package;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class Search {

	public void searchItem_1(WebDriver driver) throws InterruptedException, IOException {
			
			// creating a file reader object
			FileReader fr = new FileReader("C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Input\\config.properties");
			
			// creating a Properties instance for reading data from a properties file
			Properties p = new Properties();
			
			// load the object
			p.load(fr);
			
			// in property file data is stored as key value pair. "item" acts as a key here.
			String item = p.getProperty("item");
			
			try {
				WebElement search = driver.findElement(By.id("twotabsearchtextbox"));  // selecting the search box to search
				search.sendKeys(item);
				Thread.sleep(1000);
				WebElement magButton = driver.findElement(By.id("nav-search-submit-button"));  // selecting the magnifine glass button to search
				magButton.click();
			}
			catch(Exception e) {
				WebElement search = driver.findElement(By.id("nav-bb-search"));  // selecting the search box to search
				search.sendKeys(item);
				Thread.sleep(1000);
				WebElement magButton = driver.findElement(By.xpath("//input[@value='Go']"));  // selecting the magnifine glass button to search
				magButton.click();
			}
			
	}
}
