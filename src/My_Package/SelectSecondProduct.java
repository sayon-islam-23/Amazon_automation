package My_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectSecondProduct {
	public void selectProduct(WebDriver driver) {
//		WebElement secondProd = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div"));
//		secondProd.click();
		List<WebElement> arr = driver.findElements(By.className("s-image"));
		// selecting the second product by clicking on the second image which has the same classname as the first product image as "s-image".
		arr.get(1).click();
	}
}
