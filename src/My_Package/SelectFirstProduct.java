package My_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFirstProduct {
	public void selectProduct(WebDriver driver) {
//		WebElement firstProd = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div"));
//		firstProd.click();
		
		List<WebElement> arr = driver.findElements(By.className("s-image")); 
		// selecting the first product by clicking on the first image which has the class name "s-image".
		arr.get(0).click();
	}
}
