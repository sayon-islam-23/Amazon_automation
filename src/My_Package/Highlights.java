package My_Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
public class Highlights {
    public static void highlight(WebDriver driver, WebElement element)throws InterruptedException{

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'background:lightgreen; border: 1px solid black;')",element);
        Thread.sleep(2000);
        js.executeScript("arguments[0].setAttribute('style','background:lightgreen; border: solid 2px white');", element);      
    }
}
