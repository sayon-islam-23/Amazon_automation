package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	public void addToCart(WebDriver driver) throws InterruptedException {
		WebElement addCart1 = driver.findElement(By.id("add-to-cart-button"));
		addCart1.click();  // adding the first item to the cart
		Thread.sleep(2000);
		try {
			if(driver.findElement(By.id("attach-warranty-pane")).isDisplayed()==true) {
				driver.findElement(By.id("attachSiNoCoverage")).click();
			}
			//driver.findElement(By.id("attach-warranty-pane")).isDisplayed();
			//driver.findElement(By.id("attachSiNoCoverage")).click();   // if warranty panel is appearing 
			Thread.sleep(3000);
			driver.close();
		}
		catch(Exception e) {
			driver.close();
		}
		
		//WebElement cross = driver.findElement(By.id("attach-close_sideSheet-link"));
		//cross.click();
		Thread.sleep(2000);
		
	}
}
