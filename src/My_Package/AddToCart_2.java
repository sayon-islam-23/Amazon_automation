package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart_2 {
	public void addToCart_2(WebDriver driver) throws InterruptedException {
		WebElement addCart1 = driver.findElement(By.id("add-to-cart-button"));
		addCart1.click();   // adding the second item by clicking add to cart button
		Thread.sleep(2000);
		
		try {
			
			// when warranty panel is appearing
			
			if(driver.findElement(By.id("attach-warranty-pane")).isDisplayed()==true) {
				driver.findElement(By.id("attachSiNoCoverage")).click();
			}
			if(driver.findElement(By.id("sw-gtc")).isDisplayed()==true) {
				driver.findElement(By.id("sw-gtc")).click();
			}
		}
//		catch(NoSuchElementException a) {
//			driver.findElement(By.id("sw-gtc")).click();
//		}
		catch(Exception e) {
			driver.findElement(By.id("attach-view-cart-button-form")).click();
		}
	}
}
