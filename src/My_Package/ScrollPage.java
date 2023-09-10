package My_Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPage {
	public void Scroll(WebDriver driver) {
		
	//javascript executer is an interface in selenium which allow to execute javascript code in the browser using webdriver
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
	}
	
	public void Scroll_2(WebDriver driver) {
	//javascript executer is an interface in selenium which allow to execute javascript code in the browser using webdriver
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	}
}
